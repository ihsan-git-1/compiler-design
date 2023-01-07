package ast.nodes;

public class Node {

    public int line;
    public int col;

    public String parent;

    public Node(int line,String parent){
        this.line=line;
        this.parent=parent;
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
}
