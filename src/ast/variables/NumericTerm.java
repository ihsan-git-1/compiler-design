package ast.variables;

import ast.nodes.Node;

public class NumericTerm extends Node {
    AbstractNumberClass value;

    public NumericTerm(int line, String parent, String type, int childCount, AbstractNumberClass value) {
        super(line, parent, type, childCount);
        this.value = value;
    }
}
