import ast.variables.*;
import gen.dart_parse;
import gen.dart_parseBaseVisitor;
import org.antlr.v4.runtime.Token;

import java.util.*;


public class VariablesVisitor extends dart_parseBaseVisitor {

    private List<String> vars; //stores all the variables declared in the program so far
    private List<String> semanticErrors; // 1. duplicate declaration // reference to undeclared variables


    @Override
    public Variable visitVariable(dart_parse.VariableContext ctx) {
        System.out.println(ctx.getText());

        if (ctx.stringDeclaration() != null) {
            Variable variable = new Variable(visitStringDeclaration(ctx.stringDeclaration()));
            return variable;
        }

        if (ctx.integerDeclaration() != null) {
            Variable variable = new Variable(visitIntegerDeclaration(ctx.integerDeclaration()));
            return variable;
        }
        if (ctx.doubleDeclaration() != null) {
            Variable variable = new Variable(visitDoubleDeclaration(ctx.doubleDeclaration()));
            return variable;
        }
        if (ctx.boolDeclaration() != null) {
            Variable variable = new Variable(visitBoolDeclaration(ctx.boolDeclaration()));
            return variable;
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

        String id = ctx.getChild(0).getText();
        if (vars.contains(id)) {
            semanticErrors.add("Error: Integer" + id + "already declared (" + line + "," + column + ")");
        } else {
            vars.add(id);
        }
        int value = Integer.parseInt(ctx.ASSIGN().getText());
        return new IntegerDeclaration(id); //todo also needs AddExpression

    }

    @Override
    public DoubleDeclaration visitDoubleDeclaration(dart_parse.DoubleDeclarationContext ctx) {

        Token idToken = ctx.DOUBLE().getSymbol();
        int line = idToken.getLine();
        int column = idToken.getCharPositionInLine() + 1;
        String id=ctx.getChild(0).getText();
        if (vars.contains(id)) {
            semanticErrors.add("Error: Double" + id + "already declared (" + line + "," + column + ")");
        }
        else {
            vars.add(id);
        }
        double value = Double.parseDouble(ctx.ASSIGN().getText());
        return new DoubleDeclaration(id);  //todo also needs addDoubleExpression
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
        //working on ittt
        Queue<Object> queue = new LinkedList<>();
        int value= Integer.parseInt(ctx.getChild(0).getText());
        for (int i = 1; i < ctx.getChildCount(); i++) {
            queue.add(ctx.getChild(i).getText());
        }
        while(!queue.isEmpty()) {
            String operator = (String) queue.remove();
            int num = Integer.parseInt((String) queue.remove());
            if (operator.equals("+")) {
                value += num;
            } else if (operator.equals("-")) {
                value -= num;
            }
        }
        NumberClass num = new NumberClass(value);
        System.out.println(ctx.getText());
        return new AddExpression(visitMultiplyExpression(ctx.multiplyExpression(0)));
    }

    @Override
    public MultiplyExpression visitMultiplyExpression(dart_parse.MultiplyExpressionContext ctx) {
        Queue<Object> queue = new LinkedList<>();
        int value= Integer.parseInt(ctx.getChild(0).getText());
        for (int i = 1; i < ctx.getChildCount(); i++) {
            queue.add(ctx.getChild(i).getText());
        }
        while(!queue.isEmpty()) {
            String operator = (String) queue.remove();
            int num = Integer.parseInt((String) queue.remove());
            if (operator.equals("*")) {
                value *= num;
            } else if (operator.equals("/")) {
                value /= num;
            }
        }
        NumberClass num = new NumberClass(value);
        return new MultiplyExpression(num);
    }

    @Override
    public Object visitAddDoubleExpression(dart_parse.AddDoubleExpressionContext ctx) {
        return super.visitAddDoubleExpression(ctx);
    }

    @Override
    public Object visitMultiplyDoubleExpression(dart_parse.MultiplyDoubleExpressionContext ctx) {
        return super.visitMultiplyDoubleExpression(ctx);
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
    public Object visitNumberDouble(dart_parse.NumberDoubleContext ctx) {
        return super.visitNumberDouble(ctx);
    }
}
