package ast.nodes;

import java.util.List;

public class IfStatementDeclaration extends Node {
    BooleanOperation booleanOperation;
    Block block;
    List<Block> elseIfBlock;
    Block elseBlock;


    public IfStatementDeclaration(int line, String parent,String type,int childCount, BooleanOperation booleanOperation, Block block, List<Block> elseIfBlock, Block elseBlock) {
        super(line, parent, type,childCount);
        this.booleanOperation = booleanOperation;
        this.block = block;
        this.elseIfBlock = elseIfBlock;
        this.elseBlock = elseBlock;
    }

    @Override
    public String toString() {
        return "IfStatementDeclaration{" + "booleanOperation=" + booleanOperation + ", block=" + block + ", elseIfBlock=" + elseIfBlock + ", elseBlock=" + elseBlock + ", line=" + line + ", parent='" + parent + '\'' + '}';
    }
}
