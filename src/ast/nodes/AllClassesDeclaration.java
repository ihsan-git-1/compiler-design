package ast.nodes;


public class AllClassesDeclaration {
	AllClassesDeclarationAbstractChild child;
	
	public AllClassesDeclaration(AllClassesDeclarationAbstractChild child) {
		this.child=child;
	}
	
	
	public String toString() {
		return "All Classes "+child.toString();
	}
}
