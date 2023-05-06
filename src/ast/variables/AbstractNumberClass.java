package ast.variables;

import ast.nodes.Node;
import org.antlr.v4.runtime.ParserRuleContext;

public abstract class AbstractNumberClass extends Node {

    public AbstractNumberClass(ParserRuleContext parserRuleContext) {
        super(parserRuleContext);
    }
}
