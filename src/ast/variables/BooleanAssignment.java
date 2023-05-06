package ast.variables;

import ast.NodeType;
import ast.nodes.StatementAbstractChild;
import gen.dart_parse;

public class BooleanAssignment extends VariableDeclaration implements StatementAbstractChild, assignment {
    String name;
    BooleanValueClass expr;

    public BooleanAssignment(dart_parse.BooleanAssignmentContext ctx, BooleanValueClass expr, String name) {
        super(ctx);
        this.expr = expr;
        this.name = name;
    }

    @Override
    public String toString() {
        return getLineString()+"Double Assignment: " +name + " parent: "+ getParent()
                +" Child Count =  "+getChildCount()+" Type = "+ NodeType.BOOLEANASSIGNMENT +"\n"
                + "value: " + expr;
    }
}
