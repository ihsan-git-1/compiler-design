import ast.nodes.*;
import gen.dart_parse;
import gen.dart_parseBaseVisitor;

import java.util.ArrayList;
import java.util.List;


public class NodesVisitor extends dart_parseBaseVisitor {

    private List<String> semanticErrors = new ArrayList<>();

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
        return visitClassDeclaration(ctx.classDeclaration());
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
    public Object visitStatelessClassDeclaration(dart_parse.StatelessClassDeclarationContext ctx) {
        return super.visitStatelessClassDeclaration(ctx);
    }

    @Override
    public Object visitStatefullClassDeclaration(dart_parse.StatefullClassDeclarationContext ctx) {
        return super.visitStatefullClassDeclaration(ctx);
    }

    @Override
    public Object visitStfulFirstBody(dart_parse.StfulFirstBodyContext ctx) {
        return super.visitStfulFirstBody(ctx);
    }

    @Override
    public Object visitStfulSecondBody(dart_parse.StfulSecondBodyContext ctx) {
        return super.visitStfulSecondBody(ctx);
    }

    @Override
    public Object visitStatefullAssignStateClassDeclaration(dart_parse.StatefullAssignStateClassDeclarationContext ctx) {
        return super.visitStatefullAssignStateClassDeclaration(ctx);
    }

    @Override
    public Object visitReturnStateTypes(dart_parse.ReturnStateTypesContext ctx) {
        return super.visitReturnStateTypes(ctx);
    }

    @Override
    public Object visitFunctionReturnState(dart_parse.FunctionReturnStateContext ctx) {
        return super.visitFunctionReturnState(ctx);
    }

    @Override
    public Object visitBuildMethodDeclaration(dart_parse.BuildMethodDeclarationContext ctx) {
        return super.visitBuildMethodDeclaration(ctx);
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
    public ExpandedDeclaration visitExpandedDeclaration(dart_parse.ExpandedDeclarationContext ctx) {
        ExpandedDeclaration expandedDeclaration = new ExpandedDeclaration(visitChildPropertyDeclaration(ctx.childPropertyDeclaration()));
        return expandedDeclaration;
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
                semanticErrors.add("Error cant duplicate width");
                System.out.println("Error cant duplicate width");
            }
            if(isAvailable.get(1) && ctx.conatinerPropertiesDeclaration().get(i).heightPropertyDeclaration() != null){
                semanticErrors.add("Error cant duplicate height");
                System.out.println("Error cant duplicate height");
            }
            if(isAvailable.get(2) && ctx.conatinerPropertiesDeclaration().get(i).childPropertyDeclaration() != null){
                semanticErrors.add("Error cant duplicate child");
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
    public Object visitRowColumnDeclaration(dart_parse.RowColumnDeclarationContext ctx) {
        return super.visitRowColumnDeclaration(ctx);
    }






    //************************ dart visitors ****************************************//

    @Override
    public DartVariablesDeclaration visitDartVariabelsDeclaration(dart_parse.DartVariabelsDeclarationContext ctx) {
        VariablesVisitor variablesVisitor = new VariablesVisitor();
        return new DartVariablesDeclaration(variablesVisitor.visitVariable(ctx.variable()));

    }







}
