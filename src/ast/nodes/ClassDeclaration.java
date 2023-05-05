package ast.nodes;

import ast.NodeType;
import gen.dart_parse;

import java.util.List;
import java.util.ArrayList;

public class ClassDeclaration extends AllClassesDeclarationAbstractChild {
	List<DartDeclaration> dartDeclarationList;
	String name;

	public List<DartDeclaration> getDartDeclarationList() {
		return dartDeclarationList;
	}

	public ClassDeclaration(String name, dart_parse.ClassDeclarationContext ctx){
		super(ctx);
		this.name = name;
		this.dartDeclarationList =new ArrayList<>();

	}
	
	@Override
	public String toString() {
		return  getLineString()+"Class Declaration Name is "+name+", parent "+getParent()
				+", Child Count =  "+getChildCount()+", Type = "+ NodeType.CLASS +"\n"+
				dartDeclarationList
				;
	}
}
