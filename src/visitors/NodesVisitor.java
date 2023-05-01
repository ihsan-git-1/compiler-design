package visitors;

import ast.NodeType;
import ast.Scope;
import ast.SymbolTableObject;
import ast.nodes.*;
import ast.variables.AbstractNumberClass;
import ast.variables.AddExpression;
import ast.variables.ConditionExpr;
import ast.variables.IntegerAssignment;
import ast.variables.Variable;
import ast.variables.VariableAssignment;
import gen.dart_parse;
import gen.dart_parseBaseVisitorChild;
import org.antlr.v4.runtime.TokenStream;

import java.beans.Expression;
import java.util.ArrayList;
import java.util.List;


public class NodesVisitor extends dart_parseBaseVisitorChild {
    VariablesVisitor v = new VariablesVisitor();
    public TokenStream tokenStream;

    public NodesVisitor(TokenStream tokenStream) {
        this.tokenStream = tokenStream;
    }

    //**************************** base declarations start code ********************************///
    @Override
    public TopTreeDeclaration visitTopTreeDeclaration(dart_parse.TopTreeDeclarationContext ctx) {
        Scope s = new Scope();
        s.setId(index);
        s.setScopeName("Global Scope (0)");
        s.setParent(null);
        scopes.push(s);
        scopeNames.add(s.getScopeName());

        int line = ctx.start.getLine();
        String parent = "";
        String type = NodeType.TOPTREEDECLARATION.toString();
        int childCount = ctx.getChildCount();
        TopTreeDeclaration topTreeDeclaration = new TopTreeDeclaration(line, parent, type, childCount);
        for (int i = 0; i < ctx.allClassesDeclaration().size(); i++) {
            if (ctx.allClassesDeclaration().get(i) != null) {

                topTreeDeclaration.getTopTreeClassesChildrenList().add(visitAllClassesDeclaration(ctx.allClassesDeclaration(i)));
            }

        }
        for (int i = 0; i < ctx.dartDeclaration().size(); i++) {
            if (ctx.dartDeclaration().get(i) != null) {

                topTreeDeclaration.getTopTreeDartVariablesChildrenList().add(visitDartDeclaration(ctx.dartDeclaration(i)));
            }

        }


        return topTreeDeclaration;
    }

    @Override
    public AllClassesDeclarationAbstractChild visitAllClassesDeclaration(dart_parse.AllClassesDeclarationContext ctx) {
        if (ctx.classDeclaration() != null) {
            return visitClassDeclaration(ctx.classDeclaration());
        }
        if (ctx.statelessClassDeclaration() != null) {
            return visitStatelessClassDeclaration(ctx.statelessClassDeclaration());
        }
        if (ctx.statefullClassDeclaration() != null) {
            return visitStatefullClassDeclaration(ctx.statefullClassDeclaration());
        }
        return null;
    }

    @Override
    public ClassDeclaration visitClassDeclaration(dart_parse.ClassDeclarationContext ctx) {
        Scope s = new Scope();
        s.setScopeName("Class Scope (" + index + ")");
        s.setParent(scopes.get(index - 1));
        scopes.push(s);
        index = index + 1;
        s.setId(index);
        scopeNames.add(s.getScopeName() + " Parent Is " + s.getParent().getScopeName());

        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.CLASS.toString();
        int childCount = ctx.getChildCount();
        ClassDeclaration classDec = new ClassDeclaration(ctx.NAME().toString(), line, parent, type, childCount);
        for (int i = 0; i < ctx.dartDeclaration().size(); i++) {
            classDec.getDartDeclarationList().add(this.visitDartDeclaration(ctx.dartDeclaration(i)));
        }

        scopes.pop();
        index = index - 1;
        return classDec;
    }

