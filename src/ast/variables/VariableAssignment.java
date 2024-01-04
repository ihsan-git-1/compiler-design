package ast.variables;

import org.antlr.v4.runtime.ParserRuleContext;

public abstract class VariableAssignment extends VariableDeclaration {

    public VariableAssignment(ParserRuleContext parserRuleContext) {
        super(parserRuleContext);
    }
}
