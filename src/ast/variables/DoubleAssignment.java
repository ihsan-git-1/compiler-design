package ast.variables;

import ast.nodes.StatementAbstractChild;

public class DoubleAssignment extends VariableDeclaration implements StatementAbstractChild, assignment {
    String name;
    AddDoubleExpression expr;

    public DoubleAssignment(AddDoubleExpression expr, String name, int line, String parent,String type,int childCount) {
        super(line, parent, type, childCount);
        this.expr = expr;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Double Assignment: " +name+" line: "+ getLine() + " parent: "+ getParent()
                +" Child Count =  "+getChildCount()+" Type = "+getType()+"\n"
                + "value: " + expr;
    }
}
