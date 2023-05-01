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
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.VARIABLE.toString();
        int childCount = ctx.getChildCount();

        if (ctx.stringDeclarationLine() != null) {
            return new Variable(visitStringDeclarationLine(ctx.stringDeclarationLine()), line, parent, type, childCount);
        }
        if (ctx.integerDeclarationLine() != null) {
            return new Variable(visitIntegerDeclarationLine(ctx.integerDeclarationLine()), line, parent, type, childCount);
        }
        if (ctx.doubleDeclarationLine() != null) {
            return new Variable(visitDoubleDeclarationLine(ctx.doubleDeclarationLine()), line, parent, type, childCount);
        }
        if (ctx.booleanDeclarationLine() != null) {
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
        // int column = ctx.start.getCharPositionInLine() + 1;
        String type = NodeType.INTEGERDECLARATIONLINE.toString();
        int childCount = ctx.getChildCount();
        List<IntegerDeclaration> declarations = new ArrayList<>();
        List<IntegerDeclarationAssignment> assignments = new ArrayList<>();


        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (Objects.equals(ctx.getChild(i).getText(), ","))
                continue;
            if (ctx.getChild(i) instanceof dart_parse.IntegerDeclarationContext) {
                declarations.add(visitIntegerDeclaration((dart_parse.IntegerDeclarationContext) ctx.getChild(i)));
            } else if (ctx.getChild(i) instanceof dart_parse.IntegerDeclarationAssignmentContext) {
                assignments.add(visitIntegerDeclarationAssignment((dart_parse.IntegerDeclarationAssignmentContext) ctx.getChild(i)));
            }
        }
        return new IntegerDeclarationLine(line, parent, type, childCount, declarations, assignments);
    }

    public IntegerDeclaration visitIntegerDeclaration(dart_parse.IntegerDeclarationContext ctx) {

        int line = ctx.start.getLine();
        int column = ctx.start.getCharPositionInLine() + 1;
        String id = ctx.getChild(0).getText();
        String type = NodeType.INTEGERDECLARATION.toString();
        int childCount = ctx.getChildCount();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");

        if (CheckExistanceInScope(id, index)) {
            semanticErrors.add("The name " + id + " already defined (" + line + "," + column + ")");
        } else {
            scopes.get(index - 1).getSymbolMap().put(id, new SymbolTableObject(NodeType.INT.toString(), "0"));
        }
        varialbeNames.add("Identifier " + id + ", Type " + NodeType.INT + ", Value : 0 ,  Scope " + scopes.peek().getScopeName());
        return new IntegerDeclaration(id, line, parent, type, childCount);
    }

    public IntegerAssignment visitIntegerAssignment(dart_parse.IntegerAssignmentContext ctx) {
        int line = ctx.start.getLine();
        int column = ctx.start.getCharPositionInLine() + 1;
        String id = ctx.getChild(0).getText();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.INTEGERASSIGNMENT.toString();
        int childCount = ctx.getChildCount();

        if (!CheckExistanceInParentScope(id, index) && !CheckExistanceInScope(id, index)) {
            semanticErrors.add("Undefined name " + id + " at (" + line + "," + column + ")");
        } else if ((CheckExistanceInParentScope(id, index) || CheckExistanceInScope(id, index)) && !CheckIfTypeMatchesParentType(id, index, NodeType.INT.toString())) {
            semanticErrors.add("A value of type " + NodeType.INT.toString() + " can't be assigned to a variable of type " + getParentType(id, index, NodeType.INT.toString()));
        } else {
            AddExpression expr = visitAddExpression(ctx.addExpression());
            scopes.get(index - 1).getSymbolMap().put(id, new SymbolTableObject(NodeType.INT.toString(), String.valueOf(expr.value.getNum())));
            varialbeNames.add("Identifier " + id + ", Type " + NodeType.INT + ", Value :" + expr + " Scope " + scopes.peek().getScopeName());
            return new IntegerAssignment(expr, id, line, parent, type, childCount);
        }
        return new IntegerAssignment(null, id, line, parent, type, childCount);
    }

    public IntegerDeclarationAssignment visitIntegerDeclarationAssignment(dart_parse.IntegerDeclarationAssignmentContext ctx) {
        int line = ctx.start.getLine();
        int column = ctx.start.getCharPositionInLine() + 1;
        String id = ctx.getChild(0).getText();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.INTEGERDECLARATIONASSIGNMENT.toString();
        int childCount = ctx.getChildCount();

        if (CheckExistanceInScope(id, index)) {
            semanticErrors.add("The name " + id + " already defined (" + line + "," + column + ")");
        } else if ((CheckExistanceInParentScope(id, index) || CheckExistanceInScope(id, index)) && !CheckIfTypeMatchesParentType(id, index, NodeType.INT.toString())) {
            semanticErrors.add("A value of type " + NodeType.INT.toString() + " can't be assigned to a variable of type " + getParentType(id, index, NodeType.INT.toString()));
        } else {
            AddExpression expr = visitAddExpression(ctx.addExpression());
            scopes.get(index - 1).getSymbolMap().put(id, new SymbolTableObject(NodeType.INT.toString(), String.valueOf(expr.value.getNum())));
            varialbeNames.add("Identifier " + id + ", Type " + NodeType.INT + ", Value : " + expr.value.getNum() + " , Scope " + scopes.peek().getScopeName());
            return new IntegerDeclarationAssignment(expr, id, line, parent, type, childCount);
        }
        return new IntegerDeclarationAssignment(null, id, line, parent, type, childCount);
    }

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
                dart_parse.TermContext rightTerm = Terms.get(i + 1);
                String operator = ctx.getChild(2 * i + 1).getText();
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
        dart_parse.BinaryExprContext expr = expressions.get(0);
        BinaryExpr exprResult = visitBinaryExpr(expr);
        boolean result = exprResult.isValue();
        if (expressions.size() != 1) {
            for (int i = 0; i < expressions.size() - 1; i++) {
                dart_parse.BinaryExprContext rightExpr = expressions.get(i + 1);
                BinaryExpr rightResult = visitBinaryExpr(rightExpr);
                boolean num2 = rightResult.isValue();
                result = (result && num2);
            }
        }
        return new AndExpr(line, null, type, childCount, result);
    }

    @Override
    public ConditionExpr visitConditionExpr(dart_parse.ConditionExprContext ctx) {
        int line = ctx.start.getLine();
        //String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.BOOLEAN.toString();
        int childCount = ctx.getChildCount();
        List<dart_parse.AndExprContext> expressions = ctx.andExpr();
        dart_parse.AndExprContext expr = expressions.get(0);
        AndExpr exprResult = visitAndExpr(expr);
        boolean result = exprResult.isValue();
        if (expressions.size() != 1) {
            for (int i = 0; i < expressions.size() - 1; i++) {
                dart_parse.AndExprContext rightExpr = expressions.get(i + 1);
                AndExpr rightResult = visitAndExpr(rightExpr);
                boolean num2 = rightResult.isValue();
                result = (result || num2);
            }
        }
        return new ConditionExpr(line, null, type, childCount, result);
    }

    @Override
    public VariableAssignment visitVariableAssignment(dart_parse.VariableAssignmentContext ctx) {
        //TODO add is Decl param
        if(ctx.integerDeclaration()!=null){
            return visitIntegerDeclaration(ctx.integerDeclaration());
        }
        else if(ctx.doubleDeclaration()!=null){
            return visitDoubleDeclaration(ctx.doubleDeclaration());
        }
        else if(ctx.booleanDeclaration()!=null){
            return visitBooleanDeclaration(ctx.booleanDeclaration());
        }
        else
            return visitStringDeclaration(ctx.stringDeclaration());
    }


    public DoubleDeclarationLine visitDoubleDeclarationLine(dart_parse.DoubleDeclarationLineContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.DOUBLEDECLARATIONLINE.toString();
        int childCount = ctx.getChildCount();
        List<DoubleDeclaration> declarations = new ArrayList<>();
        List<DoubleDeclarationAssignment> assignments = new ArrayList<>();


        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (Objects.equals(ctx.getChild(i).getText(), ","))
                continue;
            if (ctx.getChild(i) instanceof dart_parse.DoubleDeclarationContext) {
                declarations.add(visitDoubleDeclaration((dart_parse.DoubleDeclarationContext) ctx.getChild(i)));
            } else if (ctx.getChild(i) instanceof dart_parse.DoubleDeclarationAssignmentContext) {
                assignments.add(visitDoubleDeclarationAssignment((dart_parse.DoubleDeclarationAssignmentContext) ctx.getChild(i)));
            }
        }
        return new DoubleDeclarationLine(line, parent, type, childCount, declarations, assignments);
    }

    public DoubleDeclarationAssignment visitDoubleDeclarationAssignment(dart_parse.DoubleDeclarationAssignmentContext ctx) {
        int line = ctx.start.getLine();
        int column = ctx.start.getCharPositionInLine() + 1;
        String id = ctx.getChild(0).getText();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.DOUBLEDECLARATIONASSIGNMENT.toString();
        int childCount = ctx.getChildCount();

        if (CheckExistanceInScope(id, index)) {
            semanticErrors.add("The name " + id + " already defined (" + line + "," + column + ")");
        } else if ((CheckExistanceInParentScope(id, index) || CheckExistanceInScope(id, index)) && !CheckIfTypeMatchesParentType(id, index, NodeType.DOUBLE.toString())) {
            semanticErrors.add("A value of type " + NodeType.DOUBLE.toString() + " can't be assigned to a variable of type " + getParentType(id, index, NodeType.DOUBLE.toString()));
        } else {
            AddDoubleExpression expr = visitAddDoubleExpression(ctx.addDoubleExpression());
            scopes.get(index - 1).getSymbolMap().put(id, new SymbolTableObject(NodeType.DOUBLE.toString(), String.valueOf(expr.value.getNum())));
            varialbeNames.add("Identifier " + id + ", Type " + NodeType.DOUBLE + ", Value : " + expr.value.getNum() + " , Scope " + scopes.peek().getScopeName());
            return new DoubleDeclarationAssignment(expr, id, line, parent, type, childCount);
        }
        return new DoubleDeclarationAssignment(null, id, line, parent, type, childCount);
    }

    public DoubleDeclaration visitDoubleDeclaration(dart_parse.DoubleDeclarationContext ctx) {

        int line = ctx.start.getLine();
        int column = ctx.start.getCharPositionInLine() + 1;
        String name = String.valueOf(ctx.NAME());
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.DOUBLEDECLARATION.toString();
        int childCount = ctx.getChildCount();

        if (CheckExistanceInScope(name, index)) {
            semanticErrors.add("The name " + name + " already defined (" + line + "," + column + ")");
        } else {
            scopes.get(index - 1).getSymbolMap().put(name, new SymbolTableObject(NodeType.DOUBLE.toString(), "0.0"));
        }
        varialbeNames.add("Identifier " + name + ", Type " + NodeType.DOUBLE + ", Value : 0.0 , Scope " + scopes.peek().getScopeName());
        return new DoubleDeclaration(name, line, parent, type, childCount);
    }

    public DoubleAssignment visitDoubleAssignment(dart_parse.DoubleAssignmentContext ctx) {
        int line = ctx.start.getLine();
        int column = ctx.start.getCharPositionInLine() + 1;
        String id = ctx.getChild(0).getText();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.DOUBLEASSIGNMENT.toString();
        int childCount = ctx.getChildCount();

        if (!CheckExistanceInParentScope(id, index) && !CheckExistanceInScope(id, index)) {
            semanticErrors.add("Undefined name " + id + " at (" + line + "," + column + ")");
        } else if ((CheckExistanceInParentScope(id, index) || CheckExistanceInScope(id, index)) && !CheckIfTypeMatchesParentType(id, index, NodeType.DOUBLE.toString())) {
            semanticErrors.add("A value of type " + NodeType.DOUBLE.toString() + " can't be assigned to a variable of type " + getParentType(id, index, NodeType.DOUBLE.toString()));
        } else {
            AddDoubleExpression expr = visitAddDoubleExpression(ctx.addDoubleExpression());
            scopes.get(index - 1).getSymbolMap().put(id, new SymbolTableObject(NodeType.DOUBLE.toString(), String.valueOf(expr.value.getNum())));
            varialbeNames.add("Identifier " + id + ", Type " + NodeType.DOUBLE + ", Value :" + expr + " Scope " + scopes.peek().getScopeName());
            return new DoubleAssignment(expr, id, line, parent, type, childCount);
        }
        return new DoubleAssignment(null, id, line, parent, type, childCount);
    }


    public StringDeclarationLine visitStringDeclarationLine(dart_parse.StringDeclarationLineContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.STRINGDECLARATIONLINE.toString();
        int childCount = ctx.getChildCount();
        List<StringDeclaration> declarations = new ArrayList<>();
        List<StringDeclarationAssignment> assignments = new ArrayList<>();

        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (Objects.equals(ctx.getChild(i).getText(), ","))
                continue;
            if (ctx.getChild(i) instanceof dart_parse.StringDeclarationContext) {
                declarations.add(visitStringDeclaration((dart_parse.StringDeclarationContext) ctx.getChild(i)));
            }
            else if (ctx.getChild(i) instanceof dart_parse.StringDeclarationAssignmentContext) {
                assignments.add(visitStringDeclarationAssignment((dart_parse.StringDeclarationAssignmentContext) ctx.getChild(i)));
            }
        }
        return new StringDeclarationLine(line, parent, type, childCount, declarations, assignments);
    }

    public StringDeclarationAssignment visitStringDeclarationAssignment(dart_parse.StringDeclarationAssignmentContext ctx) {
        int line = ctx.start.getLine();
        int column = ctx.start.getCharPositionInLine() + 1;
        String id = ctx.getChild(0).getText();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.STRINGDECLARATIONASSIGNMENT.toString();
        int childCount = ctx.getChildCount();

        if (CheckExistanceInScope(id, index)) {
            semanticErrors.add("The name " + id + " already defined (" + line + "," + column + ")");
        } else if ((CheckExistanceInParentScope(id, index) || CheckExistanceInScope(id, index)) && !CheckIfTypeMatchesParentType(id, index, NodeType.STRING.toString())) {
            semanticErrors.add("A value of type " + NodeType.STRING.toString() + " can't be assigned to a variable of type " + getParentType(id, index, NodeType.STRING.toString()));
        } else {
            String expr = ctx.STRING_LINE().getText();
            scopes.get(index - 1).getSymbolMap().put(id, new SymbolTableObject(NodeType.STRING.toString(), expr));
            varialbeNames.add("Identifier " + id + ", Type " + NodeType.STRING + ", Value : " + expr + " , Scope " + scopes.peek().getScopeName());
            return new StringDeclarationAssignment(id, expr, line, parent, type, childCount);
        }
        return new StringDeclarationAssignment(id, null, line, parent, type, childCount);
    }


    public StringDeclaration visitStringDeclaration(dart_parse.StringDeclarationContext ctx) {
        String id = String.valueOf(ctx.NAME());
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.TOPTREEDECLARATION.toString();
        int line = ctx.start.getLine();
        int column = ctx.start.getCharPositionInLine() + 1;
        int childCount = ctx.getChildCount();

        if (CheckExistanceInScope(id, index)) {
            semanticErrors.add("The name " + id + " already defined (" + line + "," + column + ")");
        } else {
            scopes.get(index - 1).getSymbolMap().put(id, new SymbolTableObject(NodeType.STRING.toString(), ""));
        }
        varialbeNames.add("Identifier " + id + ", Type " + NodeType.STRING + ", Value : , Scope " + scopes.peek().getScopeName());
        return new StringDeclaration(id, line, parent, type, childCount);
    }

    public StringAssignment visitStringAssignment(dart_parse.StringAssignmentContext ctx) {
        int line = ctx.start.getLine();
        int column = ctx.start.getCharPositionInLine() + 1;
        String id = ctx.getChild(0).getText();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.STRINGASSIGNMENT.toString();
        int childCount = ctx.getChildCount();

        if (!CheckExistanceInParentScope(id, index) && !CheckExistanceInScope(id, index)) {
            semanticErrors.add("Undefined name " + id + " at (" + line + "," + column + ")");
        } else if ((CheckExistanceInParentScope(id, index) || CheckExistanceInScope(id, index)) && !CheckIfTypeMatchesParentType(id, index, NodeType.STRING.toString())) {
            semanticErrors.add("A value of type " + NodeType.STRING.toString() + " can't be assigned to a variable of type " + getParentType(id, index, NodeType.STRING.toString()));
        } else {
            String expr = ctx.STRING_LINE().getText();
            scopes.get(index - 1).getSymbolMap().put(id, new SymbolTableObject(NodeType.STRING.toString(), expr));
            varialbeNames.add("Identifier " + id + ", Type " + NodeType.STRING + ", Value :" + expr + " Scope " + scopes.peek().getScopeName());
            return new StringAssignment(expr, id, line, parent, type, childCount);
        }
        return new StringAssignment(null, id, line, parent, type, childCount);
    }


    public BooleanDeclarationLine visitBooleanDeclarationLine(dart_parse.BooleanDeclarationLineContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.BOOLEANDECLARATIONLINE.toString();
        int childCount = ctx.getChildCount();
        List<BooleanDeclaration> declarations = new ArrayList<>();
        List<BooleanDeclarationAssignment> assignments = new ArrayList<>();
        Boolean isDecl = !(ctx.BOOL() == null);


        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (Objects.equals(ctx.getChild(i).getText(), ","))
                continue;
            if (ctx.getChild(i) instanceof dart_parse.BooleanDeclarationContext) {
                declarations.add(visitBooleanDeclaration((dart_parse.BooleanDeclarationContext) ctx.getChild(i)));
            }
            else if (ctx.getChild(i) instanceof dart_parse.BooleanDeclarationAssignmentContext) {
                assignments.add(visitBooleanDeclarationAssignment((dart_parse.BooleanDeclarationAssignmentContext) ctx.getChild(i)));
            }
        }
        return new BooleanDeclarationLine(line, parent, type, childCount, declarations, assignments);
    }


    public BooleanDeclarationAssignment visitBooleanDeclarationAssignment(dart_parse.BooleanDeclarationAssignmentContext ctx) {
        int line = ctx.start.getLine();
        int column = ctx.start.getCharPositionInLine() + 1;
        String id = ctx.getChild(0).getText();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.BOOLEANDECLARATIONASSIGNMENT.toString();
        int childCount = ctx.getChildCount();

        if (CheckExistanceInScope(id, index)) {
            semanticErrors.add("The name " + id + " already defined (" + line + "," + column + ")");
        } else if ((CheckExistanceInParentScope(id, index) || CheckExistanceInScope(id, index)) && !CheckIfTypeMatchesParentType(id, index, NodeType.BOOL.toString())) {
            semanticErrors.add("A value of type " + NodeType.BOOL.toString() + " can't be assigned to a variable of type " + getParentType(id, index, NodeType.BOOL.toString()));
        } else {
            BooleanValueClass expr = visitBooleans(ctx.booleans());
            scopes.get(index - 1).getSymbolMap().put(id, new SymbolTableObject(NodeType.BOOL.toString(), String.valueOf(expr.value)));
            varialbeNames.add("Identifier " + id + ", Type " + NodeType.BOOL + ", Value : " + expr.getBool() + " , Scope " + scopes.peek().getScopeName());
            return new BooleanDeclarationAssignment(id, expr, line, parent, type, childCount);
        }
        return new BooleanDeclarationAssignment(id, null, line, parent, type, childCount);
    }

    public BooleanDeclaration visitBooleanDeclaration(dart_parse.BooleanDeclarationContext ctx) {
        int line = ctx.start.getLine();
        int column = ctx.start.getCharPositionInLine() + 1;
        String id = ctx.getChild(0).getText();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.BOOLEANDECLARATION.toString();
        int childCount = ctx.getChildCount();

        if (CheckExistanceInScope(id, index)) {
            semanticErrors.add("The name " + id + " already defined (" + line + "," + column + ")");
        } else {
            scopes.get(index - 1).getSymbolMap().put(id, new SymbolTableObject(NodeType.BOOL.toString(), String.valueOf(false)));
        }
        varialbeNames.add("Identifier " + id + ", Type " + NodeType.BOOL + ", Value : false , Scope " + scopes.peek().getScopeName());
        return new BooleanDeclaration(id, line, parent, type, childCount);
    }

    public BooleanAssignment visitBooleanAssignment(dart_parse.BooleanAssignmentContext ctx) {
        int line = ctx.start.getLine();
        int column = ctx.start.getCharPositionInLine() + 1;
        String id = ctx.getChild(0).getText();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.BOOLEANASSIGNMENT.toString();
        int childCount = ctx.getChildCount();

        if (!CheckExistanceInParentScope(id, index) && !CheckExistanceInScope(id, index)) {
            semanticErrors.add("Undefined name " + id + " at (" + line + "," + column + ")");
        } else if ((CheckExistanceInParentScope(id, index) || CheckExistanceInScope(id, index)) && !CheckIfTypeMatchesParentType(id, index, NodeType.BOOL.toString())) {
            semanticErrors.add("A value of type " + NodeType.BOOL.toString() + " can't be assigned to a variable of type " + getParentType(id, index, NodeType.BOOL.toString()));
        } else {
            BooleanValueClass expr = visitBooleans(ctx.booleans());
            scopes.get(index - 1).getSymbolMap().put(id, new SymbolTableObject(NodeType.BOOL.toString(), String.valueOf(expr.value)));
            varialbeNames.add("Identifier " + id + ", Type " + NodeType.BOOL + ", Value :" + expr + " Scope " + scopes.peek().getScopeName());
            return new BooleanAssignment(expr, id, line, parent, type, childCount);
        }
        return new BooleanAssignment(null, id, line, parent, type, childCount);
    }


    @Override
    public AddExpression visitAddExpression(dart_parse.AddExpressionContext ctx) {
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
        value = getAdditionValue(value, queue);
        int intValue = (int) value;
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.NUMBER.toString();
        int childCount = ctx.getChildCount();
        NumberClass numClass = new NumberClass(intValue, line, "Add Expression", type, childCount);
        type = NodeType.INT.toString();
        childCount = ctx.getChildCount();
        return new AddExpression(numClass, line, parent, type, childCount);
    }

    private double getAdditionValue(double value, Queue<Object> queue) {
        double num;
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
        return value;
    }

    private double getMultiValue(double value, Queue<Object> queue) {
        double num;
        while (!queue.isEmpty()) {
            String operator = (String) queue.remove();
            if (queue.peek() instanceof Double) {
                num = (double) queue.remove();
            } else {
                num = Double.parseDouble((String) queue.remove());
            }
            if (operator.equals("*")) {
                value *= num;
            } else if (operator.equals("/")) {
                value /= num;
            }
        }
        return value;
    }

    @Override
    public MultiplyExpression visitMultiplyExpression(dart_parse.MultiplyExpressionContext ctx) {
        Queue<Object> queue = new LinkedList<>();
        double value = Double.parseDouble(ctx.getChild(0).getText());
        for (int i = 1; i < ctx.getChildCount(); i++) {
            queue.add(ctx.getChild(i).getText());
        }
        value = getMultiValue(value, queue);
        int intValue = (int) value;
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.NUMBER.toString();
        int childCount = ctx.getChildCount();
        NumberClass num = new NumberClass(intValue, line, "Multiply Expression", type, childCount);
        type = NodeType.MULTIPLYEXPRESSION.toString();
        return new MultiplyExpression(num, line, parent, type, childCount);
    }

    @Override
    public AddDoubleExpression visitAddDoubleExpression(dart_parse.AddDoubleExpressionContext ctx) {
        double value;
        Queue<Object> queue = new LinkedList<>();
        if (ctx.getChild(0) instanceof dart_parse.MultiplyDoubleExpressionContext) {
            MultiplyDoubleExpression expr = visitMultiplyDoubleExpression((dart_parse.MultiplyDoubleExpressionContext) ctx.getChild(0));
            value = expr.getValue().getNum();
        } else value = Double.parseDouble(ctx.getChild(0).getText());
        for (int i = 1; i < ctx.getChildCount(); i++) {
            if (ctx.getChild(i) instanceof dart_parse.MultiplyDoubleExpressionContext) {
                MultiplyDoubleExpression expr = visitMultiplyDoubleExpression((dart_parse.MultiplyDoubleExpressionContext) ctx.getChild(i));
                double n = expr.getValue().getNum();
                queue.add(n);
            } else {
                queue.add(ctx.getChild(i).getText());
            }
        }
        value = getAdditionValue(value, queue);
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.NUMBERDOUBLE.toString();
        int childCount = ctx.getChildCount();
        NumberDoubleClass numClass = new NumberDoubleClass(value, line, "Add Double Expression", type, childCount);
        String nodeType = NodeType.DOUBLE.toString();
        return new AddDoubleExpression(numClass, line, parent, nodeType, childCount);
    }

    @Override
    public MultiplyDoubleExpression visitMultiplyDoubleExpression(dart_parse.MultiplyDoubleExpressionContext ctx) {
        Queue<Object> queue = new LinkedList<>();
        double value = Double.parseDouble(ctx.getChild(0).getText());
        for (int i = 1; i < ctx.getChildCount(); i++) {
            queue.add(ctx.getChild(i).getText());
        }
        value = getMultiValue(value, queue);
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
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.BOOLEAN.toString();
        int childCount = ctx.getChildCount();
        if (ctx.TRUE() != null) {
            if (ctx.TRUE().getText().equals("true")) {
                return new BooleanValueClass(Boolean.parseBoolean(ctx.TRUE().getText()), line, parent, type, childCount);
            } else {
                Token boolToken = ctx.TRUE().getSymbol();
                int column = boolToken.getCharPositionInLine() + 1;
                semanticErrors.add("Error: Undefined name " + ctx.TRUE().getText() + "(" + line + "," + column + ")");
            }
        } else if (ctx.FALSE() != null) {
            if (ctx.FALSE().getText().equals("false")) {
                return new BooleanValueClass(Boolean.parseBoolean(ctx.FALSE().getText()), line, parent, type, childCount);
            } else {
                Token boolToken = ctx.FALSE().getSymbol();
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
