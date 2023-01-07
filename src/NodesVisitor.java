import ast.nodes.*;
import gen.dart_parse;
import gen.dart_parseBaseVisitor;
import java.util.ArrayList;
import java.util.List;



public class NodesVisitor extends dart_parseBaseVisitor {


    //********************* base declarations start code ********************************///
    @Override
    public TopTreeDeclaration visitTopTreeDeclaration(dart_parse.TopTreeDeclarationContext ctx) {
        TopTreeDeclaration topTreeDeclaration = new TopTreeDeclaration();
        for (int i = 0; i < ctx.allClassesDeclaration().size() ; i++) {
            if(ctx.allClassesDeclaration().get(i) != null) {

                topTreeDeclaration
                        .getTopTreeChildrenList()
                        .add(visitAllClassesDeclaration(ctx.allClassesDeclaration(i)));
            }
        }
        return topTreeDeclaration;
    }
    @Override
    public AllClassesDeclarationAbstractChild visitAllClassesDeclaration(dart_parse.AllClassesDeclarationContext ctx) {
        if(ctx.classDeclaration() != null){
            return visitClassDeclaration(ctx.classDeclaration());
        }
        if(ctx.statelessClassDeclaration() != null){
            return visitStatelessClassDeclaration(ctx.statelessClassDeclaration());
        }
        if(ctx.statefullClassDeclaration() != null){
            return visitStatefullClassDeclaration(ctx.statefullClassDeclaration());
        }
        return null;
    }

    @Override
    public ClassDeclaration visitClassDeclaration(dart_parse.ClassDeclarationContext ctx) {
        ClassDeclaration classDec = new ClassDeclaration(ctx.NAME().toString());
        for (int i = 0; i < ctx.dartVariabelsDeclaration().size(); i++) {
            classDec.getDartVariablesDeclarationList()
                    .add(visitDartVariabelsDeclaration(ctx.dartVariabelsDeclaration(i)));
        }
        return classDec;
    }

    @Override
    public StatelessClassDeclaration visitStatelessClassDeclaration(dart_parse.StatelessClassDeclarationContext ctx) {
        StatelessClassDeclaration statelessClassDeclaration
                = new StatelessClassDeclaration(ctx.NAME().getText(),
                        visitBuildMethodDeclaration(ctx.buildMethodDeclaration()));

        for (int i = 0; i < ctx.dartVariabelsDeclaration().size(); i++) {
            statelessClassDeclaration.getDartVariablesDeclarationList()
                    .add(visitDartVariabelsDeclaration(ctx.dartVariabelsDeclaration(i)));
        }

        return statelessClassDeclaration;
    }

    @Override
    public BuildMethodDeclaration visitBuildMethodDeclaration(dart_parse.BuildMethodDeclarationContext ctx) {
        BuildMethodDeclaration buildMethodDeclaration
                = new BuildMethodDeclaration(
                        visitWidgetsDeclaration(ctx.widgetsDeclaration()),
                        visitBuildContextDeclaration(ctx.buildContextDeclaration()));

        for (int i = 0; i < ctx.dartVariabelsDeclaration().size(); i++) {
            buildMethodDeclaration.getDartVariables()
                    .add(visitDartVariabelsDeclaration(ctx.dartVariabelsDeclaration(i)));
        }

        return buildMethodDeclaration;
    }


    @Override
    public BuildContextDeclaration visitBuildContextDeclaration(dart_parse.BuildContextDeclarationContext ctx) {
        return new BuildContextDeclaration(ctx.NAME().getText());
    }

    @Override
    public StatefullClassDeclaration visitStatefullClassDeclaration(dart_parse.StatefullClassDeclarationContext ctx) {
        return new StatefullClassDeclaration(
                visitStfulFirstBody(ctx.stfulFirstBody()),
                visitStfulSecondBody(ctx.stfulSecondBody())
        );
    }

    @Override
    public StatefullFirstBody visitStfulFirstBody(dart_parse.StfulFirstBodyContext ctx) {
        StatefullFirstBody statefullFirstBody
                = new StatefullFirstBody(ctx.NAME().getText(),
                visitStatefullAssignStateClassDeclaration(ctx.statefullAssignStateClassDeclaration()));

        for (int i = 0; i < ctx.dartVariabelsDeclaration().size(); i++) {
            statefullFirstBody.getDartVariablesDeclarationList()
                    .add(visitDartVariabelsDeclaration(ctx.dartVariabelsDeclaration(i)));
        }

        return statefullFirstBody;
    }

