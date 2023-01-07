package ast.nodes;

import java.util.List;

public class FunctionType extends Function {
    String type;

    public FunctionType(int line, String parent, FunctionType functionType, List<Parameter> parameters, Block block, String type) {
        super(line, parent, functionType, parameters, block);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "FunctionType{" +
                "type='" + type + '\'' +
                ", functionType=" + functionType +
                ", parameters=" + parameters +
                ", block=" + block +
                ", line=" + line +
                ", parent='" + parent + '\'' +
                '}';
    }
}
