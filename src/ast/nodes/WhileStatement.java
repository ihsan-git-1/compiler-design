package ast.nodes;

import ast.NodeType;
import ast.variables.ConditionExpr;
import gen.dart_parse;

public class WhileStatement extends Node  implements StatementAbstractChild {
    ConditionExpr conditionExpr;
    Block block;

    public WhileStatement(dart_parse.WhileStatementContext ctx, ConditionExpr conditionExpr, Block block) {

        super(ctx);

        this.conditionExpr = conditionExpr;
        this.block = block;
    }

    public ConditionExpr getConditionExpr() {
        return conditionExpr;
    }

    public void setConditionExpr(ConditionExpr conditionExpr) {
        this.conditionExpr = conditionExpr;
    }

    public Block getBlock() {
        return block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    @Override
    public String toString() {
        return getLineString()+"WhileStatement: " + "condition: " + conditionExpr + ", block: " + block + ", parent: '" + parent
                +" Child Count:  "+getChildCount()+" Type:  "+ NodeType.CONDITION;
    }
}
