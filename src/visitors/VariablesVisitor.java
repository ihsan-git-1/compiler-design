package visitors;

import ast.NodeType;
import ast.SymbolTableObject;
import ast.nodes.ForInit;
import ast.nodes.TermAbstractChild;
import ast.variables.*;
import gen.dart_parse;
import gen.dart_parseBaseVisitorChild;
import org.antlr.v4.runtime.Token;

import java.util.*;


public class VariablesVisitor extends dart_parseBaseVisitorChild {


    @Override
    public Variable visitVariable(dart_parse.VariableContext ctx) {


        if (ctx.stringDeclarationLine() != null) {

            int line = ctx.start.getLine();
            String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
            String type = NodeType.VARIABLE.toString();
            int childCount = ctx.getChildCount();
            return new Variable(visitStringDeclarationLine(ctx.stringDeclarationLine()), line, parent, type, childCount);
        }

        if (ctx.integerDeclarationLine() != null) {

            int line = ctx.start.getLine();
            String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
            String type = NodeType.VARIABLE.toString();
            int childCount = ctx.getChildCount();

            return new Variable(visitIntegerDeclarationLine(ctx.integerDeclarationLine()), line, parent, type, childCount);
        }
        if (ctx.doubleDeclarationLine() != null) {
            int line = ctx.start.getLine();
            String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
            String type = NodeType.VARIABLE.toString();
            int childCount = ctx.getChildCount();
            return new Variable(visitDoubleDeclarationLine(ctx.doubleDeclarationLine()), line, parent, type, childCount);
        }
        if (ctx.booleanDeclarationLine() != null) {
            int line = ctx.start.getLine();
            String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
            String type = NodeType.VARIABLE.toString();
            int childCount = ctx.getChildCount();
            return new Variable(visitBooleanDeclarationLine(ctx.booleanDeclarationLine()), line, parent, type, childCount);
        }

        return null;
    }

    @Override
    public NumberClass visitNumber(dart_parse.NumberContext ctx) {
        String numText = ctx.getChild(0).getText();
        int num = Integer.parseInt(numText);
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.NUMBER.toString();
        int childCount = ctx.getChildCount();
        return new NumberClass(num, line, parent, type, childCount);

    }

    @Override
    public IntegerDeclarationLine visitIntegerDeclarationLine(dart_parse.IntegerDeclarationLineContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        int column = ctx.start.getCharPositionInLine() + 1;
        String type = NodeType.INTEGERDECLARATIONLINE.toString();
        int childCount = ctx.getChildCount();
        List<IntegerDeclaration> l = new ArrayList<>();
        Boolean isDecl = !(ctx.INT() == null);


        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (Objects.equals(ctx.getChild(i).getText(), ","))
                continue;
            if (ctx.getChild(i) instanceof dart_parse.IntegerDeclarationContext) {
                l.add(visitIntegerDeclaration((dart_parse.IntegerDeclarationContext) ctx.getChild(i), isDecl));
            }
        }
        return new IntegerDeclarationLine(line, parent, type, childCount, l);
    }

    public IntegerDeclaration visitIntegerDeclaration(dart_parse.IntegerDeclarationContext ctx, Boolean isDecl) {

        int line = ctx.start.getLine();
        int column = ctx.start.getCharPositionInLine() + 1;
        String id = ctx.getChild(0).getText();

        if (!isDecl && !CheckExistanceInParentScope(id, index) && !CheckExistanceInScope(id, index)) {
            semanticErrors.add("Undefined name " + id + " at (" + line + "," + column + ")");
        }

        if (!isDecl && (CheckExistanceInParentScope(id, index) || CheckExistanceInScope(id, index)) && !CheckIfTypeMatchesParentType(id, index, NodeType.INT.toString())) {
            semanticErrors.add("A value of type " + NodeType.INT.toString() + " can't be assigned to a variable of type " + getParentType(id, index, NodeType.INT.toString()));
        }
        if (isDecl && CheckExistanceInScope(id, index)) {
            semanticErrors.add("The name " + id + " already defined (" + line + "," + column + ")");
        } else {

            if (ctx.addExpression() != null) {

                AddExpression expr = visitAddExpression(ctx.addExpression());

                scopes.get(index - 1).getSymbolMap().put(id, new SymbolTableObject(NodeType.INT.toString(), String.valueOf(expr.value.getNum())));

                int linee = ctx.start.getLine();
                String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
                String type = NodeType.INTEGERDECLARATION.toString();
                int childCount = ctx.getChildCount();
                return new IntegerDeclaration(expr, id, linee, parent, type, childCount);
            } else {
                scopes.get(index - 1).getSymbolMap().put(id, new SymbolTableObject(NodeType.INT.toString(), "0"));

                int linee = ctx.start.getLine();
                String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
                String type = NodeType.INTEGERDECLARATION.toString();
                int childCount = ctx.getChildCount();
                return new IntegerDeclaration(null, id, linee, parent, type, childCount);
            }
        }
        int linee = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.INTEGERDECLARATION.toString();
        int childCount = ctx.getChildCount();
        return new IntegerDeclaration(id, linee, parent, type, childCount);
    }
