// Generated from dart_parse.g4 by ANTLR 4.10.1
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link dart_parse}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface dart_parseVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link dart_parse#topTreeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopTreeDeclaration(dart_parse.TopTreeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#allClassesDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllClassesDeclaration(dart_parse.AllClassesDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(dart_parse.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#statelessClassDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatelessClassDeclaration(dart_parse.StatelessClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#statefullClassDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatefullClassDeclaration(dart_parse.StatefullClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#stfulFirstBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStfulFirstBody(dart_parse.StfulFirstBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#stfulSecondBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStfulSecondBody(dart_parse.StfulSecondBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#statefullAssignStateClassDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatefullAssignStateClassDeclaration(dart_parse.StatefullAssignStateClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#returnStateTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStateTypes(dart_parse.ReturnStateTypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#functionReturnState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionReturnState(dart_parse.FunctionReturnStateContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#returnArrowState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnArrowState(dart_parse.ReturnArrowStateContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#buildMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuildMethodDeclaration(dart_parse.BuildMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#dartDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDartDeclaration(dart_parse.DartDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(dart_parse.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#integerDeclarationLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerDeclarationLine(dart_parse.IntegerDeclarationLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#integerDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerDeclaration(dart_parse.IntegerDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#doubleDeclarationLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleDeclarationLine(dart_parse.DoubleDeclarationLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#doubleDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleDeclaration(dart_parse.DoubleDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#stringDeclarationLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringDeclarationLine(dart_parse.StringDeclarationLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#stringDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringDeclaration(dart_parse.StringDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#booleanDeclarationLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanDeclarationLine(dart_parse.BooleanDeclarationLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#booleanDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanDeclaration(dart_parse.BooleanDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#addExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpression(dart_parse.AddExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#multiplyExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyExpression(dart_parse.MultiplyExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#addDoubleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddDoubleExpression(dart_parse.AddDoubleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#multiplyDoubleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyDoubleExpression(dart_parse.MultiplyDoubleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#booleans}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleans(dart_parse.BooleansContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#booleanOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanOperation(dart_parse.BooleanOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#dartAllListsDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDartAllListsDeclaration(dart_parse.DartAllListsDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#dartListStringDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDartListStringDeclaration(dart_parse.DartListStringDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#dartListIntDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDartListIntDeclaration(dart_parse.DartListIntDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#dartListBoolDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDartListBoolDeclaration(dart_parse.DartListBoolDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#widgetsDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidgetsDeclaration(dart_parse.WidgetsDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#expandedDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpandedDeclaration(dart_parse.ExpandedDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#paddingDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPaddingDeclaration(dart_parse.PaddingDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#scaffoldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScaffoldDeclaration(dart_parse.ScaffoldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#textDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextDeclaration(dart_parse.TextDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#materialAppDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaterialAppDeclaration(dart_parse.MaterialAppDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#materialButtonDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaterialButtonDeclaration(dart_parse.MaterialButtonDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#conatinerDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConatinerDeclaration(dart_parse.ConatinerDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#rowColumnDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowColumnDeclaration(dart_parse.RowColumnDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#imageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImageDeclaration(dart_parse.ImageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#conatinerPropertiesDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConatinerPropertiesDeclaration(dart_parse.ConatinerPropertiesDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#paddingPropertyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPaddingPropertyDeclaration(dart_parse.PaddingPropertyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#edgeInsistAll}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdgeInsistAll(dart_parse.EdgeInsistAllContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#onPressedPropertyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnPressedPropertyDeclaration(dart_parse.OnPressedPropertyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#setStatePressedDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetStatePressedDeclaration(dart_parse.SetStatePressedDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#heightPropertyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeightPropertyDeclaration(dart_parse.HeightPropertyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#widthPropertyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidthPropertyDeclaration(dart_parse.WidthPropertyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#homePropertyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHomePropertyDeclaration(dart_parse.HomePropertyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#childPropertyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChildPropertyDeclaration(dart_parse.ChildPropertyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#childrenPropertyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChildrenPropertyDeclaration(dart_parse.ChildrenPropertyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#bodyPropertyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyPropertyDeclaration(dart_parse.BodyPropertyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#buildContextDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuildContextDeclaration(dart_parse.BuildContextDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(dart_parse.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#numberDouble}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberDouble(dart_parse.NumberDoubleContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(dart_parse.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(dart_parse.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(dart_parse.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(dart_parse.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#functionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionType(dart_parse.FunctionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(dart_parse.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(dart_parse.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(dart_parse.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(dart_parse.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(dart_parse.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#conditionExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionExpr(dart_parse.ConditionExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#logicalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpression(dart_parse.LogicalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#binaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpr(dart_parse.BinaryExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(dart_parse.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#prefixUnaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixUnaryOperator(dart_parse.PrefixUnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#postfixUnaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixUnaryOperator(dart_parse.PostfixUnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(dart_parse.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(dart_parse.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(dart_parse.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(dart_parse.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(dart_parse.ArgumentsContext ctx);
}