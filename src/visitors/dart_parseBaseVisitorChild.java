package visitors;

import ast.NodeType;
import ast.Scope;
import ast.SymbolTableObject;
import gen.dart_parseBaseVisitor;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.Stack;
import java.util.*;


public class dart_parseBaseVisitorChild extends dart_parseBaseVisitor {

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

    public static ParseTree getChildFromParent(ParseTree parentNode, String parentName,String childName,int childOrder) {
        ParseTree parent = parentNode;
        int counter=1;
        if (parent == null) {
            throw new IllegalArgumentException("Node does not have nth parent");
        }

        while(true){
            parent = parent.getParent();

            if (parent == null) {
                throw new IllegalArgumentException("Node does not have nth parent");
            }

            if(parent.getClass().getName().replace("gen.dart_parse$", "").replace("Context", "").equals(parentName)){
                if(!childName.equals("")){

                    return getChild( parent,  childName,  0,childOrder);
                }else{
                    return parent;
                }
            }
        }
    }

    public static ParseTree getChild(ParseTree node, String name, int i,int childOrder) {
        int childCount = node.getChildCount();
        for (i=childOrder; i < childCount; i++) {
            ParseTree child = node.getChild(i);
            
            if (child.getClass().getSimpleName().replace("Context", "").equals(name) ) {
                return child;
            }

            ParseTree foundChild = getChild(child, name, 0,0);
            if (foundChild != null ) {
                return foundChild;
            }
        }
        return null;
    }

    public static void emptyScopeNames(){
        scopeNames.clear();
    }

    public static void emptyVariableName(){
        varialbeNames.clear();
    }
}
