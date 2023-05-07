package visitors.DartVisitors;

import ast.NodeType;
import ast.Scope;
import ast.nodes.*;
import gen.dart_parse;
import visitors.NodesVisitor;
import visitors.dart_parseBaseVisitorChild;

import java.beans.Expression;
import java.util.ArrayList;
import java.util.List;

public class FunctionsVisitors extends dart_parseBaseVisitorChild {


    @Override
    public Function visitFunction(dart_parse.FunctionContext ctx) {

        Scope s = new Scope();
        s.setScopeName("Function Scope " + ctx.NAME() + " (" + index + ")");
        s.setParent(scopes.get(index - 1));
        scopes.push(s);
        index = index + 1;
        s.setId(index);
        scopeNames.add(s.getScopeName() + " Parent Is " + s.getParent().getScopeName());
        String functionType = ctx.functionType() != null ? ctx.functionType().getText() : "void";
        Parameter parameters = null;

        // ctx.functionBody().returnStatement()
        //String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String nodeType = NodeType.FUNCTION.toString();


        FunctionType type = null;

        String name = ctx.NAME().getText();
        if (ctx.functionType() != null) {
            type = visitFunctionType(ctx.functionType());
        }
        if (ctx.parameters() != null) {
            parameters = visitParameters(ctx.parameters());
        }

        FunctionBody functionBody = visitFunctionBody(ctx.functionBody());
        scopes.pop();
        index = index - 1;
        return new Function(ctx, type, name, parameters, functionBody);
    }

    @Override
    public FunctionBody visitFunctionBody(dart_parse.FunctionBodyContext ctx) {

        String type = NodeType.FUNCTIONBODY.toString();
        List<dart_parse.StatementContext> statementContexts = ctx.statement();
        List<Statement> statements = new ArrayList<Statement>();
        //ReturnStatement returnStatement = visitReturnStatement(ctx.returnStatement());
        StatementsVisitors statementsVisitors = new StatementsVisitors();

        for (dart_parse.StatementContext statementContext : statementContexts) {
            statements.add(statementsVisitors.visitStatement(statementContext));
        }
        return new FunctionBody(ctx,statements);
    }

    @Override
    public ReturnStatement visitReturnStatement(dart_parse.ReturnStatementContext ctx) {
        String type = NodeType.RETURNSTATEMENT.toString();

        Expression expression = (Expression) visitExpression(ctx.expression());
        return new ReturnStatement(ctx, expression);
    }

    @Override
    public FunctionType visitFunctionType(dart_parse.FunctionTypeContext ctx) {

        if (ctx.getChild(0) != null) {
            return new FunctionType(ctx.getChild(0).getText());
        }
        else return null;
    }

    @Override
    public Parameter visitParameters(dart_parse.ParametersContext ctx) {
        List<DartDeclaration> vars = new ArrayList<>();
        NodesVisitor nodesVisitor = new NodesVisitor();

        for (int i = 0; i < ctx.dartDeclaration().size(); i++) {
            if (ctx.dartDeclaration(i) != null) {
                DartDeclaration var = nodesVisitor.visitDartDeclaration(ctx.dartDeclaration(i));
                vars.add(var);
            }
        }
        return new Parameter(vars);
    }

}
