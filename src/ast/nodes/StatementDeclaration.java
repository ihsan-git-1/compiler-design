package ast.nodes;

public class StatementDeclaration extends Node{

    StatementDeclarationAbstractChild statementDeclarationAbstractChild;

    public StatementDeclaration(StatementDeclarationAbstractChild statementDeclarationAbstractChild,int line ,String parent,String type,int childCount){
        super(line, parent, type, childCount);
        this.statementDeclarationAbstractChild = statementDeclarationAbstractChild;
    }

    @Override
    public String toString() {
        return  statementDeclarationAbstractChild.toString();
    }
}
