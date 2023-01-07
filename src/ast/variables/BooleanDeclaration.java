package ast.variables;

public class BooleanDeclaration extends VariableDeclaration{
	String name;
	BooleanValueClass booleanValueClass;
	
	public BooleanDeclaration(String name, int line, String parent) {
		super(line , parent);
		this.name=name;
	}
	
	public BooleanDeclaration(String name, BooleanValueClass booleanValueClass, int line, String parent) {
		super(line ,parent);
		this.name=name;
		this.booleanValueClass=booleanValueClass;
	}

	@Override
	public String toString() {
		return "bool " +name +" = " +booleanValueClass + " line: "+getLine()+" parent: "+getParent()
				;
	}
}
