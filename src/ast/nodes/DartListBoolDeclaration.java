package ast.nodes;

import java.util.ArrayList;
import java.util.List;

import ast.NodeType;
import ast.variables.BooleanValueClass;
import gen.dart_parse;

public class DartListBoolDeclaration extends DartAllListsDeclarationAbstractChild{
	String name;
	List<BooleanValueClass> itemsList;
	
	public DartListBoolDeclaration(dart_parse.DartListBoolDeclarationContext ctx, String name) {
		super(ctx);
		this.name = name;
		this.itemsList=new ArrayList<>();
	}
	
	public List<BooleanValueClass> getListItem(){
		return itemsList;
	}
	
	public void setItemsList(List<BooleanValueClass> list) {
		this.itemsList =  list;
	}

	public void printList(List<BooleanValueClass> list){
		for(BooleanValueClass item:list){
			System.out.print(item);
			System.out.print(" ");
		}
	}

	@Override
	public String toString() {
		String var = getLineString()+"Dart Bool List "+ name +" parent "+getParent()+" Child Count =  "+getChildCount()+" Type = "+ NodeType.LIST;
		System.out.print(var);
		System.out.print(" List Items are ");
		printList(this.itemsList);
		return  "" ;
	}
}
