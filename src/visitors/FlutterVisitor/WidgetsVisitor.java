package visitors.FlutterVisitor;

import ast.NodeType;
import ast.nodes.*;
import gen.dart_parse;
import visitors.DartVisitors.StatementsVisitors;
import visitors.VariablesVisitor;
import visitors.dart_parseBaseVisitorChild;

import java.util.ArrayList;
import java.util.List;

public class WidgetsVisitor extends dart_parseBaseVisitorChild {


    @Override
    public WidgetsDeclaration visitWidgetsDeclaration(dart_parse.WidgetsDeclarationContext ctx) {

        if (ctx.expandedDeclaration() != null) {
            return new WidgetsDeclaration(ctx,visitExpandedDeclaration(ctx.expandedDeclaration()));
        }
        if (ctx.textDeclaration() != null) {
            return new WidgetsDeclaration(ctx,visitTextDeclaration(ctx.textDeclaration()));
        }
        if (ctx.paddingDeclaration() != null) {
            return new WidgetsDeclaration(ctx,visitPaddingDeclaration(ctx.paddingDeclaration()));
        }
        if (ctx.scaffoldDeclaration() != null) {
            return new WidgetsDeclaration(ctx,visitScaffoldDeclaration(ctx.scaffoldDeclaration()));
        }
        if (ctx.imageDeclaration() != null) {
            return new WidgetsDeclaration(ctx,visitImageDeclaration(ctx.imageDeclaration()));
        }
        if (ctx.conatinerDeclaration() != null) {

            return new WidgetsDeclaration(ctx,visitConatinerDeclaration(ctx.conatinerDeclaration()));
        }
        if (ctx.materialButtonDeclaration() != null) {

            return new WidgetsDeclaration(ctx,visitMaterialButtonDeclaration(ctx.materialButtonDeclaration()));
        }
        if (ctx.materialAppDeclaration() != null) {

            return new WidgetsDeclaration(ctx,visitMaterialAppDeclaration(ctx.materialAppDeclaration()));
        }
        if (ctx.rowColumnDeclaration() != null) {

            return new WidgetsDeclaration(ctx,visitRowColumnDeclaration(ctx.rowColumnDeclaration()));
        }

        return null;
    }

    @Override
    public ChildPropertyDeclaration visitChildPropertyDeclaration(dart_parse.ChildPropertyDeclarationContext ctx) {

        return new ChildPropertyDeclaration(ctx,visitWidgetsDeclaration(ctx.widgetsDeclaration()));
    }

    @Override
    public TextDeclaration visitTextDeclaration(dart_parse.TextDeclarationContext ctx) {

        return new TextDeclaration(ctx,ctx.STRING_LINE().getText());
    }

    @Override
    public ImageDeclaration visitImageDeclaration(dart_parse.ImageDeclarationContext ctx) {

        return new ImageDeclaration(ctx,ctx.STRING_LINE().getText());
    }

    @Override
    public MaterialAppDeclaration visitMaterialAppDeclaration(dart_parse.MaterialAppDeclarationContext ctx) {
        
        return new MaterialAppDeclaration(ctx,visitHomePropertyDeclaration(ctx.homePropertyDeclaration()));
    }

    @Override
    public HomePropertyDeclaration visitHomePropertyDeclaration(dart_parse.HomePropertyDeclarationContext ctx) {
        
        return new HomePropertyDeclaration(ctx,ctx.NAME().getText());
    }

    @Override
    public ExpandedDeclaration visitExpandedDeclaration(dart_parse.ExpandedDeclarationContext ctx) {
        
        return new ExpandedDeclaration(ctx,visitChildPropertyDeclaration(ctx.childPropertyDeclaration()));
    }

    @Override
    public MaterialButtonDeclaration visitMaterialButtonDeclaration(dart_parse.MaterialButtonDeclarationContext ctx) {

        return new MaterialButtonDeclaration(
                ctx,
                visitOnPressedPropertyDeclaration(ctx.onPressedPropertyDeclaration()),
                visitChildPropertyDeclaration(ctx.childPropertyDeclaration())
        );

    }

    @Override
    public OnPressedPropertyDeclaration visitOnPressedPropertyDeclaration(dart_parse.OnPressedPropertyDeclarationContext ctx) {

        StatementsVisitors statementsVisitors = new StatementsVisitors();

        OnPressedPropertyDeclaration onPressedPropertyDeclaration = new OnPressedPropertyDeclaration(ctx);

        for (int i = 0; i < ctx.statement().size(); i++) {
            onPressedPropertyDeclaration.getStatement().add(statementsVisitors.visitStatement(ctx.statement(i)));
        }

        return onPressedPropertyDeclaration;
    }

