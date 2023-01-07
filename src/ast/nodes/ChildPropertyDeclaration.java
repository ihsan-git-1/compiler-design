package ast.nodes;

public class ChildPropertyDeclaration extends ContainerPropertiesDeclarationAbstractChild{
	WidgetsDeclaration widgetsDeclaration;
	
	public ChildPropertyDeclaration(WidgetsDeclaration widgetsDeclaration,int line,String parent) {
		super(line,parent);
		this.widgetsDeclaration=widgetsDeclaration;
	}

	@Override
	public String toString() {
		return "Child Property Declaration line: "+getLine()+" parent " +getParent()
				+widgetsDeclaration
				;
	}
}
