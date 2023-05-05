package ast.nodes;

public class DartDeclarationAbstractChild extends Node{

    public DartDeclarationAbstractChild(int line, String parent, String type, int childCount){
        super(line,parent, type, childCount);

    }

//    public String toString(){
//        return " line: " + getLine() + " parent: " + getParent();
//    }
}
