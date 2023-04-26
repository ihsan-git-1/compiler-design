package ast.nodes;

import ast.variables.ConditionExpr;

import java.util.List;

public class IfStatement extends Node  implements StatementAbstractChild {
    ConditionExpr conditionExpr;
    Block block;
    List<ConditionExpr> conditionExprList;
    List<Block> elseIfBlock;
    Block elseBlock;


    public IfStatement(int line, String parent, String type, int childCount, ConditionExpr conditionExpr,List<ConditionExpr> conditionExprList, Block block, List<Block> elseIfBlock, Block elseBlock) {
        super(line, parent, type,childCount);
        this.conditionExpr = conditionExpr;
        this.conditionExprList= conditionExprList;
        this.block = block;
        this.elseIfBlock = elseIfBlock;
        this.elseBlock = elseBlock;
    }

    @Override
    public String toString() {
        return "If Statement: " + " Condition: " + conditionExpr + ", block: " + block + ", elseIfBlock: " + elseIfBlock + ", elseBlock: " + elseBlock + ", line: " + line + ", parent: '" + parent + '\'' + '}';
    }
}
