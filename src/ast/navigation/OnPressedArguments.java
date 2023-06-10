package ast.navigation;

import gen.dart_parse;

import java.util.ArrayList;
import java.util.Arrays;

public class OnPressedArguments {
    public ArrayList<String> arguments;

    public ArrayList<String> get_arguments(dart_parse.NavigationContext ctx){
        String[] exclude_strings={",", "]", "[", ";", ")", "("};

        ArrayList<String> arguments = new ArrayList<>();

        arguments.add(ctx.getChild(2).getText());

        for (int i = 7; i < ctx.getChildCount(); i++) {
            if (Arrays.asList(exclude_strings).contains(ctx.getChild(i).getText()))
                continue;
            else
                arguments.add(ctx.getChild(i).getText());
        }
        return arguments;
    }

    public OnPressedArguments(dart_parse.NavigationContext ctx){
        this.arguments = get_arguments(ctx);
    }
}
