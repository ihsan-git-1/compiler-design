package ast.nodes;

public class MaterialButtonDeclaration extends WidgetAbstractChild {
	ChildPropertyDeclaration childPropertyDeclaration;
	
	public MaterialButtonDeclaration(ChildPropertyDeclaration childPropertyDeclaration) {
		this.childPropertyDeclaration = childPropertyDeclaration;
	}
}
