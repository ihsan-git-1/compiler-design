package ast.nodes;

import org.antlr.v4.runtime.ParserRuleContext;

public class Node {

    public int line;
    public int col;


    public int childCount;
    public String parent;
    ParserRuleContext parserRuleContext;

//    public Node(int line,String parent,String type,int childCount){
//        this.line=line;
//        this.parent=parent;
//        this.type=type;
//        this.childCount=childCount;
//    }
    public Node(ParserRuleContext parserRuleContext){
     this.parserRuleContext = parserRuleContext;
    }
    public void setLine(int line) {
        this.line = line;
    }


    public int getLine() {
        try{
            return parserRuleContext.start.getLine();
        }catch (Exception e){
            return -1;
        }
    }
    public String getLineString() {
        return "Line : (" + getLine() + ") ";
    }


    public String getParent(){
        try{
            return parserRuleContext.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        }catch (Exception e){
            return "**MISSING CONTEXT**";
        }
    }

    public int getChildCount(){
        try{
            return parserRuleContext.getChildCount();
        }catch (Exception e){
            return -1;
        }
    }

    public  String generate_code(){
        return "";
    }

   // public String getType(){
//        return type;
//    }

}
