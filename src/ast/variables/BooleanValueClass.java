package ast.variables;

public class BooleanValueClass {
	String value;
	
	public BooleanValueClass(String value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return value;
	}
}
