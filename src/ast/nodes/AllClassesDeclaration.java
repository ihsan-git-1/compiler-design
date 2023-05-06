package ast.nodes;


import org.antlr.v4.runtime.ParserRuleContext;

public class AllClassesDeclaration extends Node{
	AllClassesDeclarationAbstractChild child;
	
	public AllClassesDeclaration(AllClassesDeclarationAbstractChild child, ParserRuleContext parserRuleContext) {
		super(parserRuleContext);
		this.child=child;
	}
	
	
	public String toString() {

		return "All Classes Declaration line: "+ getLine() + "parent "+ getParent()
				+" Child Count =  "+getChildCount()+" Type = "+"All class dec"+"\n"+
				child
				;
	}
}
