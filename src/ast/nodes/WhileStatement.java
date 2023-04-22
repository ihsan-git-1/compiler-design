package ast.nodes;

import ast.variables.ConditionExpr;

public class WhileStatement extends Node  implements StatementAbstractChild {
    ConditionExpr conditionExpr;
    Block block;

    public WhileStatement(int line, String parent,String type,int childCount ,ConditionExpr conditionExpr, Block block) {
        super(line, parent, type, childCount);
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
        return "WhileStatement: " + "condition: " + conditionExpr + ", block: " + block + ", line: " + line + ", parent: '" + parent
                +" Child Count:  "+getChildCount()+" Type:  "+getType();
    }
}
