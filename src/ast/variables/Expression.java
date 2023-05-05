package ast.variables;

import ast.nodes.FunctionCall;
import ast.nodes.Node;

public class Expression extends Node {


    PostfixUnaryOperator postfixUnaryOperator;
    PrefixUnaryOperator prefixUnaryOperator;
    FunctionCall functionCall;
    ConditionExpr conditionExpr;
    NumericTerm numericTerm;

    public Expression(int line, String parent, String type, int childCount, PostfixUnaryOperator postfixUnaryOperator, PrefixUnaryOperator prefixUnaryOperator, FunctionCall functionCall, ConditionExpr conditionExpr, NumericTerm numericTerm) {
        super(line, parent, type, childCount);
        this.postfixUnaryOperator = postfixUnaryOperator;
        this.prefixUnaryOperator = prefixUnaryOperator;
        this.functionCall = functionCall;
        this.conditionExpr = conditionExpr;
        this.numericTerm = numericTerm;
    }
}
