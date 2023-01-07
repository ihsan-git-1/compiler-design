package ast.nodes;

public class ScaffoldDeclaration extends WidgetAbstractChild {
	BodyPropertyDeclaration bodyPropertyDeclaration;
	
	public ScaffoldDeclaration(BodyPropertyDeclaration bodyPropertyDeclaration,int line ,String parent,String type,int childCount) {
		super(line,parent, type, childCount);
		this.bodyPropertyDeclaration = bodyPropertyDeclaration;
	}

	@Override
	public String toString() {
		return "Scaffold Declaration line: "+getLine()+" parent "+getParent()+"\n"
				+bodyPropertyDeclaration
				;
	}
}
