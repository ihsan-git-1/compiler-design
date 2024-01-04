package ast.variables;

public class PostfixUnaryOperator {
String operator;

    public PostfixUnaryOperator(String operator) {
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
        return "PostfixUnaryOperator{" +
                "operator='" + operator + '\'' +
                '}';
    }
}
