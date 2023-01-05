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
	
}
