package ast.nodes;

import ast.NodeType;
import gen.dart_parse;

import java.util.ArrayList;
import java.util.List;

public class StatefullClassDeclaration extends AllClassesDeclarationAbstractChild {
	StatefullFirstBody firstBody;
	StatefullSecondBody secondBody;


	public StatefullClassDeclaration(StatefullFirstBody firstBody, StatefullSecondBody secondBody, dart_parse.StatefullClassDeclarationContext ctx){
		super(ctx);
		this.firstBody=firstBody;
		this.secondBody=secondBody;
	}

	@Override
	public String toString() {
		return getLineString()+"Statefull Class Declaration " + " parent "+getParent()
				+" Child Count =  "+getChildCount()+" Type = "+ NodeType.BLOCK+"\n"+
				firstBody+
				secondBody
				;
	}
}
