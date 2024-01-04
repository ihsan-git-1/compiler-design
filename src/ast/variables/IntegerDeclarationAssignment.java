package ast.variables;

import ast.NodeType;
import gen.dart_parse;

public class IntegerDeclarationAssignment extends VariableAssignment {
    String name;
    AddExpression expr;

    public IntegerDeclarationAssignment(dart_parse.IntegerDeclarationAssignmentContext ctx, AddExpression expr, String name) {
        super(ctx);
        this.expr = expr;
        this.name = name;
    }

    @Override
    public String toString() {
        return getLineString()+"Integer Declaration Assignment: " +name + " parent: "+ getParent()
                +" Child Count =  "+getChildCount()+" Type = "+ NodeType.INTEGERDECLARATIONASSIGNMENT+"\n"
                + expr;
    }
}
