package ast;


import java.util.*;

public class Scope {
    private int id;
    private Scope parent;
    private String scope_name = " ";
    private boolean isParent;
    public static Map<String, SymbolTableObject> symbolTable = new HashMap<>();


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

    public Map<String, SymbolTableObject> getsymbolTable() {
        return symbolTable;
    }

    public void setsymbolTable(Map<String, SymbolTableObject> symbolTable) {
        this.symbolTable = symbolTable;
    }


//    public boolean CheckObj(object object, HTMLParser.VarContext arr, HTMLParser.Call_functionContext fun, Scope scope, Scope global)
//    {
//        if (scope.getParent()!=null) {
//            if (object != null) {
//                object object1 = null;
//                for (String j : scope.getParent().symbolTable.keySet()) {
//                    if (scope.getParent().getsymbolTable().get(j).getClass() == object.getClass()) {
//                        object1 = (object) scope.getParent().getsymbolTable().get(j);
//                        String obj1 = object.getObj1().get(object.getObj1().size() - 1).getText().replaceAll("\\s", "");
//                        String obj2 = object1.getObj1().get(object1.getObj1().size() - 1).getText().replaceAll("\\s", "");
//                        if (obj1.equals(obj2)) {
//                            if(scope.getScope_name().equals("for")&&scope.getParent().getScope_name().equals("for"))
//                                System.err.println("Error : iterator has repeated");
//                            return true;
//                        }
//                    }
//                }
//
//            }
//
//        }
//        if (global!=null) {
//            if (object != null) {
//                object object1 = null;
//                for (String j : global.symbolTable.keySet()) {
//                    if (global.getsymbolTable().get(j).getClass() == object.getClass()) {
//                        object1 = (object) global.getsymbolTable().get(j);
//                        String obj1 = object.getObj1().get(object.getObj1().size() - 1).getText().replaceAll("\\s", "");
//                        String obj2 = object1.getObj1().get(object1.getObj1().size() - 1).getText().replaceAll("\\s", "");
//                        if (obj1.equals(obj2)) {
//                            return true;
//                        }
//                    }
//                }
//
//            }
//            else if(arr!=null)
//            {
//                array array = null;
//                HTMLParser.VarContext varContext=null;
//                for (String j : global.symbolTable.keySet()) {
//                    if (global.getsymbolTable().get(j).getClass() == array.class) {
//                        array = (array) global.getsymbolTable().get(j);
//                        String obj1 = arr.getText().replaceAll("\\s", "");
//                        String obj2 = array.getName().replaceAll("\\s", "");
//                        if (obj1.equals(obj2)) {
//                            return true;
//                        }
//                    }else  if (global.getsymbolTable().get(j).getClass() == HTMLParser.VarContext.class) {
//                        varContext = (HTMLParser.VarContext) global.getsymbolTable().get(j);
//                        String obj1 = arr.getText().replaceAll("\\s", "");
//                        String obj2 = varContext.getText().replaceAll("\\s", "");
//                        if (obj1.equals(obj2)) {
//                            return true;
//                        }
//                    }
//
//
//                }
//
//            }else if(fun!=null)
//            {
//                Call_Function call_function = null;
//                HTMLParser.Call_functionContext call_functionContext=null;
//                for (String j : global.symbolTable.keySet()) {
//                    if (global.getsymbolTable().get(j).getClass() == Call_Function.class) {
//                        call_function = (Call_Function) global.getsymbolTable().get(j);
//                        String obj1 = fun.FUNNAME().getText().replaceAll("\\s", "");
//                        String obj2 = call_function.getFunction_name().replaceAll("\\s", "");
//
//                        if (obj1.equals(obj2)) {
//                            if(scope.getScope_name().equals("for"))
//                                return true;
//                        }
//                    }else if (global.getsymbolTable().get(j).getClass() == fun.getClass()) {
//                        call_functionContext = (HTMLParser.Call_functionContext) global.getsymbolTable().get(j);
//                        String obj1="";
//                        String obj2 ="" ;
//                        if(fun.FUNNAME()!=null) {
//                            obj1 = fun.FUNNAME().getText().replaceAll("\\s", "").substring(0, fun.FUNNAME().getText().indexOf("("));
//
//                        }  else if(fun.fun_att()!=null)
//                        {
//                            obj1 = fun.fun_att().VAR().getText().replaceAll("\\s", "");
//                        }
//                        else if(fun.FUNNAME_contant()!=null)
//                        {
//                            obj1 = fun.FUNNAME_contant().getText().replaceAll("\\s", "").substring(0,fun.FUNNAME_contant().getText().indexOf("("));
//                        }
//
//
//                        if(call_functionContext.FUNNAME()!=null)
//                            obj2 = call_functionContext.FUNNAME().getText().replaceAll("\\s", "").substring(0,call_functionContext.FUNNAME().getText().indexOf("("));
//                        else if(call_functionContext.fun_att()!=null)
//                        {
//                            obj2 = call_functionContext.fun_att().VAR().getText().replaceAll("\\s", "");
//                        }
//                        else if(call_functionContext.FUNNAME_contant()!=null)
//                        {
//                            obj2 = call_functionContext.FUNNAME_contant().getText().replaceAll("\\s", "").substring(0,call_functionContext.FUNNAME_contant().getText().indexOf("("));
//                        }
//
//                        if (obj1.equals(obj2)) {
//                            return true;
//                        }
//                    }
//
//
//                }
//
//            }
//        }
//        if (scope.getParent()!=null)
//        {
//
//            CheckObj(object,arr,fun,scope.getParent(),global);
//        }
//        return false;

//    }

}

