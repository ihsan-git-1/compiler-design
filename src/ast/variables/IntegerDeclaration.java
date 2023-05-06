package ast.variables;

import ast.NodeType;
import ast.nodes.Node;
import gen.dart_parse;

public class IntegerDeclaration extends Identifier implements assignment {
    String name;

    public IntegerDeclaration(dart_parse.IntegerDeclarationContext ctx, String name) {
        super(ctx);
        this.name = name;
    }

    @Override
    public String toString() {
        return getLineString()+"Integer Declaration: " +name + " parent: "+ getParent()
                +" Child Count =  "+getChildCount()+" Type = "+ NodeType.INTEGERDECLARATION+"\n";
    }
}	
