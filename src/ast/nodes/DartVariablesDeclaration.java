package ast.nodes;

public class DartVariablesDeclaration extends ClassDeclaration {
	DartVariablesDeclarationAbstractChild dartVariablesDeclarationAbstractChild;

	public DartVariablesDeclaration(DartVariablesDeclarationAbstractChild dartVariablesDeclarationAbstractChild,int line ,String parent) {
		super(line,parent);
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
