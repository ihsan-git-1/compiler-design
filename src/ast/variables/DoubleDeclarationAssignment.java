package ast.variables;

import ast.NodeType;
import gen.dart_parse;

public class DoubleDeclarationAssignment extends VariableAssignment {
    String name;
    AddDoubleExpression expr;

    public DoubleDeclarationAssignment(dart_parse.DoubleDeclarationAssignmentContext ctx,AddDoubleExpression expr, String name) {
        super(ctx);
        this.expr = expr;
        this.name = name;
    }

    @Override
    public String toString() {
            return getLineString()+"Double Declaration Assignment: "+"name:" +name + " value: "+expr.value.num  + " Parent: "+ getParent()
                    +" Child Count =  "+getChildCount()+" Type = "+ NodeType.DOUBLEDECLARATIONASSIGNMENT+"\n"
                    +expr;
    }
}
