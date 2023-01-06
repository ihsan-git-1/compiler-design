package ast.nodes;

import java.util.List;

public class BuildMethodDeclaration {
	BuildContextDeclaration context;
	List<DartVariablesDeclaration> dartVaraibles;
	List<WidgetDeclaration> widgets;
	
	public BuildMethodDeclaration(BuildContextDeclaration context) {
		this.context=context;
	}
	
	public void addDartVariables(DartVariablesDeclaration variable) {
		dartVaraibles.add(variable);
	}
	
	public void addWidgets(WidgetDeclaration widget) {
		widgets.add(widget);
	}
	
	public List<DartVariablesDeclaration> getDartVariables() {
		return dartVaraibles;
	}

	public void setDartVariables(List<DartVariablesDeclaration> dartVaraibles) {
		this.dartVaraibles = dartVaraibles;
	}
	
	public List<WidgetDeclaration> getWidgets() {
		return widgets;
	}

	public void setWidgets(List<WidgetDeclaration> widgets) {
		this.widgets = widgets;
	}
	
	
}
