package ast.variables;

import ast.NodeType;
import gen.dart_parse;

public class StringDeclarationAssignment extends VariableAssignment{
    String name;
    String stringLine;

    public StringDeclarationAssignment(dart_parse.StringDeclarationAssignmentContext ctx, String name , String stringLine) {
        super(ctx);
        this.name=name;
        this.stringLine=stringLine;
    }

    @Override
    public String toString() {
        return stringLine+"String Declaration Assignment: " +name+ "=" +stringLine+ " parent: "+ getParent()
                +" Child Count =  "+getChildCount()+" Type = "+ NodeType.STRINGDECLARATIONASSIGNMENT+"\n"
                ;
    }
}
