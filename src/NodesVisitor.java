import ast.NodeType;
import ast.SymbolTableObject;
import ast.nodes.*;
import ast.variables.AbstractNumberClass;
import ast.variables.NumberClass;
import ast.variables.NumberDoubleClass;
import gen.dart_parse;
import gen.dart_parseBaseVisitor;

import java.util.ArrayList;
import java.util.List;


public class NodesVisitor extends dart_parseBaseVisitor {


    //**************************** base declarations start code ********************************///
    @Override
    public TopTreeDeclaration visitTopTreeDeclaration(dart_parse.TopTreeDeclarationContext ctx) {

        int line = ctx.start.getLine();
        String parent = "";
        String type = NodeType.TOPTREEDECLARATION.toString();
        int childCount = ctx.getChildCount();
        TopTreeDeclaration topTreeDeclaration = new TopTreeDeclaration(line, parent, type, childCount);
        for (int i = 0; i < ctx.allClassesDeclaration().size(); i++) {
            if (ctx.allClassesDeclaration().get(i) != null) {

                topTreeDeclaration.getTopTreeChildrenList().add(visitAllClassesDeclaration(ctx.allClassesDeclaration(i)));
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
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.CLASS.toString();
        int childCount = ctx.getChildCount();
        ClassDeclaration classDec = new ClassDeclaration(ctx.NAME().toString(), line, parent, type, childCount);
        for (int i = 0; i < ctx.dartVariabelsDeclaration().size(); i++) {
            classDec.getDartVariablesDeclarationList().add(visitDartVariabelsDeclaration(ctx.dartVariabelsDeclaration(i)));
        }
        return classDec;
    }

    @Override
    public StatelessClassDeclaration visitStatelessClassDeclaration(dart_parse.StatelessClassDeclarationContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.CLASS.toString();
        int childCount = ctx.getChildCount();
        StatelessClassDeclaration statelessClassDeclaration = new StatelessClassDeclaration(ctx.NAME().getText(), visitBuildMethodDeclaration(ctx.buildMethodDeclaration()), line, parent, type, childCount);

        for (int i = 0; i < ctx.dartVariabelsDeclaration().size(); i++) {
            statelessClassDeclaration.getDartVariablesDeclarationList().add(visitDartVariabelsDeclaration(ctx.dartVariabelsDeclaration(i)));
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

        for (int i = 0; i < ctx.dartVariabelsDeclaration().size(); i++) {
            buildMethodDeclaration.getDartVariables().add(visitDartVariabelsDeclaration(ctx.dartVariabelsDeclaration(i)));
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
    public IfStatementDeclaration visitIfStatement(dart_parse.IfStatementContext ctx) {
        int line = ctx.start.getLine();
        //String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.CONDITION.toString();
        int childCount = ctx.getChildCount();
        List<Block> elseIfBlocks = new ArrayList<>();
        Block elseBlock = null;
        BooleanOperation booleanOperation = (BooleanOperation) visitBooleanOperation(ctx.booleanOperation());
        Block ifBlock = visitBlock(ctx.block(0));
        if (ctx.ELSE() != null) {
            elseBlock = visitBlock(ctx.block(ctx.block().size() - 1));
        }
        if (ctx.ELSEIF() != null) {
            for (int i = 1; i < ctx.ELSEIF().size(); i++) {
                elseIfBlocks.add(visitBlock(ctx.block(i)));
            }
            if (ctx.ELSE() == null) {
                elseIfBlocks.add(visitBlock(ctx.block(ctx.block().size() - 1)));

            }
        }
        return new IfStatementDeclaration(line, null, type, childCount, booleanOperation, ifBlock, elseIfBlocks, elseBlock);
    }

    @Override
    public WhileStatement visitWhileStatement(dart_parse.WhileStatementContext ctx) {
        int line = ctx.start.getLine();
      //  String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        BooleanOperation booleanOperation =  visitBooleanOperation(ctx.booleanOperation());
        Block block = visitBlock(ctx.block());
        String type = NodeType.CONDITION.toString();
        int childCount = ctx.getChildCount();
        return new WhileStatement(line, null, type, childCount, booleanOperation, block);
    }

    @Override
    public Block visitBlock(dart_parse.BlockContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.BLOCK.toString();
        int childCount = ctx.getChildCount();
        List<StatementDeclaration> statements = new ArrayList<>();
        for (int i = 0; i < ctx.statement().size(); i++) {
            statements.add(visitStatement(ctx.statement(i)));
        }
        return new Block(line, parent, statements, type, childCount);
    }

    @Override
    public Function visitFunction(dart_parse.FunctionContext ctx) {
        Parameter parameters = null;
        int line = ctx.start.getLine();
        //String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String nodeType = NodeType.BLOCK.toString();
        int childCount = ctx.getChildCount();
        FunctionType type = null;
        String name = ctx.NAME().getText();
        if (ctx.functionType() != null) {
            type = visitFunctionType(ctx.functionType());
        }
        if (ctx.parameters() != null) {
            parameters = visitParameters(ctx.parameters());
        }
        Block block = visitBlock(ctx.block());
        return new Function(line, null, nodeType, childCount, type, name, parameters, block);
    }

    @Override
    public FunctionType visitFunctionType(dart_parse.FunctionTypeContext ctx) {
        if (ctx.getChild(0) != null) {
            return new FunctionType(ctx.getChild(0).getText());
        } else return null;
    }

    @Override
    public Parameter visitParameters(dart_parse.ParametersContext ctx) {
        List<DartVariablesDeclaration> vars = new ArrayList<>();

        for (int i = 0; i < ctx.dartVariabelsDeclaration().size(); i++) {
            if (ctx.dartVariabelsDeclaration(i) != null) {
                DartVariablesDeclaration var = visitDartVariabelsDeclaration(ctx.dartVariabelsDeclaration(i));
                vars.add(var);
            }
        }
        return new Parameter(vars);
    }

    @Override
    public StatefullClassDeclaration visitStatefullClassDeclaration(dart_parse.StatefullClassDeclarationContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.BLOCK.toString();
        int childCount = ctx.getChildCount();
        return new StatefullClassDeclaration(visitStfulFirstBody(ctx.stfulFirstBody()), visitStfulSecondBody(ctx.stfulSecondBody()), line, parent, type, childCount);
    }

    @Override
    public StatefullFirstBody visitStfulFirstBody(dart_parse.StfulFirstBodyContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.CLASS.toString();
        int childCount = ctx.getChildCount();
        StatefullFirstBody statefullFirstBody = new StatefullFirstBody(ctx.NAME().getText(), visitStatefullAssignStateClassDeclaration(ctx.statefullAssignStateClassDeclaration()), line, parent, type, childCount);

        for (int i = 0; i < ctx.dartVariabelsDeclaration().size(); i++) {
            statefullFirstBody.getDartVariablesDeclarationList().add(visitDartVariabelsDeclaration(ctx.dartVariabelsDeclaration(i)));
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

        for (int i = 0; i < ctx.dartVariabelsDeclaration().size(); i++) {
            statefullSecondBody.getDartVariablesDeclarationList().add(visitDartVariabelsDeclaration(ctx.dartVariabelsDeclaration(i)));
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
            WidgetsDeclaration widgetsDeclaration = new WidgetsDeclaration(visitExpandedDeclaration(ctx.expandedDeclaration()), line, parent, type, childCount);
            return widgetsDeclaration;
        }
        if (ctx.textDeclaration() != null) {
            WidgetsDeclaration widgetsDeclaration = new WidgetsDeclaration(visitTextDeclaration(ctx.textDeclaration()), line, parent, type, childCount);
            return widgetsDeclaration;
        }
        if (ctx.paddingDeclaration() != null) {
            WidgetsDeclaration widgetsDeclaration = new WidgetsDeclaration(visitPaddingDeclaration(ctx.paddingDeclaration()), line, parent, type, childCount);
            return widgetsDeclaration;
        }
        if (ctx.scaffoldDeclaration() != null) {
            WidgetsDeclaration widgetsDeclaration = new WidgetsDeclaration(visitScaffoldDeclaration(ctx.scaffoldDeclaration()), line, parent, type, childCount);
            return widgetsDeclaration;
        }
        if (ctx.imageDeclaration() != null) {
            WidgetsDeclaration widgetsDeclaration = new WidgetsDeclaration(visitImageDeclaration(ctx.imageDeclaration()), line, parent, type, childCount);
            return widgetsDeclaration;
        }
        if (ctx.conatinerDeclaration() != null) {
            WidgetsDeclaration widgetsDeclaration = new WidgetsDeclaration(visitConatinerDeclaration(ctx.conatinerDeclaration()), line, parent, type, childCount);

            return widgetsDeclaration;
        }
        if (ctx.materialButtonDeclaration() != null) {
            WidgetsDeclaration widgetsDeclaration = new WidgetsDeclaration(visitMaterialButtonDeclaration(ctx.materialButtonDeclaration()), line, parent, type, childCount);

            return widgetsDeclaration;
        }
        if (ctx.materialAppDeclaration() != null) {
            WidgetsDeclaration widgetsDeclaration = new WidgetsDeclaration(visitMaterialAppDeclaration(ctx.materialAppDeclaration()), line, parent, type, childCount);

            return widgetsDeclaration;
        }
        if (ctx.rowColumnDeclaration() != null) {
            WidgetsDeclaration widgetsDeclaration = new WidgetsDeclaration(visitRowColumnDeclaration(ctx.rowColumnDeclaration()), line, parent, type, childCount);

            return widgetsDeclaration;
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
        ExpandedDeclaration expandedDeclaration = new ExpandedDeclaration(visitChildPropertyDeclaration(ctx.childPropertyDeclaration()), line, parent, type, childCount);
        return expandedDeclaration;
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
            onPressedPropertyDeclaration.getStatementDeclaration().add(visitStatement(ctx.statement(i)));
        }

        return onPressedPropertyDeclaration;
    }

    @Override
    public SetStatePressedDeclaration visitSetStatePressedDeclaration(dart_parse.SetStatePressedDeclarationContext ctx) {
        SetStatePressedDeclaration setStatePressedDeclaration = new SetStatePressedDeclaration();

        for (int i = 0; i < ctx.statement().size(); i++) {
            setStatePressedDeclaration.getStatementDeclaration().add(visitStatement(ctx.statement(i)));
        }

        return setStatePressedDeclaration;
    }

    @Override
    public StatementDeclaration visitStatement(dart_parse.StatementContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String type = NodeType.STATEMENTDECLARATION.toString();
        int childCount = ctx.getChildCount();
        if (ctx.dartVariabelsDeclaration() != null) {
            return new StatementDeclaration(visitDartVariabelsDeclaration(ctx.dartVariabelsDeclaration()), line, parent, type, childCount);
        }
        if (ctx.function() != null) {
            return new StatementDeclaration(visitFunction(ctx.function()), line, parent, type, childCount);
        }
        if (ctx.whileStatement() != null) {
            return new StatementDeclaration(visitWhileStatement(ctx.whileStatement()), line, parent, type, childCount);
        }
        if (ctx.ifStatement() != null) {
            return new StatementDeclaration(visitIfStatement(ctx.ifStatement()), line, parent, type, childCount);
        }
        return null;
    }

    @Override
    public Object visitForStatement(dart_parse.ForStatementContext ctx) {
        return super.visitForStatement(ctx);
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

        List<Boolean> isAvailable = new ArrayList<Boolean>();
        isAvailable.add(false); // width
        isAvailable.add(false); // height
        isAvailable.add(false); // child

        for (int i = 0; i < ctx.conatinerPropertiesDeclaration().size(); i++) {

            // check if property already available;
            if (isAvailable.get(0) && ctx.conatinerPropertiesDeclaration().get(i).widthPropertyDeclaration() != null) {
                dart_parseBaseVisitor.semanticErrors.add("Error cant duplicate width");
                System.out.println("Error cant duplicate width");
            }
            if (isAvailable.get(1) && ctx.conatinerPropertiesDeclaration().get(i).heightPropertyDeclaration() != null) {
                dart_parseBaseVisitor.semanticErrors.add("Error cant duplicate height");
                System.out.println("Error cant duplicate height");
            }
            if (isAvailable.get(2) && ctx.conatinerPropertiesDeclaration().get(i).childPropertyDeclaration() != null) {
                dart_parseBaseVisitor.semanticErrors.add("Error cant duplicate child");
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
            ContainerPropertiesDeclaration containerPropertiesDeclaration = new ContainerPropertiesDeclaration(visitWidthPropertyDeclaration(ctx.widthPropertyDeclaration()), line, parent, type, childCount);
            return containerPropertiesDeclaration;
        }

        if (ctx.heightPropertyDeclaration() != null) {
            ContainerPropertiesDeclaration containerPropertiesDeclaration = new ContainerPropertiesDeclaration(visitHeightPropertyDeclaration(ctx.heightPropertyDeclaration()), line, parent, type, childCount);
            return containerPropertiesDeclaration;
        }
        if (ctx.childPropertyDeclaration() != null) {
            ContainerPropertiesDeclaration containerPropertiesDeclaration = new ContainerPropertiesDeclaration(visitChildPropertyDeclaration(ctx.childPropertyDeclaration()), line, parent, type, childCount);
            return containerPropertiesDeclaration;
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

    @Override
    public DartVariablesDeclaration visitDartVariabelsDeclaration(dart_parse.DartVariabelsDeclarationContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        VariablesVisitor variablesVisitor = new VariablesVisitor();
        String type = NodeType.OBJECT.toString();
        int childCount = ctx.getChildCount();
        if (ctx.variable() != null) {
            return new DartVariablesDeclaration(variablesVisitor.visitVariable(ctx.variable()), line, parent, type, childCount);
        } else if (ctx.function() != null) {
            return new DartVariablesDeclaration(visitFunction(ctx.function()), line, parent, type, childCount);
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
            return new BooleanOperation(num1, num2,null,null, operator);
        }
        else if(ctx.NAME(0)!=null && ctx.NAME(1)!=null) {

            String key1=  ctx.NAME(0).getText();
            String key2= ctx.NAME(1).getText();
           if(symbolTable.containsKey(key1) && symbolTable.containsKey(key2)){

               SymbolTableObject s1 = symbolTable.get(key1);
               SymbolTableObject s2=symbolTable.get(key2);
               String operator = ctx.getChild(1).toString();
               return new BooleanOperation(null, null,s1,s2, operator);
           }
        }
        return null;
    }


}
