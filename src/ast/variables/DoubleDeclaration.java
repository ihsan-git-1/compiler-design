package ast.variables;

public class DoubleDeclaration extends VariableDeclaration {
	String name;
	AddDoubleExpression expr;
	
	public DoubleDeclaration(String name) {
		this.name=name;
	}
	
	public DoubleDeclaration(AddDoubleExpression expr,String name) {
		this.expr = expr;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return  name;
	}
}
