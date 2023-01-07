package ast.variables;

import ast.nodes.Node;

public abstract class VariableDeclaration extends Node {
    public VariableDeclaration(int line, String parent,String type,int childCount) {
        super(line, parent, type, childCount);
    }
}
