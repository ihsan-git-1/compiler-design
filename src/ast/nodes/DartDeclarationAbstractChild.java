package ast.nodes;

import gen.dart_parse;
import org.antlr.v4.runtime.ParserRuleContext;

public class DartDeclarationAbstractChild extends Node{

    public DartDeclarationAbstractChild(ParserRuleContext ctx){
        super(ctx);
    }

//    public String toString(){
//        return " line: " + getLine() + " parent: " + getParent();
//    }
}
