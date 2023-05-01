package ast.nodes;

public class Function extends DartDeclarationAbstractChild implements StatementAbstractChild {
    FunctionType functionType;
    String name;
    Parameter parameters;
    FunctionBody functionBody;

    public Function(int line, String parent, String type, int childCount, FunctionType functionType, String name, Parameter parameters,  FunctionBody functionBody) {
        super(line, parent, type, childCount);
        this.functionType = functionType;
        this.name = name;
        this.parameters = parameters;
        this.functionBody = functionBody;
    }

    public FunctionType getFunctionType() {
        return functionType;
    }

    public void setFunctionType(FunctionType functionType) {
        this.functionType = functionType;
    }

    public Parameter getParameters() {
        return parameters;
    }

    public void setParameters(Parameter parameters) {
        this.parameters = parameters;
    }


    @Override
    public String toString() {
        return "Function " + "name: " + name + ", functionType: " + functionType + ", parameters: " + parameters + ", functionBody: " + functionBody + ", line: " + line + ", parent: '" + parent +" Child Count =  "+getChildCount()+" Type = "+getType() +"\n";
    }
}
