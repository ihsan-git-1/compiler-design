package ast.nodes;

public class TextDeclaration extends WidgetAbstractChild {
	String strline;
	
	public TextDeclaration(String strline) {
		this.strline=strline;
	}
	
	@Override
	public String toString() {
		return strline;
	}
}
