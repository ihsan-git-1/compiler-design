package ast.nodes;

import java.util.ArrayList;
import java.util.List;

public class StatefullSecondBody {
	List<DartVariablesDeclaration> dartVariablesDeclarationList;
	BuildMethodDeclaration methodDecleration;
	String name;
	String stateName;
	
	public StatefullSecondBody(String name,String stateName,BuildMethodDeclaration methodDecleration) {
		this.name=name;
		this.stateName=stateName;
		this.methodDecleration=methodDecleration;
		this.dartVariablesDeclarationList=new ArrayList<>();
	}

	public List<DartVariablesDeclaration> getDartVariablesDeclarationList() {
		return dartVariablesDeclarationList;
	}

	
	@Override
	public String toString() {
		return  "\nclass "
				+name
				+" extends State<"
				+stateName
				+"> {\n"
				+methodDecleration
				+"\n}"
				;
	}
}
