package visitors.DartVisitors.DartVariables;

import ast.NodeType;
import ast.SymbolTableObject;
import ast.variables.*;
import gen.dart_parse;
import visitors.DartVisitors.VariablesVisitor;
import visitors.dart_parseBaseVisitorChild;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class IntegerVisitor extends dart_parseBaseVisitorChild {

    @Override
    public NumberClass visitNumber(dart_parse.NumberContext ctx) {

        String numText = ctx.getChild(0).getText();
        int num = Integer.parseInt(numText);

        return new NumberClass(ctx,num);
    }

    @Override
    public IntegerDeclarationLine visitIntegerDeclarationLine(dart_parse.IntegerDeclarationLineContext ctx) {

        int column = ctx.start.getCharPositionInLine() + 1;

        List<IntegerDeclaration> declarations = new ArrayList<>();
        List<IntegerDeclarationAssignment> assignments = new ArrayList<>();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (Objects.equals(ctx.getChild(i).getText(), ","))
                continue;
            if (ctx.getChild(i) instanceof dart_parse.IntegerDeclarationContext) {
                declarations.add(visitIntegerDeclaration((dart_parse.IntegerDeclarationContext) ctx.getChild(i)));
            } else if (ctx.getChild(i) instanceof dart_parse.IntegerDeclarationAssignmentContext) {
                assignments.add(visitIntegerDeclarationAssignment((dart_parse.IntegerDeclarationAssignmentContext) ctx.getChild(i)));
            }
        }
        return new IntegerDeclarationLine(ctx, declarations, assignments);
    }

    public IntegerDeclaration visitIntegerDeclaration(dart_parse.IntegerDeclarationContext ctx) {

        int column = ctx.start.getCharPositionInLine() + 1;
        String id = ctx.getChild(0).getText();
        String type = NodeType.INTEGERDECLARATION.toString();

        if (CheckExistanceInScope(id, index)) {
            int errorLine = ctx.start.getLine();
            semanticErrors.add("The name " + id + " already defined (" + errorLine + "," + column + ")");
        }

        else {
            scopes.get(index - 1).getSymbolMap().put(id, new SymbolTableObject(NodeType.INT.toString(), "0"));
        }

        varialbeNames.add("Identifier " + id + ", Type " + NodeType.INT + ", Value : 0 ,  Scope " + scopes.peek().getScopeName());
        return new IntegerDeclaration(ctx,id);
    }

    public IntegerAssignment visitIntegerAssignment(dart_parse.IntegerAssignmentContext ctx) {

        System.out.println("here");
        int column = ctx.start.getCharPositionInLine() + 1;
        String id = ctx.getChild(0).getText();


        if (!CheckExistanceInParentScope(id, index) && !CheckExistanceInScope(id, index)) {
            int errorLine = ctx.start.getLine();
            semanticErrors.add("Undefined name " + id + " at (" + errorLine + "," + column + ")");
        }

        else if ((CheckExistanceInParentScope(id, index) || CheckExistanceInScope(id, index)) && !CheckIfTypeMatchesParentType(id, index, NodeType.INT.toString())) {
            semanticErrors.add("A value of type " + NodeType.INT + " can't be assigned to a variable of type " + getParentType(id, index, NodeType.INT.toString()));
        }

        else {
            VariablesVisitor variablesVisitor = new VariablesVisitor();
            AddExpression expr = variablesVisitor.visitAddExpression(ctx.addExpression());
            scopes.get(index - 1).getSymbolMap().put(id, new SymbolTableObject(NodeType.INT.toString(), String.valueOf(expr.value.getNum())));
            varialbeNames.add("Identifier " + id + ", Type " + NodeType.INT + ", Value :" + expr + " Scope " + scopes.peek().getScopeName());
            return new IntegerAssignment(ctx,expr, id);
        }

        return new IntegerAssignment(ctx,null, id);
    }

    public IntegerDeclarationAssignment visitIntegerDeclarationAssignment(dart_parse.IntegerDeclarationAssignmentContext ctx) {

        int column = ctx.start.getCharPositionInLine() + 1;
        String id = ctx.getChild(0).getText();

        String type = NodeType.INTEGERDECLARATIONASSIGNMENT.toString();


        if (CheckExistanceInScope(id, index)) {
            int errorLine = ctx.start.getLine();

            semanticErrors.add("The name " + id + " already defined (" + errorLine + "," + column + ")");
        } else if ((CheckExistanceInParentScope(id, index) || CheckExistanceInScope(id, index)) && !CheckIfTypeMatchesParentType(id, index, NodeType.INT.toString())) {
            semanticErrors.add("A value of type " + NodeType.INT.toString() + " can't be assigned to a variable of type " + getParentType(id, index, NodeType.INT.toString()));
        } else {
            VariablesVisitor variablesVisitor = new VariablesVisitor();

            AddExpression expr = variablesVisitor.visitAddExpression(ctx.addExpression());

            scopes.get(index - 1).getSymbolMap().put(id, new SymbolTableObject(NodeType.INT.toString(), String.valueOf(expr.value.getNum())));

            varialbeNames.add("Identifier " + id + ", Type " + NodeType.INT + ", Value : " + expr.value.getNum() + " , Scope " + scopes.peek().getScopeName());
            return new IntegerDeclarationAssignment(ctx,expr, id);
        }
        return new IntegerDeclarationAssignment(ctx,null, id);
    }

}
