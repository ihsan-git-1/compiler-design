package ast.nodes;

import java.util.List;

public class FunctionBody extends Node{
    List<Statement> statementList;
    //ReturnStatement returnStatement;

    public FunctionBody(int line, String parent, String type, int childCount, List<Statement> statementList) {
        super(line, parent, type, childCount);
        this.statementList = statementList;
       // this.returnStatement = returnStatement;
    }

    @Override
    public String toString() {
        return "FunctionBody{" +
                "statementList=" + statementList +
                ", line=" + line +
                ", col=" + col +
                ", type='" + type + '\'' +
                ", childCount=" + childCount +
                ", parent='" + parent + '\'' +
                '}';
    }
}
