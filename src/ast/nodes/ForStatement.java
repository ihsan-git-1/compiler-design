package ast.nodes;

import ast.variables.ConditionExpr;
import ast.variables.Variable;
import ast.variables.VariableAssignment;
import gen.dart_parse;

public class ForStatement  extends Node implements StatementAbstractChild {

    Variable variable;
    ConditionExpr conditionExpr;
    Block block;
    VariableAssignment variableAssignment;

    public ForStatement(dart_parse.ForStatementContext ctx, Variable variable, ConditionExpr conditionExpr, Block block, VariableAssignment variableAssignment) {
        super(ctx);
        this.variable = variable;
        this.conditionExpr = conditionExpr;
        this.block = block;
        this.variableAssignment = variableAssignment;
    }

    @Override
    public String toString() {
        return getLineString() +
                "ForStatement{\n" +
                "variable= " + variable +
                "\n, conditionExpr= " + conditionExpr +
                "\n, variableAssignment= " + variableAssignment +
                "\n, block= " + block +
                '}';
    }
}
