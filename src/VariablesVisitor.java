import ast.NodeType;
import ast.variables.*;
import gen.dart_parse;
import gen.dart_parseBaseVisitor;
import org.antlr.v4.runtime.Token;

import java.util.*;


public class VariablesVisitor extends dart_parseBaseVisitor {



    @Override
    public Variable visitVariable(dart_parse.VariableContext ctx) {
        if (ctx.stringDeclaration() != null) {
            int line = ctx.start.getLine();
            String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$","").replace("Context","");
            String type = NodeType.VARIABLE.toString();
            int childCount = ctx.getChildCount();
            return new Variable(visitStringDeclaration(ctx.stringDeclaration()), line, parent, type, childCount);
        }

        if (ctx.integerDeclaration() != null) {
            int line = ctx.start.getLine();
            String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$","").replace("Context","");
            String type = NodeType.VARIABLE.toString();
            int childCount = ctx.getChildCount();
            return new Variable(visitIntegerDeclaration(ctx.integerDeclaration()), line, parent, type, childCount);
        }
        if (ctx.doubleDeclaration() != null) {
            int line = ctx.start.getLine();
            String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$","").replace("Context","");
            String type = NodeType.VARIABLE.toString();
            int childCount = ctx.getChildCount();
            return new Variable(visitDoubleDeclaration(ctx.doubleDeclaration()), line, parent, type, childCount);
        }
        if (ctx.boolDeclaration() != null) {
            int line = ctx.start.getLine();
            String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$","").replace("Context","");
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
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$","").replace("Context","");
        String type = NodeType.NUMBER.toString();
        int childCount = ctx.getChildCount();
        return new NumberClass(num, line, parent, type, childCount);

    }

    @Override
    public IntegerDeclaration visitIntegerDeclaration(dart_parse.IntegerDeclarationContext ctx) {
        // INT() is a method generated from the grammar INT
        int line = ctx.start.getLine();
        int column = ctx.start.getCharPositionInLine() + 1;
        String id = ctx.NAME().getText();

        if (dart_parseBaseVisitor.vars.contains(id)) {
            dart_parseBaseVisitor.semanticErrors.add("Error: Integer" + id + "already declared (" + line + "," + column + ")");


        } else {
            dart_parseBaseVisitor.vars.add(id);

        }
        if (ctx.addExpression() != null) {
            AddExpression expr = visitAddExpression(ctx.addExpression());
            int linee = ctx.start.getLine();
            String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$","").replace("Context","");
            String type = NodeType.INTEGERDECLARATION.toString();
            int childCount = ctx.getChildCount();
            return new IntegerDeclaration(expr, id, linee, parent, type, childCount);
        }
        int linee = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$","").replace("Context","");
        String type = NodeType.INTEGERDECLARATION.toString();
        int childCount = ctx.getChildCount();
        return new IntegerDeclaration(id, linee, parent, type, childCount);
    }

    @Override
    public DoubleDeclaration visitDoubleDeclaration(dart_parse.DoubleDeclarationContext ctx) {
        Token idToken = ctx.DOUBLE().getSymbol();
        int line = idToken.getLine();
        int column = idToken.getCharPositionInLine() + 1;
        String id = ctx.getChild(0).getText();
        String name= String.valueOf(ctx.NAME());
        if (dart_parseBaseVisitor.vars.contains(id)) {
            dart_parseBaseVisitor.semanticErrors.add("Error: Double" + id + "already declared (" + line + "," + column + ")");
        } else {
            dart_parseBaseVisitor.vars.add(id);
        }
        if (ctx.addDoubleExpression() != null) {
            AddDoubleExpression expr = visitAddDoubleExpression(ctx.addDoubleExpression());
            int linee = ctx.start.getLine();
            String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$","").replace("Context","");
            String type = NodeType.DOUBLEDECLARATION.toString();
            int childCount = ctx.getChildCount();
            return new DoubleDeclaration(expr,name,linee, parent, type, childCount);
        }
        int linee = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$","").replace("Context","");
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
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$","").replace("Context","");
        String type = NodeType.TOPTREEDECLARATION.toString();
        int childCount = ctx.getChildCount();
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

        BooleanValueClass booleanValueClass = visitBooleans(ctx.booleans());
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$","").replace("Context","");
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
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$","").replace("Context","");
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
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$","").replace("Context","");
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
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$","").replace("Context","");
        String type = NodeType.NUMBERDOUBLE.toString();
        int childCount = ctx.getChildCount();
        NumberDoubleClass numClass = new NumberDoubleClass(value, line, "Add Double Expression", type, childCount);
        String type = NodeType.ADDDOUBLEEXPRESSION.toString();
        int childCount = ctx.getChildCount();
        return new AddDoubleExpression(numClass, line, parent, type, childCount);
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
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$","").replace("Context","");
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
            if(ctx.TRUE().getText().equals("true")){
                int line = ctx.start.getLine();
                String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$","").replace("Context","");
                String type = NodeType.BOOLEAN.toString();
                int childCount = ctx.getChildCount();
                return new BooleanValueClass(Boolean.parseBoolean(ctx.TRUE().getText()), line, parent, type, childCount);
            }else{
                Token boolToken = ctx.TRUE().getSymbol();
                int line = boolToken.getLine();
                int column = boolToken.getCharPositionInLine() + 1;
                dart_parseBaseVisitor.semanticErrors.add("Error: Undefined name " + ctx.TRUE().getText() + "(" + line + "," + column + ")");
            }
        } else if (ctx.FALSE() != null) {

            if(ctx.TRUE().getText().equals("false")){
                int line = ctx.start.getLine();
                String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$","").replace("Context","");
                String type = NodeType.BOOLEAN.toString();
                int childCount = ctx.getChildCount();
                return new BooleanValueClass(Boolean.parseBoolean(ctx.FALSE().getText()), line, parent, type, childCount);
            }else{
                Token boolToken = ctx.FALSE().getSymbol();
                int line = boolToken.getLine();
                int column = boolToken.getCharPositionInLine() + 1;
                dart_parseBaseVisitor.semanticErrors.add("Error: Undefined name " + ctx.TRUE().getText() + "(" + line + "," + column + ")");
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
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$","").replace("Context","");
        String type = NodeType.NUMBERDOUBLE.toString();
        int childCount = ctx.getChildCount();
        return new NumberDoubleClass(number, line, parent, type, childCount);
    }
}
