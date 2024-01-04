package ast.variables;

import ast.nodes.DartDeclarationAbstractChild;
import gen.dart_parse;

public class Variable extends DartDeclarationAbstractChild {
    VariableDeclaration declaration;

    public Variable(dart_parse.VariableContext ctx, VariableDeclaration declaration) {
        super(ctx);
        this.declaration = declaration;
    }

    @Override
    public String toString() {
        return declaration.toString();
    }
}
