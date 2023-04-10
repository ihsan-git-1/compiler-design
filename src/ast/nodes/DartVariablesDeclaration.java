package ast.nodes;

public class DartVariablesDeclaration extends Node
		implements StatementAbstractChild {
	DartVariablesDeclarationAbstractChild dartVariablesDeclarationAbstractChild;

	public DartVariablesDeclaration(DartVariablesDeclarationAbstractChild dartVariablesDeclarationAbstractChild,int line ,String parent,String type,int childCount) {
		super(line,parent, type,childCount);
		this.dartVariablesDeclarationAbstractChild = dartVariablesDeclarationAbstractChild;
	}

	@Override
	public String toString() {
		return "Dart Variable Declaration: " + " line: "+ getLine() + " parent: " + getParent()
				+" Child Count =  "+getChildCount()+" Type = "+getType()+"\n"
				+ dartVariablesDeclarationAbstractChild;
	}
}
