package ast.nodes;


public class AllClassesDeclaration extends Node{
	AllClassesDeclarationAbstractChild child;
	
	public AllClassesDeclaration(AllClassesDeclarationAbstractChild child,int line ,String parent) {
		super(line,parent);
		this.child=child;
	}
	
	
	public String toString() {

		return "All Classes Declaration line: "+ getLine() + "parent "+ getParent()
				+" Child Count =  "+getChildCount()+" Type = "+getType()+"\n"+
				child
				;
	}
}
