package ast.variables;

public class BooleanValueClass {
	boolean value;
	
	public BooleanValueClass(boolean value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return String.valueOf(value);
	}
}
