package ast.nodes;

import java.util.List;

public class Block extends Node {
    List<StatementDeclaration> statements;

    public List<StatementDeclaration> getStatements() {
        return statements;
    }

    public void setStatements(List<StatementDeclaration> statements) {
        this.statements = statements;
    }

    public Block(int line, String parent, List<StatementDeclaration> statements) {
        super(line, parent);
        this.statements = statements;
    }

    @Override
    public String toString() {
        return "Block{" + "statements=" + statements + '}';
    }
}
