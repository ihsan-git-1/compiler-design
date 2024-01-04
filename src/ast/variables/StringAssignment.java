package ast.variables;

import ast.NodeType;
import ast.nodes.StatementAbstractChild;
import gen.dart_parse;

public class StringAssignment extends VariableDeclaration implements StatementAbstractChild, assignment {
    String name;
    String stringLine;

    public StringAssignment(dart_parse.StringAssignmentContext ctx,String stringLine, String name) {
        super(ctx);
        this.stringLine = stringLine;
        this.name = name;
    }

    @Override
    public String toString() {
        return getLineString()+"Double Assignment: " +name+ " parent: "+ getParent()
                +" Child Count =  "+getChildCount()+" Type = "+ NodeType.STRINGASSIGNMENT+"\n"
                + "value: " + stringLine;
    }
}
