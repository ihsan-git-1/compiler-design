package ast.nodes;

public class ChildPropertyDeclaration extends ContainerPropertiesDeclarationAbstractChild{
	WidgetsDeclaration widgetsDeclaration;
	
	public ChildPropertyDeclaration(WidgetsDeclaration widgetsDeclaration,int line,String parent,String type,int childCount) {
		super(line,parent, type, childCount);
		this.widgetsDeclaration=widgetsDeclaration;
	}

	@Override
	public String toString() {
		return "Child Property Declaration line: "+getLine()+" parent " +getParent()
				+" Child Count =  "+getChildCount()+" Type = "+getType()+"\n"
				+widgetsDeclaration;
	}
}
