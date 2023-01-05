package ast.nodes;

public class DartVariablesDeclaration extends ClassDeclaration {
	DartVariablesDeclarationAbstractChild child;
	
	public DartVariablesDeclaration(DartVariablesDeclarationAbstractChild child) {
		this.child=child;
	}
	
}
