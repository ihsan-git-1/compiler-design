package ast.variables;

import ast.nodes.Node;

public abstract class NumericTermAbstractChild<T> extends Node {
    protected T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public NumericTermAbstractChild(int line, String parent, String type, int childCount) {
        super(line, parent, type, childCount);
    }
}
