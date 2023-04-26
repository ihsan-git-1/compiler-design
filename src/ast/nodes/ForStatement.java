package ast.nodes;

import ast.variables.ConditionExpr;
import ast.variables.Variable;
import ast.variables.VariableAssignment;

public class ForStatement  extends Node implements StatementAbstractChild {

    Variable variable;
    ConditionExpr conditionExpr;
    Block block;
    VariableAssignment variableAssignment;

    public ForStatement(int line, String parent, String type, int childCount, Variable variable, ConditionExpr conditionExpr, Block block,VariableAssignment variableAssignment) {
        super(line, parent, type, childCount);
        this.variable = variable;
        this.conditionExpr = conditionExpr;
        this.block = block;
        this.variableAssignment = variableAssignment;
    }
}
