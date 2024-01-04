package ast.variables;

import gen.dart_parse;

public class DoubleDeclaration extends Identifier implements assignment {
    String name;

    public DoubleDeclaration(dart_parse.DoubleDeclarationContext ctx , String name) {
        super(ctx);
        this.name = name;
    }
}
