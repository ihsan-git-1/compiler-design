package ast.navigation;

import ast.NodeType;
import ast.nodes.DartDeclarationAbstractChild;
import gen.dart_parse;

public class Navigation extends DartDeclarationAbstractChild {


    String name;

    public Navigation(dart_parse.NavigationContext ctx, String name) {
        super(ctx);
        this.name = name;
    }

    public String toString() {
        return  getLineString()+"Navigation Declaration: value: "+ name + " parent: "+ getParent()
                +" Child Count =  "+getChildCount()+" Type = "+ NodeType.Navigation+"\n";
    }

}
