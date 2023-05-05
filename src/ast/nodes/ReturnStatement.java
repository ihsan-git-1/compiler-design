package ast.nodes;

import gen.dart_parse;

import java.beans.Expression;

public class ReturnStatement extends Node{
    Expression expression;

    public ReturnStatement(dart_parse.ReturnStatementContext ctx, Expression expression) {
        super(ctx);
        this.expression = expression;
    }

    @Override
    public String toString() {
        return getLineString()
                +"ReturnStatement{" +
                "expression=" + expression +
                ", col=" + col +
                ", type='" + type + '\'' +
                ", childCount=" + childCount +
                ", parent='" + parent + '\'' +
                '}';
    }
}
