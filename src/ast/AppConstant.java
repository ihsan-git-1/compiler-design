package ast;

import java.util.ArrayList;
import java.util.Arrays;

public class AppConstant {

    static ArrayList<String> extra_files = new ArrayList<>();

    public static String getExtraFiles() {
        return Arrays.toString(extra_files.toArray()).replace("[", "").replace("]", "").replace(",","");
    }

    public static void addExtraFile(String file){
        extra_files.add(file);
    }

    public static String getHtmlHeader(){
        return "<!DOCTYPE html>\n" +
                "<html lang=\'en\'>\n " +
                "<head>\n " +
                "<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css\" " +
                "rel=\"stylesheet\" " +
                "integrity=\"sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65\"" +
                " crossorigin=\"anonymous\">\n " +
                "<title>Compiler</title>\n  " +
                "<meta charset=\'utf-8\'>\n  " +
                "<style>\n  " +
                "</style>\n" +
                " </head>\n " +
                "<body>\n"
                ;
    }
    public static String getHtmlFooter(){
        return "</body>\n" +
                "<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js\" " +
                "integrity=\"sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4\" " +
                "crossorigin=\"anonymous\"></script>\n" +
                "<script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.0/jquery.min.js\" " +
                "integrity=\"sha512-3gJwYpMe3QewGELv8k/BX9vcqhryRdzRMxVfq6ngyWXwo03GFEzjsUm8Q7RZcHPHksttq7/GFoxjCVUjkjvPdw==\" " +
                "crossorigin=\"anonymous\"" +
                " referrerpolicy=\"no-referrer\">" +
                "</script>\n"
                ;
    }
}
