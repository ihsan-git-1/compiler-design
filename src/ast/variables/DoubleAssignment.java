package ast.variables;

import ast.NodeType;
import ast.nodes.StatementAbstractChild;
import gen.dart_parse;

public class DoubleAssignment extends VariableDeclaration implements StatementAbstractChild, assignment {
    String name;
    AddDoubleExpression expr;

    public DoubleAssignment(dart_parse.DoubleAssignmentContext ctx, AddDoubleExpression expr, String name) {
        super(ctx);
        this.expr = expr;
        this.name = name;
    }

    @Override
    public String toString() {
        return getLineString()+"Double Assignment: " +name + " parent: "+ getParent()
                +" Child Count =  "+getChildCount()+" Type = "+ NodeType.DOUBLEASSIGNMENT+"\n"
                + "value: " + expr;
    }
}
