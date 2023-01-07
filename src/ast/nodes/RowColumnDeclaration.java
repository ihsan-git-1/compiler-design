package ast.nodes;

public class RowColumnDeclaration extends WidgetAbstractChild {
	String name;
	ChildrenPropertyDeclaration childrenPropertyDeclaration;
	
	public RowColumnDeclaration(String name,ChildrenPropertyDeclaration childrenPropertyDeclaration,int line ,String parent) {
		super(line,parent);
		this.name = name;
		this.childrenPropertyDeclaration=childrenPropertyDeclaration;
	}

	@Override
	public String toString() {
		return name
				+" (\n"
				+childrenPropertyDeclaration
				+"\n)"
				;
	}
}
