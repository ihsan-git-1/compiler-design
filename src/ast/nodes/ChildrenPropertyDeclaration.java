package ast.nodes;

import java.util.ArrayList;
import java.util.List;

public class ChildrenPropertyDeclaration {
	List<WidgetsDeclaration> widgetsDeclarationList;
	
	public ChildrenPropertyDeclaration() {
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
		return "children: \n"
				+widgetsDeclarationList
				+"\n"
				;
	}
}
