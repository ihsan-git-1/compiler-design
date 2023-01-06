package ast.nodes;

public class PaddingDeclaration extends WidgetAbstractChild {
	PaddingPropertyDeclaration paddingPropertyDeclaration;
	ChildPropertyDeclaration childPropertyDeclaration;
	
	public PaddingDeclaration(PaddingPropertyDeclaration paddingProperty,ChildPropertyDeclaration childProperty) {
		this.paddingPropertyDeclaration=paddingProperty;
		this.childPropertyDeclaration=childProperty;
	}

	@Override
	public String toString() {
		return "Padding (\n"
				+paddingPropertyDeclaration
				+"\n"
				+childPropertyDeclaration
				+")"
				;
	}
}
