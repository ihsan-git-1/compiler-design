package ast.nodes;

public class Node {

    public int line;
    public int col;

    public String type;

    public int childCount;
    public String parent;

    public Node(int line,String parent,String type,int childCount){
        this.line=line;
        this.parent=parent;
        this.type=type;
        this.childCount=childCount;
    }
    public void setLine(int line) {
        this.line = line;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getLine() {
        return line;
    }

    public int getCol() {
        return col;
    }

    public String getParent(){
        return parent;
    }

    public int getChildCount(){
        return childCount;
    }

    public String getType(){
        return type;
    }
}
