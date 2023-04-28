package ast.variables;

import java.util.List;

public class IntegerDeclarationLine extends VariableDeclaration {
    List<IntegerDeclaration> declarations;
    List<IntegerDeclarationAssignment> assignments;

    public IntegerDeclarationLine(int line, String parent,String type,int childCount, List<IntegerDeclaration> declarations, List<IntegerDeclarationAssignment> assignments) {
        super(line, parent, type, childCount);
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
        return "Integer Declaration Line: "
                +"Number of declarations on this line: " + this.declarations.size()
                +" Number of assignments on this line: " + this.assignments.size()
                +" line: "+ getLine()
                + " parent: "+ getParent()
                +" Child Count =  "+getChildCount()+" Type = "+getType()+"\n";
    }
}
