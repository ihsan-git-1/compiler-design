package ast.variables;

public class IntegerDeclaration extends VariableDeclaration {
	String name;
	AddExpression expr;
	
	public IntegerDeclaration(String name) {
		this.name=name;
	}
	
	public IntegerDeclaration(AddExpression expr,String name) {
		this.expr = expr;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return  name;
	}
}	
