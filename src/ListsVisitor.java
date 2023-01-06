import ast.nodes.DartAllListsDeclaration;
import ast.nodes.DartListBoolDeclaration;
import ast.nodes.DartListIntDeclaration;
import ast.nodes.DartListStringDeclaration;
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
		
		if (ctx.dartListStringDeclaration() != null) {
			DartAllListsDeclaration decl = new DartAllListsDeclaration(visitDartListStringDeclaration(ctx.dartListStringDeclaration()));
            return decl;
        }else if(ctx.dartListIntDeclaration() != null) {
        	DartAllListsDeclaration decl = new DartAllListsDeclaration(visitDartListIntDeclaration(ctx.dartListIntDeclaration()));
            return decl;
        }else if(ctx.dartListBoolDeclaration() != null) {
        	DartAllListsDeclaration decl = new DartAllListsDeclaration(visitDartListBoolDeclaration(ctx.dartListBoolDeclaration()));
            return decl;
        }else {
        	return null;
        }
	
	}

	@Override
	public DartListStringDeclaration visitDartListStringDeclaration(DartListStringDeclarationContext ctx) {

		String name = ctx.NAME().getText();
		List<String> dartListStringItems = new ArrayList<>();


		for(int i=7;i<ctx.getChildCount();i++){
			String strLine = ctx.getChild(i).getText();
			if((!strLine.equals("[")) && (!strLine.equals("]")) && (!strLine.equals(",")) && (!strLine.equals(";"))){
				dartListStringItems.add(strLine);
			}

		}
		DartListStringDeclaration dec = new DartListStringDeclaration(name);
		dec.setItemsList(dartListStringItems);
		return dec;
	}

	@Override
	public DartListIntDeclaration visitDartListIntDeclaration(DartListIntDeclarationContext ctx) {
		String name = ctx.NAME().getText();
		List<NumberClass> dartListIntItems = new ArrayList<>();

		for(int i=7;i<ctx.getChildCount();i++){
			NumberClass number = (NumberClass) ctx.getChild(i);
			if(){
				dartListIntItems.add(num);
			}
		}
		DartListIntDeclaration dec = new DartListIntDeclaration(name);
		dec.setItemsList(dartListIntItems);
		return dec;
	}

	@Override
	public DartListBoolDeclaration visitDartListBoolDeclaration(DartListBoolDeclarationContext ctx) {
		return null;
	}
	
}
