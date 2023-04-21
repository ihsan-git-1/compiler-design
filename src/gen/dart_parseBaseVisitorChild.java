package gen;

import ast.NodeType;
import ast.Scope;
import ast.SymbolTableObject;

import java.util.*;

public class dart_parseBaseVisitorChild extends dart_parseBaseVisitor{

    public static List<String> semanticErrors = new ArrayList<>();

    public static ArrayList<Scope> symbolTable = new ArrayList<Scope>();
    public static ArrayList<Scope> scopes=new ArrayList<>();
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
                        if(mapElement.getValue().type == type){
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
}
