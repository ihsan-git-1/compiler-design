package ast.nodes;

public class StatefullAssignStateClassDeclaration extends Node{
	String name;
	ReturnStateTypes types;
	
	public StatefullAssignStateClassDeclaration(String name,ReturnStateTypes types,int line,String parent,String type,int childCount) {
		super(line,parent, type, childCount);
		this.types = types;
		this.name = name;
	}
	
	@Override
	public String toString() {

		return  "StatefullAssignStateClassDeclaration Name " +name + " line: "+ getLine() + " parent "+ getParent()+"\n"
				+types
				;
	}
}
