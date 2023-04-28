package ast.variables;

import java.util.List;

public class BooleanDeclarationLine extends VariableDeclaration {
    List<BooleanDeclaration> declarations;
    List<BooleanDeclarationAssignment> assignments;


    public BooleanDeclarationLine(int line, String parent,String type,int childCount, List<BooleanDeclaration> declarations, List<BooleanDeclarationAssignment> assignments) {
        super(line, parent, type, childCount);
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
        return "Boolean Declaration Line: "
                +"Number of declarations on this line: " + this.declarations.size()
                +"Number of assignments on this line: " + this.assignments.size()
                +" line: "+ getLine()
                + " parent: "+ getParent()
                +" Child Count =  "+getChildCount()+" Type = "+getType()+"\n"
                +this.declarations.toString();
    }
}
