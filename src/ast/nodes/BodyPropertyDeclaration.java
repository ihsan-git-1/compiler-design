package ast.nodes;

public class BodyPropertyDeclaration {
	WidgetsDeclaration widgetsDeclaration;
	
	public BodyPropertyDeclaration(WidgetsDeclaration widgetsDeclaration) {

		this.widgetsDeclaration=widgetsDeclaration;
	}

	@Override
	public String toString() {
		return "body : "+ widgetsDeclaration;
	}
}
