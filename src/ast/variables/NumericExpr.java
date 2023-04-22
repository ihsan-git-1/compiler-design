package ast.variables;

import ast.nodes.TermAbstractChild;

public class NumericExpr extends TermAbstractChild
{
    public NumericExpr(int line, String parent, String type, int childCount) {
        super(line, parent, type, childCount);
    }
}
