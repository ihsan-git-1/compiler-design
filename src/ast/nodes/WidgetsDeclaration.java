package ast.nodes;

public class WidgetsDeclaration extends Node{
	WidgetAbstractChild widgetAbstractChild;
	public WidgetsDeclaration(WidgetAbstractChild widgetAbstractChild,int line,String parent) {
		super(line,parent);
		this.widgetAbstractChild = widgetAbstractChild;
	}

	@Override
	public String toString() {
		return "Widget Declaration line: "+getLine()+" parent "+getParent()
				+" Child Count =  "+getChildCount()+" Type = "+getType()+"\n"+
				widgetAbstractChild.toString();
	}
}
