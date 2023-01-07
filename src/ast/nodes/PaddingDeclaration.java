package ast.nodes;

public class PaddingDeclaration extends WidgetAbstractChild {
	PaddingPropertyDeclaration paddingPropertyDeclaration;
	ChildPropertyDeclaration childPropertyDeclaration;
	
	public PaddingDeclaration(PaddingPropertyDeclaration paddingProperty,ChildPropertyDeclaration childProperty,int line ,String parent) {
		super(line,parent);
		this.paddingPropertyDeclaration=paddingProperty;
		this.childPropertyDeclaration=childProperty;
	}

	@Override
	public String toString() {
		return "Padding Declaration line: "+getLine()+ " parent "+getParent()
				+paddingPropertyDeclaration
				+childPropertyDeclaration
				;
	}
}
