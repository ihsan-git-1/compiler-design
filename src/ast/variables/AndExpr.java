package ast.variables;

import ast.nodes.Node;

public class AndExpr extends Node {
boolean value;

    public AndExpr(int line, String parent, String type, int childCount, boolean value) {
        super(line, parent, type, childCount);
        this.value = value;
    }

    public boolean isValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "AndExpr{" +
                "value=" + value +
                ", line=" + line +
                ", col=" + col +
                ", type='" + type + '\'' +
                ", childCount=" + childCount +
                ", parent='" + parent + '\'' +
                '}';
    }
}
