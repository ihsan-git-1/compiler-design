package ast.variables;

public abstract class Identifier extends NumericTermAbstractChild<Double>{
    public double value;

    @Override
    public Double getValue() {
        return super.getValue();
    }

    @Override
    public void setValue(Double value) {
        super.setValue(value);
    }

    public Identifier(int line, String parent, String type, int childCount) {
        super(line, parent, type, childCount);
        setValue(value);
    }

}