    @Override
    public StatefullSecondBody visitStfulSecondBody(dart_parse.StfulSecondBodyContext ctx) {
        StatefullSecondBody statefullSecondBody
                = new StatefullSecondBody(
                        ctx.NAME(0).getText(),
                ctx.NAME(1).getText(),
                visitBuildMethodDeclaration(ctx.buildMethodDeclaration()));

        for (int i = 0; i < ctx.dartVariabelsDeclaration().size(); i++) {
            statefullSecondBody.getDartVariablesDeclarationList()
                    .add(visitDartVariabelsDeclaration(ctx.dartVariabelsDeclaration(i)));
        }

        return statefullSecondBody;
    }

    @Override
    public StatefullAssignStateClassDeclaration visitStatefullAssignStateClassDeclaration(dart_parse.StatefullAssignStateClassDeclarationContext ctx) {
        return new StatefullAssignStateClassDeclaration(ctx.NAME().getText(),visitReturnStateTypes(ctx.returnStateTypes()));
    }

    @Override
    public ReturnStateTypes visitReturnStateTypes(dart_parse.ReturnStateTypesContext ctx) {
        String name = "";

        if(ctx.functionReturnState() != null){
            name = ctx.functionReturnState().NAME().getText();
        }
        if(ctx.returnArrowState() != null){
            name = ctx.returnArrowState().NAME().getText();
        }
        return new ReturnStateTypes(name);
    }



    //************************ flutter visitors ****************************************//

    @Override
    public WidgetsDeclaration visitWidgetsDeclaration(dart_parse.WidgetsDeclarationContext ctx) {

        if(ctx.expandedDeclaration() != null){
            WidgetsDeclaration widgetsDeclaration
                    = new WidgetsDeclaration(visitExpandedDeclaration(ctx.expandedDeclaration()));
            return widgetsDeclaration;
        }
        if(ctx.textDeclaration() != null){
            WidgetsDeclaration widgetsDeclaration
                    = new WidgetsDeclaration(visitTextDeclaration(ctx.textDeclaration()));
            return widgetsDeclaration;
        }
        if(ctx.paddingDeclaration() != null){
            WidgetsDeclaration widgetsDeclaration
                    = new WidgetsDeclaration(visitPaddingDeclaration(ctx.paddingDeclaration()));
            return widgetsDeclaration;
        }
        if(ctx.scaffoldDeclaration() != null){
            WidgetsDeclaration widgetsDeclaration
                    = new WidgetsDeclaration(visitScaffoldDeclaration(ctx.scaffoldDeclaration()));
            return widgetsDeclaration;
        }
        if(ctx.imageDeclaration() != null){
            WidgetsDeclaration widgetsDeclaration
                    = new WidgetsDeclaration(visitImageDeclaration(ctx.imageDeclaration()));
            return widgetsDeclaration;
        }
        if(ctx.conatinerDeclaration() != null){
            WidgetsDeclaration widgetsDeclaration
                    = new WidgetsDeclaration(visitConatinerDeclaration(ctx.conatinerDeclaration()));

            return widgetsDeclaration;
        }
        if(ctx.materialButtonDeclaration() != null){
            WidgetsDeclaration widgetsDeclaration
                    = new WidgetsDeclaration(visitMaterialButtonDeclaration(ctx.materialButtonDeclaration()));

            return widgetsDeclaration;
        }
        if(ctx.materialAppDeclaration() != null){
            WidgetsDeclaration widgetsDeclaration
                    = new WidgetsDeclaration(visitMaterialAppDeclaration(ctx.materialAppDeclaration()));

            return widgetsDeclaration;
        }
        if(ctx.rowColumnDeclaration() != null){
            WidgetsDeclaration widgetsDeclaration
                    = new WidgetsDeclaration(visitRowColumnDeclaration(ctx.rowColumnDeclaration()));

            return widgetsDeclaration;
        }

        return null;
    }

    @Override
    public ChildPropertyDeclaration visitChildPropertyDeclaration(dart_parse.ChildPropertyDeclarationContext ctx) {
        return new ChildPropertyDeclaration(visitWidgetsDeclaration(ctx.widgetsDeclaration()));
    }