    @Override
    public StatelessClassDeclaration visitStatelessClassDeclaration(dart_parse.StatelessClassDeclarationContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.CLASS.toString();
        int childCount = ctx.getChildCount();
        StatelessClassDeclaration statelessClassDeclaration = new StatelessClassDeclaration(ctx.NAME().getText(), visitBuildMethodDeclaration(ctx.buildMethodDeclaration()), line, parent, type, childCount);

        for (int i = 0; i < ctx.dartDeclaration().size(); i++) {
            statelessClassDeclaration.getDartDeclarationList().add(this.visitDartDeclaration(ctx.dartDeclaration(i)));
        }

        return statelessClassDeclaration;
    }

    @Override
    public BuildMethodDeclaration visitBuildMethodDeclaration(dart_parse.BuildMethodDeclarationContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.FUNCTION.toString();
        int childCount = ctx.getChildCount();
        BuildMethodDeclaration buildMethodDeclaration = new BuildMethodDeclaration(visitWidgetsDeclaration(ctx.widgetsDeclaration()), visitBuildContextDeclaration(ctx.buildContextDeclaration()), line, parent, type, childCount);

        for (int i = 0; i < ctx.dartDeclaration().size(); i++) {
            buildMethodDeclaration.getDartDeclarations().add(this.visitDartDeclaration(ctx.dartDeclaration(i)));
        }

        return buildMethodDeclaration;
    }


    @Override
    public BuildContextDeclaration visitBuildContextDeclaration(dart_parse.BuildContextDeclarationContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.OBJECT.toString();
        int childCount = ctx.getChildCount();
        return new BuildContextDeclaration(ctx.NAME().getText(), line, parent, type, childCount);
    }

