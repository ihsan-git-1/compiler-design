package ast.nodes;

public class BodyPropertyDeclaration extends Node{
	WidgetsDeclaration widgetsDeclaration;
	
	public BodyPropertyDeclaration(WidgetsDeclaration widgetsDeclaration,int line ,String parent) {
		super(line,parent);
		this.widgetsDeclaration=widgetsDeclaration;
	}

	@Override
	public String toString() {
		return "Body Property Declaration line: "+getLine()+" parent "
				+ widgetsDeclaration;
	}
}
