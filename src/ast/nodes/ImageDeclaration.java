package ast.nodes;

public class ImageDeclaration extends WidgetAbstractChild {
	String str;
	
	public ImageDeclaration(String str) {
		this.str=str;
	}
	
	@Override
	public String toString() {
		return
				"Image(\n"
				+str
				+"\n)"
				;
	}
}
