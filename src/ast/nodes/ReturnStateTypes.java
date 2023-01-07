package ast.nodes;

public class ReturnStateTypes extends Node{
	String name;
	
	public ReturnStateTypes(String name,int line ,String parent) {
		super(line,parent);
		this.name = name;
	}

	@Override
	public String toString() {
		return name+"();";
	}
}
