package ast.variables;

public class BooleanDeclaration extends VariableDeclaration{
	String name;
	BooleanValueClass booleanValueClass;
	
	public BooleanDeclaration(String name) {
		this.name=name;
	}
	
	public BooleanDeclaration(String name, BooleanValueClass booleanValueClass) {
		this.name=name;
		this.booleanValueClass=booleanValueClass;
	}

	@Override
	public String toString() {
		return "bool "
				+name
				+" = "
				+booleanValueClass
				;
	}
}
