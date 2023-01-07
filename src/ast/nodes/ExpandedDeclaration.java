package ast.nodes;

public class ExpandedDeclaration extends WidgetAbstractChild {
	ChildPropertyDeclaration childPropertyDeclaration;
	
	public ExpandedDeclaration(ChildPropertyDeclaration childPropertyDeclaration,int line ,String parent,String type,int childCount) {
		super(line,parent, type, childCount);
		this.childPropertyDeclaration=childPropertyDeclaration;
	}

	@Override
	public String toString() {

		return "Expanded line: "+getLine()+" parent "+getParent()
				+" Child Count =  "+getChildCount()+" Type = "+getType()+"\n"
				+childPropertyDeclaration;
	}
}
