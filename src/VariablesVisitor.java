import ast.variables.*;
import gen.dart_parse;
import gen.dart_parseBaseVisitor;
import org.antlr.v4.runtime.Token;


import java.util.List;

public class VariablesVisitor extends dart_parseBaseVisitor {

    private List<String> vars; //stores all the variables declared in the program so far
    private List<String> semanticErrors; // 1. duplicate declaration // reference to undeclared variables

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
        int column = idToken.getCharPositionInLine()+1;

        String id = ctx.getChild(0).getText();
        if(vars.contains(id)){
            semanticErrors.add("Error: Integer"+id+"already declared ("+ line +","+ column +")");
        }else{
            vars.add(id);
        }
        int value = Integer.parseInt(ctx.ASSIGN().getText());
        return new IntegerDeclaration(id); //todo also needs AddExpression

    }

    @Override
    public Object visitAddDoubleExpression(dart_parse.AddDoubleExpressionContext ctx) {
        return super.visitAddDoubleExpression(ctx);
    }

//    @Override
//    public AddExpression visitAddExpression(dart_parse.AddExpressionContext ctx) {
//        return super.visitAddExpression(ctx);
//    }

    @Override
    public Object visitMultiplyDoubleExpression(dart_parse.MultiplyDoubleExpressionContext ctx) {
        return super.visitMultiplyDoubleExpression(ctx);
    }

    @Override
    public Object visitBooleans(dart_parse.BooleansContext ctx) {
        return super.visitBooleans(ctx);
    }

//    @Override
//    public BooleanDeclaration visitBoolDeclaration(dart_parse.BoolDeclarationContext ctx) {
//        String name = String.valueOf(ctx.NAME());
//        TerminalNode bool = ctx.BOOL();
//        return new BooleanDeclaration(name, bool);
//    }

//    @Override
//    public DoubleDeclaration visitDoubleDeclaration(dart_parse.DoubleDeclarationContext ctx) {
//        String name = String.valueOf(ctx.NAME());
//        return new DoubleDeclaration(new AddDoubleExpression(ctx.addDoubleExpression()), name);
//        //TODO : figure out why addDoubleExpression() is DoubleDeclarationContext
//        //todo solved: just create object from recived context
//    }

//    @Override
//    public Object visitIntegerDeclaration(dart_parse.IntegerDeclarationContext ctx) {
//       AddExpression ad= visitAddExpression( ctx.addExpression());
//        return new IntegerDeclaration(ad,String.valueOf(ctx.NAME()));
//    }

    @Override
    public StringDeclaration visitStringDeclaration(dart_parse.StringDeclarationContext ctx) {
        String name = String.valueOf(ctx.NAME());
        String stringLine = String.valueOf(ctx.STRING_LINE());
        return new StringDeclaration(name, stringLine);
    }

//    @Override
//    public Object visitVariable(dart_parse.VariableContext ctx) {
//
//    }

}
