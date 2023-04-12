package gen;

import ast.SymbolTableObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class dart_parseBaseVisitorChild extends dart_parseBaseVisitor{

    public static List<String> semanticErrors = new ArrayList<>();
//	public static List<String> vars= new ArrayList<>();

    public static Map<String, SymbolTableObject> symbolTable = new HashMap<>();
}