    @Override
    public SetStatePressedDeclaration visitSetStatePressedDeclaration(dart_parse.SetStatePressedDeclarationContext ctx) {
        StatementsVisitors statementsVisitors = new StatementsVisitors();

        SetStatePressedDeclaration setStatePressedDeclaration = new SetStatePressedDeclaration();

        for (int i = 0; i < ctx.statement().size(); i++) {
            setStatePressedDeclaration.getStatement().add(statementsVisitors.visitStatement(ctx.statement(i)));
        }

        return setStatePressedDeclaration;
    }


    @Override
    public PaddingDeclaration visitPaddingDeclaration(dart_parse.PaddingDeclarationContext ctx) {

        return new PaddingDeclaration(
                ctx,
                visitPaddingPropertyDeclaration(ctx.paddingPropertyDeclaration()),
                visitChildPropertyDeclaration(ctx.childPropertyDeclaration())
        );
    }

    @Override
    public PaddingPropertyDeclaration visitPaddingPropertyDeclaration(dart_parse.PaddingPropertyDeclarationContext ctx) {

        return new PaddingPropertyDeclaration(ctx,visitEdgeInsistAll(ctx.edgeInsistAll()));
    }

    @Override
    public EdgeInsistAll visitEdgeInsistAll(dart_parse.EdgeInsistAllContext ctx) {
        
       
        VariablesVisitor variablesVisitor = new VariablesVisitor();
        String type = NodeType.OBJECT.toString();
        
        return new EdgeInsistAll(variablesVisitor.visitNumber(ctx.number()));
    }

    @Override
    public ScaffoldDeclaration visitScaffoldDeclaration(dart_parse.ScaffoldDeclarationContext ctx) {
        
       
        String type = NodeType.OBJECT.toString();
        
        return new ScaffoldDeclaration(visitBodyPropertyDeclaration(ctx.bodyPropertyDeclaration()));
    }

    @Override
    public BodyPropertyDeclaration visitBodyPropertyDeclaration(dart_parse.BodyPropertyDeclarationContext ctx) {
        
       
        String type = NodeType.PROPERTY.toString();
        
        return new BodyPropertyDeclaration(visitWidgetsDeclaration(ctx.widgetsDeclaration()));
    }

    @Override
    public ContainerDeclaration visitConatinerDeclaration(dart_parse.ConatinerDeclarationContext ctx) {
        
       
        String type = NodeType.CONTAINER.toString();
        
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
        
       
        String type = NodeType.PROPERTY.toString();
        
        if (ctx.widthPropertyDeclaration() != null) {
            return new ContainerPropertiesDeclaration(visitWidthPropertyDeclaration(ctx.widthPropertyDeclaration()));
        }

        if (ctx.heightPropertyDeclaration() != null) {
            return new ContainerPropertiesDeclaration(visitHeightPropertyDeclaration(ctx.heightPropertyDeclaration()));
        }
        if (ctx.childPropertyDeclaration() != null) {
            return new ContainerPropertiesDeclaration(visitChildPropertyDeclaration(ctx.childPropertyDeclaration()));
        }
        return null;
    }

    @Override
    public HeightPropertyDeclaration visitHeightPropertyDeclaration(dart_parse.HeightPropertyDeclarationContext ctx) {
        VariablesVisitor variablesVisitor = new VariablesVisitor();
        
       
        String type = NodeType.PROPERTY.toString();
        
        return new HeightPropertyDeclaration(variablesVisitor.visitNumber(ctx.number()));
    }

    @Override
    public WidthPropertyDeclaration visitWidthPropertyDeclaration(dart_parse.WidthPropertyDeclarationContext ctx) {
        
       
        VariablesVisitor variablesVisitor = new VariablesVisitor();
        String type = NodeType.PROPERTY.toString();
        
        return new WidthPropertyDeclaration(variablesVisitor.visitNumber(ctx.number()));
    }

    @Override
    public RowColumnDeclaration visitRowColumnDeclaration(dart_parse.RowColumnDeclarationContext ctx) {
        
       
        String name = "Column";
        String type = NodeType.CONTAINER.toString();
        
        if (ctx.ROW() != null) {
            name = "Row";
        }
        return new RowColumnDeclaration(name, visitChildrenPropertyDeclaration(ctx.childrenPropertyDeclaration()));
    }

    @Override
    public ChildrenPropertyDeclaration visitChildrenPropertyDeclaration(dart_parse.ChildrenPropertyDeclarationContext ctx) {
        
       
        String type = NodeType.PROPERTY.toString();
        
        ChildrenPropertyDeclaration childrenPropertyDeclaration = new ChildrenPropertyDeclaration(line, parent, type, childCount);
        for (int i = 0; i < ctx.widgetsDeclaration().size(); i++) {
            childrenPropertyDeclaration.getWidgetDeclarationList().add(visitWidgetsDeclaration(ctx.widgetsDeclaration(i)));
        }
        return childrenPropertyDeclaration;
    }

}
