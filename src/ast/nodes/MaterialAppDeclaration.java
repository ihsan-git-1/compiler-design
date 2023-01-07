package ast.nodes;

public class MaterialAppDeclaration extends WidgetAbstractChild {
	HomePropertyDeclaration homePropertyDeclaration;
	
	public MaterialAppDeclaration(HomePropertyDeclaration homePropertyDeclaration,int line ,String parent,String type,int childCount) {
		super(line,parent, type, childCount);
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
