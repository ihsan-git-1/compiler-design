package ast.nodes;

import gen.dart_parse;

public class Statement extends Node{

    StatementAbstractChild statementAbstractChild;

    public Statement(StatementAbstractChild statementAbstractChild, dart_parse.StatementContext ctx){
        super(ctx);
        this.statementAbstractChild = statementAbstractChild;
    }

    @Override
    public String toString() {
        return  statementAbstractChild.toString();
    }
}
