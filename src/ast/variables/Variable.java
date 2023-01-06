package ast.variables;
import ast.nodes.DartVariablesDeclarationAbstractChild;

public class Variable extends DartVariablesDeclarationAbstractChild{
	VariableDeclaration declaration;
	
	public Variable(VariableDeclaration declaration) {
		this.declaration = declaration;
	}

	@Override
	public String toString() {
		return "Variable "
				+"\n|\n"
				+ declaration
				;
	}
}
