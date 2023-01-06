package ast.nodes;

public class MaterialAppDeclaration extends WidgetAbstractChild {
	HomePropertyDeclaration homePropertyDeclaration;
	
	public MaterialAppDeclaration(HomePropertyDeclaration homePropertyDeclaration) {
		this.homePropertyDeclaration=homePropertyDeclaration;
	}
}
