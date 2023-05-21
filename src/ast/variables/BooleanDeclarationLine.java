package ast.variables;

import ast.NodeType;
import gen.dart_parse;

import java.util.List;

public class BooleanDeclarationLine extends VariableDeclaration {
    List<BooleanDeclaration> declarations;
    List<BooleanDeclarationAssignment> assignments;


    public BooleanDeclarationLine(dart_parse.BooleanDeclarationLineContext ctx, List<BooleanDeclaration> declarations, List<BooleanDeclarationAssignment> assignments) {
        super(ctx);
        this.declarations = declarations;
        this.assignments = assignments;
    }

    public void setDeclarations(List<BooleanDeclaration> declarations){
        this.declarations = declarations;
    }
    public void setAssignments(List<BooleanDeclarationAssignment> assignments){
        this.assignments = assignments;
    }

    public String toString() {
        return getLineString()+"Boolean Declaration Line: "
                +"Number of declarations on this line: " + (this.declarations.size() + 1)
                +"Number of assignments on this line: " + this.assignments.size()
                + " parent: "+ getParent()
                +" Child Count =  "+getChildCount()+" Type = "+ NodeType.BOOLEANDECLARATIONLINE+"\n"
                +this.declarations.toString();
    }
}
