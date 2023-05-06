package ast.variables;

import ast.NodeType;
import ast.nodes.Node;
import ast.nodes.TermAbstractChild;
import gen.dart_parse;

public class ConditionExpr extends TermAbstractChild<Boolean> {
    boolean value;

    public ConditionExpr(dart_parse.ConditionExprContext ctx, boolean value) {
        super(ctx,value);
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
        return getLineString()+"ConditionExpr{ " +
                "value=" + value +
                ", col=" + col +
                ", type='" +  NodeType.BOOLEAN + '\'' +
                ", childCount=" + childCount +
                ", parent='" + parent + '\'' +
                '}';
    }
}
