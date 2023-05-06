package ast.variables;

import ast.NodeType;
import gen.dart_parse;

import java.util.List;

public class IntegerDeclarationLine extends VariableDeclaration {
    List<IntegerDeclaration> declarations;
    List<IntegerDeclarationAssignment> assignments;

    public IntegerDeclarationLine(dart_parse.IntegerDeclarationLineContext ctx, List<IntegerDeclaration> declarations, List<IntegerDeclarationAssignment> assignments) {
        super(ctx);
        this.declarations = declarations;
        this.assignments = assignments;
    }

    public void setDeclarations(List<IntegerDeclaration> declarations){
        this.declarations = declarations;
    }
    public void setAssignments(List<IntegerDeclarationAssignment> assignments){
        this.assignments = assignments;
    }

    public String toString() {
        return getLineString()+"Integer Declaration Line: "
                +"Number of declarations on this line: " + this.declarations.size()
                +" Number of assignments on this line: " + this.assignments.size()
                + " parent: "+ getParent()
                +" Child Count =  "+getChildCount()+" Type = "+ NodeType.INTEGERDECLARATIONLINE+"\n";
    }
}
