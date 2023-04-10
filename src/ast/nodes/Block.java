package ast.nodes;

import java.util.List;

public class Block extends Node {
    List<Statement> statements;

    public List<Statement> getStatements() {
        return statements;
    }

    public void setStatements(List<Statement> statements) {
        this.statements = statements;
    }

    public Block(int line, String parent, List<Statement> statements, String type, int childCount) {
        super(line, parent,type,childCount);
        this.statements = statements;
    }

    @Override
    public String toString() {
        return statements.toString();
    }
}
