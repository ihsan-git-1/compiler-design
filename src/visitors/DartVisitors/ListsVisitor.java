package visitors.DartVisitors;

import ast.NodeType;
import ast.SymbolTableObject;
import ast.nodes.DartAllListsDeclaration;
import ast.nodes.DartListBoolDeclaration;
import ast.nodes.DartListIntDeclaration;
import ast.nodes.DartListStringDeclaration;
import ast.variables.BooleanValueClass;
import ast.variables.NumberClass;
import gen.dart_parse.DartAllListsDeclarationContext;
import gen.dart_parse.DartListBoolDeclarationContext;
import gen.dart_parse.DartListIntDeclarationContext;
import gen.dart_parse.DartListStringDeclarationContext;
import visitors.dart_parseBaseVisitorChild;

import java.util.ArrayList;
import java.util.List;

public class ListsVisitor extends dart_parseBaseVisitorChild {

	@Override
	public DartAllListsDeclaration visitDartAllListsDeclaration(DartAllListsDeclarationContext ctx) {


		if (ctx.dartListStringDeclaration() != null) {
			return new DartAllListsDeclaration(ctx,visitDartListStringDeclaration(ctx.dartListStringDeclaration()));
		}else if(ctx.dartListIntDeclaration() != null) {
			return new DartAllListsDeclaration(ctx,visitDartListIntDeclaration(ctx.dartListIntDeclaration()));
		}else if(ctx.dartListBoolDeclaration() != null) {
			return new DartAllListsDeclaration(ctx,visitDartListBoolDeclaration(ctx.dartListBoolDeclaration()));
		}else {
			return null;
		}

	}

	@Override
	public DartListStringDeclaration visitDartListStringDeclaration(DartListStringDeclarationContext ctx) {


		int column = ctx.STRING().getSymbol().getCharPositionInLine() + 1;

		String name = ctx.NAME().getText();
		int errorLine = ctx.start.getLine();

		if(CheckExistanceInScope(name,index)){
			semanticErrors.add("The name " + name + " already defined (" + errorLine + "," + column + ")");
		}else{
			scopes.get(index - 1).getSymbolMap().put(name, new SymbolTableObject(NodeType.LIST.toString(), name));

		}
		List<String> dartListStringItems = new ArrayList<>();
		for(int i=7;i<ctx.getChildCount();i++){
			String strLine = ctx.getChild(i).getText();
			if((!strLine.equals("[")) && (!strLine.equals("]")) && (!strLine.equals(",")) && (!strLine.equals(";"))){
				dartListStringItems.add(strLine);
			}
		}
		DartListStringDeclaration dec = new DartListStringDeclaration(ctx,name);
		dec.setItemsList(dartListStringItems);
		return dec;

	}

	@Override
	public DartListIntDeclaration visitDartListIntDeclaration(DartListIntDeclarationContext ctx) {

		int column = ctx.NAME().getSymbol().getCharPositionInLine() + 1;

		String name = ctx.NAME().getText();
		List<NumberClass> dartListIntItems = new ArrayList<>();

		int errorLine = ctx.start.getLine();

		if(CheckExistanceInScope(name,index)){
			semanticErrors.add("The name " + name + " already defined (" + errorLine + "," + column + ")");
		}else{
			scopes.get(index - 1).getSymbolMap().put(name, new SymbolTableObject(NodeType.LIST.toString(), name));
		}
		for(int i=7;i<ctx.getChildCount();i++){
			String str = ctx.getChild(i).getText();
			if(!str.equals(",") && !str.equals("]") && !str.equals(";")) {
				try {

					NumberClass number = new NumberClass(ctx,Integer.parseInt(ctx.getChild(i).getText()));
					dartListIntItems.add(number);
				} catch (Exception e) {

				}
			}
		}

		DartListIntDeclaration dec = new DartListIntDeclaration(ctx,name);
		dec.setItemsList(dartListIntItems);
		return dec;
	}

	@Override
	public DartListBoolDeclaration visitDartListBoolDeclaration(DartListBoolDeclarationContext ctx) {

		int column = ctx.NAME().getSymbol().getCharPositionInLine() + 1;

		String name = ctx.NAME().getText();
		List<BooleanValueClass> dartListBoolItems = new ArrayList<>();

		for(int i=7;i<ctx.getChildCount();i++){
			String str = ctx.getChild(i).getText();

			if(!str.equals(",") && !str.equals("]") && !str.equals(";")) {

				try {
					BooleanValueClass b = new BooleanValueClass(ctx,Boolean.parseBoolean(ctx.getChild(i).getText()));
					dartListBoolItems.add(b);
				} catch (Exception e) {

				}
			}
		}
		int errorLine = ctx.start.getLine();

		if(CheckExistanceInScope(name,index)){
			semanticErrors.add("The name " + name + " already defined (" + errorLine + "," + column + ")");
		}else{
			scopes.get(index - 1).getSymbolMap().put(name, new SymbolTableObject(NodeType.LIST.toString(), name));
		}


		DartListBoolDeclaration dec = new DartListBoolDeclaration(ctx,name);
		dec.setItemsList(dartListBoolItems);
		return dec;
	}

}
