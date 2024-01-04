package ast.variables;

import ast.NodeType;
import ast.nodes.Node;
import gen.dart_parse;

public class BinaryExpr extends Node {
boolean value;

    public boolean isValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }

    public BinaryExpr(dart_parse.BinaryExprContext ctx, boolean value) {
        super(ctx);
        this.value = value;
    }

    @Override
    public String toString() {
        return getLineString()+"BinaryExpr{" +
                "value=" + value +
                ", col=" + col +
                ", type='" + NodeType.BOOLEAN + '\'' +
                ", childCount=" + childCount +
                ", parent='" + parent + '\'' +
                '}';
    }
}
