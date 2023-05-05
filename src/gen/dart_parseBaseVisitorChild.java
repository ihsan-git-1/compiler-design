package gen;

import ast.NodeType;
import ast.Scope;
import ast.SymbolTableObject;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import java.util.Stack;
import java.util.*;

public class dart_parseBaseVisitorChild extends dart_parseBaseVisitor{

    public static List<String> semanticErrors = new ArrayList<>();

    public static ArrayList<String>scopeNames = new ArrayList<>();
    public static ArrayList<String>varialbeNames = new ArrayList<>();
    public static Stack<Scope> scopes=new Stack<>();

    public static int index=1;


    public boolean CheckExistanceInScope(String id , int index ){

        for(Scope s : scopes){
            if(s.getId() == index){

                for (Map.Entry<String, SymbolTableObject> mapElement : s.getSymbolMap().entrySet()) {
                    if(mapElement.getKey().equals(id)){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean CheckExistanceInParentScope(String id , int index ){

        for(Scope s : scopes){
            if(s.getId() < index){

                for (Map.Entry<String, SymbolTableObject> mapElement : s.getSymbolMap().entrySet()) {
                    if(mapElement.getKey().equals(id)){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean CheckIfTypeMatchesParentType(String id,int index,String type){

        for(Scope s : scopes){
            if(s.getId() <= index){

                for (Map.Entry<String, SymbolTableObject> mapElement : s.getSymbolMap().entrySet()) {

                    if(mapElement.getKey().equals(id)){
                        if(mapElement.getValue().type.equals(type)){
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public String getParentType (String id,int index,String type){

        for(Scope s : scopes){
            if(s.getId() <= index){
                for (Map.Entry<String, SymbolTableObject> mapElement : s.getSymbolMap().entrySet()) {

                    if(mapElement.getKey().equals(id)){

                        return mapElement.getValue().type;
                    }
                }
            }
        }
        return "";
    }

    public Object getVariableValueFromScopes(String id , int index ){

        for(Scope s : scopes){
            if(s.getId() <= index){
                for (Map.Entry<String, SymbolTableObject> mapElement : s.getSymbolMap().entrySet()) {
                    if(mapElement.getKey().equals(id)){
                        return mapElement.getValue().value;
                    }
                }
            }
        }
        return null;
    }

    public String getVariableTypeFromScopes(String id , int index ){

        for(Scope s : scopes){
            if(s.getId() <= index){

                for (Map.Entry<String, SymbolTableObject> mapElement : s.getSymbolMap().entrySet()) {

                    if(mapElement.getKey().equals(id)){

                        return mapElement.getValue().type;
                    }
                }
            }
        }
        return "";
    }



//    public boolean searchForBracketToken(String tokenStr, ParserRuleContext ctx,TokenStream tokenStream){
//        int i=1;
//        String opositeBracket ;
//        if(tokenStr.equals("{")){
//            opositeBracket = "}";
//        }else{
//            opositeBracket = "{";
//        }
//
//        while((ctx.getStart().getTokenIndex() - i != 0 )){
//            int previousTokenIndex = ctx.getStart().getTokenIndex() - i;
//            Token previousToken = tokenStream.get(previousTokenIndex);
//            if(tokenStr.equals(previousToken.getText())){
//                return true;
//            }else if(opositeBracket.equals(previousToken.getText())){
//                return false;
//            }
//            i = i-1;
//        }
//        return false;
//    }
}
