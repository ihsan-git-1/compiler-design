package ast.nodes;

public class RowColumnDeclaration extends WidgetAbstractChild {
	String name;
	ChildrenPropertyDeclaration childrenPropertyDeclaration;
	
	public RowColumnDeclaration(String name,ChildrenPropertyDeclaration childrenPropertyDeclaration,int line ,String parent,String type,int childCount) {
		super(line,parent, type, childCount);
		this.name = name;
		this.childrenPropertyDeclaration=childrenPropertyDeclaration;
	}

	@Override
	public String toString() {

		return "Row Column Declaration Name " +name+" line: "+getLine() + " parent "+getParent()+"\n"
				+childrenPropertyDeclaration;
	}
}
