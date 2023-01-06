import ast.variables.*;
import gen.dart_parse;
import gen.dart_parseBaseVisitor;
import org.antlr.v4.runtime.Token;

import java.util.*;


public class VariablesVisitor extends dart_parseBaseVisitor {

    private List<String> vars; //stores all the variables declared in the program so far
    private List<String> semanticErrors = new ArrayList<>(); // 1. duplicate declaration // reference to undeclared variables



    @Override
    public Variable visitVariable(dart_parse.VariableContext ctx) {
        if (ctx.stringDeclaration() != null) {
            return new Variable(visitStringDeclaration(ctx.stringDeclaration()));
        }

        if (ctx.integerDeclaration() != null) {
            return new Variable(visitIntegerDeclaration(ctx.integerDeclaration()));
        }
        if (ctx.doubleDeclaration() != null) {
            return new Variable(visitDoubleDeclaration(ctx.doubleDeclaration()));
        }
        if (ctx.boolDeclaration() != null) {
            return new Variable(visitBoolDeclaration(ctx.boolDeclaration()));
        }

        return null;
    }

    @Override
    public NumberClass visitNumber(dart_parse.NumberContext ctx) {
        String numText = ctx.getChild(0).getText();
        int num = Integer.parseInt(numText);
        return new NumberClass(num);

    }

    @Override
    public IntegerDeclaration visitIntegerDeclaration(dart_parse.IntegerDeclarationContext ctx) {
        // INT() is a method generated from the grammar INT
        Token idToken = ctx.INT().getSymbol();
        int line = idToken.getLine();
        int column = idToken.getCharPositionInLine() + 1;
        String id = ctx.NAME().getText();
//        if (vars.contains(id)) {
//            semanticErrors.add("Error: Integer" + id + "already declared (" + line + "," + column + ")");
//        } else {
//            vars.add(id);
//        }
        if (ctx.addExpression() != null) {
            AddExpression expr = visitAddExpression(ctx.addExpression());
            return new IntegerDeclaration(expr, id);
        }
        return new IntegerDeclaration(id); //todo also needs AddExpression
    }

    @Override
    public DoubleDeclaration visitDoubleDeclaration(dart_parse.DoubleDeclarationContext ctx) {
        Token idToken = ctx.DOUBLE().getSymbol();
        int line = idToken.getLine();
        int column = idToken.getCharPositionInLine() + 1;
        String id = ctx.getChild(0).getText();
        String name= String.valueOf(ctx.NAME());
//        if (vars.contains(id)) {
//            semanticErrors.add("Error: Double" + id + "already declared (" + line + "," + column + ")");
//        } else {
//            vars.add(id);
//        }
        if (ctx.addDoubleExpression() != null) {
            AddDoubleExpression expr = visitAddDoubleExpression(ctx.addDoubleExpression());
            return new DoubleDeclaration(expr,name);
        }
        return new DoubleDeclaration(name);
    }

    @Override
    public StringDeclaration visitStringDeclaration(dart_parse.StringDeclarationContext ctx) {
        String name = "";
        String stringLine = "";
        if (ctx.NAME() != null) {
            name = String.valueOf(ctx.NAME());
        }
        if (ctx.STRING_LINE() != null) {
            stringLine = String.valueOf(ctx.STRING_LINE());
        }
        return new StringDeclaration(name, stringLine);
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
        return new BooleanDeclaration(ctx.NAME().toString(), booleanValueClass);
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
        NumberClass numClass = new NumberClass(intValue);
        return new AddExpression(numClass);
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
        NumberClass num = new NumberClass(intValue);
        return new MultiplyExpression(num);
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
        NumberDoubleClass numClass = new NumberDoubleClass(value);
        return new AddDoubleExpression(numClass);
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
        NumberDoubleClass num = new NumberDoubleClass(value);
        return new MultiplyDoubleExpression(num);
    }

    @Override
    public BooleanValueClass visitBooleans(dart_parse.BooleansContext ctx) {
        if (ctx.TRUE() != null) {

            return new BooleanValueClass(ctx.TRUE().getText());

        } else if (ctx.FALSE() != null) {

            return new BooleanValueClass(ctx.FALSE().getText());

        } else {
            //TODO add error Arraylist
            return null;
        }
    }

    @Override
    public NumberDoubleClass visitNumberDouble(dart_parse.NumberDoubleContext ctx) {
        double number = Double.parseDouble(ctx.NUMBERDOUBLE().getText());
        return new NumberDoubleClass(number);
    }
}
