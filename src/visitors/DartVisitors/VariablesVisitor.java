package visitors.DartVisitors;
import ast.NodeType;
import ast.SymbolTableObject;
import ast.nodes.TermAbstractChild;
import ast.variables.*;
import gen.dart_parse;
import org.antlr.v4.runtime.Token;
import visitors.DartVisitors.DartVariables.DoubleVisitor;
import visitors.DartVisitors.DartVariables.IntegerVisitor;
import visitors.DartVisitors.DartVariables.StringVisitor;
import visitors.dart_parseBaseVisitorChild;
import java.util.*;


public class VariablesVisitor extends dart_parseBaseVisitorChild {

    @Override
    public Variable visitVariable(dart_parse.VariableContext ctx) {
        
        if (ctx.stringDeclarationLine() != null) {
            StringVisitor stringVisitor = new StringVisitor();

            return new Variable(ctx,stringVisitor.visitStringDeclarationLine(ctx.stringDeclarationLine()));
        }
        if (ctx.integerDeclarationLine() != null) {
            IntegerVisitor integerVisitor = new IntegerVisitor();
            return new Variable(ctx,integerVisitor.visitIntegerDeclarationLine(ctx.integerDeclarationLine()));
        }
        if (ctx.doubleDeclarationLine() != null) {
            DoubleVisitor doubleVisitor = new DoubleVisitor();
            return new Variable(ctx,doubleVisitor.visitDoubleDeclarationLine(ctx.doubleDeclarationLine()));
        }
        if (ctx.booleanDeclarationLine() != null) {
            return new Variable(ctx,visitBooleanDeclarationLine(ctx.booleanDeclarationLine()));
        }
        return null;
    }


    @Override
    public BinaryExpr visitBinaryExpr(dart_parse.BinaryExprContext ctx) {
        
        //
        String type = NodeType.BOOLEAN.toString();
        
        List<dart_parse.TermContext> Terms = ctx.term();
        if (Terms.size() == 1) {
            dart_parse.TermContext term = Terms.get(0);
            TermAbstractChild<Boolean> termResult = visitTerm(term);
            boolean result = termResult.getValue();
            return new BinaryExpr(ctx, result);
        } else {
            dart_parse.TermContext leftTerm = Terms.get(0);
            TermAbstractChild<Boolean> leftResult = visitTerm(leftTerm);
            boolean num1 = leftResult.getValue();
            boolean result = num1;
            for (int i = 0; i < Terms.size() - 1; i++) {
                dart_parse.TermContext rightTerm = Terms.get(i + 1);
                String operator = ctx.getChild(2 * i + 1).getText();
                TermAbstractChild<Boolean> rightResult = visitTerm(rightTerm);
                num1 = result;
                boolean num2 = rightResult.getValue();
                switch (operator) {
                    case "==" -> result = (num1 == num2);

                    case "!=" -> result = (num1 != num2);
                }
            }
            return new BinaryExpr(ctx , result);
        }
    }

    @Override
    public TermAbstractChild<Boolean> visitTerm(dart_parse.TermContext ctx) {
        if (ctx.numericExpr() != null) {
            return visitNumericExpr(ctx.numericExpr());
        }
        if (ctx.conditionExpr() != null) {
            return visitConditionExpr(ctx.conditionExpr());
        }
        if (ctx.booleans() != null) {
            return visitBooleans(ctx.booleans());
        }
        return null;
    }

    @Override
    public NumericExpr visitNumericExpr(dart_parse.NumericExprContext ctx) {
        
        
        String type = NodeType.BOOLEAN.toString();
        
        List<dart_parse.NumericTermContext> numericTerms = ctx.numericTerm();
        dart_parse.NumericTermContext leftTerm = numericTerms.get(0);
        dart_parse.NumericTermContext rightTerm = numericTerms.get(1);
        String operator = ctx.getChild(1).getText();
        NumericTermAbstractChild<Double> leftResult = visitNumericTerm(leftTerm);
        NumericTermAbstractChild<Double> rightResult = visitNumericTerm(rightTerm);
        double num1 = leftResult.getValue();
        double num2 = rightResult.getValue();
        boolean bool = false;
        switch (operator) {
            case "==" -> bool = (num1 == num2);

            case "!=" -> bool = (num1 != num2);

            case ">=" -> bool = (num1 >= num2);

            case "<=" -> bool = (num1 <= num2);

            case ">" -> bool = (num1 > num2);

            case "<" -> bool = (num1 < num2);

        }
        return new NumericExpr(ctx, bool);
    }

