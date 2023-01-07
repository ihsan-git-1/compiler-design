package ast.variables;

public class StringDeclaration extends VariableDeclaration{
	String name;
	String stringLine;
	
	public StringDeclaration(String name ,String stringLine, int line, String parent,String type,int childCount) {
		super(line, parent, type, childCount);
		this.name=name;
		this.stringLine=stringLine;
	}
	
	@Override
	public String toString() {
		return "String Declaration: " +name+ "=" +stringLine+" line: "+ getLine() + " parent: "+ getParent()
				+" Child Count =  "+getChildCount()+" Type = "+getType()+"\n"
				;
	}
}
