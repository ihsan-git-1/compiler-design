package ast.nodes;

import java.util.ArrayList;
import java.util.List;

public class BuildMethodDeclaration {
	BuildContextDeclaration context;
	List<DartVariablesDeclaration> dartVaraibles;
	WidgetsDeclaration widgets;
	
	public BuildMethodDeclaration(WidgetsDeclaration widgets,BuildContextDeclaration context) {
		dartVaraibles = new ArrayList<>();
		this.widgets = widgets;
		this.context = context;
	}

	public List<DartVariablesDeclaration> getDartVariables() {
		return dartVaraibles;
	}


	@Override
	public String toString() {
		return "Widget build("+context+")" +"{"
				+dartVaraibles
				+"\nreturn "+widgets
				+"}\n"
				;
	}
}
