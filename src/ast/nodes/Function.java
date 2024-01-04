package ast.nodes;

import ast.NodeType;
import gen.dart_parse;

public class Function extends DartDeclarationAbstractChild implements StatementAbstractChild {
    FunctionType functionType;
    String name;
    Parameter parameters;
    FunctionBody functionBody;

    public Function(dart_parse.FunctionContext ctx, FunctionType functionType, String name, Parameter parameters, FunctionBody functionBody) {
        super(ctx);
        this.functionType = functionType;
        this.name = name;
        this.parameters = parameters;
        this.functionBody = functionBody;
    }


    @Override
    public String toString() {
        return getLineString()+"Function " + "name: " + name + ", functionType: " + functionType + ", parameters: " + parameters + ", functionBody: " + functionBody  + ", parent: '" + parent +" Child Count =  "+getChildCount()+" Type = "+ NodeType.FUNCTION +"\n";
    }
}
