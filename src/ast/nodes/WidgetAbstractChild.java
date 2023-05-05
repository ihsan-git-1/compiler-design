package ast.nodes;

import gen.dart_parse;
import org.antlr.v4.runtime.ParserRuleContext;

public abstract class WidgetAbstractChild extends Node{

    public WidgetAbstractChild(dart_parse.TextDeclarationContext ctx) {
        super(ctx);
    }
    public WidgetAbstractChild(dart_parse.ImageDeclarationContext ctx) {
        super(ctx);
    }
}
