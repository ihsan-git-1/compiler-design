package ast.variables;

import ast.NodeType;
import gen.dart_parse;

import java.util.List;

public class StringDeclarationLine extends VariableDeclaration {
    List<StringDeclaration> declarations;
    List<StringDeclarationAssignment> assignments;

    public StringDeclarationLine(dart_parse.StringDeclarationLineContext ctx, List<StringDeclaration> declarations, List<StringDeclarationAssignment> assignments) {
        super(ctx);
        this.declarations = declarations;
        this.assignments = assignments;
    }

    public void setDeclarations(List<StringDeclaration> declarations){
        this.declarations = declarations;
    }
    public void setAssignments(List<StringDeclarationAssignment> assignments){
        this.assignments = assignments;
    }

    public String toString() {
        return getLineString()+"String Declaration Line: "
                +"Number of declarations on this line: " + (this.declarations.size() + 1)
                +"Number of assignments on this line: " + this.assignments.size()
                + " parent: "+ getParent()
                +" Child Count =  "+getChildCount()+" Type = "+ NodeType.STRINGDECLARATIONLINE+"\n";
    }
}
