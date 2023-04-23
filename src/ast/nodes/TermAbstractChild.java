package ast.nodes;



public abstract class TermAbstractChild<T> extends Node {
protected T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public TermAbstractChild(int line, String parent, String type, int childCount, T value) {
        super(line, parent, type, childCount);
        this.value = value;
    }
}
