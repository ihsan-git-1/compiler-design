import ast.nodes.ClassDeclaration;
import gen.dart_parse;
import gen.dart_parseBaseVisitor;

public class NodesVisitor extends dart_parseBaseVisitor {


    @Override
    public Object visitAllClassesDeclaration(dart_parse.AllClassesDeclarationContext ctx) {
        return super.visitAllClassesDeclaration(ctx);
    }

    @Override
    public Object visitClassDeclaration(dart_parse.ClassDeclarationContext ctx) {
        ClassDeclaration classDec = new ClassDeclaration();
        for (int i = 0; i < ctx.dartVariabelsDeclaration().size(); i++) {
            //  classDec.addChildren(ctx.dartVariabelsDeclaration().get(i));


        }
        return super.visitClassDeclaration(ctx);
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
    public Object visitDartVariabelsDeclaration(dart_parse.DartVariabelsDeclarationContext ctx) {
        return super.visitDartVariabelsDeclaration(ctx);
    }

    @Override
    public Object visitWidgetsDeclaration(dart_parse.WidgetsDeclarationContext ctx) {
        return super.visitWidgetsDeclaration(ctx);
    }

    @Override
    public Object visitExpandedDeclaration(dart_parse.ExpandedDeclarationContext ctx) {
        return super.visitExpandedDeclaration(ctx);
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
