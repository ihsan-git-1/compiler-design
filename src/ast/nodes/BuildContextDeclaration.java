package ast.nodes;

public class BuildContextDeclaration extends Node{
	String name;
	
	public BuildContextDeclaration(String name,int line ,String parent,String type,int childCount) {
		super(line,parent, type,childCount);
		this.name=name;
	}
	
	public String toString() {
		return "BuildContext Name "+name + " line: "+getLine() + " parent "+getParent()
				+" Child Count =  "+getChildCount()+" Type = "+getType();
	}
}
