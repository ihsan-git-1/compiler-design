package ast.nodes;


public class AllClassesDeclaration extends Node{
	AllClassesDeclarationAbstractChild child;
	
	public AllClassesDeclaration(AllClassesDeclarationAbstractChild child,int line ,String parent,String type,int childCount) {
		super(line,parent,type,childCount);
		this.child=child;
	}
	
	
	public String toString() {

		return "All Classes Declaration line: "+ getLine() + "parent "+ getParent()+"\n"+
				child
				;
	}
}
