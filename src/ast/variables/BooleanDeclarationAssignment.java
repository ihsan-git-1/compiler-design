package ast.variables;

import ast.NodeType;
import gen.dart_parse;

public class BooleanDeclarationAssignment extends VariableAssignment{
    String name;
    public BooleanValueClass booleanValueClass;

    public BooleanDeclarationAssignment(dart_parse.BooleanDeclarationAssignmentContext ctx, String name, BooleanValueClass booleanValueClass) {
        super(ctx);
        this.name=name;
        this.booleanValueClass=booleanValueClass;
    }

    @Override
    public String toString() {
        return getLineString() +"Boolean Declaration Assignment: " +name+" parent: "+ getParent()
                +" Child Count =  "+getChildCount()+" Type = "+ NodeType.BOOLEANDECLARATIONASSIGNMENT
                + " value: " + booleanValueClass +"\n"
                ;
    }
}
