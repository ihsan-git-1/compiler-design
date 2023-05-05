package ast.nodes;

import gen.dart_parse;

public class DartDeclarationAbstractChild extends Node{

    public DartDeclarationAbstractChild(dart_parse.FunctionContext ctx){
        super(ctx);
    }

//    public String toString(){
//        return " line: " + getLine() + " parent: " + getParent();
//    }
}
