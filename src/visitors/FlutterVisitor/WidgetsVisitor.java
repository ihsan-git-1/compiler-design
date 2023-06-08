package visitors.FlutterVisitor;

import ast.NodeType;
import ast.nodes.*;
import ast.variables.Variable;
import gen.dart_parse;
import org.antlr.v4.runtime.tree.ParseTree;
import visitors.DartVisitors.DartVariables.IntegerVisitor;
import visitors.DartVisitors.StatementsVisitors;
import visitors.DartVisitors.VariablesVisitor;
import visitors.dart_parseBaseVisitorChild;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.JsonWriter;
import java.io.StringWriter;
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


        String str = "",dataText="";
        if(ctx.NAME() != null) {
            str = ctx.NAME().getText();
        }else if(ctx.STRING_LINE() != null){
            str = ctx.STRING_LINE().getText();
        }
        if(CheckExistanceInScope(str,scopes.size()) || CheckExistanceInParentScope(str,scopes.size())){
            dataText=str;
            str  = (String)getVariableValueFromScopes(str,scopes.size());
        }
        return new TextDeclaration(ctx,str,dataText);
    }

    @Override
    public ImageDeclaration visitImageDeclaration(dart_parse.ImageDeclarationContext ctx) {


        int height=0,width=0;
        String navigation="",pressedURL="",pressedVariable="",dataVariable="",pressedText="",pressedTextVariable="";

        try{
            dart_parse.HeightPropertyDeclarationContext heightPropertyDecl = (dart_parse.HeightPropertyDeclarationContext) getChildFromParent(ctx,"ConatinerDeclaration","HeightPropertyDeclaration",0);
            height = Integer.parseInt(heightPropertyDecl.number().getChild(0).getText());
        }catch (Exception e){}

        try{
            dart_parse.WidthPropertyDeclarationContext widthPropertyDecl = (dart_parse.WidthPropertyDeclarationContext) getChildFromParent(ctx,"ConatinerDeclaration","WidthPropertyDeclaration",0);
            width = Integer.parseInt(widthPropertyDecl.number().getChild(0).getText());
        }catch(Exception e){}

        try{
            dart_parse.NavigationContext nav = (dart_parse.NavigationContext) getChildFromParent(ctx,"MaterialButtonDeclaration","Navigation",0);
            navigation = nav.STRING_LINE().getText();
        }catch(Exception e){}

        try{
            dart_parse.SetStatePressedDeclarationContext setPressed = (dart_parse.SetStatePressedDeclarationContext) getChildFromParent(ctx,"MaterialButtonDeclaration","SetStatePressedDeclaration",0);
            dart_parse.StringAssignmentContext setPressedString = (dart_parse.StringAssignmentContext) getChildFromParent(setPressed,"OnPressedPropertyDeclaration","StringAssignment",0);
            pressedURL = setPressedString.STRING_LINE().getText();
            pressedVariable = setPressedString.NAME().getText();
        }catch(Exception e){}

        String jsonString="";
        JsonObjectBuilder jsonObjectBuilder = Json.createObjectBuilder();

        try{
            dart_parse.StringAssignmentContext setTextPressed = (dart_parse.StringAssignmentContext) getChildFromParent(ctx,"MaterialButtonDeclaration","StringAssignment",0);
            dart_parse.StringAssignmentContext setTextPressedString = (dart_parse.StringAssignmentContext) getChildFromParent(setTextPressed,"SetStatePressedDeclaration","StringAssignment",6);
            pressedText = setTextPressedString.STRING_LINE().getText();
            pressedTextVariable = setTextPressedString.NAME().getText();
            jsonObjectBuilder.add(pressedTextVariable, pressedText);
        }catch(Exception e){}


        try{
            dart_parse.StringAssignmentContext setTextPressed = (dart_parse.StringAssignmentContext) getChildFromParent(ctx,"MaterialButtonDeclaration","StringAssignment",0);
            dart_parse.StringAssignmentContext setTextPressedString = (dart_parse.StringAssignmentContext) getChildFromParent(setTextPressed,"SetStatePressedDeclaration","StringAssignment",7);
            pressedText = setTextPressedString.STRING_LINE().getText();
            pressedTextVariable = setTextPressedString.NAME().getText();
            jsonObjectBuilder.add(pressedTextVariable, pressedText);
        }catch(Exception e){}


            JsonObject jsonObject = jsonObjectBuilder.build();
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = Json.createWriter(stringWriter);
            jsonWriter.writeObject(jsonObject);
            jsonWriter.close();
            jsonString = stringWriter.toString().replace("\\\"","");




        String str="";
        if(ctx.NAME() != null){
            str = ctx.NAME().getText();
        }else if(ctx.STRING_LINE() != null){
            str = ctx.STRING_LINE().getText();
        }

        if(CheckExistanceInScope(str,scopes.size()) || CheckExistanceInParentScope(str,scopes.size())){
            dataVariable = str;
            str  = (String)getVariableValueFromScopes(str,scopes.size());

        }

        return new ImageDeclaration(ctx,
                str,
                height,
                width,
                navigation,
                pressedURL,
                pressedVariable,
                dataVariable,
                jsonString
                );
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

        IntegerVisitor variablesVisitor = new IntegerVisitor();

        return new EdgeInsistAll(ctx,variablesVisitor.visitNumber(ctx.number()));
    }

    @Override
    public ScaffoldDeclaration visitScaffoldDeclaration(dart_parse.ScaffoldDeclarationContext ctx) {
        return new ScaffoldDeclaration(ctx,visitBodyPropertyDeclaration(ctx.bodyPropertyDeclaration()));
    }

    @Override
    public BodyPropertyDeclaration visitBodyPropertyDeclaration(dart_parse.BodyPropertyDeclarationContext ctx) {
        
        return new BodyPropertyDeclaration(ctx,visitWidgetsDeclaration(ctx.widgetsDeclaration()));
    }

    @Override
    public ContainerDeclaration visitConatinerDeclaration(dart_parse.ConatinerDeclarationContext ctx) {
        
       
        String type = NodeType.CONTAINER.toString();
        
        ContainerDeclaration containerDeclaration = new ContainerDeclaration(ctx);

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

        if (ctx.widthPropertyDeclaration() != null) {
            return new ContainerPropertiesDeclaration(ctx,visitWidthPropertyDeclaration(ctx.widthPropertyDeclaration()));
        }

        if (ctx.heightPropertyDeclaration() != null) {
            return new ContainerPropertiesDeclaration(ctx,visitHeightPropertyDeclaration(ctx.heightPropertyDeclaration()));
        }
        if (ctx.childPropertyDeclaration() != null) {
            return new ContainerPropertiesDeclaration(ctx,visitChildPropertyDeclaration(ctx.childPropertyDeclaration()));
        }
        return null;
    }

    @Override
    public HeightPropertyDeclaration visitHeightPropertyDeclaration(dart_parse.HeightPropertyDeclarationContext ctx) {
        IntegerVisitor variablesVisitor = new IntegerVisitor();

        return new HeightPropertyDeclaration(ctx , variablesVisitor.visitNumber(ctx.number()) );
    }

    @Override
    public WidthPropertyDeclaration visitWidthPropertyDeclaration(dart_parse.WidthPropertyDeclarationContext ctx) {


        IntegerVisitor variablesVisitor = new IntegerVisitor();

        return new WidthPropertyDeclaration(ctx,variablesVisitor.visitNumber(ctx.number()));
    }

    @Override
    public RowColumnDeclaration visitRowColumnDeclaration(dart_parse.RowColumnDeclarationContext ctx) {
        
       int numOfChildren=0;
        String name ="";

        if (ctx.ROW() != null) {
            name = "Row";
        }
        if(ctx.COLUMN() != null){
            name = "Column";
            dart_parse.ChildrenPropertyDeclarationContext parentRowDecl = (dart_parse.ChildrenPropertyDeclarationContext) getChildFromParent(ctx,"RowColumnDeclaration","ChildrenPropertyDeclaration",0);
            for(ParseTree child :parentRowDecl.children){
                if(child.getChildCount()>=1){
                    numOfChildren++;
                }
            }
        }

        return new RowColumnDeclaration(ctx,name,numOfChildren, visitChildrenPropertyDeclaration(ctx.childrenPropertyDeclaration()));
    }

    @Override
    public ChildrenPropertyDeclaration visitChildrenPropertyDeclaration(dart_parse.ChildrenPropertyDeclarationContext ctx) {

        ChildrenPropertyDeclaration childrenPropertyDeclaration = new ChildrenPropertyDeclaration(ctx);
        for (int i = 0; i < ctx.widgetsDeclaration().size(); i++) {
            childrenPropertyDeclaration.getWidgetDeclarationList().add(visitWidgetsDeclaration(ctx.widgetsDeclaration(i)));
        }
        return childrenPropertyDeclaration;
    }

}
