package ast.nodes;

public class ReturnStateTypes extends Node{
	String name;
	
	public ReturnStateTypes(String name,int line ,String parent) {
		super(line,parent);
		this.name = name;
	}

	@Override
	public String toString() {
		return "Return State Type Name "+ name + " line: "+ getLine() + " parent "+getParent()
				+" Child Count =  "+getChildCount()+" Type = "+getType()+"\n";
	}
}
