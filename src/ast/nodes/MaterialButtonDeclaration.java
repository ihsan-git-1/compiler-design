package ast.nodes;

public class MaterialButtonDeclaration extends WidgetAbstractChild {

	OnPressedPropertyDeclaration onPressedPropertyDeclaration;
	ChildPropertyDeclaration childPropertyDeclaration;
	
	public MaterialButtonDeclaration(OnPressedPropertyDeclaration onPressedPropertyDeclaration,ChildPropertyDeclaration childPropertyDeclaration,int line ,String parent,String type,int childCount) {

		super(line,parent, type, childCount);
		this.onPressedPropertyDeclaration = onPressedPropertyDeclaration;
		this.childPropertyDeclaration = childPropertyDeclaration;
	}

	@Override
	public String toString() {
		return "MaterialButton line: "+getLine() + " parent "+getParent()+"\n"
				+childPropertyDeclaration
				+onPressedPropertyDeclaration
				;
	}
}
