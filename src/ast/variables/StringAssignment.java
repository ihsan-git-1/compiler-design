package ast.variables;

import ast.nodes.StatementAbstractChild;

public class StringAssignment extends VariableDeclaration implements StatementAbstractChild, assignment {
    String name;
    String stringLine;

    public StringAssignment(String stringLine, String name, int line, String parent,String type,int childCount) {
        super(line, parent, type, childCount);
        this.stringLine = stringLine;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Double Assignment: " +name+" line: "+ getLine() + " parent: "+ getParent()
                +" Child Count =  "+getChildCount()+" Type = "+getType()+"\n"
                + "value: " + stringLine;
    }
}
