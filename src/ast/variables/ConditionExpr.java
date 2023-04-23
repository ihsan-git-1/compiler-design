package ast.variables;

import ast.nodes.Node;
import ast.nodes.TermAbstractChild;

public class ConditionExpr extends TermAbstractChild<Boolean> {
    boolean value;

    public ConditionExpr(int line, String parent, String type, int childCount, boolean value) {
        super(line, parent, type, childCount,value);
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
        return "ConditionExpr{" +
                "value=" + value +
                ", line=" + line +
                ", col=" + col +
                ", type='" + type + '\'' +
                ", childCount=" + childCount +
                ", parent='" + parent + '\'' +
                '}';
    }
}
