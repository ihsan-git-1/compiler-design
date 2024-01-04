package visitors.DartVisitors.DartVariables;

import ast.NodeType;
import ast.SymbolTableObject;
import ast.variables.*;
import gen.dart_parse;
import visitors.DartVisitors.VariablesVisitor;
import visitors.dart_parseBaseVisitorChild;

import java.util.*;

public class DoubleVisitor  extends dart_parseBaseVisitorChild {


    public DoubleDeclarationLine visitDoubleDeclarationLine(dart_parse.DoubleDeclarationLineContext ctx) {


        String type = NodeType.DOUBLEDECLARATIONLINE.toString();

        List<DoubleDeclaration> declarations = new ArrayList<>();
        List<DoubleDeclarationAssignment> assignments = new ArrayList<>();


        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (Objects.equals(ctx.getChild(i).getText(), ","))
                continue;
            if (ctx.getChild(i) instanceof dart_parse.DoubleDeclarationContext) {
                declarations.add(visitDoubleDeclaration((dart_parse.DoubleDeclarationContext) ctx.getChild(i)));
            } else if (ctx.getChild(i) instanceof dart_parse.DoubleDeclarationAssignmentContext) {
                assignments.add(visitDoubleDeclarationAssignment((dart_parse.DoubleDeclarationAssignmentContext) ctx.getChild(i)));
            }
        }
        return new DoubleDeclarationLine(ctx, declarations, assignments);
    }

    public DoubleDeclarationAssignment visitDoubleDeclarationAssignment(dart_parse.DoubleDeclarationAssignmentContext ctx) {

        int column = ctx.start.getCharPositionInLine() + 1;
        String id = ctx.getChild(0).getText();

        String type = NodeType.DOUBLEDECLARATIONASSIGNMENT.toString();

        int errorLine = ctx.start.getLine();

        if (CheckExistanceInScope(id, index)) {
            semanticErrors.add("The name " + id + " already defined (" + errorLine + "," + column + ")");
        } else if ((CheckExistanceInParentScope(id, index) || CheckExistanceInScope(id, index)) && !CheckIfTypeMatchesParentType(id, index, NodeType.DOUBLE.toString())) {
            semanticErrors.add("A value of type " + NodeType.DOUBLE.toString() + " can't be assigned to a variable of type " + getParentType(id, index, NodeType.DOUBLE.toString()));
        } else {
            AddDoubleExpression expr = visitAddDoubleExpression(ctx.addDoubleExpression());
            scopes.get(index - 1).getSymbolMap().put(id, new SymbolTableObject(NodeType.DOUBLE.toString(), String.valueOf(expr.value.getNum())));
            varialbeNames.add("Identifier " + id + ", Type " + NodeType.DOUBLE + ", Value : " + expr.value.getNum() + " , Scope " + scopes.peek().getScopeName());
            return new DoubleDeclarationAssignment(ctx,expr, id);
        }
        return new DoubleDeclarationAssignment(ctx,null, id);
    }

    public DoubleDeclaration visitDoubleDeclaration(dart_parse.DoubleDeclarationContext ctx) {

        int column = ctx.start.getCharPositionInLine() + 1;
        String name = String.valueOf(ctx.NAME());

        String type = NodeType.DOUBLEDECLARATION.toString();
        int errorLine = ctx.start.getLine();

        if (CheckExistanceInScope(name, index)) {
            semanticErrors.add("The name " + name + " already defined (" + errorLine + "," + column + ")");
        } else {
            scopes.get(index - 1).getSymbolMap().put(name, new SymbolTableObject(NodeType.DOUBLE.toString(), "0.0"));
        }
        varialbeNames.add("Identifier " + name + ", Type " + NodeType.DOUBLE + ", Value : 0.0 , Scope " + scopes.peek().getScopeName());
        return new DoubleDeclaration(ctx,name);
    }

    public DoubleAssignment visitDoubleAssignment(dart_parse.DoubleAssignmentContext ctx) {

        int column = ctx.start.getCharPositionInLine() + 1;
        String id = ctx.getChild(0).getText();

        String type = NodeType.DOUBLEASSIGNMENT.toString();

        int errorLine = ctx.start.getLine();

        if (!CheckExistanceInParentScope(id, index) && !CheckExistanceInScope(id, index)) {
            semanticErrors.add("Undefined name " + id + " at (" + errorLine + "," + column + ")");
        } else if ((CheckExistanceInParentScope(id, index) || CheckExistanceInScope(id, index)) && !CheckIfTypeMatchesParentType(id, index, NodeType.DOUBLE.toString())) {
            semanticErrors.add("A value of type " + NodeType.DOUBLE.toString() + " can't be assigned to a variable of type " + getParentType(id, index, NodeType.DOUBLE.toString()));
        } else {
            AddDoubleExpression expr = visitAddDoubleExpression(ctx.addDoubleExpression());
            scopes.get(index - 1).getSymbolMap().put(id, new SymbolTableObject(NodeType.DOUBLE.toString(), String.valueOf(expr.value.getNum())));
            varialbeNames.add("Identifier " + id + ", Type " + NodeType.DOUBLE + ", Value : " + expr.value.getNum() + " Scope " + scopes.peek().getScopeName());
            return new DoubleAssignment(ctx,expr, id);
        }
        return new DoubleAssignment(ctx,null, id);
    }

    @Override
    public MultiplyDoubleExpression visitMultiplyDoubleExpression(dart_parse.MultiplyDoubleExpressionContext ctx) {

        int column = ctx.start.getCharPositionInLine() + 1;
        Object value = 0.0;
        Queue<Object> queue = new LinkedList<>();

        if(ctx.getParent().getChildCount()>1) {

            if (ctx.name().isEmpty()) {
                try {
                    value = Double.parseDouble(ctx.getChild(0).getText());

                    for (int i = 1; i < ctx.getChildCount(); i++) {
                        queue.add(ctx.getChild(i).getText());
                    }
                    value = (new VariablesVisitor()).getMultiValue((Double) value, queue);
                } catch (Exception e) {
                }
            }
            else if (!ctx.name().isEmpty()) {


                for (int i = 0; i < ctx.getChildCount(); i++) {

                    if(ctx.getChild(i) instanceof dart_parse.NameContext){

                        String variable = ctx.getChild(i).getText();
                        int errorLine = ctx.start.getLine();

                        if (!CheckExistanceInParentScope(variable, index) && !CheckExistanceInScope(variable, index)) {
                            semanticErrors.add("Undefined name " + variable + " at (" + errorLine + "," + column + ")");

                        }else {
                            value = getVariableValueFromScopes(variable, index);
                            queue.add(value);
                        }
                    }else{

                        queue.add(ctx.getChild(i).getText());
                    }
                }
                if(semanticErrors.size()==0){
                    value = Double.parseDouble(queue.remove().toString());
                    value = (new VariablesVisitor()).getMultiValue((double) value, queue);
                }

            }
        }
        else if(ctx.getParent().getChildCount()==1){

            for (int i = 0; i < ctx.getChildCount(); i++) {
                if(ctx.getChild(i) instanceof dart_parse.NumberContext || ctx.getChild(i) instanceof dart_parse.NumberDoubleContext){
                    try{
                        value = Double.parseDouble(ctx.getChild(i).getText());
                        queue.add(value);
                    }catch(Exception e){}
                }
                else if(ctx.getChild(i) instanceof dart_parse.NameContext){

                    int errorLine = ctx.start.getLine();
                    String variable = ctx.getChild(i).getText();
                    if (!CheckExistanceInParentScope(variable, index) && !CheckExistanceInScope(variable, index)) {
                        semanticErrors.add("Undefined name " + variable + " at (" + errorLine + "," + column + ")");
                    }else{

                        value = getVariableValueFromScopes(variable,index);

                        queue.add(value);
                    }
                }
                else{
                    queue.add(ctx.getChild(i).getText());
                }
            }

            if(semanticErrors.size()==0){
                value = Double.parseDouble(queue.remove().toString());
                value = (new VariablesVisitor()).getMultiValue((double) value, queue);
            }


        }


        String type = NodeType.NUMBERDOUBLE.toString();

        // todo :something is sus here using the same context !!!
        NumberDoubleClass num = new NumberDoubleClass(ctx,(double) value);

        return new MultiplyDoubleExpression(ctx,num);
    }

    @Override
    public AddDoubleExpression visitAddDoubleExpression(dart_parse.AddDoubleExpressionContext ctx) {
        double value;
        Queue<Object> queue = new LinkedList<>();
        String leftmost_operand_type = "";

        if (ctx.getChild(0) instanceof dart_parse.MultiplyDoubleExpressionContext) {
            MultiplyDoubleExpression expr = visitMultiplyDoubleExpression((dart_parse.MultiplyDoubleExpressionContext) ctx.getChild(0));
            value = expr.getValue().getNum();

            if(((dart_parse.MultiplyDoubleExpressionContext) ctx.getChild(0)).name().size() != 0){
                String variable =  ctx.getChild(0).getText();
                leftmost_operand_type = getVariableTypeFromScopes(variable,index );
            }


        } else value = Double.parseDouble(ctx.getChild(0).getText());
        for (int i = 1; i < ctx.getChildCount(); i++) {
            if (ctx.getChild(i) instanceof dart_parse.MultiplyDoubleExpressionContext) {
                MultiplyDoubleExpression expr = visitMultiplyDoubleExpression((dart_parse.MultiplyDoubleExpressionContext) ctx.getChild(i));
                double n = expr.getValue().getNum();

                if(((dart_parse.MultiplyDoubleExpressionContext) ctx.getChild(i)).name().size() != 0  && !leftmost_operand_type.equals("") && !leftmost_operand_type.equals("int")){
                    String variable =  ctx.getChild(i).getText();
                    String right_operand_type = getVariableTypeFromScopes(variable,index);

                    if(!right_operand_type.equals(leftmost_operand_type) && !right_operand_type.equals("") && !right_operand_type.equals("int") && semanticErrors.size()==0){
                        semanticErrors.add("A value of type '"+ (leftmost_operand_type != "double"?leftmost_operand_type:right_operand_type) +"' can't be assigned to a variable of type 'double'.");
                    }
                }

                queue.add(n);
            } else {
                queue.add(ctx.getChild(i).getText());
            }
        }
        value = (new VariablesVisitor()).getAdditionValue(value, queue);


        String type = NodeType.NUMBERDOUBLE.toString();

        NumberDoubleClass numClass = new NumberDoubleClass(ctx,value);
        String nodeType = NodeType.DOUBLE.toString();
        return new AddDoubleExpression(ctx,numClass);
    }

    @Override
    public NumberDoubleClass visitNumberDouble(dart_parse.NumberDoubleContext ctx) {
        double number = Double.parseDouble(ctx.NUMBERDOUBLE().getText());


        String type = NodeType.NUMBERDOUBLE.toString();

        return new NumberDoubleClass(ctx,number);
    }

}
