import ast.nodes.*;
import gen.dart_parse;
import gen.dart_parseBaseVisitor;



public class NodesVisitor extends dart_parseBaseVisitor {



  // base declarations start code ///
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



    // flutter visitors //

    @Override
    public WidgetsDeclaration visitWidgetsDeclaration(dart_parse.WidgetsDeclarationContext ctx) {
        //todo : add all widgets
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
    public ExpandedDeclaration visitExpandedDeclaration(dart_parse.ExpandedDeclarationContext ctx) {
      ExpandedDeclaration expandedDeclaration = new ExpandedDeclaration(visitChildPropertyDeclaration(ctx.childPropertyDeclaration()));
      return expandedDeclaration;
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

    @Override
    public DartVariablesDeclaration visitDartVariabelsDeclaration(dart_parse.DartVariabelsDeclarationContext ctx) {
        VariablesVisitor variablesVisitor = new VariablesVisitor();
        return new DartVariablesDeclaration(variablesVisitor.visitVariable(ctx.variable()));

    }

    @Override
    public Object visitPaddingDeclaration(dart_parse.PaddingDeclarationContext ctx) {
        return super.visitPaddingDeclaration(ctx);
    }

    @Override
    public Object visitScaffoldDeclaration(dart_parse.ScaffoldDeclarationContext ctx) {
        return super.visitScaffoldDeclaration(ctx);
    }

    @Override
    public Object visitConatinerDeclaration(dart_parse.ConatinerDeclarationContext ctx) {
        return super.visitConatinerDeclaration(ctx);
    }

    @Override
    public Object visitRowColumnDeclaration(dart_parse.RowColumnDeclarationContext ctx) {
        return super.visitRowColumnDeclaration(ctx);
    }

    @Override
    public Object visitImageDeclaration(dart_parse.ImageDeclarationContext ctx) {
        return super.visitImageDeclaration(ctx);
    }

    @Override
    public Object visitConatinerPropertiesDeclaration(dart_parse.ConatinerPropertiesDeclarationContext ctx) {
        return super.visitConatinerPropertiesDeclaration(ctx);
    }

    @Override
    public Object visitPaddingPropertyDeclaration(dart_parse.PaddingPropertyDeclarationContext ctx) {
        return super.visitPaddingPropertyDeclaration(ctx);
    }

    @Override
    public Object visitEdgeInsistAll(dart_parse.EdgeInsistAllContext ctx) {
        return super.visitEdgeInsistAll(ctx);
    }

}
