package ast.variables;

import ast.nodes.DartVariablesDeclarationAbstractChild;

public class Variable extends DartVariablesDeclarationAbstractChild {
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
