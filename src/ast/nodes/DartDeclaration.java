package ast.nodes;

public class DartDeclaration extends Node
		implements StatementAbstractChild {
	DartDeclarationAbstractChild dartDeclarationAbstractChild;

	public DartDeclaration(DartDeclarationAbstractChild dartDeclarationAbstractChild, int line , String parent, String type, int childCount) {
		super(line,parent, type,childCount);
		this.dartDeclarationAbstractChild = dartDeclarationAbstractChild;
	}

	@Override
	public String toString() {
		return "Dart Variable Declaration: " + " line: "+ getLine() + " parent: " + getParent()
				+" Child Count =  "+getChildCount()+" Type = "+getType()+"\n"
				+ dartDeclarationAbstractChild;
	}
}
