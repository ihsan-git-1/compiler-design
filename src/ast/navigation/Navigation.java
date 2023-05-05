package ast.navigation;

import ast.nodes.DartDeclarationAbstractChild;

public class Navigation extends DartDeclarationAbstractChild {


    String name;

    public Navigation(String name, int line, String parent, String type, int childCount) {
        super(line, parent, type, childCount);
        this.name = name;
    }

    public String toString() {
        return  "Navigation Declaration: value: "+ name + " line: "+getLine() + " parent: "+ getParent()
                +" Child Count =  "+getChildCount()+" Type = "+getType()+"\n";
    }

}
