package ast.nodes;

public class BodyPropertyDeclaration extends Node{
	WidgetsDeclaration widgetsDeclaration;
	
	public BodyPropertyDeclaration(WidgetsDeclaration widgetsDeclaration,int line ,String parent,String type,int childCount) {
		super(line,parent, type, childCount);
		this.widgetsDeclaration=widgetsDeclaration;
	}

	@Override
	public String toString() {
		return "Body Property Declaration line: "+getLine()+" parent "+getParent()+"\n"
				+ widgetsDeclaration;
	}
}
