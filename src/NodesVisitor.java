import ast.nodes.*;
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
        TopTreeDeclaration topTreeDeclaration = new TopTreeDeclaration(line, parent);
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
        ClassDeclaration classDec = new ClassDeclaration(ctx.NAME().toString(), line, parent);
        for (int i = 0; i < ctx.dartVariabelsDeclaration().size(); i++) {
            classDec.getDartVariablesDeclarationList().add(visitDartVariabelsDeclaration(ctx.dartVariabelsDeclaration(i)));
        }
        return classDec;
    }

    @Override
    public StatelessClassDeclaration visitStatelessClassDeclaration(dart_parse.StatelessClassDeclarationContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        StatelessClassDeclaration statelessClassDeclaration = new StatelessClassDeclaration(ctx.NAME().getText(), visitBuildMethodDeclaration(ctx.buildMethodDeclaration()), line, parent);

        for (int i = 0; i < ctx.dartVariabelsDeclaration().size(); i++) {
            statelessClassDeclaration.getDartVariablesDeclarationList().add(visitDartVariabelsDeclaration(ctx.dartVariabelsDeclaration(i)));
        }

        return statelessClassDeclaration;
    }

    @Override
    public BuildMethodDeclaration visitBuildMethodDeclaration(dart_parse.BuildMethodDeclarationContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        BuildMethodDeclaration buildMethodDeclaration = new BuildMethodDeclaration(visitWidgetsDeclaration(ctx.widgetsDeclaration()), visitBuildContextDeclaration(ctx.buildContextDeclaration()), line, parent);

        for (int i = 0; i < ctx.dartVariabelsDeclaration().size(); i++) {
            buildMethodDeclaration.getDartVariables().add(visitDartVariabelsDeclaration(ctx.dartVariabelsDeclaration(i)));
        }

        return buildMethodDeclaration;
    }


    @Override
    public BuildContextDeclaration visitBuildContextDeclaration(dart_parse.BuildContextDeclarationContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        return new BuildContextDeclaration(ctx.NAME().getText(), line, parent);
    }

    @Override
    public IfStatementDeclaration visitIfStatement(dart_parse.IfStatementContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
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
        return new IfStatementDeclaration(line, parent, booleanOperation, ifBlock, elseIfBlocks, elseBlock);
    }

    @Override
    public WhileStatement visitWhileStatement(dart_parse.WhileStatementContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        BooleanOperation booleanOperation = (BooleanOperation) visitBooleanOperation(ctx.booleanOperation());
        Block block = visitBlock(ctx.block());
        return new WhileStatement(line, parent, booleanOperation, block);
    }

    @Override
    public Block visitBlock(dart_parse.BlockContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        List<StatementDeclaration> statements = new ArrayList<>();
        for (int i = 0; i < ctx.statement().size(); i++) {
            statements.add(visitStatement(ctx.statement(i)));
        }
        return new Block(line, parent, statements);
    }

    @Override
    public Function visitFunction(dart_parse.FunctionContext ctx) {
        Parameter parameters = null;
        int line = ctx.start.getLine();
        //String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        FunctionType type = visitFunctionType(ctx.functionType());
        String name = ctx.NAME().getText();
        if (ctx.parameters() != null) {
            parameters = visitParameters(ctx.parameters());
        }
        Block block = visitBlock(ctx.block());
        return new Function(line, null, type, name, parameters, block);
    }

    @Override
    public FunctionType visitFunctionType(dart_parse.FunctionTypeContext ctx) {
        return new FunctionType(ctx.getChild(0).getText());
    }

    @Override
    public Parameter visitParameters(dart_parse.ParametersContext ctx) {
        List<DartVariablesDeclaration> vars = new ArrayList<>();

        for (int i = 0; i < ctx.dartVariabelsDeclaration().size(); i++) {
            DartVariablesDeclaration var = visitDartVariabelsDeclaration(ctx.dartVariabelsDeclaration(i));
            vars.add(var);
        }
        return new Parameter(vars);
    }

    @Override
    public StatefullClassDeclaration visitStatefullClassDeclaration(dart_parse.StatefullClassDeclarationContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        return new StatefullClassDeclaration(visitStfulFirstBody(ctx.stfulFirstBody()), visitStfulSecondBody(ctx.stfulSecondBody()), line, parent);
    }

    @Override
    public StatefullFirstBody visitStfulFirstBody(dart_parse.StfulFirstBodyContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        StatefullFirstBody statefullFirstBody = new StatefullFirstBody(ctx.NAME().getText(), visitStatefullAssignStateClassDeclaration(ctx.statefullAssignStateClassDeclaration()), line, parent);

        for (int i = 0; i < ctx.dartVariabelsDeclaration().size(); i++) {
            statefullFirstBody.getDartVariablesDeclarationList().add(visitDartVariabelsDeclaration(ctx.dartVariabelsDeclaration(i)));
        }

        return statefullFirstBody;
    }

    @Override
    public StatefullSecondBody visitStfulSecondBody(dart_parse.StfulSecondBodyContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        StatefullSecondBody statefullSecondBody = new StatefullSecondBody(ctx.NAME(0).getText(), ctx.NAME(1).getText(), visitBuildMethodDeclaration(ctx.buildMethodDeclaration()), line, parent);

        for (int i = 0; i < ctx.dartVariabelsDeclaration().size(); i++) {
            statefullSecondBody.getDartVariablesDeclarationList().add(visitDartVariabelsDeclaration(ctx.dartVariabelsDeclaration(i)));
        }

        return statefullSecondBody;
    }

    @Override
    public StatefullAssignStateClassDeclaration visitStatefullAssignStateClassDeclaration(dart_parse.StatefullAssignStateClassDeclarationContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        return new StatefullAssignStateClassDeclaration(ctx.NAME().getText(), visitReturnStateTypes(ctx.returnStateTypes()), line, parent);
    }

    @Override
    public ReturnStateTypes visitReturnStateTypes(dart_parse.ReturnStateTypesContext ctx) {
        String name = "";
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        if (ctx.functionReturnState() != null) {
            name = ctx.functionReturnState().NAME().getText();
        }
        if (ctx.returnArrowState() != null) {
            name = ctx.returnArrowState().NAME().getText();
        }
        return new ReturnStateTypes(name, line, parent);
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

        if (ctx.expandedDeclaration() != null) {
            return new WidgetsDeclaration(visitExpandedDeclaration(ctx.expandedDeclaration()), line, parent);
        }
        if (ctx.textDeclaration() != null) {
            return new WidgetsDeclaration(visitTextDeclaration(ctx.textDeclaration()), line, parent);
        }
        if (ctx.paddingDeclaration() != null) {
            return new WidgetsDeclaration(visitPaddingDeclaration(ctx.paddingDeclaration()), line, parent);
        }
        if (ctx.scaffoldDeclaration() != null) {
            return new WidgetsDeclaration(visitScaffoldDeclaration(ctx.scaffoldDeclaration()), line, parent);
        }
        if (ctx.imageDeclaration() != null) {
            return new WidgetsDeclaration(visitImageDeclaration(ctx.imageDeclaration()), line, parent);
        }
        if (ctx.conatinerDeclaration() != null) {

            return new WidgetsDeclaration(visitConatinerDeclaration(ctx.conatinerDeclaration()), line, parent);
        }
        if (ctx.materialButtonDeclaration() != null) {

            return new WidgetsDeclaration(visitMaterialButtonDeclaration(ctx.materialButtonDeclaration()), line, parent);
        }
        if (ctx.materialAppDeclaration() != null) {

            return new WidgetsDeclaration(visitMaterialAppDeclaration(ctx.materialAppDeclaration()), line, parent);
        }
        if (ctx.rowColumnDeclaration() != null) {

            return new WidgetsDeclaration(visitRowColumnDeclaration(ctx.rowColumnDeclaration()), line, parent);
        }

        return null;
    }

    @Override
    public ChildPropertyDeclaration visitChildPropertyDeclaration(dart_parse.ChildPropertyDeclarationContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        return new ChildPropertyDeclaration(visitWidgetsDeclaration(ctx.widgetsDeclaration()), line, parent);
    }

    @Override
    public TextDeclaration visitTextDeclaration(dart_parse.TextDeclarationContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        return new TextDeclaration(ctx.STRING_LINE().getText(), line, parent);
    }

    @Override
    public ImageDeclaration visitImageDeclaration(dart_parse.ImageDeclarationContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        return new ImageDeclaration(ctx.STRING_LINE().getText(), line, parent);
    }

    @Override
    public MaterialAppDeclaration visitMaterialAppDeclaration(dart_parse.MaterialAppDeclarationContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        return new MaterialAppDeclaration(visitHomePropertyDeclaration(ctx.homePropertyDeclaration()), line, parent);
    }

    @Override
    public HomePropertyDeclaration visitHomePropertyDeclaration(dart_parse.HomePropertyDeclarationContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        return new HomePropertyDeclaration(ctx.NAME().getText(), line, parent);
    }

    @Override
    public ExpandedDeclaration visitExpandedDeclaration(dart_parse.ExpandedDeclarationContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        return new ExpandedDeclaration(visitChildPropertyDeclaration(ctx.childPropertyDeclaration()), line, parent);
    }

    @Override
    public MaterialButtonDeclaration visitMaterialButtonDeclaration(dart_parse.MaterialButtonDeclarationContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        return new MaterialButtonDeclaration(visitOnPressedPropertyDeclaration(ctx.onPressedPropertyDeclaration()), visitChildPropertyDeclaration(ctx.childPropertyDeclaration()), line, parent);
    }

    @Override
    public OnPressedPropertyDeclaration visitOnPressedPropertyDeclaration(dart_parse.OnPressedPropertyDeclarationContext ctx) {
        OnPressedPropertyDeclaration onPressedPropertyDeclaration = new OnPressedPropertyDeclaration();

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
        return new StatementDeclaration(visitDartVariabelsDeclaration(ctx.dartVariabelsDeclaration()));
    }

