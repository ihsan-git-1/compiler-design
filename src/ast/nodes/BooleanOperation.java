package ast.nodes;


import ast.variables.AbstractNumberClass;

public class BooleanOperation {
    AbstractNumberClass num1;
    AbstractNumberClass num2;
    String operation;

    public BooleanOperation(AbstractNumberClass num1, AbstractNumberClass num2, String operation) {
        this.num1 = num1;
        this.num2 = num2;
        this.operation = operation;
    }

    public AbstractNumberClass getNum1() {
        return num1;
    }

    public void setNum1(AbstractNumberClass num1) {
        this.num1 = num1;
    }

    public AbstractNumberClass getNum2() {
        return num2;
    }

    public void setNum2(AbstractNumberClass num2) {
        this.num2 = num2;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    @Override
    public String toString() {
        return "BooleanOperation{" + "num1=" + num1 + ", num2=" + num2 + ", operation='" + operation + '\'' + '}';
    }

}
