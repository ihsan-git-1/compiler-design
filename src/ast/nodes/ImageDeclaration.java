package ast.nodes;

public class ImageDeclaration extends WidgetAbstractChild {
	String str;
	
	public ImageDeclaration(String str,int line ,String parent,String type,int childCount) {
		super(line,parent, type, childCount);
		this.str=str;
	}
	
	@Override
	public String toString() {
		return
				"Image Declaration src = "+str+ " line: "+getLine() + " parent "+getParent()
						+" Child Count =  "+getChildCount()+" Type = "+getType()+"\n";
	}
}
