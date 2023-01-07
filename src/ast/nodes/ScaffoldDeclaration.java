package ast.nodes;

public class ScaffoldDeclaration extends WidgetAbstractChild {
	BodyPropertyDeclaration bodyPropertyDeclaration;
	
	public ScaffoldDeclaration(BodyPropertyDeclaration bodyPropertyDeclaration,int line ,String parent) {
		super(line,parent);
		this.bodyPropertyDeclaration = bodyPropertyDeclaration;
	}

	@Override
	public String toString() {
		return "Scaffold Declaration line: "+getLine()+" parent "+getParent()
				+bodyPropertyDeclaration
				;
	}
}
