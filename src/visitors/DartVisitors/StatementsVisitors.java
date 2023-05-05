package visitors.DartVisitors;
import ast.NodeType;
import ast.Scope;
import ast.nodes.*;
import ast.variables.ConditionExpr;
import ast.variables.Variable;
import ast.variables.VariableAssignment;
import gen.dart_parse;
import visitors.NodesVisitor;
import visitors.VariablesVisitor;
import visitors.dart_parseBaseVisitorChild;
import java.util.ArrayList;
import java.util.List;

public class StatementsVisitors extends dart_parseBaseVisitorChild {

    @Override
    public Statement visitStatement(dart_parse.StatementContext ctx) {
        NodesVisitor nodesVisitor = new NodesVisitor();

        String type = NodeType.STATEMENT.toString();

        if (ctx.dartDeclaration() != null) {
            return new Statement(nodesVisitor.visitDartDeclaration(ctx.dartDeclaration()), ctx);
        }
        if (ctx.whileStatement() != null) {

            return new Statement(visitWhileStatement(ctx.whileStatement()), ctx);
        }
        if (ctx.ifStatement() != null) {
            return new Statement(visitIfStatement(ctx.ifStatement()), ctx);
        }

        if (ctx.forStatement() != null) {
            return new Statement(visitForStatement(ctx.forStatement()), ctx);
        }
        if (ctx.assignment() != null) {
            if (ctx.assignment().integerAssignment() != null)
                return new Statement((new VariablesVisitor()).visitIntegerAssignment(ctx.assignment().integerAssignment()), ctx);
            if (ctx.assignment().doubleAssignment() != null)
                return new Statement((new VariablesVisitor()).visitDoubleAssignment(ctx.assignment().doubleAssignment()), ctx);
            if (ctx.assignment().stringAssignment() != null)
                return new Statement((new VariablesVisitor()).visitStringAssignment(ctx.assignment().stringAssignment()), ctx);
            if (ctx.assignment().booleanAssignment() != null)
                return new Statement((new VariablesVisitor()).visitBooleanAssignment(ctx.assignment().booleanAssignment()), ctx);
        }
        return null;
    }
    @Override
    public IfStatement visitIfStatement(dart_parse.IfStatementContext ctx) {
        VariablesVisitor variablesVisitor = new VariablesVisitor();

        Scope s = new Scope();
        s.setScopeName("If Scope (" + index + ")");
        s.setParent(scopes.get(index - 1));
        scopes.push(s);
        index = index + 1;
        s.setId(index);
        scopeNames.add(s.getScopeName() + " Parent Is " + s.getParent().getScopeName());

        int line = ctx.start.getLine();
        //String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.CONDITION.toString();
        int childCount = ctx.getChildCount();
        List<Block> elseIfBlocks = new ArrayList<>();
        Block elseBlock = null;
        List<ConditionExpr> conditions = new ArrayList<>();
        ConditionExpr firsConditionExpr = variablesVisitor.visitConditionExpr(ctx.conditionExpr(0));
        for (int i = 1; i < ctx.conditionExpr().size(); i++) {
            ConditionExpr conditionExpr = variablesVisitor.visitConditionExpr(ctx.conditionExpr(i));
            conditions.add(conditionExpr);
        }

        Block ifBlock = visitBlock(ctx.block(0));

        if (!ctx.ELSE().isEmpty()) {

            elseBlock = visitBlock(ctx.block(ctx.block().size() - 1));
        }

        if (!ctx.ELSEIF().isEmpty()) {

            for (int i = 1; i < ctx.ELSEIF().size(); i++) {
                elseIfBlocks.add(visitBlock(ctx.block(i)));
            }
            if (!ctx.ELSE().isEmpty()) {
                elseIfBlocks.add(visitBlock(ctx.block(ctx.block().size() - 1)));

            }
        }
        scopes.pop();
        index = index - 1;
        return new IfStatement(line, null, type, childCount, firsConditionExpr, conditions, ifBlock, elseIfBlocks, elseBlock);
    }

    @Override
    public WhileStatement visitWhileStatement(dart_parse.WhileStatementContext ctx) {
        VariablesVisitor variablesVisitor = new VariablesVisitor();

        Scope s = new Scope();
        s.setScopeName("While Scope (" + index + ")");
        s.setParent(scopes.get(index - 1));
        scopes.push(s);
        index = index + 1;
        s.setId(index);
        scopeNames.add(s.getScopeName() + " Parent Is " + s.getParent().getScopeName());

        int line = ctx.start.getLine();
        //String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        ConditionExpr conditionExpr = variablesVisitor.visitConditionExpr(ctx.conditionExpr());
        Block block = visitBlock(ctx.block());
        String type = NodeType.CONDITION.toString();
        int childCount = ctx.getChildCount();

        scopes.pop();
        index = index - 1;
        return new WhileStatement(line, null, type, childCount, conditionExpr, block);
    }

    @Override
    public ForStatement visitForStatement(dart_parse.ForStatementContext ctx) {

        VariablesVisitor variablesVisitor = new VariablesVisitor();

        Variable variableDeclaration = null;
        ConditionExpr conditionExpr = null;
        VariableAssignment variableAssignment = null;
//        Scope s = new Scope();
//        s.setScopeName("for Scope (" + index + ")");
//        s.setParent(scopes.get(index - 1));
//        index = index + 1;
//        s.setId(index);
//        scopes.push(s);
        int line = ctx.start.getLine();
        //String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.CONDITION.toString();
        int childCount = ctx.getChildCount();
        if (ctx.variable() != null) {
            variableDeclaration = variablesVisitor.visitVariable(ctx.variable());
        }
        if (ctx.conditionExpr() != null) {
            conditionExpr = variablesVisitor.visitConditionExpr(ctx.conditionExpr());
        }
        if (ctx.variableAssignment() != null) {
            variableAssignment = variablesVisitor.visitVariableAssignment(ctx.variableAssignment());
        }
        Block block = visitBlock(ctx.block());
        return new ForStatement(line, null, type, childCount, variableDeclaration, conditionExpr, block, variableAssignment);

    }
    @Override
    public Block visitBlock(dart_parse.BlockContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.BLOCK.toString();
        int childCount = ctx.getChildCount();
        List<Statement> statements = new ArrayList<>();

        for (int i = 0; i < ctx.statement().size(); i++) {
            statements.add( visitStatement(ctx.statement(i)) );
        }

        return new Block(line, parent, statements, type, childCount);
    }

}