    @Override
    public NumericTermAbstractChild<Double> visitNumericTerm(dart_parse.NumericTermContext ctx) {
        if (ctx.addExpression() != null) {
            return visitAddExpression(ctx.addExpression());
        }
        if (ctx.addDoubleExpression() != null) {
            DoubleVisitor doubleVisitor = new DoubleVisitor();
            return doubleVisitor.visitAddDoubleExpression(ctx.addDoubleExpression());
        }
        if (ctx.identifier() != null) {
            return visitIdentifier(ctx.identifier());
        }
        return null;
    }

    @Override
    public Identifier visitIdentifier(dart_parse.IdentifierContext ctx) {
        if (ctx.integerDeclaration() != null){
            IntegerVisitor integerVisitor = new IntegerVisitor();
            return integerVisitor.visitIntegerDeclaration(ctx.integerDeclaration());
        }
        if (ctx.booleanDeclaration() != null)
            return visitBooleanDeclaration(ctx.booleanDeclaration());
        if (ctx.doubleDeclaration() != null){
            DoubleVisitor doubleVisitor = new DoubleVisitor();
            return doubleVisitor.visitDoubleDeclaration(ctx.doubleDeclaration());

        }
        if (ctx.stringDeclaration() != null){
            StringVisitor stringVisitor = new StringVisitor();
            return stringVisitor.visitStringDeclaration(ctx.stringDeclaration());
        }

        return null;
    }

    @Override
    public AndExpr visitAndExpr(dart_parse.AndExprContext ctx) {
        
        
        String type = NodeType.BOOLEAN.toString();
        
        List<dart_parse.BinaryExprContext> expressions = ctx.binaryExpr();
        dart_parse.BinaryExprContext expr = expressions.get(0);
        BinaryExpr exprResult = visitBinaryExpr(expr);
        boolean result = exprResult.isValue();
        if (expressions.size() != 1) {
            for (int i = 0; i < expressions.size() - 1; i++) {
                dart_parse.BinaryExprContext rightExpr = expressions.get(i + 1);
                BinaryExpr rightResult = visitBinaryExpr(rightExpr);
                boolean num2 = rightResult.isValue();
                result = (result && num2);
            }
        }
        return new AndExpr(ctx, result);
    }

    @Override
    public ConditionExpr visitConditionExpr(dart_parse.ConditionExprContext ctx) {

        List<dart_parse.AndExprContext> expressions = ctx.andExpr();
        dart_parse.AndExprContext expr = expressions.get(0);
        AndExpr exprResult = visitAndExpr(expr);
        boolean result = exprResult.isValue();

        if (expressions.size() != 1) {
            for (int i = 0; i < expressions.size() - 1; i++) {
                dart_parse.AndExprContext rightExpr = expressions.get(i + 1);
                AndExpr rightResult = visitAndExpr(rightExpr);
                boolean num2 = rightResult.isValue();
                result = (result || num2);
            }
        }

        return new ConditionExpr(ctx, result);
    }

    @Override
    public VariableAssignment visitVariableAssignment(dart_parse.VariableAssignmentContext ctx) {

        if (ctx.integerDeclarationAssignment() != null) {
            IntegerVisitor integerVisitor = new IntegerVisitor();
            return integerVisitor.visitIntegerDeclarationAssignment(ctx.integerDeclarationAssignment());
        }
        if (ctx.doubleDeclarationAssignment() != null) {
            DoubleVisitor doubleVisitor = new DoubleVisitor();

            return doubleVisitor.visitDoubleDeclarationAssignment(ctx.doubleDeclarationAssignment());
        }
        if (ctx.booleanDeclarationAssignment() != null) {
            return visitBooleanDeclarationAssignment(ctx.booleanDeclarationAssignment());
        }
        if (ctx.stringDeclarationAssignment() != null) {
            StringVisitor stringVisitor = new StringVisitor();
            return stringVisitor.visitStringDeclarationAssignment(ctx.stringDeclarationAssignment());
        }
        return null;

    }



