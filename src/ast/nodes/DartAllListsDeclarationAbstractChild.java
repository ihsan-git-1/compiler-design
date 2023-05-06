package ast.nodes;

import gen.dart_parse;

public abstract class DartAllListsDeclarationAbstractChild extends Node{
    public DartAllListsDeclarationAbstractChild(dart_parse.DartListStringDeclarationContext ctx){
        super(ctx);
    }
    public DartAllListsDeclarationAbstractChild(dart_parse.DartListBoolDeclarationContext ctx){
        super(ctx);
    }
    public DartAllListsDeclarationAbstractChild(dart_parse.DartListIntDeclarationContext ctx){
        super(ctx);
    }
}
