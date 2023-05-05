package ast.variables;

public class PrefixUnaryOperator {

  String operator;

    public PrefixUnaryOperator(String operator) {
        this.operator = operator;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Override
    public String toString() {
        return "PrefixUnaryOperator{" +
                "operator='" + operator + '\'' +
                '}';
    }
}
