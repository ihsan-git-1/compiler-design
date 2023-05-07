package ast.nodes;


import org.antlr.v4.runtime.ParserRuleContext;

public class AllClassesDeclaration extends Node{
	AllClassesDeclarationAbstractChild child;
	
	public AllClassesDeclaration(AllClassesDeclarationAbstractChild child, ParserRuleContext parserRuleContext) {
		super(parserRuleContext);
		this.child=child;
	}
	
	
	public String toString() {

		return getLineString()+"All Classes Declaration " + "parent "+ getParent()
				+" Child Count =  "+getChildCount()+" Type = "+"All class dec"+"\n"+
				child
				;
	}

	public String generate_code(){
		return child.generate_code();
	}
}
