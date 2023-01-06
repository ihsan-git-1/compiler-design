package ast.nodes;

public class MaterialAppDeclaration extends WidgetAbstractChild {
	HomePropertyDeclaration homePropertyDeclaration;
	
	public MaterialAppDeclaration(HomePropertyDeclaration homePropertyDeclaration) {
		this.homePropertyDeclaration=homePropertyDeclaration;
	}

	@Override
	public String toString() {
		return "MaterialApp(\n"
				+homePropertyDeclaration
				+"\n)\n"
				;
	}
}