//    @Override
//    public ForStatement visitForStatement(dart_parse.ForStatementContext ctx) {
//       BooleanOperation booleanOperation= (BooleanOperation) visitBooleanOperation(ctx.booleanOperation());
//
//       return ForStatement();
//    }


    @Override
    public PaddingDeclaration visitPaddingDeclaration(dart_parse.PaddingDeclarationContext ctx) {

        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        return new PaddingDeclaration(visitPaddingPropertyDeclaration(ctx.paddingPropertyDeclaration()), visitChildPropertyDeclaration(ctx.childPropertyDeclaration()), line, parent);
    }

    @Override
    public PaddingPropertyDeclaration visitPaddingPropertyDeclaration(dart_parse.PaddingPropertyDeclarationContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        return new PaddingPropertyDeclaration(visitEdgeInsistAll(ctx.edgeInsistAll()), line, parent);
    }

    @Override
    public EdgeInsistAll visitEdgeInsistAll(dart_parse.EdgeInsistAllContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        VariablesVisitor variablesVisitor = new VariablesVisitor();
        return new EdgeInsistAll(variablesVisitor.visitNumber(ctx.number()), line, parent);
    }

    @Override
    public ScaffoldDeclaration visitScaffoldDeclaration(dart_parse.ScaffoldDeclarationContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        return new ScaffoldDeclaration(visitBodyPropertyDeclaration(ctx.bodyPropertyDeclaration()), line, parent);
    }

    @Override
    public BodyPropertyDeclaration visitBodyPropertyDeclaration(dart_parse.BodyPropertyDeclarationContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        return new BodyPropertyDeclaration(visitWidgetsDeclaration(ctx.widgetsDeclaration()), line, parent);
    }

    @Override
    public ContainerDeclaration visitConatinerDeclaration(dart_parse.ConatinerDeclarationContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        ContainerDeclaration containerDeclaration = new ContainerDeclaration(line, parent);

        List<Boolean> isAvailable = new ArrayList<>();
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
        if (ctx.widthPropertyDeclaration() != null) {
            return new ContainerPropertiesDeclaration(visitWidthPropertyDeclaration(ctx.widthPropertyDeclaration()), line, parent);
        }

        if (ctx.heightPropertyDeclaration() != null) {
            return new ContainerPropertiesDeclaration(visitHeightPropertyDeclaration(ctx.heightPropertyDeclaration()), line, parent);
        }
        if (ctx.childPropertyDeclaration() != null) {
            return new ContainerPropertiesDeclaration(visitChildPropertyDeclaration(ctx.childPropertyDeclaration()), line, parent);
        }
        return null;
    }

    @Override
    public HeightPropertyDeclaration visitHeightPropertyDeclaration(dart_parse.HeightPropertyDeclarationContext ctx) {
        VariablesVisitor variablesVisitor = new VariablesVisitor();
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        return new HeightPropertyDeclaration(variablesVisitor.visitNumber(ctx.number()), line, parent);
    }

    @Override
    public WidthPropertyDeclaration visitWidthPropertyDeclaration(dart_parse.WidthPropertyDeclarationContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        VariablesVisitor variablesVisitor = new VariablesVisitor();
        return new WidthPropertyDeclaration(variablesVisitor.visitNumber(ctx.number()), line, parent);
    }

    @Override
    public RowColumnDeclaration visitRowColumnDeclaration(dart_parse.RowColumnDeclarationContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        String name = "Column";
        if (ctx.ROW() != null) {
            name = "Row";
        }
        return new RowColumnDeclaration(name, visitChildrenPropertyDeclaration(ctx.childrenPropertyDeclaration()), line, parent);
    }

    @Override
    public ChildrenPropertyDeclaration visitChildrenPropertyDeclaration(dart_parse.ChildrenPropertyDeclarationContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        ChildrenPropertyDeclaration childrenPropertyDeclaration = new ChildrenPropertyDeclaration(line, parent);
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
        return new DartVariablesDeclaration(variablesVisitor.visitVariable(ctx.variable()), line, parent);

    }

//    @Override
//    public BooleanOperation visitBooleanOperation(dart_parse.BooleanOperationContext ctx) {
//
//        return new BooleanOperation();
//    }


}
