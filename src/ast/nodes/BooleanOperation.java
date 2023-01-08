package ast.nodes;


import ast.SymbolTableObject;
import ast.variables.AbstractNumberClass;

public class BooleanOperation {
    AbstractNumberClass num1;
    AbstractNumberClass num2;
    SymbolTableObject s1;
    SymbolTableObject s2;
    String operation;

    public BooleanOperation(AbstractNumberClass num1, AbstractNumberClass num2, SymbolTableObject s1, SymbolTableObject s2, String operation) {
        this.num1 = num1;
        this.num2 = num2;
        this.s1 = s1;
        this.s2 = s2;
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
        if (num1 != null && num2 != null) {
            return num1 + " " + operation + " " + num2;
        } else return s1.value + " " + operation + " " + s2.value;
    }

}
