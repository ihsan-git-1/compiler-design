package ast.nodes;

public class DartVariablesDeclaration extends ClassDeclaration {
	DartVariablesDeclarationAbstractChild dartVariablesDeclarationAbstractChild;

	public DartVariablesDeclaration(DartVariablesDeclarationAbstractChild dartVariablesDeclarationAbstractChild) {
		this.dartVariablesDeclarationAbstractChild = dartVariablesDeclarationAbstractChild;
	}

	@Override
	public String toString() {

		return "\nDartVariablesDeclaration"
				+"\n|\n"
				+dartVariablesDeclarationAbstractChild
				+";"
				+'\n';
	}
}
