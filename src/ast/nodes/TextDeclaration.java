package ast.nodes;

public class TextDeclaration extends WidgetAbstractChild {
	String strline;
	
	public TextDeclaration(String strline,int line ,String parent,String type,int childCount) {
		super(line,parent, type, childCount);
		this.strline=strline;
	}
	
	@Override
	public String toString() {
		return "Text Declaration text = "+strline.toString()+" line: "+getLine()+" parent "+getParent()+"\n";

	}
}
