package visitors;

import ast.NodeType;
import ast.Scope;
import ast.SymbolTableObject;
import ast.variables.*;
import gen.dart_parse;
import gen.dart_parseBaseVisitorChild;
import org.antlr.v4.runtime.Token;


import java.util.*;


public class VariablesVisitor extends dart_parseBaseVisitorChild {


    @Override
    public Variable visitVariable(dart_parse.VariableContext ctx) {


        if (ctx.stringDeclaration() != null) {

            int line = ctx.start.getLine();
            String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
            String type = NodeType.VARIABLE.toString();
            int childCount = ctx.getChildCount();
            return new Variable(visitStringDeclaration(ctx.stringDeclaration()), line, parent, type, childCount);
        }

        if (ctx.integerDeclaration() != null) {

            int line = ctx.start.getLine();
            String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
            String type = NodeType.VARIABLE.toString();
            int childCount = ctx.getChildCount();

            return new Variable(visitIntegerDeclaration(ctx.integerDeclaration()), line, parent, type, childCount);
        }
        if (ctx.doubleDeclaration() != null) {
            int line = ctx.start.getLine();
            String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
            String type = NodeType.VARIABLE.toString();
            int childCount = ctx.getChildCount();
            return new Variable(visitDoubleDeclaration(ctx.doubleDeclaration()), line, parent, type, childCount);
        }
        if (ctx.boolDeclaration() != null) {
            int line = ctx.start.getLine();
            String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
            String type = NodeType.VARIABLE.toString();
            int childCount = ctx.getChildCount();
            return new Variable(visitBoolDeclaration(ctx.boolDeclaration()), line, parent, type, childCount);
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
    public IntegerDeclaration visitIntegerDeclaration(dart_parse.IntegerDeclarationContext ctx) {

        int line = ctx.start.getLine();
        int column = ctx.start.getCharPositionInLine() + 1;
        String id = ctx.NAME().getText();

        if(ctx.INT()==null && !CheckExistanceInParentScope(id,index) && !CheckExistanceInScope(id,index)){
            semanticErrors.add("Undefined name " + id + " at (" + line + "," + column + ")");
        }

        if(ctx.INT()==null && (CheckExistanceInParentScope(id,index) || CheckExistanceInScope(id, index))&& !CheckIfTypeMatchesParentType(id,index,NodeType.INT.toString())){
            semanticErrors.add("A value of type "+ NodeType.INT.toString() +" can't be assigned to a variable of type "+getParentType(id,index,NodeType.INT.toString()));
        }

        if (ctx.INT()!=null && CheckExistanceInScope(id, index)) {
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
            }else{

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
    public Object visitConditionExpr(dart_parse.ConditionExprContext ctx) {
        return super.visitConditionExpr(ctx);
    }

    @Override
    public Object visitLogicalExpression(dart_parse.LogicalExpressionContext ctx) {
        return super.visitLogicalExpression(ctx);
    }

    @Override
    public Object visitBinaryExpr(dart_parse.BinaryExprContext ctx) {
        return super.visitBinaryExpr(ctx);
    }

    @Override
    public TermAbstractChild visitTerm(dart_parse.TermContext ctx) {
        String type;
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        int childCount = ctx.getChildCount();

        if (ctx.addExpression() != null){
           // AddExpression expr = visitAddExpression(ctx.addExpression());
        }
        if(ctx.addDoubleExpression() != null){
         //   return visitAddDoubleExpression(ctx.addDoubleExpression());
        }
        return null;
    }

    @Override
    public Object visitForInit(dart_parse.ForInitContext ctx) {
        return super.visitForInit(ctx);
    }

    /////////////////////////////////////
    @Override
    public DoubleDeclaration visitDoubleDeclaration(dart_parse.DoubleDeclarationContext ctx) {

        int line = ctx.start.getLine();
        int column = ctx.start.getCharPositionInLine() + 1;
        String name = String.valueOf(ctx.NAME());


        if(ctx.DOUBLE()==null && !CheckExistanceInParentScope(name,index) && !CheckExistanceInScope(name,index)){
            semanticErrors.add("Undefined name " + name + " at (" + line + "," + column + ")");
        }


        if(ctx.DOUBLE()==null && (CheckExistanceInParentScope(name,index) || CheckExistanceInScope(name, index) )&& !CheckIfTypeMatchesParentType(name,index,NodeType.DOUBLE.toString())){
            semanticErrors.add("A value of type "+ NodeType.DOUBLE.toString() +" can't be assigned to a variable of type "+getParentType(name,index,NodeType.DOUBLE.toString()));
        }

        if (ctx.DOUBLE()!=null && CheckExistanceInScope(name, index)) {
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
            }else{
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

    @Override
    public StringDeclaration visitStringDeclaration(dart_parse.StringDeclarationContext ctx) {
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

        if(ctx.STRING()==null && !CheckExistanceInParentScope(name,index) && !CheckExistanceInScope(name,index)){
            semanticErrors.add("Undefined name " + name + " at (" + line + "," + column + ")");
        }
        if(ctx.STRING()==null && (CheckExistanceInParentScope(name,index) || CheckExistanceInScope(name, index)) && !CheckIfTypeMatchesParentType(name,index,NodeType.STRING.toString())){
            semanticErrors.add("A value of type "+ NodeType.STRING.toString() +" can't be assigned to a variable of type "+getParentType(name,index,NodeType.STRING.toString()));
        }
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.TOPTREEDECLARATION.toString();
        int childCount = ctx.getChildCount();


        if (ctx.STRING()!=null && CheckExistanceInScope(name, index)) {
            semanticErrors.add("The name " + name + " already defined (" + line + "," + column + ")");
        }else{
            scopes.get(index - 1).getSymbolMap().put(name, new SymbolTableObject(NodeType.STRING.toString(), stringLine));
        }


        return new StringDeclaration(name, stringLine, line, parent, type, childCount);
    }

    @Override
    public BooleanDeclaration visitBoolDeclaration(dart_parse.BoolDeclarationContext ctx) {

        if (ctx.NAME() == null) {
            //TODO add error Arraylist
        }
        if (ctx.booleans() == null) {
            //TODO add error Arraylist
        }
        String id = ctx.NAME().getText();

        scopes.get(index - 1).getSymbolMap().put(id, new SymbolTableObject(NodeType.BOOL.toString(), ctx.booleans().getText()));

        BooleanValueClass booleanValueClass = visitBooleans(ctx.booleans());
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.BOOLEANDECLARATION.toString();
        int childCount = ctx.getChildCount();

        return new BooleanDeclaration(ctx.NAME().toString(), booleanValueClass, line, parent, type, childCount);
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
        int nodechildCount = ctx.getChildCount();
        return new AddDoubleExpression(numClass, line, parent, nodeType, nodechildCount);
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
