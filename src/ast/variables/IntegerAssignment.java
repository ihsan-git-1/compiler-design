package ast.variables;

import ast.nodes.StatementAbstractChild;

public class IntegerAssignment extends VariableDeclaration implements StatementAbstractChild, assignment {
    String name;
    AddExpression expr;

    public IntegerAssignment(AddExpression expr, String name, int line, String parent,String type,int childCount) {
        super(line, parent, type, childCount);
        this.expr = expr;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Integer Assignment: " +name+" line: "+ getLine() + " parent: "+ getParent()
                +" Child Count =  "+getChildCount()+" Type = "+getType()+"\n"
                + expr;
    }
}
