package ast.nodes;

import java.util.ArrayList;
import java.util.List;

public class StatefullFirstBody {
	List<DartVariablesDeclaration> dartVariablesDeclarationList;
	StatefullAssignStateClassDeclaration dec;
	String name;
	
	public StatefullFirstBody(String name,StatefullAssignStateClassDeclaration dec) {
		this.name = name;
		this.dec = dec;
		this.dartVariablesDeclarationList=new ArrayList<>();
	}

	public List<DartVariablesDeclaration> getDartVariablesDeclarationList() {
		return dartVariablesDeclarationList;
	}

	@Override
	public String toString() {

		return  "\nclass "
				+name
				+" extends StatefulWidget {"
				+dartVariablesDeclarationList
				+"\n"
				+dec
				;
	}
}
