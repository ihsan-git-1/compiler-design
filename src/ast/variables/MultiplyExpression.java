package ast.variables;

public class MultiplyExpression {
    NumberClass value;

    public NumberClass getValue() {
        return value;
    }

    public void setValue(NumberClass value) {
        this.value = value;
    }

    public MultiplyExpression(NumberClass value) {
        this.value = value;

    }

    @Override
    public String toString() {
            return value.toString();
    }
}