    @Override
    public TextDeclaration visitTextDeclaration(dart_parse.TextDeclarationContext ctx) {
        return new TextDeclaration(ctx.STRING_LINE().getText());
    }
    @Override
    public ImageDeclaration visitImageDeclaration(dart_parse.ImageDeclarationContext ctx) {
        return new ImageDeclaration(ctx.STRING_LINE().getText());
    }

    @Override
    public MaterialAppDeclaration visitMaterialAppDeclaration(dart_parse.MaterialAppDeclarationContext ctx) {
        return new MaterialAppDeclaration(visitHomePropertyDeclaration(ctx.homePropertyDeclaration()));
    }

    @Override
    public HomePropertyDeclaration visitHomePropertyDeclaration(dart_parse.HomePropertyDeclarationContext ctx) {
        return new HomePropertyDeclaration(ctx.NAME().getText());
    }

    @Override
    public ExpandedDeclaration visitExpandedDeclaration(dart_parse.ExpandedDeclarationContext ctx) {
        ExpandedDeclaration expandedDeclaration = new ExpandedDeclaration(visitChildPropertyDeclaration(ctx.childPropertyDeclaration()));
        return expandedDeclaration;
    }

    @Override
    public MaterialButtonDeclaration visitMaterialButtonDeclaration(dart_parse.MaterialButtonDeclarationContext ctx) {
        return new MaterialButtonDeclaration(visitChildPropertyDeclaration(ctx.childPropertyDeclaration()));
    }

    @Override
    public PaddingDeclaration visitPaddingDeclaration(dart_parse.PaddingDeclarationContext ctx) {
        return new PaddingDeclaration(
                visitPaddingPropertyDeclaration(ctx.paddingPropertyDeclaration())
                ,visitChildPropertyDeclaration(ctx.childPropertyDeclaration())
        );
    }

    @Override
    public PaddingPropertyDeclaration visitPaddingPropertyDeclaration(dart_parse.PaddingPropertyDeclarationContext ctx) {
        return new PaddingPropertyDeclaration(visitEdgeInsistAll(ctx.edgeInsistAll()));
    }

    @Override
    public EdgeInsistAll visitEdgeInsistAll(dart_parse.EdgeInsistAllContext ctx) {
        VariablesVisitor variablesVisitor = new VariablesVisitor();
        return new EdgeInsistAll(variablesVisitor.visitNumber(ctx.number()));
    }

    @Override
    public ScaffoldDeclaration visitScaffoldDeclaration(dart_parse.ScaffoldDeclarationContext ctx) {
        return new ScaffoldDeclaration(visitBodyPropertyDeclaration(ctx.bodyPropertyDeclaration()));
    }

    @Override
    public BodyPropertyDeclaration visitBodyPropertyDeclaration(dart_parse.BodyPropertyDeclarationContext ctx) {
        return new BodyPropertyDeclaration(visitWidgetsDeclaration(ctx.widgetsDeclaration()));
    }

