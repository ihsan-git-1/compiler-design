package ast.variables;

public class AddExpression {
	NumberClass value;


	public AddExpression(NumberClass value) {
		this.value = value;

	}

	@Override
	public String toString() {
		return value.toString();
	}
}
