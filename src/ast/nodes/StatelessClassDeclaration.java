package ast.nodes;

import ast.NodeType;
import gen.dart_parse;

import java.util.ArrayList;
import java.util.List;

public class StatelessClassDeclaration extends AllClassesDeclarationAbstractChild {

List<DartDeclaration> dartDeclarationList;
BuildMethodDeclaration methodDecleration;
String name;


	public StatelessClassDeclaration(String name, BuildMethodDeclaration methodDeclaration,dart_parse.StatelessClassDeclarationContext ctx) {
		super(ctx);
		this.name = name;
		this.dartDeclarationList = new ArrayList<>();
		this.methodDecleration = methodDeclaration;
	}
	

	public List<DartDeclaration> getDartDeclarationList() {
		return dartDeclarationList;
	}


	@Override
	public String toString() {
		return  getLineString()+"Stateless Class Declaration Name "+name+ " parent "+ getParent()
				+" Child Count =  "+getChildCount()+" Type = "+ NodeType.CLASS +"\n"
				+ dartDeclarationList
				+"\n"
				+methodDecleration
				+"\n"
				;
	}
}
