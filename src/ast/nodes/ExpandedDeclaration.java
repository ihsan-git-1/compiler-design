package ast.nodes;

public class ExpandedDeclaration extends WidgetAbstractChild {
	ChildPropertyDeclaration childPropertyDeclaration;
	
	public ExpandedDeclaration(ChildPropertyDeclaration childPropertyDeclaration) {
		this.childPropertyDeclaration=childPropertyDeclaration;
	}

	@Override
	public String toString() {
		return "Expanded : \n"+childPropertyDeclaration;
	}
}