    public BooleanDeclarationLine visitBooleanDeclarationLine(dart_parse.BooleanDeclarationLineContext ctx) {
        
        
        String type = NodeType.BOOLEANDECLARATIONLINE.toString();
        
        List<BooleanDeclaration> declarations = new ArrayList<>();
        List<BooleanDeclarationAssignment> assignments = new ArrayList<>();
        Boolean isDecl = !(ctx.BOOL() == null);


        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (Objects.equals(ctx.getChild(i).getText(), ","))
                continue;
            if (ctx.getChild(i) instanceof dart_parse.BooleanDeclarationContext) {
                declarations.add(visitBooleanDeclaration((dart_parse.BooleanDeclarationContext) ctx.getChild(i)));
            } else if (ctx.getChild(i) instanceof dart_parse.BooleanDeclarationAssignmentContext) {
                assignments.add(visitBooleanDeclarationAssignment((dart_parse.BooleanDeclarationAssignmentContext) ctx.getChild(i)));
            }
        }
        return new BooleanDeclarationLine(line, parent, type, childCount, declarations, assignments);
    }


    public BooleanDeclarationAssignment visitBooleanDeclarationAssignment(dart_parse.BooleanDeclarationAssignmentContext ctx) {
        
        int column = ctx.start.getCharPositionInLine() + 1;
        String id = ctx.getChild(0).getText();
        
        String type = NodeType.BOOLEANDECLARATIONASSIGNMENT.toString();
        

        if (CheckExistanceInScope(id, index)) {
            semanticErrors.add("The name " + id + " already defined (" + line + "," + column + ")");
        } else if ((CheckExistanceInParentScope(id, index) || CheckExistanceInScope(id, index)) && !CheckIfTypeMatchesParentType(id, index, NodeType.BOOL.toString())) {
            semanticErrors.add("A value of type " + NodeType.BOOL.toString() + " can't be assigned to a variable of type " + getParentType(id, index, NodeType.BOOL.toString()));
        } else {
            BooleanValueClass expr = visitBooleans(ctx.booleans());
            scopes.get(index - 1).getSymbolMap().put(id, new SymbolTableObject(NodeType.BOOL.toString(), String.valueOf(expr.value)));
            varialbeNames.add("Identifier " + id + ", Type " + NodeType.BOOL + ", Value : " + expr.getBool() + " , Scope " + scopes.peek().getScopeName());
            return new BooleanDeclarationAssignment(id, expr, line, parent, type, childCount);
        }
        return new BooleanDeclarationAssignment(id, null, line, parent, type, childCount);
    }

    public BooleanDeclaration visitBooleanDeclaration(dart_parse.BooleanDeclarationContext ctx) {
        
        int column = ctx.start.getCharPositionInLine() + 1;
        String id = ctx.getChild(0).getText();
        
        String type = NodeType.BOOLEANDECLARATION.toString();
        

        if (CheckExistanceInScope(id, index)) {
            semanticErrors.add("The name " + id + " already defined (" + line + "," + column + ")");
        } else {
            scopes.get(index - 1).getSymbolMap().put(id, new SymbolTableObject(NodeType.BOOL.toString(), String.valueOf(false)));
        }
        varialbeNames.add("Identifier " + id + ", Type " + NodeType.BOOL + ", Value : false , Scope " + scopes.peek().getScopeName());
        return new BooleanDeclaration(id, line, parent, type, childCount);
    }

    public BooleanAssignment visitBooleanAssignment(dart_parse.BooleanAssignmentContext ctx) {
        
        int column = ctx.start.getCharPositionInLine() + 1;
        String id = ctx.getChild(0).getText();
        
        String type = NodeType.BOOLEANASSIGNMENT.toString();
        

        if (!CheckExistanceInParentScope(id, index) && !CheckExistanceInScope(id, index)) {
            semanticErrors.add("Undefined name " + id + " at (" + line + "," + column + ")");
        } else if ((CheckExistanceInParentScope(id, index) || CheckExistanceInScope(id, index)) && !CheckIfTypeMatchesParentType(id, index, NodeType.BOOL.toString())) {
            semanticErrors.add("A value of type " + NodeType.BOOL.toString() + " can't be assigned to a variable of type " + getParentType(id, index, NodeType.BOOL.toString()));
        } else {
            BooleanValueClass expr = visitBooleans(ctx.booleans());
            scopes.get(index - 1).getSymbolMap().put(id, new SymbolTableObject(NodeType.BOOL.toString(), String.valueOf(expr.value)));
            varialbeNames.add("Identifier " + id + ", Type " + NodeType.BOOL + ", Value :" + expr + " Scope " + scopes.peek().getScopeName());
            return new BooleanAssignment(expr, id, line, parent, type, childCount);
        }
        return new BooleanAssignment(null, id, line, parent, type, childCount);
    }


    @Override
    public AddExpression visitAddExpression(dart_parse.AddExpressionContext ctx) {

        double value;
        Queue<Object> queue = new LinkedList<>();
        String leftmost_operand_type = "";

        if (ctx.getChild(0) instanceof dart_parse.MultiplyExpressionContext) {
            MultiplyExpression expr = visitMultiplyExpression((dart_parse.MultiplyExpressionContext) ctx.getChild(0));
            value = expr.getValue().getNum();

            if(((dart_parse.MultiplyExpressionContext) ctx.getChild(0)).name().size() != 0){
                String variable =  ctx.getChild(0).getText();
                leftmost_operand_type = getVariableTypeFromScopes(variable,index);
            }

            if(ctx.getChild(0).getChildCount()>1){

                for(int j=0;j<ctx.getChild(0).getChildCount();j++) {
                    if(ctx.getChild(0).getChild(j) instanceof dart_parse.NameContext){
                        String variable_inner = ctx.getChild(0).getChild(j).getText();
                        leftmost_operand_type = getVariableTypeFromScopes(variable_inner, index);

                        for (int k = j+1; k < ctx.getChild(0).getChildCount(); k++) {
                            if (leftmost_operand_type != "" &&  ctx.getChild(0).getChild(k) instanceof dart_parse.NameContext) {
                                variable_inner = ctx.getChild(0).getChild(k).getText();
                                String right_operand_type = getVariableTypeFromScopes(variable_inner, index);

                                if (!right_operand_type.equals(leftmost_operand_type) && !right_operand_type.equals("") && semanticErrors.size() == 0) {
                                    semanticErrors.add("A value of type '" + (leftmost_operand_type != "int" ? leftmost_operand_type : right_operand_type) + "' can't be assigned to a variable of type 'int'.");
                                    break;
                                }
                            }
                        }

                        }
                    }
            }
        }
        else {
            value = Double.parseDouble(ctx.getChild(0).getText());
        }

        for (int i = 1; i < ctx.getChildCount(); i++) {
            if (ctx.getChild(i) instanceof dart_parse.MultiplyExpressionContext) {

                MultiplyExpression expr = visitMultiplyExpression((dart_parse.MultiplyExpressionContext) ctx.getChild(i));
                double n = expr.getValue().getNum();

                if(((dart_parse.MultiplyExpressionContext) ctx.getChild(i)).name().size() != 0 && leftmost_operand_type!=""){
                    String variable =  ctx.getChild(i).getText();
                    String right_operand_type = getVariableTypeFromScopes(variable,index);


                    if(!right_operand_type.equals(leftmost_operand_type) && !right_operand_type.equals("") && semanticErrors.size()==0){

                        semanticErrors.add("A value of type '"+ (leftmost_operand_type != "int"?leftmost_operand_type:right_operand_type) +"' can't be assigned to a variable of type 'int'.");
                    }
                }

                queue.add(n);
            } else {
                queue.add(ctx.getChild(i).getText());
            }
        }
        value = getAdditionValue(value, queue);
        int intValue = (int) value;
        
        
        String type = NodeType.NUMBER.toString();
        
        NumberClass numClass = new NumberClass(intValue, line, "Add Expression", type, childCount);
        type = NodeType.INT.toString();
        childCount = ctx.getChildCount();
        return new AddExpression(numClass, line, parent, type, childCount);
    }

    public double getAdditionValue(double value, Queue<Object> queue) {
        double num;
        while (!queue.isEmpty()) {
            String operator = (String) queue.remove();
            if (queue.peek() instanceof Double) {
                num = (double) queue.remove();
            } else {
                num = Double.parseDouble((String) queue.remove());
            }
            if (operator.equals("+")) {
                value += num;
            } else if (operator.equals("-")) {
                value -= num;
            }
        }
        return value;
    }

    public double getMultiValue(double value, Queue<Object> queue) {
        double num;
        while (!queue.isEmpty()) {
            String operator = (String) queue.remove();

            if (queue.peek() instanceof Double) {
                num = (double) queue.remove();
            } else {
                num = Double.parseDouble((String) queue.remove());
            }
            if (operator.equals("*")) {
                value *= num;
            } else if (operator.equals("/")) {
                value /= num;
            }
        }
        return value;
    }

    @Override
    public MultiplyExpression visitMultiplyExpression(dart_parse.MultiplyExpressionContext ctx) {

        
        int column = ctx.start.getCharPositionInLine() + 1;
        Queue<Object> queue = new LinkedList<>();
        Object value ;
        int intValue = 0;

        if(ctx.getParent().getChildCount()>1){

            if(ctx.name().isEmpty()){
                try{
                    value = Double.parseDouble(ctx.getChild(0).getText());
                    for (int i = 1; i < ctx.getChildCount(); i++) {
                        queue.add(ctx.getChild(i).getText());
                    }
                    value = getMultiValue((Double)value, queue);

                    intValue = ((Double) value).intValue();
                }catch(Exception e){}
            }
            else if(!ctx.name().isEmpty()){

                for (int i = 0; i < ctx.getChildCount(); i++) {

                    if(ctx.getChild(i) instanceof dart_parse.NameContext){
                        String variable = ctx.getChild(i).getText();

                        if (!CheckExistanceInParentScope(variable, index) && !CheckExistanceInScope(variable, index)) {
                            semanticErrors.add("Undefined name " + variable + " at (" + line + "," + column + ")");
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
                    value = getMultiValue((double) value, queue);
                    intValue = ((Double) value).intValue();
                }

            }
        }
        else if(ctx.getParent().getChildCount()==1){

            for (int i = 0; i < ctx.getChildCount(); i++) {
                if(ctx.getChild(i) instanceof dart_parse.NumberContext ){

                    try{
                        value = Double.parseDouble(ctx.getChild(i).getText());
                        queue.add(value);
                    }catch(Exception e){}
                }
                else if(ctx.getChild(i) instanceof dart_parse.NameContext){

                    String variable = ctx.getChild(i).getText();
                    if (!CheckExistanceInParentScope(variable, index) && !CheckExistanceInScope(variable, index)) {
                        semanticErrors.add("Undefined name " + variable + " at (" + line + "," + column + ")");
                        queue.add("0");
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
                value = getMultiValue((double) value, queue);
                intValue = ((Double) value).intValue();
            }

        }

        
        String type = NodeType.NUMBER.toString();
        
        NumberClass num = new NumberClass(intValue, line, "Multiply Expression", type, childCount);
        type = NodeType.MULTIPLYEXPRESSION.toString();
        return new MultiplyExpression(num, line, parent, type, childCount);
    }

    @Override
    public BooleanValueClass visitBooleans(dart_parse.BooleansContext ctx) {
        
        
        String type = NodeType.BOOLEAN.toString();
        
        if (ctx.TRUE() != null) {
            if (ctx.TRUE().getText().equals("true")) {
                return new BooleanValueClass(Boolean.parseBoolean(ctx.TRUE().getText()), line, parent, type, childCount);
            } else {
                Token boolToken = ctx.TRUE().getSymbol();
                int column = boolToken.getCharPositionInLine() + 1;
                semanticErrors.add("Error: Undefined name " + ctx.TRUE().getText() + "(" + line + "," + column + ")");
            }
        } else if (ctx.FALSE() != null) {
            if (ctx.FALSE().getText().equals("false")) {
                return new BooleanValueClass(Boolean.parseBoolean(ctx.FALSE().getText()), line, parent, type, childCount);
            } else {
                Token boolToken = ctx.FALSE().getSymbol();
                int column = boolToken.getCharPositionInLine() + 1;
                semanticErrors.add("Error: Undefined name " + ctx.TRUE().getText() + "(" + line + "," + column + ")");
            }
        } else {
            //TODO add error Arraylist
            return null;
        }
        return null;
    }

}
