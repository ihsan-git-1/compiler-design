package ast.nodes;

public class Statement extends Node{

    StatementAbstractChild statementAbstractChild;

    public Statement(StatementAbstractChild statementAbstractChild, int line , String parent, String type, int childCount){
        super(line, parent, type, childCount);
        this.statementAbstractChild = statementAbstractChild;
    }

    @Override
    public String toString() {
        return  statementAbstractChild.toString();
    }
}
