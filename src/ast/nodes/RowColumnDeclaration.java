package ast.nodes;

public class RowColumnDeclaration extends WidgetAbstractChild {
	String name;
	ChildrenPropertyDeclaration childrenPropertyDeclaration;
	
	public RowColumnDeclaration(String name,ChildrenPropertyDeclaration childrenPropertyDeclaration) {
		this.name = name;
		this.childrenPropertyDeclaration=childrenPropertyDeclaration;
	}

	@Override
	public String toString() {
		return name
				+"("
				+childrenPropertyDeclaration
				+"\n)"
				;
	}
}
