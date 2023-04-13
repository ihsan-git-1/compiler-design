package ast.variables;

import java.util.List;

public class BooleanDeclarationLine extends VariableDeclaration {
    List<BooleanDeclaration> declarations;

    public BooleanDeclarationLine(int line, String parent,String type,int childCount, List<BooleanDeclaration> declarations) {
        super(line, parent, type, childCount);
        this.declarations = declarations;
    }

    public void setDeclarations(List<BooleanDeclaration> declarations){
        this.declarations = declarations;
    }

    public String toString() {
        return "Boolean Declaration Line: "
                +"Number of declarations on this line: " + this.declarations.size()
                +" line: "+ getLine()
                + " parent: "+ getParent()
                +" Child Count =  "+getChildCount()+" Type = "+getType()+"\n"
                +this.declarations.toString();
    }
}
