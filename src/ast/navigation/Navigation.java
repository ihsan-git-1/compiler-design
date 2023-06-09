package ast.navigation;

import ast.NodeType;
import ast.nodes.DartDeclarationAbstractChild;
import gen.dart_parse;

public class Navigation extends DartDeclarationAbstractChild {


    String class_name;
    String url;

    public String getClassName() {
        return class_name;
    }

    public String getURL() {
        return url;
    }
    public Navigation(dart_parse.NavigationContext ctx, String name,String url) {
        super(ctx);
        this.class_name = class_name;
        this.url = url;
    }

    public String toString() {
        return  getLineString()+"Navigation Declaration: value: "+ class_name + " parent: "+ getParent()
                +" Child Count =  "+getChildCount()+" Type = "+ NodeType.Navigation+"\n";
    }

}
