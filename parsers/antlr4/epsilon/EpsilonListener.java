// Generated from Epsilon.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EpsilonParser}.
 */
public interface EpsilonListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EpsilonParser#topLevel}.
	 * @param ctx the parse tree
	 */
	void enterTopLevel(EpsilonParser.TopLevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link EpsilonParser#topLevel}.
	 * @param ctx the parse tree
	 */
	void exitTopLevel(EpsilonParser.TopLevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link EpsilonParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(EpsilonParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EpsilonParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(EpsilonParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EpsilonParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(EpsilonParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EpsilonParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(EpsilonParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EpsilonParser#functionParamList}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParamList(EpsilonParser.FunctionParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link EpsilonParser#functionParamList}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParamList(EpsilonParser.FunctionParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link EpsilonParser#functionParam}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParam(EpsilonParser.FunctionParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link EpsilonParser#functionParam}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParam(EpsilonParser.FunctionParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link EpsilonParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(EpsilonParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EpsilonParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(EpsilonParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EpsilonParser#variableList}.
	 * @param ctx the parse tree
	 */
	void enterVariableList(EpsilonParser.VariableListContext ctx);
	/**
	 * Exit a parse tree produced by {@link EpsilonParser#variableList}.
	 * @param ctx the parse tree
	 */
	void exitVariableList(EpsilonParser.VariableListContext ctx);
	/**
	 * Enter a parse tree produced by {@link EpsilonParser#initDecl}.
	 * @param ctx the parse tree
	 */
	void enterInitDecl(EpsilonParser.InitDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link EpsilonParser#initDecl}.
	 * @param ctx the parse tree
	 */
	void exitInitDecl(EpsilonParser.InitDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link EpsilonParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(EpsilonParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link EpsilonParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(EpsilonParser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link EpsilonParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(EpsilonParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link EpsilonParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(EpsilonParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link EpsilonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(EpsilonParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EpsilonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(EpsilonParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link EpsilonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(EpsilonParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EpsilonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(EpsilonParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EpsilonParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(EpsilonParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EpsilonParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(EpsilonParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EpsilonParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(EpsilonParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EpsilonParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(EpsilonParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EpsilonParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(EpsilonParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EpsilonParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(EpsilonParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EpsilonParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(EpsilonParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EpsilonParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(EpsilonParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EpsilonParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(EpsilonParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EpsilonParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(EpsilonParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EpsilonParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(EpsilonParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EpsilonParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(EpsilonParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EpsilonParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(EpsilonParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EpsilonParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(EpsilonParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EpsilonParser#functionInvocation}.
	 * @param ctx the parse tree
	 */
	void enterFunctionInvocation(EpsilonParser.FunctionInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EpsilonParser#functionInvocation}.
	 * @param ctx the parse tree
	 */
	void exitFunctionInvocation(EpsilonParser.FunctionInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EpsilonParser#functionExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExpression(EpsilonParser.FunctionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EpsilonParser#functionExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExpression(EpsilonParser.FunctionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EpsilonParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(EpsilonParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link EpsilonParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(EpsilonParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link EpsilonParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(EpsilonParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link EpsilonParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(EpsilonParser.LiteralContext ctx);
}