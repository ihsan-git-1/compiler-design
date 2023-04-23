package ast.variables;

import ast.nodes.TermAbstractChild;

public class NumericExpr extends TermAbstractChild<Boolean>
{
    boolean value;

    public boolean isValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }

    public NumericExpr(int line, String parent, String type, int childCount, boolean value) {
        super(line, parent, type, childCount,value);
    }

    @Override
    public String toString() {
        return "NumericExpr{" +
                "value=" + value +
                ", line=" + line +
                ", col=" + col +
                ", type='" + type + '\'' +
                ", childCount=" + childCount +
                ", parent='" + parent + '\'' +
                '}';
    }
}
