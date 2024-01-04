package ast.nodes;


import gen.dart_parse;

public abstract class TermAbstractChild<T> extends Node {
protected T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public TermAbstractChild(dart_parse.NumericExprContext ctx, T value) {
        super(ctx);
        this.value = value;
    }
    public TermAbstractChild(dart_parse.BooleansContext ctx, T value) {
        super(ctx);
        this.value = value;
    }
    public TermAbstractChild(dart_parse.DartListBoolDeclarationContext ctx, T value) {
        super(ctx);
        this.value = value;
    }
    public TermAbstractChild(dart_parse.ConditionExprContext ctx, T value) {
        super(ctx);
        this.value = value;
    }
}
