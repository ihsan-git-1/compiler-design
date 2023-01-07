package ast.nodes;

import java.util.ArrayList;
import java.util.List;

public class BuildMethodDeclaration extends Node{
	BuildContextDeclaration context;
	List<DartVariablesDeclaration> dartVaraibles;
	WidgetsDeclaration widgets;
	
	public BuildMethodDeclaration(WidgetsDeclaration widgets,BuildContextDeclaration context,int line ,String parent) {
		super(line,parent);
		dartVaraibles = new ArrayList<>();
		this.widgets = widgets;
		this.context = context;
	}

	public List<DartVariablesDeclaration> getDartVariables() {
		return dartVaraibles;
	}


	@Override
	public String toString() {
		return "Build Method Declaration line: "+ getLine() + " parent "+ getParent()
				+" Child Count =  "+getChildCount()+" Type = "+getType()+"\n"
				+context
				+dartVaraibles+"\n"
				+widgets+"\n"

				;
	}
}
