package ast.variables;

import ast.nodes.DartDeclarationAbstractChild;

public class Variable extends DartDeclarationAbstractChild {
    VariableDeclaration declaration;

    public Variable(VariableDeclaration declaration, int line, String parent,String type,int childCount) {
        super(line, parent, type, childCount);
        this.declaration = declaration;
    }

    @Override
    public String toString() {
        return declaration.toString();
    }
}
