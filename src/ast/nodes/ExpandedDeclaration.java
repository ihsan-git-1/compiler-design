package ast.nodes;

public class ExpandedDeclaration extends WidgetAbstractChild {
	ChildPropertyDeclaration childPropertyDeclaration;
	
	public ExpandedDeclaration(ChildPropertyDeclaration childPropertyDeclaration,int line ,String parent) {
		super(line,parent);
		this.childPropertyDeclaration=childPropertyDeclaration;
	}

	@Override
	public String toString() {

		return "Expanded line: "+getLine()+" parent "+getParent()+"\n"
				+childPropertyDeclaration;
	}
}