//TODO complete this methods

    /////////////////////////////////////

    @Override
    public BinaryExpr visitBinaryExpr(dart_parse.BinaryExprContext ctx) {
        int line = ctx.start.getLine();
        //String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.BOOLEAN.toString();
        int childCount = ctx.getChildCount();
        List<dart_parse.TermContext> Terms = ctx.term();
        if (Terms.size() == 1) {
            dart_parse.TermContext term = Terms.get(0);
            TermAbstractChild<Boolean> termResult = visitTerm(term);
            boolean result = termResult.getValue();
            return new BinaryExpr(line, null, type, childCount, result);
        } else {
            dart_parse.TermContext leftTerm = Terms.get(0);
            TermAbstractChild<Boolean> leftResult = visitTerm(leftTerm);
            boolean num1 = leftResult.getValue();
            boolean result = num1;
            for (int i = 0; i < Terms.size() - 1; i++) {
                leftTerm = Terms.get(i);
                dart_parse.TermContext rightTerm = Terms.get(i + 1);
                String operator = ctx.getChild(2 * i + 1).getText();
                leftResult = visitTerm(leftTerm);
                TermAbstractChild<Boolean> rightResult = visitTerm(rightTerm);
                num1 = result;
                boolean num2 = rightResult.getValue();
                switch (operator) {
                    case "==" -> result = (num1 == num2);

                    case "!=" -> result = (num1 != num2);
                }
            }
            return new BinaryExpr(line, null, type, childCount, result);
        }
    }

    @Override
    public TermAbstractChild<Boolean> visitTerm(dart_parse.TermContext ctx) {
        if (ctx.numericExpr() != null) {
            return visitNumericExpr(ctx.numericExpr());
        }
        if (ctx.conditionExpr() != null) {
            return visitConditionExpr(ctx.conditionExpr());
        }
        if (ctx.booleans() != null) {
            return visitBooleans(ctx.booleans());
        }
        return null;
    }

    @Override
    public NumericExpr visitNumericExpr(dart_parse.NumericExprContext ctx) {
        int line = ctx.start.getLine();
        // String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.BOOLEAN.toString();
        int childCount = ctx.getChildCount();
        List<dart_parse.NumericTermContext> numericTerms = ctx.numericTerm();
        dart_parse.NumericTermContext leftTerm = numericTerms.get(0);
        dart_parse.NumericTermContext rightTerm = numericTerms.get(1);
        String operator = ctx.getChild(1).getText();
        NumericTermAbstractChild<Double> leftResult = visitNumericTerm(leftTerm);
        NumericTermAbstractChild<Double> rightResult = visitNumericTerm(rightTerm);
        double num1 = leftResult.getValue();
        double num2 = rightResult.getValue();
        boolean bool = false;
        switch (operator) {
            case "==" -> bool = (num1 == num2);

            case "!=" -> bool = (num1 != num2);

            case ">=" -> bool = (num1 >= num2);

            case "<=" -> bool = (num1 <= num2);

        }
        return new NumericExpr(line, null, type, childCount, bool);
    }

    @Override
    public NumericTermAbstractChild<Double> visitNumericTerm(dart_parse.NumericTermContext ctx) {
        if (ctx.addExpression() != null) {
            return visitAddExpression(ctx.addExpression());
        }
        if (ctx.addDoubleExpression() != null) {
            return visitAddDoubleExpression(ctx.addDoubleExpression());
        }
        return null;
    }

    @Override
    public AndExpr visitAndExpr(dart_parse.AndExprContext ctx) {
        int line = ctx.start.getLine();
        //String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.BOOLEAN.toString();
        int childCount = ctx.getChildCount();
        List<dart_parse.BinaryExprContext> expressions = ctx.binaryExpr();
        if (expressions.size() == 1) {
            dart_parse.BinaryExprContext expr = expressions.get(0);
            BinaryExpr exprResult = visitBinaryExpr(expr);
            boolean result = exprResult.isValue();
            return new AndExpr(line, null, type, childCount, result);
        } else {
            dart_parse.BinaryExprContext leftExpr = expressions.get(0);
            BinaryExpr leftResult = visitBinaryExpr(leftExpr);
            boolean result = leftResult.isValue();;
            for (int i = 0; i < expressions.size() - 1; i++) {
                dart_parse.BinaryExprContext rightExpr = expressions.get(i + 1);
                BinaryExpr rightResult = visitBinaryExpr(rightExpr);
                boolean num2 = rightResult.isValue();
                result = (result && num2);
            }
            return new AndExpr(line, null, type, childCount, result);
        }
    }

    @Override
    public ConditionExpr visitConditionExpr(dart_parse.ConditionExprContext ctx) {
        int line = ctx.start.getLine();
        //String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.BOOLEAN.toString();
        int childCount = ctx.getChildCount();
        List<dart_parse.AndExprContext> expressions = ctx.andExpr();
        if (expressions.size() == 1) {
            dart_parse.AndExprContext expr = expressions.get(0);
            AndExpr exprResult = visitAndExpr(expr);
            boolean result = exprResult.isValue();
            return new ConditionExpr(line, null, type, childCount, result);
        } else {
            dart_parse.AndExprContext leftExpr = expressions.get(0);
            AndExpr leftResult = visitAndExpr(leftExpr);
            boolean result = leftResult.isValue();;
            for (int i = 0; i < expressions.size() - 1; i++) {
                dart_parse.AndExprContext rightExpr = expressions.get(i + 1);
                AndExpr rightResult = visitAndExpr(rightExpr);
                boolean num2 = rightResult.isValue();
                result = (result || num2);
            }
            return new ConditionExpr(line, null, type, childCount, result);
        }
    }

    @Override
    public ForInit visitForInit(dart_parse.ForInitContext ctx) {
        return null;
    }

    /////////////////////////////////////

    public DoubleDeclarationLine visitDoubleDeclarationLine(dart_parse.DoubleDeclarationLineContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        int column = ctx.start.getCharPositionInLine() + 1;
        String type = NodeType.DOUBLEDECLARATIONLINE.toString();
        int childCount = ctx.getChildCount();
        List<DoubleDeclaration> l = new ArrayList<>();
        Boolean isDecl = !(ctx.DOUBLE() == null);


        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (Objects.equals(ctx.getChild(i).getText(), ","))
                continue;
            if (ctx.getChild(i) instanceof dart_parse.DoubleDeclarationContext) {
                l.add(visitDoubleDeclaration((dart_parse.DoubleDeclarationContext) ctx.getChild(i), isDecl));
            }
        }
        return new DoubleDeclarationLine(line, parent, type, childCount, l);
    }

    public DoubleDeclaration visitDoubleDeclaration(dart_parse.DoubleDeclarationContext ctx, Boolean isDecl) {

        int line = ctx.start.getLine();
        int column = ctx.start.getCharPositionInLine() + 1;
        String name = String.valueOf(ctx.NAME());


        if (!isDecl && !CheckExistanceInParentScope(name, index) && !CheckExistanceInScope(name, index)) {
            semanticErrors.add("Undefined name " + name + " at (" + line + "," + column + ")");
        }

        if (!isDecl && (CheckExistanceInParentScope(name, index) || CheckExistanceInScope(name, index)) && !CheckIfTypeMatchesParentType(name, index, NodeType.DOUBLE.toString())) {
            semanticErrors.add("A value of type " + NodeType.DOUBLE.toString() + " can't be assigned to a variable of type " + getParentType(name, index, NodeType.DOUBLE.toString()));
        }

        if (isDecl && CheckExistanceInScope(name, index)) {
            semanticErrors.add("The name " + name + " already defined (" + line + "," + column + ")");
        } else {
            if (ctx.addDoubleExpression() != null) {
                AddDoubleExpression expr = visitAddDoubleExpression(ctx.addDoubleExpression());
                scopes.get(index - 1).getSymbolMap().put(name, new SymbolTableObject(NodeType.DOUBLE.toString(), String.valueOf(expr.value.getNum())));
                int linee = ctx.start.getLine();
                String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
                String type = NodeType.DOUBLEDECLARATION.toString();
                int childCount = ctx.getChildCount();
                return new DoubleDeclaration(expr, name, linee, parent, type, childCount);
            } else {
                scopes.get(index - 1).getSymbolMap().put(name, new SymbolTableObject(NodeType.DOUBLE.toString(), "0.0"));

                int linee = ctx.start.getLine();
                String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
                String type = NodeType.DOUBLEDECLARATION.toString();
                int childCount = ctx.getChildCount();
                return new DoubleDeclaration(null, name, linee, parent, type, childCount);
            }
        }

        int linee = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.DOUBLEDECLARATION.toString();
        int childCount = ctx.getChildCount();
        return new DoubleDeclaration(name, linee, parent, type, childCount);
    }


    public StringDeclarationLine visitStringDeclarationLine(dart_parse.StringDeclarationLineContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        int column = ctx.start.getCharPositionInLine() + 1;
        String type = NodeType.STRINGDECLARATIONLINE.toString();
        int childCount = ctx.getChildCount();
        List<StringDeclaration> l = new ArrayList<>();
        Boolean isDecl = !(ctx.STRING() == null);


        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (Objects.equals(ctx.getChild(i).getText(), ","))
                continue;
            if (ctx.getChild(i) instanceof dart_parse.StringDeclarationContext) {
                l.add(visitStringDeclaration((dart_parse.StringDeclarationContext) ctx.getChild(i), isDecl));
            }
        }
        return new StringDeclarationLine(line, parent, type, childCount, l);
    }

    public StringDeclaration visitStringDeclaration(dart_parse.StringDeclarationContext ctx, Boolean isDecl) {
        String name = null;
        String stringLine = null;
        if (ctx.NAME() != null) {
            name = String.valueOf(ctx.NAME());
        }
        if (ctx.STRING_LINE() != null) {
            stringLine = String.valueOf(ctx.STRING_LINE());
        }
        int line = ctx.start.getLine();
        int column = ctx.start.getCharPositionInLine() + 1;

        if (!isDecl && !CheckExistanceInParentScope(name, index) && !CheckExistanceInScope(name, index)) {
            semanticErrors.add("Undefined name " + name + " at (" + line + "," + column + ")");
        }
        if (!isDecl && (CheckExistanceInParentScope(name, index) || CheckExistanceInScope(name, index)) && !CheckIfTypeMatchesParentType(name, index, NodeType.STRING.toString())) {
            semanticErrors.add("A value of type " + NodeType.STRING.toString() + " can't be assigned to a variable of type " + getParentType(name, index, NodeType.STRING.toString()));
        }
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.TOPTREEDECLARATION.toString();
        int childCount = ctx.getChildCount();


        if (isDecl && CheckExistanceInScope(name, index)) {
            semanticErrors.add("The name " + name + " already defined (" + line + "," + column + ")");
        } else {
            scopes.get(index - 1).getSymbolMap().put(name, new SymbolTableObject(NodeType.STRING.toString(), stringLine));
        }


        return new StringDeclaration(name, stringLine, line, parent, type, childCount);
    }

    public BooleanDeclarationLine visitBooleanDeclarationLine(dart_parse.BooleanDeclarationLineContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        int column = ctx.start.getCharPositionInLine() + 1;
        String type = NodeType.BOOLEANDECLARATIONLINE.toString();
        int childCount = ctx.getChildCount();
        List<BooleanDeclaration> l = new ArrayList<>();
        Boolean isDecl = !(ctx.BOOL() == null);


        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (Objects.equals(ctx.getChild(i).getText(), ","))
                continue;
            if (ctx.getChild(i) instanceof dart_parse.BooleanDeclarationContext) {
                l.add(visitBooleanDeclaration((dart_parse.BooleanDeclarationContext) ctx.getChild(i), isDecl));
            }
        }
        return new BooleanDeclarationLine(line, parent, type, childCount, l);
    }


    public BooleanDeclaration visitBooleanDeclaration(dart_parse.BooleanDeclarationContext ctx, Boolean isDecl) {
        int line = ctx.start.getLine();
        int column = ctx.start.getCharPositionInLine() + 1;
        String id = ctx.getChild(0).getText();

        if (!isDecl && !CheckExistanceInParentScope(id, index) && !CheckExistanceInScope(id, index)) {
            semanticErrors.add("Undefined name " + id + " at (" + line + "," + column + ")");
        }

        if (!isDecl && (CheckExistanceInParentScope(id, index) || CheckExistanceInScope(id, index)) && !CheckIfTypeMatchesParentType(id, index, NodeType.BOOL.toString())) {
            semanticErrors.add("A value of type " + NodeType.BOOL.toString() + " can't be assigned to a variable of type " + getParentType(id, index, NodeType.BOOL.toString()));
        }
        if (isDecl && CheckExistanceInScope(id, index)) {
            semanticErrors.add("The name " + id + " already defined (" + line + "," + column + ")");
        } else {
            if (ctx.booleans() != null) {
                BooleanValueClass expr = visitBooleans(ctx.booleans());

                scopes.get(index - 1).getSymbolMap().put(id, new SymbolTableObject(NodeType.BOOL.toString(), String.valueOf(expr.getBool())));

                int linee = ctx.start.getLine();
                String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
                String type = NodeType.BOOLEANDECLARATION.toString();
                int childCount = ctx.getChildCount();
                return new BooleanDeclaration(id, expr, linee, parent, type, childCount);
            } else {
                scopes.get(index - 1).getSymbolMap().put(id, new SymbolTableObject(NodeType.BOOL.toString(), "0.0"));

                int linee = ctx.start.getLine();
                String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
                String type = NodeType.BOOLEANDECLARATION.toString();
                int childCount = ctx.getChildCount();
                return new BooleanDeclaration(id, linee, parent, type, childCount);
            }
        }
//        scopes.get(index - 1).getSymbolMap().put(id, new SymbolTableObject(NodeType.BOOL.toString(), ctx.booleans().getText()));
        int linee = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.BOOLEANDECLARATION.toString();
        int childCount = ctx.getChildCount();
        return new BooleanDeclaration(id, linee, parent, type, childCount);
    }

    @Override
    public AddExpression visitAddExpression(dart_parse.AddExpressionContext ctx) {
        double num;
        double value;
        Queue<Object> queue = new LinkedList<>();
        if (ctx.getChild(0) instanceof dart_parse.MultiplyExpressionContext) {
            MultiplyExpression expr = visitMultiplyExpression((dart_parse.MultiplyExpressionContext) ctx.getChild(0));
            value = expr.getValue().getNum();
        } else {
            value = Double.parseDouble(ctx.getChild(0).getText());
        }
        for (int i = 1; i < ctx.getChildCount(); i++) {
            if (ctx.getChild(i) instanceof dart_parse.MultiplyExpressionContext) {
                MultiplyExpression expr = visitMultiplyExpression((dart_parse.MultiplyExpressionContext) ctx.getChild(i));
                double n = expr.getValue().getNum();
                queue.add(n);
            } else {
                queue.add(ctx.getChild(i).getText());
            }
        }
        while (!queue.isEmpty()) {
            String operator = (String) queue.remove();
            if (queue.peek() instanceof Double) {
                num = (double) queue.remove();
            } else {
                num = Double.parseDouble((String) queue.remove());
            }
            if (operator.equals("+")) {
                value += num;
            } else if (operator.equals("-")) {
                value -= num;
            }
        }
        int intValue = (int) value;
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.NUMBER.toString();
        int childCount = ctx.getChildCount();
        NumberClass numClass = new NumberClass(intValue, line, "Add Expression", type, childCount);
        type = NodeType.ADDEXPRESSION.toString();
        childCount = ctx.getChildCount();
        return new AddExpression(numClass, line, parent, type, childCount);
    }

    @Override
    public MultiplyExpression visitMultiplyExpression(dart_parse.MultiplyExpressionContext ctx) {
        Queue<Object> queue = new LinkedList<>();
        double value = Double.parseDouble(ctx.getChild(0).getText());
        for (int i = 1; i < ctx.getChildCount(); i++) {
            queue.add(ctx.getChild(i).getText());
        }
        while (!queue.isEmpty()) {
            String operator = (String) queue.remove();
            double num = Double.parseDouble((String) queue.remove());
            if (operator.equals("*")) {
                value *= num;
            } else if (operator.equals("/")) {
                value /= num;
            }
        }
        int intValue = (int) value;
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.NUMBER.toString();
        int childCount = ctx.getChildCount();
        NumberClass num = new NumberClass(intValue, line, "Multiply Expression", type, childCount);
        type = NodeType.MULTIPLYEXPRESSION.toString();
        childCount = ctx.getChildCount();
        return new MultiplyExpression(num, line, parent, type, childCount);
    }

    @Override
    public AddDoubleExpression visitAddDoubleExpression(dart_parse.AddDoubleExpressionContext ctx) {
        double num;
        double value;
        Queue<Object> queue = new LinkedList<>();
        if (ctx.getChild(0) instanceof dart_parse.MultiplyDoubleExpressionContext) {
            MultiplyDoubleExpression expr = visitMultiplyDoubleExpression((dart_parse.MultiplyDoubleExpressionContext) ctx.getChild(0));
            value = expr.getValue().getNum();
        } else {
            value = Double.parseDouble(ctx.getChild(0).getText());
        }
        for (int i = 1; i < ctx.getChildCount(); i++) {
            if (ctx.getChild(i) instanceof dart_parse.MultiplyDoubleExpressionContext) {
                MultiplyDoubleExpression expr = visitMultiplyDoubleExpression((dart_parse.MultiplyDoubleExpressionContext) ctx.getChild(i));
                double n = expr.getValue().getNum();
                queue.add(n);
            } else {
                queue.add(ctx.getChild(i).getText());
            }
        }
        while (!queue.isEmpty()) {
            String operator = (String) queue.remove();
            if (queue.peek() instanceof Double) {
                num = (double) queue.remove();
            } else {
                num = Double.parseDouble((String) queue.remove());
            }
            if (operator.equals("+")) {
                value += num;
            } else if (operator.equals("-")) {
                value -= num;
            }
        }
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.NUMBERDOUBLE.toString();
        int childCount = ctx.getChildCount();
        NumberDoubleClass numClass = new NumberDoubleClass(value, line, "Add Double Expression", type, childCount);
        String nodeType = NodeType.ADDDOUBLEEXPRESSION.toString();
        return new AddDoubleExpression(numClass, line, parent, nodeType, childCount);
    }

    @Override
    public MultiplyDoubleExpression visitMultiplyDoubleExpression(dart_parse.MultiplyDoubleExpressionContext ctx) {
        Queue<Object> queue = new LinkedList<>();
        double value = Double.parseDouble(ctx.getChild(0).getText());
        for (int i = 1; i < ctx.getChildCount(); i++) {
            queue.add(ctx.getChild(i).getText());
        }
        while (!queue.isEmpty()) {
            String operator = (String) queue.remove();
            double num = Double.parseDouble((String) queue.remove());
            if (operator.equals("*")) {
                value *= num;
            } else if (operator.equals("/")) {
                value /= num;
            }
        }
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.NUMBERDOUBLE.toString();
        int childCount = ctx.getChildCount();
        NumberDoubleClass num = new NumberDoubleClass(value, line, "Multiply Double Expression", type, childCount);
        type = NodeType.MULTIPLYDOUBLEEXPRESSION.toString();
        childCount = ctx.getChildCount();
        return new MultiplyDoubleExpression(num, line, parent, type, childCount);
    }

    @Override
    public BooleanValueClass visitBooleans(dart_parse.BooleansContext ctx) {

        if (ctx.TRUE() != null) {
            if (ctx.TRUE().getText().equals("true")) {
                int line = ctx.start.getLine();
                String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
                String type = NodeType.BOOLEAN.toString();
                int childCount = ctx.getChildCount();
                return new BooleanValueClass(Boolean.parseBoolean(ctx.TRUE().getText()), line, parent, type, childCount);
            } else {
                Token boolToken = ctx.TRUE().getSymbol();
                int line = boolToken.getLine();
                int column = boolToken.getCharPositionInLine() + 1;
                semanticErrors.add("Error: Undefined name " + ctx.TRUE().getText() + "(" + line + "," + column + ")");
            }
        } else if (ctx.FALSE() != null) {
            if (ctx.FALSE().getText().equals("false")) {
                int line = ctx.start.getLine();
                String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
                String type = NodeType.BOOLEAN.toString();
                int childCount = ctx.getChildCount();
                return new BooleanValueClass(Boolean.parseBoolean(ctx.FALSE().getText()), line, parent, type, childCount);
            } else {
                Token boolToken = ctx.FALSE().getSymbol();
                int line = boolToken.getLine();
                int column = boolToken.getCharPositionInLine() + 1;
                semanticErrors.add("Error: Undefined name " + ctx.TRUE().getText() + "(" + line + "," + column + ")");
            }

        } else {
            //TODO add error Arraylist
            return null;
        }
        return null;
    }

    @Override
    public NumberDoubleClass visitNumberDouble(dart_parse.NumberDoubleContext ctx) {
        double number = Double.parseDouble(ctx.NUMBERDOUBLE().getText());
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.NUMBERDOUBLE.toString();
        int childCount = ctx.getChildCount();
        return new NumberDoubleClass(number, line, parent, type, childCount);
    }
}
