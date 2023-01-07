import ast.nodes.DartAllListsDeclaration;
import ast.nodes.DartListBoolDeclaration;
import ast.nodes.DartListIntDeclaration;
import ast.nodes.DartListStringDeclaration;
import ast.variables.BooleanValueClass;
import ast.variables.NumberClass;
import ast.variables.Variable;
import gen.dart_parse.DartAllListsDeclarationContext;
import gen.dart_parse.DartListBoolDeclarationContext;
import gen.dart_parse.DartListIntDeclarationContext;
import gen.dart_parse.DartListStringDeclarationContext;
import gen.dart_parseBaseVisitor;

import java.util.ArrayList;
import java.util.List;

public class ListsVisitor extends dart_parseBaseVisitor{

	@Override
	public DartAllListsDeclaration visitDartAllListsDeclaration(DartAllListsDeclarationContext ctx) {

		int line = ctx.start.getLine();
		String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$","").replace("Context","");

		if (ctx.dartListStringDeclaration() != null) {
			DartAllListsDeclaration decl = new DartAllListsDeclaration(visitDartListStringDeclaration(ctx.dartListStringDeclaration()),line,parent);
			return decl;
		}else if(ctx.dartListIntDeclaration() != null) {
			DartAllListsDeclaration decl = new DartAllListsDeclaration(visitDartListIntDeclaration(ctx.dartListIntDeclaration()),line,parent);
			return decl;
		}else if(ctx.dartListBoolDeclaration() != null) {
			DartAllListsDeclaration decl = new DartAllListsDeclaration(visitDartListBoolDeclaration(ctx.dartListBoolDeclaration()),line,parent);
			return decl;
		}else {
			return null;
		}

	}

	@Override
	public DartListStringDeclaration visitDartListStringDeclaration(DartListStringDeclarationContext ctx) {

		int line = ctx.start.getLine();
		String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$","").replace("Context","");

		String name = ctx.NAME().getText();
		List<String> dartListStringItems = new ArrayList<>();
		for(int i=7;i<ctx.getChildCount();i++){
			String strLine = ctx.getChild(i).getText();
			if((!strLine.equals("[")) && (!strLine.equals("]")) && (!strLine.equals(",")) && (!strLine.equals(";"))){
				dartListStringItems.add(strLine);
			}
		}
		DartListStringDeclaration dec = new DartListStringDeclaration(name,line,parent);
		dec.setItemsList(dartListStringItems);
		return dec;
	}

	@Override
	public DartListIntDeclaration visitDartListIntDeclaration(DartListIntDeclarationContext ctx) {
		int line = ctx.start.getLine();
		String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$","").replace("Context","");
		String name = ctx.NAME().getText();
		List<NumberClass> dartListIntItems = new ArrayList<>();

		for(int i=7;i<ctx.getChildCount();i++){
			String str = ctx.getChild(i).getText();
			if(!str.equals(",") && !str.equals("]") && !str.equals(";")) {
				try {
					int numLine = ctx.start.getLine();
					String numParent = ctx.getParent().getClass().getName().replace("gen.dart_parse$","").replace("Context","");
					NumberClass number = new NumberClass(Integer.parseInt(ctx.getChild(i).getText()), line, parent);
					dartListIntItems.add(number);
				} catch (Exception e) {

				}
			}
		}
		DartListIntDeclaration dec = new DartListIntDeclaration(name,line,parent);
		dec.setItemsList(dartListIntItems);
		return dec;
	}

	@Override
	public DartListBoolDeclaration visitDartListBoolDeclaration(DartListBoolDeclarationContext ctx) {
		int line = ctx.start.getLine();
		String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$","").replace("Context","");
		String name = ctx.NAME().getText();
		List<BooleanValueClass> dartListBoolItems = new ArrayList<>();

		for(int i=7;i<ctx.getChildCount();i++){
			String str = ctx.getChild(i).getText();

			if(!str.equals(",") && !str.equals("]") && !str.equals(";")) {

				try {
					int boolLine = ctx.start.getLine();
					String boolParent = ctx.getParent().getClass().getName().replace("gen.dart_parse$","").replace("Context","");
					BooleanValueClass b = new BooleanValueClass(Boolean.parseBoolean(ctx.getChild(i).getText()), line, parent);
					dartListBoolItems.add(b);
				} catch (Exception e) {

				}
			}
		}

		DartListBoolDeclaration dec = new DartListBoolDeclaration(name,line,parent);
		dec.setItemsList(dartListBoolItems);
		return dec;
	}

}
