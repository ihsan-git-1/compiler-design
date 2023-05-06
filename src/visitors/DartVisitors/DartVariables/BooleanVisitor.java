package visitors.DartVisitors.DartVariables;

import ast.NodeType;
import ast.SymbolTableObject;
import ast.variables.*;
import gen.dart_parse;
import org.antlr.v4.runtime.Token;
import visitors.dart_parseBaseVisitorChild;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BooleanVisitor extends dart_parseBaseVisitorChild {

    public BooleanDeclarationLine visitBooleanDeclarationLine(dart_parse.BooleanDeclarationLineContext ctx) {


        String type = NodeType.BOOLEANDECLARATIONLINE.toString();

        List<BooleanDeclaration> declarations = new ArrayList<>();
        List<BooleanDeclarationAssignment> assignments = new ArrayList<>();
        Boolean isDecl = !(ctx.BOOL() == null);


        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (Objects.equals(ctx.getChild(i).getText(), ","))
                continue;
            if (ctx.getChild(i) instanceof dart_parse.BooleanDeclarationContext) {
                declarations.add(visitBooleanDeclaration((dart_parse.BooleanDeclarationContext) ctx.getChild(i)));
            } else if (ctx.getChild(i) instanceof dart_parse.BooleanDeclarationAssignmentContext) {
                assignments.add(visitBooleanDeclarationAssignment((dart_parse.BooleanDeclarationAssignmentContext) ctx.getChild(i)));
            }
        }
        return new BooleanDeclarationLine(ctx, declarations, assignments);
    }


    public BooleanDeclarationAssignment visitBooleanDeclarationAssignment(dart_parse.BooleanDeclarationAssignmentContext ctx) {

        int column = ctx.start.getCharPositionInLine() + 1;
        String id = ctx.getChild(0).getText();

        String type = NodeType.BOOLEANDECLARATIONASSIGNMENT.toString();

        int errorLine = ctx.start.getLine();

        if (CheckExistanceInScope(id, index)) {
            semanticErrors.add("The name " + id + " already defined (" + errorLine + "," + column + ")");
        } else if ((CheckExistanceInParentScope(id, index) || CheckExistanceInScope(id, index)) && !CheckIfTypeMatchesParentType(id, index, NodeType.BOOL.toString())) {
            semanticErrors.add("A value of type " + NodeType.BOOL.toString() + " can't be assigned to a variable of type " + getParentType(id, index, NodeType.BOOL.toString()));
        } else {
            BooleanValueClass expr = visitBooleans(ctx.booleans());
            scopes.get(index - 1).getSymbolMap().put(id, new SymbolTableObject(NodeType.BOOL.toString(), String.valueOf(expr.value)));
            varialbeNames.add("Identifier " + id + ", Type " + NodeType.BOOL + ", Value : " + expr.getBool() + " , Scope " + scopes.peek().getScopeName());
            return new BooleanDeclarationAssignment(ctx,id, expr);
        }
        return new BooleanDeclarationAssignment(ctx, id, null);
    }

    public BooleanDeclaration visitBooleanDeclaration(dart_parse.BooleanDeclarationContext ctx) {

        int column = ctx.start.getCharPositionInLine() + 1;
        String id = ctx.getChild(0).getText();

        String type = NodeType.BOOLEANDECLARATION.toString();


        int errorLine = ctx.start.getLine();

        if (CheckExistanceInScope(id, index)) {
            semanticErrors.add("The name " + id + " already defined (" + errorLine + "," + column + ")");
        } else {
            scopes.get(index - 1).getSymbolMap().put(id, new SymbolTableObject(NodeType.BOOL.toString(), String.valueOf(false)));
        }
        varialbeNames.add("Identifier " + id + ", Type " + NodeType.BOOL + ", Value : false , Scope " + scopes.peek().getScopeName());
        return new BooleanDeclaration(ctx,id);
    }

    public BooleanAssignment visitBooleanAssignment(dart_parse.BooleanAssignmentContext ctx) {

        int column = ctx.start.getCharPositionInLine() + 1;
        String id = ctx.getChild(0).getText();

        String type = NodeType.BOOLEANASSIGNMENT.toString();


        int errorLine = ctx.start.getLine();

        if (!CheckExistanceInParentScope(id, index) && !CheckExistanceInScope(id, index)) {
            semanticErrors.add("Undefined name " + id + " at (" + errorLine + "," + column + ")");
        } else if ((CheckExistanceInParentScope(id, index) || CheckExistanceInScope(id, index)) && !CheckIfTypeMatchesParentType(id, index, NodeType.BOOL.toString())) {
            semanticErrors.add("A value of type " + NodeType.BOOL.toString() + " can't be assigned to a variable of type " + getParentType(id, index, NodeType.BOOL.toString()));
        } else {
            BooleanValueClass expr = visitBooleans(ctx.booleans());
            scopes.get(index - 1).getSymbolMap().put(id, new SymbolTableObject(NodeType.BOOL.toString(), String.valueOf(expr.value)));
            varialbeNames.add("Identifier " + id + ", Type " + NodeType.BOOL + ", Value :" + expr + " Scope " + scopes.peek().getScopeName());
            return new BooleanAssignment(ctx,expr, id);
        }
        return new BooleanAssignment(ctx,null, id);
    }

    @Override
    public BooleanValueClass visitBooleans(dart_parse.BooleansContext ctx) {

        int errorLine = ctx.start.getLine();

        String type = NodeType.BOOLEAN.toString();

        if (ctx.TRUE() != null) {
            if (ctx.TRUE().getText().equals("true")) {
                return new BooleanValueClass(ctx,Boolean.parseBoolean(ctx.TRUE().getText()));
            } else {
                Token boolToken = ctx.TRUE().getSymbol();
                int column = boolToken.getCharPositionInLine() + 1;
                semanticErrors.add("Error: Undefined name " + ctx.TRUE().getText() + "(" + errorLine + "," + column + ")");
            }
        } else if (ctx.FALSE() != null) {
            if (ctx.FALSE().getText().equals("false")) {
                return new BooleanValueClass(ctx,Boolean.parseBoolean(ctx.FALSE().getText()));
            } else {
                Token boolToken = ctx.FALSE().getSymbol();

                int column = boolToken.getCharPositionInLine() + 1;
                semanticErrors.add("Error: Undefined name " + ctx.TRUE().getText() + "(" + errorLine + "," + column + ")");
            }
        } else {
            //TODO add error Arraylist
            return null;
        }
        return null;
    }

}
