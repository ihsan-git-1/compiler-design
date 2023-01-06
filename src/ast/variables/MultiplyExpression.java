package ast.variables;

public class MultiplyExpression {
    NumberClass value;


    public MultiplyExpression(NumberClass value) {
        this.value = value;

    }

    @Override
    public String toString() {
            return value.toString();
    }
}
