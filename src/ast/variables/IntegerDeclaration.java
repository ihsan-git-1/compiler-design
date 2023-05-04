package ast.variables;

import ast.nodes.Node;

public class IntegerDeclaration extends Identifier implements assignment {
    String name;

    public IntegerDeclaration(String name, int line, String parent,String type,int childCount) {
        super(line, parent, type, childCount);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Integer Declaration: " +name+" line: "+ getLine() + " parent: "+ getParent()
                +" Child Count =  "+getChildCount()+" Type = "+getType()+"\n";
    }
}	
