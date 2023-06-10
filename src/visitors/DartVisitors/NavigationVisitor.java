package visitors.DartVisitors;

import ast.navigation.Navigation;
import ast.navigation.OnPressedArguments;
import gen.dart_parse;
import visitors.dart_parseBaseVisitorChild;

public class NavigationVisitor extends dart_parseBaseVisitorChild {

    @Override
    public Navigation visitNavigation(dart_parse.NavigationContext ctx) {
        OnPressedArguments args = new OnPressedArguments(ctx);

        Navigation navigation = new Navigation(ctx,args);

        return navigation;

    }
}
