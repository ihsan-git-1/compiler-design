package ast.variables;

import ast.nodes.Node;

public class VariableAssignment extends Node {

    public VariableAssignment(int line, String parent, String type, int childCount) {
        super(line, parent, type, childCount);
    }
}
