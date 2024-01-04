package ast;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class AppConstant {

    static ArrayList<String> extra_files = new ArrayList<>();
    public static String addNavigationScriptAfterBuild="";

    public static String getExtraFiles() {
        return Arrays.toString(extra_files.toArray()).replace("[", "").replace("]", "").replace(",","");
    }

    public static void addExtraFile(String file){
        extra_files.add(file);
    }

    public static void emptyExtraFiles(){
        extra_files.clear();
    }
    public static String getHtmlHeader(){
        return "<!DOCTYPE html>\n" +
                "<html lang='en'>\n " +
                "<head>\n " +
                "<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css\" " +
                "rel=\"stylesheet\" " +
                "integrity=\"sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65\"" +
                " crossorigin=\"anonymous\">\n " +
                "<title>Compiler</title>\n  " +
                "<meta charset='utf-8'>\n  " +
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

    public static void addNavigationScriptToHtml(String fileName){
        String htmlFilePath = "src/CodeGeneration/"+fileName+".html";

        String scriptCode = "$(document).ready(function(){\n"
                + "    var url = getUrlParameter('image_url');\n"
                + "    var desc = getUrlParameter('image_description');\n"
                + "    $('img').attr('src',url);\n"
                + "    $('p').text(desc);\n"
                + "});\n\n"
                + "var getUrlParameter = function getUrlParameter(sParam) {\n"
                + "    var sPageURL = window.location.search.substring(1),\n"
                + "        sURLVariables = sPageURL.split('&'),\n"
                + "        sParameterName,\n"
                + "        i;\n\n"
                + "    for (i = 0; i < sURLVariables.length; i++) {\n"
                + "        sParameterName = sURLVariables[i].split('=');\n\n"
                + "        if (sParameterName[0] === sParam) {\n"
                + "            return sParameterName[1] === undefined ? true : decodeURIComponent(sParameterName[1]);\n"
                + "        }\n"
                + "    }\n\n"
                + "    return false;\n"
                + "};";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(htmlFilePath));
            StringBuilder htmlContent = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                htmlContent.append(line).append("\n");
            }
            reader.close();

            int indexOfClosingHtmlTag = htmlContent.lastIndexOf("</html>");
            if (indexOfClosingHtmlTag != -1) {
                htmlContent.insert(indexOfClosingHtmlTag, "<script>\n" + scriptCode + "</script>\n");
            }


            BufferedWriter writer = new BufferedWriter(new FileWriter(htmlFilePath));
            writer.write(htmlContent.toString());
            writer.close();

        } catch (IOException e) {}
    }

    public static void addExtraFileAfterBuild(){
        if(!addNavigationScriptAfterBuild.isEmpty()){
            addNavigationScriptToHtml(addNavigationScriptAfterBuild);
            addNavigationScriptAfterBuild="";
        }
    }
}
