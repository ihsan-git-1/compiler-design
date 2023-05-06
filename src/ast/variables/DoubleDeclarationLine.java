package ast.variables;

import ast.NodeType;
import gen.dart_parse;

import java.util.List;

public class DoubleDeclarationLine extends VariableDeclaration {
    List<DoubleDeclaration> declarations;
    List<DoubleDeclarationAssignment> assignments;

    public DoubleDeclarationLine(dart_parse.DoubleDeclarationLineContext ctx, List<DoubleDeclaration> declarations, List<DoubleDeclarationAssignment> assignments) {
        super(ctx);
        this.declarations = declarations;
        this.assignments = assignments;
    }

    public void setDeclarations(List<DoubleDeclaration> declarations){
        this.declarations = declarations;
    }
    public void setAssignments(List<DoubleDeclarationAssignment> assignments){
        this.assignments = assignments;
    }

    public String toString() {
        return getLineString()+"Double Declaration Line: "
                +"Number of declarations on this line: " + this.declarations.size()
                +"Number of assignments on this line: " + this.assignments.size()
                + " parent: "+ getParent()
                +" Child Count =  "+getChildCount()+" Type = "+ NodeType.DOUBLEDECLARATIONLINE+"\n";
    }
}
