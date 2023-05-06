package ast.variables;

import ast.NodeType;
import ast.nodes.StatementAbstractChild;
import gen.dart_parse;

public class IntegerAssignment extends VariableDeclaration implements StatementAbstractChild, assignment {
    String name;
    AddExpression expr;

    public IntegerAssignment(dart_parse.IntegerAssignmentContext ctx, AddExpression expr, String name) {
        super(ctx);
        this.expr = expr;
        this.name = name;
    }

    @Override
    public String toString() {
        return getLineString()+"Integer Assignment: " +name + " parent: "+ getParent()
                +" Child Count =  "+getChildCount()+" Type = "+ NodeType.INTEGERASSIGNMENT+"\n"
                + expr;
    }
}
