package ast;


import java.util.*;

public class Scope {
    private int id;
    private Scope parent;
    private String scope_name = " ";
    private boolean isParent;
    public  Map<String, SymbolTableObject> symbolMap = new HashMap<>();



    public boolean isParent() {
        return isParent;
    }

    public void setIsParent(boolean parent) {
        isParent = parent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setScopeName(String scope_name) {
        this.scope_name = scope_name;
    }

    public Scope getParent() {
        return parent;
    }

    public String getScopeName() {
        return scope_name;
    }


    public void setParent(Scope parent) {
        this.parent = parent;
    }

    public Map<String, SymbolTableObject> getSymbolMap() {
        return symbolMap;
    }

    public void setSymbolMap(Map<String, SymbolTableObject> symbolMap) {
        this.symbolMap = symbolMap;
    }






}

