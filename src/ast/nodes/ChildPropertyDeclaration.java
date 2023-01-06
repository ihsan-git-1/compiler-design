package ast.nodes;

public class ChildPropertyDeclaration {
	WidgetsDeclaration widgetsDeclaration;
	
	public ChildPropertyDeclaration(WidgetsDeclaration widgetsDeclaration) {
		this.widgetsDeclaration=widgetsDeclaration;
	}

	@Override
	public String toString() {
		return "child : "
				+ widgetsDeclaration
				;
	}
}
