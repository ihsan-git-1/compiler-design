package ast.nodes;

public class DartVariablesDeclarationAbstractChild extends Node{

    public DartVariablesDeclarationAbstractChild(int line,String parent,String type,int childCount){
        super(line,parent, type, childCount);
    }

//    public String toString(){
//        return " line: " + getLine() + " parent: " + getParent();
//    }
}
