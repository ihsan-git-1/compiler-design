package ast.nodes;

import gen.dart_parse;

import java.util.List;

public class Block extends Node {
    List<Statement> statements;



    public Block(dart_parse.BlockContext ctx, List<Statement> statements) {
        super(ctx);
        this.statements = statements;
    }

    @Override
    public String toString() {
        return statements.toString();
    }
}
