package ast.variables;

import java.util.List;

public class StringDeclarationLine extends VariableDeclaration {
    List<StringDeclaration> declarations;

    public StringDeclarationLine(int line, String parent,String type,int childCount, List<StringDeclaration> declarations) {
        super(line, parent, type, childCount);
        this.declarations = declarations;
    }

    public void setDeclarations(List<StringDeclaration> declarations){
        this.declarations = declarations;
    }

    public String toString() {
        return "String Declaration Line: "
                +"Number of declarations on this line: " + this.declarations.size()
                +" line: "+ getLine()
                + " parent: "+ getParent()
                +" Child Count =  "+getChildCount()+" Type = "+getType()+"\n";
    }
}
