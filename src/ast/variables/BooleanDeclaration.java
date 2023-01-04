package ast.variables;

public class BooleanDeclaration {
	String name;
	BooleanClass bool;
	
	public BooleanDeclaration(String name) {
		this.name=name;
	}
	
	public BooleanDeclaration(String name,BooleanClass bool) {
		this.name=name;
		this.bool=bool;
	}
}
