package ast.variables;

import ast.nodes.Node;
import org.antlr.v4.runtime.ParserRuleContext;

public abstract class VariableDeclaration extends Node {

    public VariableDeclaration(ParserRuleContext parserRuleContext) {
        super(parserRuleContext);
    }
}
