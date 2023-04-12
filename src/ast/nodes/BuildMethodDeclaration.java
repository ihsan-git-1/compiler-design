package ast.nodes;

import java.util.ArrayList;
import java.util.List;

public class BuildMethodDeclaration extends Node{
	BuildContextDeclaration context;
	List<DartDeclaration> dartDeclaration;
	WidgetsDeclaration widgets;
	
	public BuildMethodDeclaration(WidgetsDeclaration widgets,BuildContextDeclaration context,int line ,String parent,String type,int childCount) {
		super(line,parent, type, childCount);
		dartDeclaration = new ArrayList<>();
		this.widgets = widgets;
		this.context = context;
	}

	public List<DartDeclaration> getDartDeclarations() {
		return dartDeclaration;
	}


	@Override
	public String toString() {
		return "Build Method Declaration line: "+ getLine() + " parent "+ getParent()
				+" Child Count =  "+getChildCount()+" Type = "+getType()+"\n"
				+context
				+ dartDeclaration +"\n"
				+widgets+"\n"

				;
	}
}
