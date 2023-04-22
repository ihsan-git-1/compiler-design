package ast.nodes;



public abstract class TermAbstractChild extends Node {

    public TermAbstractChild(int line, String parent, String type, int childCount) {
        super(line, parent, type, childCount);
    }
}
