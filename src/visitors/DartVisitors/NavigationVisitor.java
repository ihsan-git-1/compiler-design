package visitors.DartVisitors;

import ast.navigation.Navigation;
import gen.dart_parse;
import visitors.dart_parseBaseVisitorChild;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class NavigationVisitor extends dart_parseBaseVisitorChild {


    @Override
    public Navigation visitNavigation(dart_parse.NavigationContext ctx) {

        Navigation navigation = new Navigation(ctx,ctx.NAME().getText());

        System.out.println(navigation.getName());

        String htmlFilePath = "src/tests/CodeGeneration/"+navigation.getName()+".html";

        File htmlFile = new File(htmlFilePath);

        if (Desktop.isDesktopSupported()) {
            Desktop desktop = Desktop.getDesktop();
            if (htmlFile.exists()) {
                try {
                    String name = "John";
                    String url = htmlFile.toURI().toString() + "?name=asdas";
                    System.out.println("URL: " + url);

                    // Open the URL in the default browser
                    desktop.browse(new URI(url));
                } catch (IOException e ) {
                    System.out.println("Can't launch html files");
                } catch (URISyntaxException e) {
                    e.printStackTrace();
                }
            }
            else{
                System.out.println("file not found");
            }
        }

        return navigation;

    }
}
