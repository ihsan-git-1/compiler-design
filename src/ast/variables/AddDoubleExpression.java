package ast.variables;


public class AddDoubleExpression extends NumericTermAbstractChild<Double> {
    public NumberDoubleClass value;
    @Override
    public Double getValue() {
        return super.getValue();
    }

    @Override
    public void setValue(Double value) {
        super.setValue(value);
    }

    public AddDoubleExpression(NumberDoubleClass value, int line, String parent, String type, int childCount) {
        super(line, parent, type, childCount);
        this.value = value;
        setValue(value.num);
    }

    @Override
    public String toString() {
        return "Add Double Expression: " + value.num + " line: " + getLine() + " parent " + getParent() + " Child Count =  " + getChildCount() + " Type = " + getType() + "\n" + value;
    }
}
