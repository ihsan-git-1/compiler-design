package ast.nodes;

import java.util.List;

public class Function extends Node {
    FunctionType functionType;
    List<Parameter> parameters;
    Block block;


    public Function(int line, String parent, FunctionType functionType, List<Parameter> parameters, Block block) {
        super(line, parent);
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

    public List<Parameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<Parameter> parameters) {
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
        return "Function{" +
                "functionType=" + functionType +
                ", parameters=" + parameters +
                ", block=" + block +
                ", line=" + line +
                ", parent='" + parent + '\'' +
                '}';
    }
}
