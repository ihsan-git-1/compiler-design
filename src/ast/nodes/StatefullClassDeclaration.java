package ast.nodes;

import java.util.ArrayList;
import java.util.List;

public class StatefullClassDeclaration extends AllClassesDeclarationAbstractChild {
	StatefullFirstBody firstBody;
	StatefullSecondBody secondBody;
	
	
	public StatefullClassDeclaration(StatefullFirstBody firstBody,StatefullSecondBody secondBody,int line,String parent){
		super(line,parent);
		this.firstBody=firstBody;
		this.secondBody=secondBody;
	}

	@Override
	public String toString() {
		return "Statefull Class Declaration line: "+getLine() + " parent "+getParent()+"\n"+
				firstBody+
				secondBody
				;
	}
}
