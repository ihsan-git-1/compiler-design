package ast.nodes;

public class DartVariablesDeclaration extends Node
		implements StatementDeclarationAbstractChild {
	DartVariablesDeclarationAbstractChild dartVariablesDeclarationAbstractChild;

	public DartVariablesDeclaration(DartVariablesDeclarationAbstractChild dartVariablesDeclarationAbstractChild,int line ,String parent) {
		super(line,parent);
		this.dartVariablesDeclarationAbstractChild = dartVariablesDeclarationAbstractChild;
	}

	@Override
	public String toString() {
		return "Dart Variable Declaration: " + " line: "+ getLine() + " parent: " + getParent()
				+" Child Count =  "+getChildCount()+" Type = "+getType()+"\n"
				+ dartVariablesDeclarationAbstractChild;
	}
}
