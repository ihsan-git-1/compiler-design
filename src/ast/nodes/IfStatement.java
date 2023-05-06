package ast.nodes;

import ast.variables.ConditionExpr;
import gen.dart_parse;

import java.util.List;

public class IfStatement extends Node  implements StatementAbstractChild {
    ConditionExpr conditionExpr;
    Block block;
    List<ConditionExpr> conditionExprList;
    List<Block> elseIfBlock;
    Block elseBlock;


    public IfStatement(dart_parse.IfStatementContext ctx, ConditionExpr conditionExpr, List<ConditionExpr> conditionExprList, Block block, List<Block> elseIfBlock, Block elseBlock) {
        super(ctx);
        this.conditionExpr = conditionExpr;
        this.conditionExprList= conditionExprList;
        this.block = block;
        this.elseIfBlock = elseIfBlock;
        this.elseBlock = elseBlock;
    }

    @Override
    public String toString() {
        return getLineString()+"If Statement: " + " Condition: " + conditionExpr + ", block: " + block + ", elseIfBlock: " + elseIfBlock + ", elseBlock: " + elseBlock + ", " +  ", parent: '" + parent + '\'' + '}';
    }
}
