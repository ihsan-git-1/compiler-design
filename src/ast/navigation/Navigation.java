package ast.navigation;

import ast.NodeType;
import ast.nodes.DartDeclarationAbstractChild;
import gen.dart_parse;

public class Navigation extends DartDeclarationAbstractChild {

OnPressedArguments arguments;

    public Navigation(dart_parse.NavigationContext ctx, OnPressedArguments arguments) {
        super(ctx);
        this.arguments=arguments;
    }

    public String toString() {
        return  getLineString()+"Navigation Declaration: value: "+ arguments.arguments.get(0) + " parent: "+ getParent()
                +" Child Count =  "+getChildCount()+" Type = "+ NodeType.Navigation+"\n";
    }

}
