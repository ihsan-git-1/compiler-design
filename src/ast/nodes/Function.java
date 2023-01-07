package ast.nodes;

import java.util.List;

public class Function extends Node {
    FunctionType functionType;
    String name;
    Parameter parameters;
    Block block;


    public Function(int line, String parent,String type,int childCount,FunctionType functionType, String name, Parameter parameters, Block block) {
        super(line, parent, type, childCount);
        this.name = name;
        this.functionType = functionType;
        this.parameters = parameters;
        this.block = block;
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

    public Block getBlock() {
        return block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    @Override
    public String toString() {
        return "Function " + "name: " + name + ", functionType: " + functionType + ", parameters: " + parameters + ", block: " + block + ", line: " + line + ", parent: '" + parent + '\'';
    }
}
