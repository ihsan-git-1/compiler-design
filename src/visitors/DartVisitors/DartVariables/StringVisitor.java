package visitors.DartVisitors.DartVariables;

import ast.NodeType;
import ast.SymbolTableObject;
import ast.variables.StringAssignment;
import ast.variables.StringDeclaration;
import ast.variables.StringDeclarationAssignment;
import ast.variables.StringDeclarationLine;
import gen.dart_parse;
import visitors.dart_parseBaseVisitorChild;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StringVisitor extends dart_parseBaseVisitorChild {

    public StringDeclarationLine visitStringDeclarationLine(dart_parse.StringDeclarationLineContext ctx) {

        List<StringDeclaration> declarations = new ArrayList<>();
        List<StringDeclarationAssignment> assignments = new ArrayList<>();

        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (Objects.equals(ctx.getChild(i).getText(), ","))
                continue;
            if (ctx.getChild(i) instanceof dart_parse.StringDeclarationContext) {
                declarations.add(visitStringDeclaration((dart_parse.StringDeclarationContext) ctx.getChild(i)));
            } else if (ctx.getChild(i) instanceof dart_parse.StringDeclarationAssignmentContext) {
                assignments.add(visitStringDeclarationAssignment((dart_parse.StringDeclarationAssignmentContext) ctx.getChild(i)));
            }
        }
        return new StringDeclarationLine(ctx,declarations, assignments);
    }

    public StringDeclarationAssignment visitStringDeclarationAssignment(dart_parse.StringDeclarationAssignmentContext ctx) {

        int column = ctx.start.getCharPositionInLine() + 1;
        String id = ctx.getChild(0).getText();

        String type = NodeType.STRINGDECLARATIONASSIGNMENT.toString();

        int errorLine = ctx.start.getLine();

        if (CheckExistanceInScope(id, index)) {
            semanticErrors.add("The name " + id + " already defined (" + errorLine + "," + column + ")");
        } else if ((CheckExistanceInParentScope(id, index) || CheckExistanceInScope(id, index)) && !CheckIfTypeMatchesParentType(id, index, NodeType.STRING.toString())) {
            semanticErrors.add("A value of type " + NodeType.STRING.toString() + " can't be assigned to a variable of type " + getParentType(id, index, NodeType.STRING.toString()));
        } else {
            String expr = ctx.STRING_LINE().getText();
            scopes.get(index - 1).getSymbolMap().put(id, new SymbolTableObject(NodeType.STRING.toString(), expr));
            varialbeNames.add("Identifier " + id + ", Type " + NodeType.STRING + ", Value : " + expr + " , Scope " + scopes.peek().getScopeName());
            return new StringDeclarationAssignment(ctx,id, expr);
        }
        return new StringDeclarationAssignment(ctx,id, null);
    }


    public StringDeclaration visitStringDeclaration(dart_parse.StringDeclarationContext ctx) {
        String id = String.valueOf(ctx.NAME());

        String type = NodeType.TOPTREEDECLARATION.toString();

        int column = ctx.start.getCharPositionInLine() + 1;

        int errorLine = ctx.start.getLine();

        if (CheckExistanceInScope(id, index)) {
            semanticErrors.add("The name " + id + " already defined (" + errorLine + "," + column + ")");
        }
        else {
            scopes.get(index - 1).getSymbolMap().put(id, new SymbolTableObject(NodeType.STRING.toString(), ""));
        }
        varialbeNames.add("Identifier " + id + ", Type " + NodeType.STRING + ", Value : , Scope " + scopes.peek().getScopeName());
        return new StringDeclaration(ctx,id);
    }

    public StringAssignment visitStringAssignment(dart_parse.StringAssignmentContext ctx) {

        int column = ctx.start.getCharPositionInLine() + 1;
        String id = ctx.getChild(0).getText();

        String type = NodeType.STRINGASSIGNMENT.toString();


        int errorLine = ctx.start.getLine();

        if (!CheckExistanceInParentScope(id, index) && !CheckExistanceInScope(id, index)) {
            semanticErrors.add("Undefined name " + id + " at (" + errorLine + "," + column + ")");
        } else if ((CheckExistanceInParentScope(id, index) || CheckExistanceInScope(id, index)) && !CheckIfTypeMatchesParentType(id, index, NodeType.STRING.toString())) {
            semanticErrors.add("A value of type " + NodeType.STRING.toString() + " can't be assigned to a variable of type " + getParentType(id, index, NodeType.STRING.toString()));
        } else {
            String expr = ctx.STRING_LINE().getText();
            scopes.get(index - 1).getSymbolMap().put(id, new SymbolTableObject(NodeType.STRING.toString(), expr));
            varialbeNames.add("Identifier " + id + ", Type " + NodeType.STRING + ", Value :" + expr + " Scope " + scopes.peek().getScopeName());
            return new StringAssignment(ctx,expr, id);
        }
        return new StringAssignment(ctx,null, id);
    }

}
