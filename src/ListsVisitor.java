import ast.nodes.DartAllListsDeclaration;
import ast.nodes.DartListBoolDeclaration;
import ast.nodes.DartListIntDeclaration;
import ast.nodes.DartListStringDeclaration;
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
		String strLine = ctx.getChild(7).getText();

		if(!strLine.isEmpty()){
			dartListStringItems.add(strLine);
		}
		for(int i=8;i<ctx.getChildCount();i++){
			System.out.println(ctx.getChild(i).getText());
			if(ctx.getChild(i).equals(ctx.STRING_LINE())){
				System.out.println(true);
				dartListStringItems.add(ctx.getChild(i).getText());
			}
		}
		DartListStringDeclaration dec = new DartListStringDeclaration(name);
		dec.setItemsList(dartListStringItems);
		return dec;
	}

	@Override
	public DartListIntDeclaration visitDartListIntDeclaration(DartListIntDeclarationContext ctx) {
		return null;
	}

	@Override
	public DartListBoolDeclaration visitDartListBoolDeclaration(DartListBoolDeclarationContext ctx) {
		return null;
	}
	
}