    @Override
    public ContainerDeclaration visitConatinerDeclaration(dart_parse.ConatinerDeclarationContext ctx) {
        ContainerDeclaration containerDeclaration = new ContainerDeclaration();

        List<Boolean> isAvailable = new ArrayList<Boolean>();
        isAvailable.add(false); // width
        isAvailable.add(false); // height
        isAvailable.add(false); // child

        for (int i = 0; i < ctx.conatinerPropertiesDeclaration().size() ; i++) {

            // check if property already available;
            if(isAvailable.get(0) && ctx.conatinerPropertiesDeclaration().get(i).widthPropertyDeclaration() != null){
                dart_parseBaseVisitor.semanticErrors.add("Error cant duplicate width");
                System.out.println("Error cant duplicate width");
            }
            if(isAvailable.get(1) && ctx.conatinerPropertiesDeclaration().get(i).heightPropertyDeclaration() != null){
                dart_parseBaseVisitor.semanticErrors.add("Error cant duplicate height");
                System.out.println("Error cant duplicate height");
            }
            if(isAvailable.get(2) && ctx.conatinerPropertiesDeclaration().get(i).childPropertyDeclaration() != null){
                dart_parseBaseVisitor.semanticErrors.add("Error cant duplicate child");
                System.out.println("Error cant duplicate child");
            }

            // add property if not already available;
            if(ctx.conatinerPropertiesDeclaration().get(i) != null) {
                if(ctx.conatinerPropertiesDeclaration().get(i).widthPropertyDeclaration() != null &&  !isAvailable.get(0)){
                    containerDeclaration.getContainerDeclarationList()
                            .add(visitConatinerPropertiesDeclaration(ctx.conatinerPropertiesDeclaration(i)));
                    isAvailable.set(0,true); // width

                }
                if(ctx.conatinerPropertiesDeclaration().get(i).heightPropertyDeclaration() != null &&  !isAvailable.get(1)){
                    containerDeclaration.getContainerDeclarationList()
                            .add(visitConatinerPropertiesDeclaration(ctx.conatinerPropertiesDeclaration(i)));
                    isAvailable.set(1,true); // width
                }
                if( ctx.conatinerPropertiesDeclaration().get(i).childPropertyDeclaration() != null &&  !isAvailable.get(2)){
                    containerDeclaration.getContainerDeclarationList()
                            .add(visitConatinerPropertiesDeclaration(ctx.conatinerPropertiesDeclaration(i)));
                    isAvailable.set(2,true); // width
                }
            }


        }
        return containerDeclaration;
    }
    @Override
    public ContainerPropertiesDeclaration visitConatinerPropertiesDeclaration(dart_parse.ConatinerPropertiesDeclarationContext ctx) {
        if(ctx.widthPropertyDeclaration() != null){
            ContainerPropertiesDeclaration containerPropertiesDeclaration
                    = new ContainerPropertiesDeclaration(visitWidthPropertyDeclaration(ctx.widthPropertyDeclaration()));
            return containerPropertiesDeclaration;
        }

        if(ctx.heightPropertyDeclaration() != null){
            ContainerPropertiesDeclaration containerPropertiesDeclaration
                    = new ContainerPropertiesDeclaration(visitHeightPropertyDeclaration(ctx.heightPropertyDeclaration()));
            return  containerPropertiesDeclaration;
        }
        if(ctx.childPropertyDeclaration() != null){
            ContainerPropertiesDeclaration containerPropertiesDeclaration
                    = new ContainerPropertiesDeclaration(visitChildPropertyDeclaration(ctx.childPropertyDeclaration()));
            return containerPropertiesDeclaration;
        }
        return null;
    }

    @Override
    public HeightPropertyDeclaration visitHeightPropertyDeclaration(dart_parse.HeightPropertyDeclarationContext ctx) {
        VariablesVisitor variablesVisitor = new VariablesVisitor();
        return new HeightPropertyDeclaration(variablesVisitor.visitNumber(ctx.number()));
    }
    @Override
    public WidthPropertyDeclaration visitWidthPropertyDeclaration(dart_parse.WidthPropertyDeclarationContext ctx) {
        VariablesVisitor variablesVisitor = new VariablesVisitor();
        return new WidthPropertyDeclaration(variablesVisitor.visitNumber(ctx.number()));
    }

    @Override
    public RowColumnDeclaration visitRowColumnDeclaration(dart_parse.RowColumnDeclarationContext ctx) {
        String name = "Column";
        if(ctx.ROW() != null){
            name = "Row";
        }
        return new RowColumnDeclaration(name,visitChildrenPropertyDeclaration(ctx.childrenPropertyDeclaration()));
    }
    @Override
    public ChildrenPropertyDeclaration visitChildrenPropertyDeclaration(dart_parse.ChildrenPropertyDeclarationContext ctx) {
        ChildrenPropertyDeclaration childrenPropertyDeclaration = new ChildrenPropertyDeclaration();
        for (int i = 0; i < ctx.widgetsDeclaration().size(); i++) {
            childrenPropertyDeclaration.getWidgetDeclarationList()
                    .add(visitWidgetsDeclaration(ctx.widgetsDeclaration(i)));
        }
        return childrenPropertyDeclaration;
    }


    //************************ dart visitors ****************************************//

    @Override
    public DartVariablesDeclaration visitDartVariabelsDeclaration(dart_parse.DartVariabelsDeclarationContext ctx) {
        VariablesVisitor variablesVisitor = new VariablesVisitor();
        return new DartVariablesDeclaration(variablesVisitor.visitVariable(ctx.variable()));

    }







}
