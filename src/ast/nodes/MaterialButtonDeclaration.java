package ast.nodes;

public class MaterialButtonDeclaration extends WidgetAbstractChild {

	OnPressedPropertyDeclaration onPressedPropertyDeclaration;
	ChildPropertyDeclaration childPropertyDeclaration;
	
	public MaterialButtonDeclaration(OnPressedPropertyDeclaration onPressedPropertyDeclaration,ChildPropertyDeclaration childPropertyDeclaration,int line ,String parent) {

		super(line,parent);
		this.onPressedPropertyDeclaration = onPressedPropertyDeclaration;
		this.childPropertyDeclaration = childPropertyDeclaration;
	}

	@Override
	public String toString() {
		return "MaterialButton line: "+getLine() + " parent "+getParent()
				+" Child Count =  "+getChildCount()+" Type = "+getType()+"\n"
				+childPropertyDeclaration
				+onPressedPropertyDeclaration
				;
	}
}
