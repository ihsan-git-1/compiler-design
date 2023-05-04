package ast.variables;


public class BooleanDeclaration extends Identifier implements assignment {
	String name;
	public BooleanDeclaration(String name, int line, String parent,String type,int childCount) {
		super(line , parent,type,childCount);
		this.name=name;
	}

	@Override
	public String toString() {
		return "Boolean Declaration: " +name+" line: "+ getLine() + " parent: "+ getParent()
				+" Child Count =  "+getChildCount()+" Type = "+getType();
	}
}
