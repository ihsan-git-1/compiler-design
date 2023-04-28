package ast.variables;

import ast.nodes.StatementAbstractChild;

public class BooleanAssignment extends VariableDeclaration implements StatementAbstractChild, assignment {
    String name;
    BooleanValueClass expr;

    public BooleanAssignment(BooleanValueClass expr, String name, int line, String parent,String type,int childCount) {
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
