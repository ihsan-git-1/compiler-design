import ast.variables.*;
import gen.dart_parse;
import gen.dart_parseBaseVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

public class VariablesVisitor extends dart_parseBaseVisitor {

    @Override
    public Object visitAddDoubleExpression(dart_parse.AddDoubleExpressionContext ctx) {
        return super.visitAddDoubleExpression(ctx);
    }

    @Override
    public Object visitAddExpression(dart_parse.AddExpressionContext ctx) {
        return super.visitAddExpression(ctx);
    }

    @Override
    public Object visitMultiplyDoubleExpression(dart_parse.MultiplyDoubleExpressionContext ctx) {
        return super.visitMultiplyDoubleExpression(ctx);
    }

    @Override
    public Object visitBooleans(dart_parse.BooleansContext ctx) {
        return super.visitBooleans(ctx);
    }

    @Override
    public BooleanDeclaration visitBoolDeclaration(dart_parse.BoolDeclarationContext ctx) {
        String name = String.valueOf(ctx.NAME());
        TerminalNode bool = ctx.BOOL();
        return new BooleanDeclaration(name, bool);
    }

    @Override
    public DoubleDeclaration visitDoubleDeclaration(dart_parse.DoubleDeclarationContext ctx) {
        String name = String.valueOf(ctx.NAME());
        return new DoubleDeclaration(new AddDoubleExpression(ctx.addDoubleExpression()), name);
        //TODO : figure out why addDoubleExpression() is DoubleDeclarationContext
        //todo solved: just create object from recived context
    }

    @Override
    public Object visitIntegerDeclaration(dart_parse.IntegerDeclarationContext ctx) {
        return new IntegerDeclaration(String.valueOf(ctx.NAME()), ctx.addExpression());
    }

    @Override
    public StringDeclaration visitStringDeclaration(dart_parse.StringDeclarationContext ctx) {
        String name = String.valueOf(ctx.NAME());
        String stringLine = String.valueOf(ctx.STRING_LINE());
        return new StringDeclaration(name, stringLine);
    }

    @Override
    public Object visitVariable(dart_parse.VariableContext ctx) {

    }

}
