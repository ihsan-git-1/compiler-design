// Generated from java-escape by ANTLR 4.11.1
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
	 * Visit a parse tree produced by {@link dart_parse#dartVariabelsDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDartVariabelsDeclaration(dart_parse.DartVariabelsDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(dart_parse.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#integerDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerDeclaration(dart_parse.IntegerDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#doubleDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleDeclaration(dart_parse.DoubleDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#stringDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringDeclaration(dart_parse.StringDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link dart_parse#boolDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolDeclaration(dart_parse.BoolDeclarationContext ctx);
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
}