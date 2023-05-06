package ast.variables;

import ast.NodeType;
import ast.nodes.TermAbstractChild;
import gen.dart_parse;

public class NumericExpr extends TermAbstractChild<Boolean>
{
    boolean value;

    public boolean isValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }

    public NumericExpr(dart_parse.NumericExprContext ctx, boolean value) {
        super(ctx,value);
    }

    @Override
    public String toString() {
        return getLineString()+"NumericExpr{" +
                "value=" + value +
                ", col=" + col +
                ", type='" + NodeType.BOOLEAN + '\'' +
                ", childCount=" + childCount +
                ", parent='" + parent + '\'' +
                '}';
    }
}
