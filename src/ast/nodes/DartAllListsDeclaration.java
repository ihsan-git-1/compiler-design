package ast.nodes;

public class DartAllListsDeclaration extends DartVariablesDeclarationAbstractChild{

	DartAllListsDeclarationAbstractChild dartAllListsDeclarationAbstractChild;
	
	public DartAllListsDeclaration(DartAllListsDeclarationAbstractChild child,int line ,String parent) {
		super(line,parent);
		this.dartAllListsDeclarationAbstractChild=child;
	}

	 
}
