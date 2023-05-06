package visitors.DartVisitors;

import ast.NodeType;
import ast.navigation.Navigation;
import gen.dart_parse;
import visitors.dart_parseBaseVisitorChild;

public class NavigationVisitor extends dart_parseBaseVisitorChild {


    @Override
    public Navigation visitNavigation(dart_parse.NavigationContext ctx) {
        int line = ctx.start.getLine();
        String type = NodeType.Navigation.toString();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");

        int childCount = ctx.getChildCount();

        return new Navigation(ctx,ctx.STRING_LINE().getText());

    }
}