    @Override
    public IfStatement visitIfStatement(dart_parse.IfStatementContext ctx) {

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
        ConditionExpr firsConditionExpr = v.visitConditionExpr(ctx.conditionExpr(0));
        for (int i = 1; i < ctx.conditionExpr().size(); i++) {
            ConditionExpr conditionExpr = v.visitConditionExpr(ctx.conditionExpr(i));
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

        Scope s = new Scope();
        s.setScopeName("While Scope (" + index + ")");
        s.setParent(scopes.get(index - 1));
        scopes.push(s);
        index = index + 1;
        s.setId(index);
        scopeNames.add(s.getScopeName() + " Parent Is " + s.getParent().getScopeName());

        int line = ctx.start.getLine();
        //String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        ConditionExpr conditionExpr = v.visitConditionExpr(ctx.conditionExpr());
        Block block = visitBlock(ctx.block());
        String type = NodeType.CONDITION.toString();
        int childCount = ctx.getChildCount();

        scopes.pop();
        index = index - 1;
        return new WhileStatement(line, null, type, childCount, conditionExpr, block);
    }

    @Override
    public Block visitBlock(dart_parse.BlockContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.BLOCK.toString();
        int childCount = ctx.getChildCount();
        List<Statement> statements = new ArrayList<>();

        for (int i = 0; i < ctx.statement().size(); i++) {

            statements.add(visitStatement(ctx.statement(i)));
        }

        return new Block(line, parent, statements, type, childCount);
    }

    @Override
    public Function visitFunction(dart_parse.FunctionContext ctx) {
        boolean isPushed = false;
        Scope s = new Scope();
        s.setScopeName("Function Scope " + ctx.NAME() + " (" + index + ")");
        s.setParent(scopes.get(index - 1));
        scopes.push(s);
        index = index + 1;
        s.setId(index);
        scopeNames.add(s.getScopeName() + " Parent Is " + s.getParent().getScopeName());
        String functionType = ctx.functionType() != null ? ctx.functionType().getText() : "void";
        Parameter parameters = null;
        FunctionBody functionBody = visitFunctionBody(ctx.functionBody());
       // ctx.functionBody().returnStatement()
        int line = ctx.start.getLine();
        //String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String nodeType = NodeType.FUNCTION.toString();
        int childCount = ctx.getChildCount();
        FunctionType type = null;
        String name = ctx.NAME().getText();
        if (ctx.functionType() != null) {
            type = visitFunctionType(ctx.functionType());
        }
        if (ctx.parameters() != null) {
            parameters = visitParameters(ctx.parameters());
        }
        scopes.pop();
        index = index - 1;
        return new Function(line, null, nodeType, childCount, type, name, parameters, functionBody);
    }

    @Override
    public FunctionBody visitFunctionBody(dart_parse.FunctionBodyContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type=NodeType.FUNCTIONBODY.toString();
        int childCount = ctx.getChildCount();
        List<dart_parse.StatementContext> statementContexts = ctx.statement();
        List<Statement> statements = null;
        ReturnStatement returnStatement= visitReturnStatement(ctx.returnStatement());
        for (dart_parse.StatementContext statementContext : statementContexts) {
            statements.add(visitStatement(statementContext));
        }
        return new FunctionBody(line, parent, type, childCount, statements,returnStatement);
    }

    @Override
    public ReturnStatement visitReturnStatement(dart_parse.ReturnStatementContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type=NodeType.RETURNSTATEMENT.toString();
        int childCount = ctx.getChildCount();
        Expression expression = (Expression) visitExpression(ctx.expression());
        return new ReturnStatement(line, parent, type, childCount,expression);
    }

    @Override
    public FunctionType visitFunctionType(dart_parse.FunctionTypeContext ctx) {
        if (ctx.getChild(0) != null) {
            return new FunctionType(ctx.getChild(0).getText());
        } else return null;
    }

    @Override
    public Parameter visitParameters(dart_parse.ParametersContext ctx) {
        List<DartDeclaration> vars = new ArrayList<>();

        for (int i = 0; i < ctx.dartDeclaration().size(); i++) {
            if (ctx.dartDeclaration(i) != null) {

                DartDeclaration var = visitDartDeclaration(ctx.dartDeclaration(i));
                vars.add(var);
            }
        }
        return new Parameter(vars);
    }

    @Override
    public StatefullClassDeclaration visitStatefullClassDeclaration(dart_parse.StatefullClassDeclarationContext ctx) {

        Scope s = new Scope();
        s.setScopeName("StatefullClass Scope (" + index + ")");
        s.setParent(scopes.get(index - 1));
        scopes.push(s);
        index = index + 1;
        s.setId(index);
        scopeNames.add(s.getScopeName() + " Parnet Is " + s.getParent().getScopeName());

        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.BLOCK.toString();
        int childCount = ctx.getChildCount();

        StatefullFirstBody firstBody = visitStfulFirstBody(ctx.stfulFirstBody());
        StatefullSecondBody secondBody = visitStfulSecondBody(ctx.stfulSecondBody());

        return new StatefullClassDeclaration(firstBody, secondBody, line, parent, type, childCount);
    }

    @Override
    public StatefullFirstBody visitStfulFirstBody(dart_parse.StfulFirstBodyContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.CLASS.toString();
        int childCount = ctx.getChildCount();
        StatefullFirstBody statefullFirstBody = new StatefullFirstBody(ctx.NAME().getText(), visitStatefullAssignStateClassDeclaration(ctx.statefullAssignStateClassDeclaration()), line, parent, type, childCount);

        for (int i = 0; i < ctx.dartDeclaration().size(); i++) {
            statefullFirstBody.getDartDeclarationList().add(visitDartDeclaration(ctx.dartDeclaration(i)));
        }

        return statefullFirstBody;
    }

    @Override
    public StatefullSecondBody visitStfulSecondBody(dart_parse.StfulSecondBodyContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.CLASS.toString();
        int childCount = ctx.getChildCount();
        StatefullSecondBody statefullSecondBody = new StatefullSecondBody(ctx.NAME(0).getText(), ctx.NAME(1).getText(), visitBuildMethodDeclaration(ctx.buildMethodDeclaration()), line, parent, type, childCount);

        for (int i = 0; i < ctx.dartDeclaration().size(); i++) {
            statefullSecondBody.getDartDeclarationList().add(visitDartDeclaration(ctx.dartDeclaration(i)));
        }

        return statefullSecondBody;
    }

    @Override
    public StatefullAssignStateClassDeclaration visitStatefullAssignStateClassDeclaration(dart_parse.StatefullAssignStateClassDeclarationContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.CLASS.toString();
        int childCount = ctx.getChildCount();
        return new StatefullAssignStateClassDeclaration(ctx.NAME().getText(), visitReturnStateTypes(ctx.returnStateTypes()), line, parent, type, childCount);
    }

    @Override
    public ReturnStateTypes visitReturnStateTypes(dart_parse.ReturnStateTypesContext ctx) {
        String name = "";
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.BLOCK.toString();
        int childCount = ctx.getChildCount();
        if (ctx.functionReturnState() != null) {
            name = ctx.functionReturnState().NAME().getText();
        }
        if (ctx.returnArrowState() != null) {
            name = ctx.returnArrowState().NAME().getText();
        }
        return new ReturnStateTypes(name, line, parent, type, childCount);
    }

    @Override
    public Object visitFunctionReturnState(dart_parse.FunctionReturnStateContext ctx) {
        return super.visitFunctionReturnState(ctx);
    }

    @Override
    public Object visitReturnArrowState(dart_parse.ReturnArrowStateContext ctx) {
        return super.visitReturnArrowState(ctx);
    }


    //******************************* flutter visitors ****************************************//

    @Override
    public WidgetsDeclaration visitWidgetsDeclaration(dart_parse.WidgetsDeclarationContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.WIDGET.toString();
        int childCount = ctx.getChildCount();
        if (ctx.expandedDeclaration() != null) {
            return new WidgetsDeclaration(visitExpandedDeclaration(ctx.expandedDeclaration()), line, parent, type, childCount);
        }
        if (ctx.textDeclaration() != null) {
            return new WidgetsDeclaration(visitTextDeclaration(ctx.textDeclaration()), line, parent, type, childCount);
        }
        if (ctx.paddingDeclaration() != null) {
            return new WidgetsDeclaration(visitPaddingDeclaration(ctx.paddingDeclaration()), line, parent, type, childCount);
        }
        if (ctx.scaffoldDeclaration() != null) {
            return new WidgetsDeclaration(visitScaffoldDeclaration(ctx.scaffoldDeclaration()), line, parent, type, childCount);
        }
        if (ctx.imageDeclaration() != null) {
            return new WidgetsDeclaration(visitImageDeclaration(ctx.imageDeclaration()), line, parent, type, childCount);
        }
        if (ctx.conatinerDeclaration() != null) {

            return new WidgetsDeclaration(visitConatinerDeclaration(ctx.conatinerDeclaration()), line, parent, type, childCount);
        }
        if (ctx.materialButtonDeclaration() != null) {

            return new WidgetsDeclaration(visitMaterialButtonDeclaration(ctx.materialButtonDeclaration()), line, parent, type, childCount);
        }
        if (ctx.materialAppDeclaration() != null) {

            return new WidgetsDeclaration(visitMaterialAppDeclaration(ctx.materialAppDeclaration()), line, parent, type, childCount);
        }
        if (ctx.rowColumnDeclaration() != null) {

            return new WidgetsDeclaration(visitRowColumnDeclaration(ctx.rowColumnDeclaration()), line, parent, type, childCount);
        }

        return null;
    }

    @Override
    public ChildPropertyDeclaration visitChildPropertyDeclaration(dart_parse.ChildPropertyDeclarationContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.PROPERTY.toString();
        int childCount = ctx.getChildCount();
        return new ChildPropertyDeclaration(visitWidgetsDeclaration(ctx.widgetsDeclaration()), line, parent, type, childCount);
    }

    @Override
    public TextDeclaration visitTextDeclaration(dart_parse.TextDeclarationContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.OBJECT.toString();
        int childCount = ctx.getChildCount();
        return new TextDeclaration(ctx.STRING_LINE().getText(), line, parent, type, childCount);
    }

    @Override
    public ImageDeclaration visitImageDeclaration(dart_parse.ImageDeclarationContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.OBJECT.toString();
        int childCount = ctx.getChildCount();
        return new ImageDeclaration(ctx.STRING_LINE().getText(), line, parent, type, childCount);
    }

    @Override
    public MaterialAppDeclaration visitMaterialAppDeclaration(dart_parse.MaterialAppDeclarationContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.OBJECT.toString();
        int childCount = ctx.getChildCount();
        return new MaterialAppDeclaration(visitHomePropertyDeclaration(ctx.homePropertyDeclaration()), line, parent, type, childCount);
    }

    @Override
    public HomePropertyDeclaration visitHomePropertyDeclaration(dart_parse.HomePropertyDeclarationContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.PROPERTY.toString();
        int childCount = ctx.getChildCount();
        return new HomePropertyDeclaration(ctx.NAME().getText(), line, parent, type, childCount);
    }

    @Override
    public ExpandedDeclaration visitExpandedDeclaration(dart_parse.ExpandedDeclarationContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.OBJECT.toString();
        int childCount = ctx.getChildCount();
        return new ExpandedDeclaration(visitChildPropertyDeclaration(ctx.childPropertyDeclaration()), line, parent, type, childCount);
    }

    @Override
    public MaterialButtonDeclaration visitMaterialButtonDeclaration(dart_parse.MaterialButtonDeclarationContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.OBJECT.toString();
        int childCount = ctx.getChildCount();
        return new MaterialButtonDeclaration(visitOnPressedPropertyDeclaration(ctx.onPressedPropertyDeclaration()), visitChildPropertyDeclaration(ctx.childPropertyDeclaration()), line, parent, type, childCount);
    }

    @Override
    public OnPressedPropertyDeclaration visitOnPressedPropertyDeclaration(dart_parse.OnPressedPropertyDeclarationContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.PROPERTY.toString();
        int childCount = ctx.getChildCount();

        OnPressedPropertyDeclaration onPressedPropertyDeclaration = new OnPressedPropertyDeclaration(line, parent, type, childCount);

        for (int i = 0; i < ctx.statement().size(); i++) {
            onPressedPropertyDeclaration.getStatement().add(visitStatement(ctx.statement(i)));
        }

        return onPressedPropertyDeclaration;
    }

    @Override
    public SetStatePressedDeclaration visitSetStatePressedDeclaration(dart_parse.SetStatePressedDeclarationContext ctx) {
        SetStatePressedDeclaration setStatePressedDeclaration = new SetStatePressedDeclaration();

        for (int i = 0; i < ctx.statement().size(); i++) {
            setStatePressedDeclaration.getStatement().add(visitStatement(ctx.statement(i)));
        }

        return setStatePressedDeclaration;
    }

    @Override
    public Statement visitStatement(dart_parse.StatementContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.STATEMENT.toString();
        int childCount = ctx.getChildCount();
        if (ctx.dartDeclaration() != null) {
            return new Statement(visitDartDeclaration(ctx.dartDeclaration()), line, parent, type, childCount);
        }
        if (ctx.function() != null) {
            return new Statement(visitFunction(ctx.function()), line, parent, type, childCount);
        }
        if (ctx.whileStatement() != null) {

            return new Statement(visitWhileStatement(ctx.whileStatement()), line, parent, type, childCount);
        }
        if (ctx.ifStatement() != null) {
            return new Statement(visitIfStatement(ctx.ifStatement()), line, parent, type, childCount);
        }

        if (ctx.forStatement() != null) {
            return new Statement(visitForStatement(ctx.forStatement()), line, parent, type, childCount);
        }
        if (ctx.assignment() != null) {
            if (ctx.assignment().integerAssignment() != null)
                return new Statement((new VariablesVisitor()).visitIntegerAssignment(ctx.assignment().integerAssignment()), line, parent, type, childCount);
            if (ctx.assignment().doubleAssignment() != null)
                return new Statement((new VariablesVisitor()).visitDoubleAssignment(ctx.assignment().doubleAssignment()), line, parent, type, childCount);
            if (ctx.assignment().stringAssignment() != null)
                return new Statement((new VariablesVisitor()).visitStringAssignment(ctx.assignment().stringAssignment()), line, parent, type, childCount);
            if (ctx.assignment().booleanAssignment() != null)
                return new Statement((new VariablesVisitor()).visitBooleanAssignment(ctx.assignment().booleanAssignment()), line, parent, type, childCount);
        }
        return null;
    }

    @Override
    public ForStatement visitForStatement(dart_parse.ForStatementContext ctx) {

        Scope s = new Scope();
        s.setScopeName("for Scope (" + index + ")");
        s.setParent(scopes.get(index - 1));
        index = index + 1;
        s.setId(index);
        scopes.push(s);

        int line = ctx.start.getLine();
        //String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.CONDITION.toString();
        int childCount = ctx.getChildCount();
        Variable variableDeclaration = v.visitVariable(ctx.variable());
        ConditionExpr conditionExpr = v.visitConditionExpr(ctx.conditionExpr());
        Block block = visitBlock(ctx.block());
        VariableAssignment va = v.visitVariableAssignment(ctx.variableAssignment());
        return new ForStatement(line, null, type, childCount, variableDeclaration, conditionExpr, block, va);

    }


    @Override
    public PaddingDeclaration visitPaddingDeclaration(dart_parse.PaddingDeclarationContext ctx) {

        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.OBJECT.toString();
        int childCount = ctx.getChildCount();
        return new PaddingDeclaration(visitPaddingPropertyDeclaration(ctx.paddingPropertyDeclaration()), visitChildPropertyDeclaration(ctx.childPropertyDeclaration()), line, parent, type, childCount);
    }

    @Override
    public PaddingPropertyDeclaration visitPaddingPropertyDeclaration(dart_parse.PaddingPropertyDeclarationContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.PROPERTY.toString();
        int childCount = ctx.getChildCount();
        return new PaddingPropertyDeclaration(visitEdgeInsistAll(ctx.edgeInsistAll()), line, parent, type, childCount);
    }

    @Override
    public EdgeInsistAll visitEdgeInsistAll(dart_parse.EdgeInsistAllContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        VariablesVisitor variablesVisitor = new VariablesVisitor();
        String type = NodeType.OBJECT.toString();
        int childCount = ctx.getChildCount();
        return new EdgeInsistAll(variablesVisitor.visitNumber(ctx.number()), line, parent, type, childCount);
    }

    @Override
    public ScaffoldDeclaration visitScaffoldDeclaration(dart_parse.ScaffoldDeclarationContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.OBJECT.toString();
        int childCount = ctx.getChildCount();
        return new ScaffoldDeclaration(visitBodyPropertyDeclaration(ctx.bodyPropertyDeclaration()), line, parent, type, childCount);
    }

    @Override
    public BodyPropertyDeclaration visitBodyPropertyDeclaration(dart_parse.BodyPropertyDeclarationContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.PROPERTY.toString();
        int childCount = ctx.getChildCount();
        return new BodyPropertyDeclaration(visitWidgetsDeclaration(ctx.widgetsDeclaration()), line, parent, type, childCount);
    }

    @Override
    public ContainerDeclaration visitConatinerDeclaration(dart_parse.ConatinerDeclarationContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.CONTAINER.toString();
        int childCount = ctx.getChildCount();
        ContainerDeclaration containerDeclaration = new ContainerDeclaration(line, parent, type, childCount);

        List<Boolean> isAvailable = new ArrayList<>();
        isAvailable.add(false); // width
        isAvailable.add(false); // height
        isAvailable.add(false); // child

        for (int i = 0; i < ctx.conatinerPropertiesDeclaration().size(); i++) {

            // check if property already available;
            if (isAvailable.get(0) && ctx.conatinerPropertiesDeclaration().get(i).widthPropertyDeclaration() != null) {
                dart_parseBaseVisitorChild.semanticErrors.add("Error cant duplicate width");
                System.out.println("Error cant duplicate width");
            }
            if (isAvailable.get(1) && ctx.conatinerPropertiesDeclaration().get(i).heightPropertyDeclaration() != null) {
                dart_parseBaseVisitorChild.semanticErrors.add("Error cant duplicate height");
                System.out.println("Error cant duplicate height");
            }
            if (isAvailable.get(2) && ctx.conatinerPropertiesDeclaration().get(i).childPropertyDeclaration() != null) {
                dart_parseBaseVisitorChild.semanticErrors.add("Error cant duplicate child");
                System.out.println("Error cant duplicate child");
            }

            // add property if not already available;
            if (ctx.conatinerPropertiesDeclaration().get(i) != null) {
                if (ctx.conatinerPropertiesDeclaration().get(i).widthPropertyDeclaration() != null && !isAvailable.get(0)) {
                    containerDeclaration.getContainerDeclarationList().add(visitConatinerPropertiesDeclaration(ctx.conatinerPropertiesDeclaration(i)));
                    isAvailable.set(0, true); // width

                }
                if (ctx.conatinerPropertiesDeclaration().get(i).heightPropertyDeclaration() != null && !isAvailable.get(1)) {
                    containerDeclaration.getContainerDeclarationList().add(visitConatinerPropertiesDeclaration(ctx.conatinerPropertiesDeclaration(i)));
                    isAvailable.set(1, true); // width
                }
                if (ctx.conatinerPropertiesDeclaration().get(i).childPropertyDeclaration() != null && !isAvailable.get(2)) {
                    containerDeclaration.getContainerDeclarationList().add(visitConatinerPropertiesDeclaration(ctx.conatinerPropertiesDeclaration(i)));
                    isAvailable.set(2, true); // width
                }
            }


        }
        return containerDeclaration;
    }

    @Override
    public ContainerPropertiesDeclaration visitConatinerPropertiesDeclaration(dart_parse.ConatinerPropertiesDeclarationContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.PROPERTY.toString();
        int childCount = ctx.getChildCount();
        if (ctx.widthPropertyDeclaration() != null) {
            return new ContainerPropertiesDeclaration(visitWidthPropertyDeclaration(ctx.widthPropertyDeclaration()), line, parent, type, childCount);
        }

        if (ctx.heightPropertyDeclaration() != null) {
            return new ContainerPropertiesDeclaration(visitHeightPropertyDeclaration(ctx.heightPropertyDeclaration()), line, parent, type, childCount);
        }
        if (ctx.childPropertyDeclaration() != null) {
            return new ContainerPropertiesDeclaration(visitChildPropertyDeclaration(ctx.childPropertyDeclaration()), line, parent, type, childCount);
        }
        return null;
    }

    @Override
    public HeightPropertyDeclaration visitHeightPropertyDeclaration(dart_parse.HeightPropertyDeclarationContext ctx) {
        VariablesVisitor variablesVisitor = new VariablesVisitor();
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.PROPERTY.toString();
        int childCount = ctx.getChildCount();
        return new HeightPropertyDeclaration(variablesVisitor.visitNumber(ctx.number()), line, parent, type, childCount);
    }

    @Override
    public WidthPropertyDeclaration visitWidthPropertyDeclaration(dart_parse.WidthPropertyDeclarationContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        VariablesVisitor variablesVisitor = new VariablesVisitor();
        String type = NodeType.PROPERTY.toString();
        int childCount = ctx.getChildCount();
        return new WidthPropertyDeclaration(variablesVisitor.visitNumber(ctx.number()), line, parent, type, childCount);
    }

    @Override
    public RowColumnDeclaration visitRowColumnDeclaration(dart_parse.RowColumnDeclarationContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String name = "Column";
        String type = NodeType.CONTAINER.toString();
        int childCount = ctx.getChildCount();
        if (ctx.ROW() != null) {
            name = "Row";
        }
        return new RowColumnDeclaration(name, visitChildrenPropertyDeclaration(ctx.childrenPropertyDeclaration()), line, parent, type, childCount);
    }

    @Override
    public ChildrenPropertyDeclaration visitChildrenPropertyDeclaration(dart_parse.ChildrenPropertyDeclarationContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.PROPERTY.toString();
        int childCount = ctx.getChildCount();
        ChildrenPropertyDeclaration childrenPropertyDeclaration = new ChildrenPropertyDeclaration(line, parent, type, childCount);
        for (int i = 0; i < ctx.widgetsDeclaration().size(); i++) {
            childrenPropertyDeclaration.getWidgetDeclarationList().add(visitWidgetsDeclaration(ctx.widgetsDeclaration(i)));
        }
        return childrenPropertyDeclaration;
    }


    //******************************* dart visitors ****************************************//

    public DartDeclaration visitDartDeclaration(dart_parse.DartDeclarationContext ctx) {


        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        VariablesVisitor variablesVisitor = new VariablesVisitor();
        String type = NodeType.OBJECT.toString();
        int childCount = ctx.getChildCount();
        if (ctx.variable() != null) {
            return new DartDeclaration(variablesVisitor.visitVariable(ctx.variable()), line, parent, type, childCount);
        } else if (ctx.function() != null) {
            return new DartDeclaration(visitFunction(ctx.function()), line, parent, type, childCount);
        } else if (ctx.dartAllListsDeclaration() != null) {
            ListsVisitor listsVisitor = new ListsVisitor();
            return new DartDeclaration(listsVisitor.visitDartAllListsDeclaration(ctx.dartAllListsDeclaration()), line, parent, type, childCount);
        }
        return null;
    }

    @Override
    public BooleanOperation visitBooleanOperation(dart_parse.BooleanOperationContext ctx) {
        if (!ctx.numberDouble().isEmpty() || !ctx.number().isEmpty()) {
            AbstractNumberClass num1;
            AbstractNumberClass num2;
            VariablesVisitor variablesVisitor = new VariablesVisitor();
            if (ctx.numberDouble().size() == 2) {
                num1 = variablesVisitor.visitNumberDouble(ctx.numberDouble(0));
                num2 = variablesVisitor.visitNumberDouble(ctx.numberDouble(1));
            } else if (ctx.number().size() == 2) {
                num1 = variablesVisitor.visitNumber(ctx.number(0));
                num2 = variablesVisitor.visitNumber(ctx.number(1));
            } else {
                num1 = variablesVisitor.visitNumber(ctx.number(0));
                num2 = variablesVisitor.visitNumberDouble(ctx.numberDouble(0));
            }
            String operator = ctx.getChild(1).toString();
            return new BooleanOperation(num1, num2, null, null, operator);
        } else if (ctx.NAME(0) != null && ctx.NAME(1) != null) {

            String key1 = ctx.NAME(0).getText();
            String key2 = ctx.NAME(1).getText();

            if (scopes.get(index - 1).getSymbolMap().containsKey(key1) && scopes.get(index - 1).getSymbolMap().containsKey(key2)) {

                SymbolTableObject s1 = scopes.get(index - 1).getSymbolMap().get(key1);
                SymbolTableObject s2 = scopes.get(index - 1).getSymbolMap().get(key2);
                String operator = ctx.getChild(1).toString();
                return new BooleanOperation(null, null, s1, s2, operator);
            }
        }
        return null;
    }


}
