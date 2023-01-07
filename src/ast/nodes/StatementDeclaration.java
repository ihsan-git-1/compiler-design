package ast.nodes;

public class StatementDeclaration {

    StatementDeclarationAbstractChild statementDeclarationAbstractChild;

    public StatementDeclaration(StatementDeclarationAbstractChild statementDeclarationAbstractChild){
        this.statementDeclarationAbstractChild = statementDeclarationAbstractChild;
    }

    @Override
    public String toString() {
        return  statementDeclarationAbstractChild.toString();
    }
}
