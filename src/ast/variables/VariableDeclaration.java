package ast.variables;

import ast.nodes.Node;

public abstract class VariableDeclaration extends Node {
    public VariableDeclaration(int line, String parent) {
        super(line, parent);
    }
}
