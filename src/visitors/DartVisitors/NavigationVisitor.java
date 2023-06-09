package visitors.DartVisitors;

import ast.navigation.Navigation;
import gen.dart_parse;
import visitors.dart_parseBaseVisitorChild;

public class NavigationVisitor extends dart_parseBaseVisitorChild {

    @Override
    public Navigation visitNavigation(dart_parse.NavigationContext ctx) {

        Navigation navigation = new Navigation(ctx,ctx.NAME().getText(),ctx.STRING_LINE().getText());

        return navigation;

    }
}
