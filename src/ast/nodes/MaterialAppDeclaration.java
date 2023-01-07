package ast.nodes;

public class MaterialAppDeclaration extends WidgetAbstractChild {
	HomePropertyDeclaration homePropertyDeclaration;
	
	public MaterialAppDeclaration(HomePropertyDeclaration homePropertyDeclaration,int line ,String parent) {
		super(line,parent);
		this.homePropertyDeclaration=homePropertyDeclaration;
	}

	@Override
	public String toString() {
		return "Material App Declaration line: "+getLine()+" parent "+getParent()
				+" Child Count =  "+getChildCount()+" Type = "+getType()+"\n"
				+homePropertyDeclaration
				;
	}
}
