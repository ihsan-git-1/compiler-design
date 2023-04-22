package ast.nodes;

import ast.variables.ConditionExpr;

public class ForStatement  extends Node implements StatementAbstractChild {

    ForInit forInit;
    ConditionExpr conditionExpr;
    Block block;
    ExpressionList expressionList;

    public ForStatement(int line, String parent, String type, int childCount, ForInit forInit, ConditionExpr conditionExpr, Block block, ExpressionList expressionList) {
        super(line, parent, type, childCount);
        this.forInit = forInit;
        this.conditionExpr = conditionExpr;
        this.block = block;
        this.expressionList = expressionList;
    }
}
