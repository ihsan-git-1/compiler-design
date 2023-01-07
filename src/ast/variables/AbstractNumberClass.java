package ast.variables;

import ast.nodes.Node;

public abstract class AbstractNumberClass extends Node {

    public AbstractNumberClass(int line, String parent,String type,int childCount) {
        super(line, parent, type, childCount);
    }
}
