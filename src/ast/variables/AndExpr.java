package ast.variables;

import ast.NodeType;
import ast.nodes.Node;
import gen.dart_parse;

public class AndExpr extends Node {
boolean value;

    public AndExpr(dart_parse.AndExprContext ctx, boolean value) {
        super(ctx);
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
        return getLineString()+"AndExpr{" +
                "value=" + value +
                ", line=" + line +
                ", col=" + col +
                ", type='" + NodeType.BOOLEAN + '\'' +
                ", childCount=" + childCount +
                ", parent='" + parent + '\'' +
                '}';
    }
}
