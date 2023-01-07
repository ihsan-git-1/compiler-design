package ast.nodes;

public class HomePropertyDeclaration extends Node{
	String name;
	
	public HomePropertyDeclaration(String name,int line ,String parent,String type,int childCount) {
		super(line,parent, type,childCount);
		this.name=name;
	}
	
	@Override
	public String toString() {
		return "Home Property Declaration Name  "+name+ " line: "+getLine() + " parent "+ getParent();
	}
}
