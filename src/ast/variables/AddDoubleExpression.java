package ast.variables;

public class AddDoubleExpression {
	NumberDoubleClass value;


	public AddDoubleExpression(NumberDoubleClass value) {
		this.value = value;

	}

	@Override
	public String toString() {
		return value.toString();
	}
}
