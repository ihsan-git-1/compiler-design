package ast.nodes;

import java.util.ArrayList;
import java.util.List;

public class StatefullClassDeclaration extends AllClassesDeclarationAbstractChild {
	StatefullFirstBody firstBody;
	StatefullSecondBody secondBody;
	
	
	public StatefullClassDeclaration(StatefullFirstBody firstBody,StatefullSecondBody secondBody){
		this.firstBody=firstBody;
		this.secondBody=secondBody;
	}

	@Override
	public String toString() {
		return ""
				+firstBody
				+secondBody
				;
	}
}
