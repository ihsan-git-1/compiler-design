package ast.variables;

public class StringDeclaration extends VariableDeclaration{
	String name;
	String stringLine;
	
	public StringDeclaration(String name ,String stringLine) {
		this.name=name;
		this.stringLine=stringLine;
	}
	
	@Override
	public String toString() {
		return "String " +
				name +
				"="+
				stringLine
				;
	}
}
