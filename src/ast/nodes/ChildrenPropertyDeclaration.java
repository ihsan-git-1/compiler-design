package ast.nodes;

import java.util.ArrayList;
import java.util.List;

public class ChildrenPropertyDeclaration extends Node{
	List<WidgetsDeclaration> widgetsDeclarationList;
	
	public ChildrenPropertyDeclaration(int line ,String parent,String type,int childCount) {
		super(line,parent, type, childCount);
		this.widgetsDeclarationList = new ArrayList<>();
	}
	
	public void addWidgets(WidgetsDeclaration widget) {
		widgetsDeclarationList.add(widget);
	}
	
	public List<WidgetsDeclaration> getWidgetDeclarationList() {
		return widgetsDeclarationList;
	}

	public void setWidgetDeclarationList(List<WidgetsDeclaration> list) {
		this.widgetsDeclarationList = list;
	}

	@Override
	public String toString() {
		return "Children Property Declaration line: "+getLine() + " parent "+getParent()
				+" Child Count =  "+getChildCount()+" Type = "+getType()+"\n"
				+widgetsDeclarationList
				;
	}
}
