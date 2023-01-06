package ast.variables;

public class MultiplyDoubleExpression {
	NumberDoubleClass value;

	public NumberDoubleClass getValue() {
		return value;
	}

	public void setValue(NumberDoubleClass value) {
		this.value = value;
	}

	public MultiplyDoubleExpression(NumberDoubleClass value) {
		this.value = value;

	}

	@Override
	public String toString() {
		return value.toString();
	}
}
