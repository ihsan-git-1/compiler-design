package ast.variables;

import java.util.List;

public class DoubleDeclarationLine extends VariableDeclaration {
    List<DoubleDeclaration> declarations;
    List<DoubleDeclarationAssignment> assignments;

    public DoubleDeclarationLine(int line, String parent,String type,int childCount, List<DoubleDeclaration> declarations, List<DoubleDeclarationAssignment> assignments) {
        super(line, parent, type, childCount);
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
        return "Double Declaration Line: "
                +"Number of declarations on this line: " + this.declarations.size()
                +"Number of assignments on this line: " + this.assignments.size()
                +" line: "+ getLine()
                + " parent: "+ getParent()
                +" Child Count =  "+getChildCount()+" Type = "+getType()+"\n";
    }
}
