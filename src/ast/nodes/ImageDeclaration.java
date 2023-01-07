package ast.nodes;

public class ImageDeclaration extends WidgetAbstractChild {
	String str;
	
	public ImageDeclaration(String str,int line ,String parent) {
		super(line,parent);
		this.str=str;
	}
	
	@Override
	public String toString() {
		return
				"Image Declaration line: "+getLine() + " parent "+getParent()
				+str
				;
	}
}
