package ast.nodes;

public class WhileStatement {
    BooleanOperation booleanOperation;
    Block block;

    public WhileStatement(BooleanOperation booleanOperation, Block block) {
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
        return "WhileStatement{" + "booleanOperation=" + booleanOperation + ", block=" + block + '}';
    }
}
