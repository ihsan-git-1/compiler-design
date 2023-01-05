package ast.variables;
import ast.nodes.DartVariablesDeclarationAbstractChild;

public class Variable extends DartVariablesDeclarationAbstractChild{
	VariableDeclaration declaration;
	
	public Variable(VariableDeclaration declaration) {
		this.declaration=declaration;
	}
}
