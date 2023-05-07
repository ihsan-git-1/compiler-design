package ast.nodes;


import gen.dart_parse;

public abstract class AllClassesDeclarationAbstractChild  extends Node{
    public AllClassesDeclarationAbstractChild(dart_parse.ClassDeclarationContext ctx){
        super(ctx);
    }


    public AllClassesDeclarationAbstractChild(dart_parse.StatefullClassDeclarationContext ctx){
        super(ctx);
    }

    public AllClassesDeclarationAbstractChild(dart_parse.StatelessClassDeclarationContext ctx){
        super(ctx);
    }

//    @Override
//    public String generate_code() {
//        if(ctx instanceof )
//    }
}
