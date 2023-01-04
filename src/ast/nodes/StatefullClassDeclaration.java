package ast.nodes;

import java.util.ArrayList;
import java.util.List;

public class StatefullClassDeclaration extends AllClassesDeclarationAbstractChild {
	StatefullFirstBody firstBody;
	StatefullSecondBody secondBody;
	
	
	StatefullClassDeclaration(StatefullFirstBody firstBody,StatefullSecondBody secondBody){
		this.firstBody=firstBody;
		this.secondBody=secondBody;
	}
}
