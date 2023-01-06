package ast.nodes;

import java.util.List;

public class BuildMethodDeclaration {
	BuildContextDeclaration context;
	List<DartVariablesDeclaration> dartVaraibles;
	List<WidgetsDeclaration> widgets;
	
	public BuildMethodDeclaration(BuildContextDeclaration context) {
		this.context=context;
	}
	
	public void addDartVariables(DartVariablesDeclaration variable) {
		dartVaraibles.add(variable);
	}
	
	public void addWidgets(WidgetsDeclaration widget) {
		widgets.add(widget);
	}
	
	public List<DartVariablesDeclaration> getDartVariables() {
		return dartVaraibles;
	}

	public void setDartVariables(List<DartVariablesDeclaration> dartVaraibles) {
		this.dartVaraibles = dartVaraibles;
	}
	
	public List<WidgetsDeclaration> getWidgets() {
		return widgets;
	}

	public void setWidgets(List<WidgetsDeclaration> widgets) {
		this.widgets = widgets;
	}
	
	
}
