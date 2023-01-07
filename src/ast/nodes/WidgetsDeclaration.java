package ast.nodes;

public class WidgetsDeclaration extends Node{
	WidgetAbstractChild widgetAbstractChild;
	public WidgetsDeclaration(WidgetAbstractChild widgetAbstractChild,int line,String parent,String type,int childCount) {
		super(line,parent, type, childCount);
		this.widgetAbstractChild = widgetAbstractChild;
	}

	@Override
	public String toString() {
		return "Widget Declaration line: "+getLine()+" parent "+getParent()+"\n"+
				widgetAbstractChild.toString();
	}
}
