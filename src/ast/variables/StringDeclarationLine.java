package ast.variables;

import java.util.List;

public class StringDeclarationLine extends VariableDeclaration {
    List<StringDeclaration> declarations;
    List<StringDeclarationAssignment> assignments;

    public StringDeclarationLine(int line, String parent,String type,int childCount, List<StringDeclaration> declarations, List<StringDeclarationAssignment> assignments) {
        super(line, parent, type, childCount);
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
        return "String Declaration Line: "
                +"Number of declarations on this line: " + this.declarations.size()
                +"Number of assignments on this line: " + this.assignments.size()
                +" line: "+ getLine()
                + " parent: "+ getParent()
                +" Child Count =  "+getChildCount()+" Type = "+getType()+"\n";
    }
}
