package ast.variables;

public class BooleanDeclaration extends VariableDeclaration{
	String name;
	BooleanValueClass booleanValueClass;
	
	public BooleanDeclaration(String name, int line, String parent,String type,int childCount) {
		super(line , parent,type,childCount);
		this.name=name;
	}
	
	public BooleanDeclaration(String name, BooleanValueClass booleanValueClass, int line, String parent,String type,int childCount) {
		super(line ,parent, type, childCount);
		this.name=name;
		this.booleanValueClass=booleanValueClass;
	}

	@Override
	public String toString() {
		return "Boolean Declaration: " +name+" line: "+ getLine() + " parent: "+ getParent()
				+" Child Count =  "+getChildCount()+" Type = "+getType()+"\n"
				+ booleanValueClass
				;
	}
}
