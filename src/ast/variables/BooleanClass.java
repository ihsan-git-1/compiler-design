package ast.variables;

public class BooleanClass {
	String name;
	
	public BooleanClass(String name) {
		this.name=name;
	}
	
	@Override
	public String toString() {
		return  name;
	}
}
