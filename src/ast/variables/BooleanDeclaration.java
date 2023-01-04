package ast.variables;

import org.antlr.v4.runtime.tree.TerminalNode;

public class BooleanDeclaration {
	String name;
	TerminalNode bool;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TerminalNode getBool() {
		return bool;
	}

	public void setBool(TerminalNode bool) {
		this.bool = bool;
	}

	public BooleanDeclaration(String name) {
		this.name=name;
	}
	
	public BooleanDeclaration(String name, TerminalNode bool) {
		this.name=name;
		this.bool=bool;
	}
}
