package ast.nodes;

public class PaddingDeclaration extends WidgetAbstractChild {
	PaddingPropertyDeclaration paddingPropertyDeclaration;
	ChildPropertyDeclaration childPropertyDeclaration;
	
	public PaddingDeclaration(PaddingPropertyDeclaration paddingProperty,ChildPropertyDeclaration childProperty) {
		this.paddingPropertyDeclaration=paddingProperty;
		this.childPropertyDeclaration=childProperty;
	}
}
