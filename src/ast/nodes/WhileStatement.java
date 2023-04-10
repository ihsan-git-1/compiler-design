package ast.nodes;

public class WhileStatement extends Node  implements StatementAbstractChild {
    BooleanOperation booleanOperation;
    Block block;

    public WhileStatement(int line, String parent,String type,int childCount ,BooleanOperation booleanOperation, Block block) {
        super(line, parent, type, childCount);
        this.booleanOperation = booleanOperation;
        this.block = block;
    }

    public BooleanOperation getBooleanOperation() {
        return booleanOperation;
    }

    public void setBooleanOperation(BooleanOperation booleanOperation) {
        this.booleanOperation = booleanOperation;
    }

    public Block getBlock() {
        return block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    @Override
    public String toString() {
        return "WhileStatement: " + "condition: " + booleanOperation + ", block: " + block + ", line: " + line + ", parent: '" + parent
                +" Child Count:  "+getChildCount()+" Type:  "+getType();
    }
}
