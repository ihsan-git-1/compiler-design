package ast.nodes;

import gen.dart_parse;
import org.antlr.v4.runtime.ParserRuleContext;

public abstract class ContainerPropertiesDeclarationAbstractChild extends Node{


    public ContainerPropertiesDeclarationAbstractChild(dart_parse.ChildPropertyDeclarationContext ctx) {
        super(ctx);
    }
    public ContainerPropertiesDeclarationAbstractChild(dart_parse.WidthPropertyDeclarationContext ctx) {
        super(ctx);
    }
    public ContainerPropertiesDeclarationAbstractChild(dart_parse.HeightPropertyDeclarationContext ctx) {
        super(ctx);
    }

}
