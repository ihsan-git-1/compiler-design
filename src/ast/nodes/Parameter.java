package ast.nodes;

import java.util.List;

public class Parameter {

    List<DartDeclaration> parameter;

    public Parameter(List<DartDeclaration> parameter) {
        this.parameter = parameter;
    }

    public List<DartDeclaration> getParameter() {
        return parameter;
    }

    public void setParameter(List<DartDeclaration> parameter) {
        this.parameter = parameter;
    }

    @Override
    public String toString() {
        return "Parameter{" +
                "parameter=" + parameter +
                '}';
    }
}
