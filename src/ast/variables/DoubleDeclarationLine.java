package ast.variables;

import java.util.List;

public class DoubleDeclarationLine extends VariableDeclaration {
    List<DoubleDeclaration> declarations;

    public DoubleDeclarationLine(int line, String parent,String type,int childCount, List<DoubleDeclaration> declarations) {
        super(line, parent, type, childCount);
        this.declarations = declarations;
    }

    public void setDeclarations(List<DoubleDeclaration> declarations){
        this.declarations = declarations;
    }

    public String toString() {
        return "Double Declaration Line: "
                +"Number of declarations on this line: " + this.declarations.size()
                +" line: "+ getLine()
                + " parent: "+ getParent()
                +" Child Count =  "+getChildCount()+" Type = "+getType()+"\n";
    }
}
