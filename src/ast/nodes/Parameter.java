package ast.nodes;

import java.util.List;

public class Parameter {

    List<DartVariablesDeclaration> parameter;

    public Parameter(List<DartVariablesDeclaration> parameter) {
        this.parameter = parameter;
    }

    public List<DartVariablesDeclaration> getParameter() {
        return parameter;
    }

    public void setParameter(List<DartVariablesDeclaration> parameter) {
        this.parameter = parameter;
    }

    @Override
    public String toString() {
        return "Parameter{" +
                "parameter=" + parameter +
                '}';
    }
}
