package ast.nodes;

public abstract class WidgetAbstractChild extends Node{
    public WidgetAbstractChild(int line ,String parent,String type,int childCount){
        super(line,parent, type, childCount);
    }
}
