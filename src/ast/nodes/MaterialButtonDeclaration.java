package ast.nodes;

public class MaterialButtonDeclaration extends WidgetAbstractChild {
	ChildPropertyDeclaration childPropertyDeclaration;
	
	public MaterialButtonDeclaration(ChildPropertyDeclaration childPropertyDeclaration,int line ,String parent) {

		super(line,parent);
		this.childPropertyDeclaration = childPropertyDeclaration;
	}

	@Override
	public String toString() {
		return "MaterialButton line: "+getLine() + " parent "+getParent()+"\n"
				+childPropertyDeclaration

				;
	}
}
