package ast.variables;

import java.util.List;

public class IntegerDeclarationLine extends VariableDeclaration {
    List<IntegerDeclaration> declarations;

    public IntegerDeclarationLine(int line, String parent,String type,int childCount, List<IntegerDeclaration> declarations) {
        super(line, parent, type, childCount);
        this.declarations = declarations;
    }

    public void setDeclarations(List<IntegerDeclaration> declarations){
        this.declarations = declarations;
    }

    public String toString() {
        return "Integer Declaration Line: "
                +"Number of declarations on this line: " + this.declarations.size()
                +" line: "+ getLine()
                + " parent: "+ getParent()
                +" Child Count =  "+getChildCount()+" Type = "+getType()+"\n";
    }
}
