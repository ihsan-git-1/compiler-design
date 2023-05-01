package ast.nodes;

import java.beans.Expression;

public class ReturnStatement extends Node{
    Expression expression;

    public ReturnStatement(int line, String parent, String type, int childCount, Expression expression) {
        super(line, parent, type, childCount);
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "ReturnStatement{" +
                "expression=" + expression +
                ", line=" + line +
                ", col=" + col +
                ", type='" + type + '\'' +
                ", childCount=" + childCount +
                ", parent='" + parent + '\'' +
                '}';
    }
}
