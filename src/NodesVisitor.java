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
        TopTreeDeclaration topTreeDeclaration = new TopTreeDeclaration(line,parent);
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
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$","").replace("Context","");
        ClassDeclaration classDec = new ClassDeclaration(ctx.NAME().toString(),line,parent);
        for (int i = 0; i < ctx.dartVariabelsDeclaration().size(); i++) {
            classDec.getDartVariablesDeclarationList()
                    .add(visitDartVariabelsDeclaration(ctx.dartVariabelsDeclaration(i)));
        }
        return classDec;
    }

    @Override
    public StatelessClassDeclaration visitStatelessClassDeclaration(dart_parse.StatelessClassDeclarationContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$","").replace("Context","");
        StatelessClassDeclaration statelessClassDeclaration
                = new StatelessClassDeclaration(ctx.NAME().getText(),
                visitBuildMethodDeclaration(ctx.buildMethodDeclaration()),line,parent);

        for (int i = 0; i < ctx.dartVariabelsDeclaration().size(); i++) {
            statelessClassDeclaration.getDartVariablesDeclarationList()
                    .add(visitDartVariabelsDeclaration(ctx.dartVariabelsDeclaration(i)));
        }

        return statelessClassDeclaration;
    }

    @Override
    public BuildMethodDeclaration visitBuildMethodDeclaration(dart_parse.BuildMethodDeclarationContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$","").replace("Context","");
        BuildMethodDeclaration buildMethodDeclaration
                = new BuildMethodDeclaration(
                visitWidgetsDeclaration(ctx.widgetsDeclaration()),
                visitBuildContextDeclaration(ctx.buildContextDeclaration()),line,parent);

        for (int i = 0; i < ctx.dartVariabelsDeclaration().size(); i++) {
            buildMethodDeclaration.getDartVariables()
                    .add(visitDartVariabelsDeclaration(ctx.dartVariabelsDeclaration(i)));
        }

        return buildMethodDeclaration;
    }


    @Override
    public BuildContextDeclaration visitBuildContextDeclaration(dart_parse.BuildContextDeclarationContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$","").replace("Context","");
        return new BuildContextDeclaration(ctx.NAME().getText(),line,parent);
    }

    @Override
    public StatefullClassDeclaration visitStatefullClassDeclaration(dart_parse.StatefullClassDeclarationContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$","").replace("Context","");
        return new StatefullClassDeclaration(
                visitStfulFirstBody(ctx.stfulFirstBody()),
                visitStfulSecondBody(ctx.stfulSecondBody()),line,parent
        );
    }

    @Override
    public StatefullFirstBody visitStfulFirstBody(dart_parse.StfulFirstBodyContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$","").replace("Context","");
        StatefullFirstBody statefullFirstBody
                = new StatefullFirstBody(ctx.NAME().getText(),
                visitStatefullAssignStateClassDeclaration(ctx.statefullAssignStateClassDeclaration()),line,parent);

        for (int i = 0; i < ctx.dartVariabelsDeclaration().size(); i++) {
            statefullFirstBody.getDartVariablesDeclarationList()
                    .add(visitDartVariabelsDeclaration(ctx.dartVariabelsDeclaration(i)));
        }

        return statefullFirstBody;
    }

    @Override
    public StatefullSecondBody visitStfulSecondBody(dart_parse.StfulSecondBodyContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$","").replace("Context","");
        StatefullSecondBody statefullSecondBody
                = new StatefullSecondBody(
                ctx.NAME(0).getText(),
                ctx.NAME(1).getText(),
                visitBuildMethodDeclaration(ctx.buildMethodDeclaration()),line,parent);

        for (int i = 0; i < ctx.dartVariabelsDeclaration().size(); i++) {
            statefullSecondBody.getDartVariablesDeclarationList()
                    .add(visitDartVariabelsDeclaration(ctx.dartVariabelsDeclaration(i)));
        }

        return statefullSecondBody;
    }

    @Override
    public StatefullAssignStateClassDeclaration visitStatefullAssignStateClassDeclaration(dart_parse.StatefullAssignStateClassDeclarationContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$","").replace("Context","");
        return new StatefullAssignStateClassDeclaration(ctx.NAME().getText(),visitReturnStateTypes(ctx.returnStateTypes()),line, parent);
    }

    @Override
    public ReturnStateTypes visitReturnStateTypes(dart_parse.ReturnStateTypesContext ctx) {
        String name = "";
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$","").replace("Context","");
        if(ctx.functionReturnState() != null){
            name = ctx.functionReturnState().NAME().getText();
        }
        if(ctx.returnArrowState() != null){
            name = ctx.returnArrowState().NAME().getText();
        }
        return new ReturnStateTypes(name,line ,parent);
    }



    //******************************* flutter visitors ****************************************//

    @Override
    public WidgetsDeclaration visitWidgetsDeclaration(dart_parse.WidgetsDeclarationContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$","").replace("Context","");

        if(ctx.expandedDeclaration() != null){
            WidgetsDeclaration widgetsDeclaration
                    = new WidgetsDeclaration(visitExpandedDeclaration(ctx.expandedDeclaration()),
                    line,parent);
            return widgetsDeclaration;
        }
        if(ctx.textDeclaration() != null){
            WidgetsDeclaration widgetsDeclaration
                    = new WidgetsDeclaration(visitTextDeclaration(ctx.textDeclaration()),
                    line,parent);
            return widgetsDeclaration;
        }
        if(ctx.paddingDeclaration() != null){
            WidgetsDeclaration widgetsDeclaration
                    = new WidgetsDeclaration(visitPaddingDeclaration(ctx.paddingDeclaration()),
                    line,parent);
            return widgetsDeclaration;
        }
        if(ctx.scaffoldDeclaration() != null){
            WidgetsDeclaration widgetsDeclaration
                    = new WidgetsDeclaration(visitScaffoldDeclaration(ctx.scaffoldDeclaration()),
                    line,parent);
            return widgetsDeclaration;
        }
        if(ctx.imageDeclaration() != null){
            WidgetsDeclaration widgetsDeclaration
                    = new WidgetsDeclaration(visitImageDeclaration(ctx.imageDeclaration()),
                    line,parent);
            return widgetsDeclaration;
        }
        if(ctx.conatinerDeclaration() != null){
            WidgetsDeclaration widgetsDeclaration
                    = new WidgetsDeclaration(visitConatinerDeclaration(ctx.conatinerDeclaration()),
                    line,parent);

            return widgetsDeclaration;
        }
        if(ctx.materialButtonDeclaration() != null){
            WidgetsDeclaration widgetsDeclaration
                    = new WidgetsDeclaration(visitMaterialButtonDeclaration(ctx.materialButtonDeclaration()),
                    line,parent);

            return widgetsDeclaration;
        }
        if(ctx.materialAppDeclaration() != null){
            WidgetsDeclaration widgetsDeclaration
                    = new WidgetsDeclaration(visitMaterialAppDeclaration(ctx.materialAppDeclaration()),
                    line,parent);

            return widgetsDeclaration;
        }
        if(ctx.rowColumnDeclaration() != null){
            WidgetsDeclaration widgetsDeclaration
                    = new WidgetsDeclaration(visitRowColumnDeclaration(ctx.rowColumnDeclaration()),
                    line,parent);

            return widgetsDeclaration;
        }

        return null;
    }

    @Override
    public ChildPropertyDeclaration visitChildPropertyDeclaration(dart_parse.ChildPropertyDeclarationContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$","").replace("Context","");
        return new ChildPropertyDeclaration(visitWidgetsDeclaration(ctx.widgetsDeclaration()),line,parent);
    }

    @Override
    public TextDeclaration visitTextDeclaration(dart_parse.TextDeclarationContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$","").replace("Context","");
        return new TextDeclaration(ctx.STRING_LINE().getText(),line,parent);
    }
    @Override
    public ImageDeclaration visitImageDeclaration(dart_parse.ImageDeclarationContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$","").replace("Context","");
        return new ImageDeclaration(ctx.STRING_LINE().getText(),line,parent);
    }

    @Override
    public MaterialAppDeclaration visitMaterialAppDeclaration(dart_parse.MaterialAppDeclarationContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$","").replace("Context","");
        return new MaterialAppDeclaration(visitHomePropertyDeclaration(ctx.homePropertyDeclaration()),line,parent);
    }

    @Override
    public HomePropertyDeclaration visitHomePropertyDeclaration(dart_parse.HomePropertyDeclarationContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$","").replace("Context","");
        return new HomePropertyDeclaration(ctx.NAME().getText(),line,parent);
    }

    @Override
    public ExpandedDeclaration visitExpandedDeclaration(dart_parse.ExpandedDeclarationContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$","").replace("Context","");
        ExpandedDeclaration expandedDeclaration = new ExpandedDeclaration(visitChildPropertyDeclaration(ctx.childPropertyDeclaration()),line,parent);
        return expandedDeclaration;
    }

    @Override
    public MaterialButtonDeclaration visitMaterialButtonDeclaration(dart_parse.MaterialButtonDeclarationContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$","").replace("Context","");
        return new MaterialButtonDeclaration(visitChildPropertyDeclaration(ctx.childPropertyDeclaration()),line,parent);
    }

    @Override
    public PaddingDeclaration visitPaddingDeclaration(dart_parse.PaddingDeclarationContext ctx) {

        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$","").replace("Context","");
        return new PaddingDeclaration(
                visitPaddingPropertyDeclaration(ctx.paddingPropertyDeclaration())
                ,visitChildPropertyDeclaration(ctx.childPropertyDeclaration()),line,parent
        );
    }

    @Override
    public PaddingPropertyDeclaration visitPaddingPropertyDeclaration(dart_parse.PaddingPropertyDeclarationContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$","").replace("Context","");
        return new PaddingPropertyDeclaration(visitEdgeInsistAll(ctx.edgeInsistAll()),line,parent);
    }

    @Override
    public EdgeInsistAll visitEdgeInsistAll(dart_parse.EdgeInsistAllContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$","").replace("Context","");
        VariablesVisitor variablesVisitor = new VariablesVisitor();
        return new EdgeInsistAll(variablesVisitor.visitNumber(ctx.number()),line,parent);
    }

    @Override
    public ScaffoldDeclaration visitScaffoldDeclaration(dart_parse.ScaffoldDeclarationContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$","").replace("Context","");
        return new ScaffoldDeclaration(visitBodyPropertyDeclaration(ctx.bodyPropertyDeclaration()),line,parent);
    }

    @Override
    public BodyPropertyDeclaration visitBodyPropertyDeclaration(dart_parse.BodyPropertyDeclarationContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$","").replace("Context","");
        return new BodyPropertyDeclaration(visitWidgetsDeclaration(ctx.widgetsDeclaration()),line,parent);
    }

    @Override
    public ContainerDeclaration visitConatinerDeclaration(dart_parse.ConatinerDeclarationContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$","").replace("Context","");
        ContainerDeclaration containerDeclaration = new ContainerDeclaration(line,parent);

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
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$","").replace("Context","");
        if(ctx.widthPropertyDeclaration() != null){
            ContainerPropertiesDeclaration containerPropertiesDeclaration
                    = new ContainerPropertiesDeclaration(visitWidthPropertyDeclaration(ctx.widthPropertyDeclaration()),line,parent);
            return containerPropertiesDeclaration;
        }

        if(ctx.heightPropertyDeclaration() != null){
            ContainerPropertiesDeclaration containerPropertiesDeclaration
                    = new ContainerPropertiesDeclaration(visitHeightPropertyDeclaration(ctx.heightPropertyDeclaration()),line,parent);
            return  containerPropertiesDeclaration;
        }
        if(ctx.childPropertyDeclaration() != null){
            ContainerPropertiesDeclaration containerPropertiesDeclaration
                    = new ContainerPropertiesDeclaration(visitChildPropertyDeclaration(ctx.childPropertyDeclaration()),line,parent);
            return containerPropertiesDeclaration;
        }
        return null;
    }

    @Override
    public HeightPropertyDeclaration visitHeightPropertyDeclaration(dart_parse.HeightPropertyDeclarationContext ctx) {
        VariablesVisitor variablesVisitor = new VariablesVisitor();
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$","").replace("Context","");
        return new HeightPropertyDeclaration(variablesVisitor.visitNumber(ctx.number()),line,parent);
    }
    @Override
    public WidthPropertyDeclaration visitWidthPropertyDeclaration(dart_parse.WidthPropertyDeclarationContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$","").replace("Context","");
        VariablesVisitor variablesVisitor = new VariablesVisitor();
        return new WidthPropertyDeclaration(variablesVisitor.visitNumber(ctx.number()),line,parent);
    }

    @Override
    public RowColumnDeclaration visitRowColumnDeclaration(dart_parse.RowColumnDeclarationContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$","").replace("Context","");
        String name = "Column";
        if(ctx.ROW() != null){
            name = "Row";
        }
        return new RowColumnDeclaration(name,visitChildrenPropertyDeclaration(ctx.childrenPropertyDeclaration()),line,parent);
    }
    @Override
    public ChildrenPropertyDeclaration visitChildrenPropertyDeclaration(dart_parse.ChildrenPropertyDeclarationContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$","").replace("Context","");
        ChildrenPropertyDeclaration childrenPropertyDeclaration = new ChildrenPropertyDeclaration(line,parent);
        for (int i = 0; i < ctx.widgetsDeclaration().size(); i++) {
            childrenPropertyDeclaration.getWidgetDeclarationList()
                    .add(visitWidgetsDeclaration(ctx.widgetsDeclaration(i)));
        }
        return childrenPropertyDeclaration;
    }


    //******************************* dart visitors ****************************************//

    @Override
    public DartVariablesDeclaration visitDartVariabelsDeclaration(dart_parse.DartVariabelsDeclarationContext ctx) {
        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$","").replace("Context","");
        VariablesVisitor variablesVisitor = new VariablesVisitor();
        return new DartVariablesDeclaration(variablesVisitor.visitVariable(ctx.variable()),line,parent);

    }







}
