// Generated from D:/Documents/La Salle/CMPILER/pseudocode/res\PseudocodeParser.g4 by ANTLR 4.9
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PseudocodeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PseudocodeParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PseudocodeParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(PseudocodeParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodeParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(PseudocodeParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(PseudocodeParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodeParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(PseudocodeParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodeParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(PseudocodeParser.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodeParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(PseudocodeParser.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodeParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(PseudocodeParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodeParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(PseudocodeParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodeParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(PseudocodeParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodeParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(PseudocodeParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodeParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(PseudocodeParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodeParser#createExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateExpression(PseudocodeParser.CreateExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodeParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(PseudocodeParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodeParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(PseudocodeParser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodeParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(PseudocodeParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodeParser#unaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperator(PseudocodeParser.UnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodeParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(PseudocodeParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodeParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(PseudocodeParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(PseudocodeParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodeParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(PseudocodeParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodeParser#scanStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScanStatement(PseudocodeParser.ScanStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodeParser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumpStatement(PseudocodeParser.JumpStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodeParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(PseudocodeParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodeParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(PseudocodeParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodeParser#statementSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementSeq(PseudocodeParser.StatementSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodeParser#selectionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectionStatement(PseudocodeParser.SelectionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodeParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(PseudocodeParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodeParser#elseIfStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfStatement(PseudocodeParser.ElseIfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodeParser#elseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStatement(PseudocodeParser.ElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodeParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(PseudocodeParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodeParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationStatement(PseudocodeParser.IterationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodeParser#forInitStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInitStatement(PseudocodeParser.ForInitStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodeParser#iterationInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationInit(PseudocodeParser.IterationInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodeParser#declarationseq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationseq(PseudocodeParser.DeclarationseqContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodeParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(PseudocodeParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodeParser#emptyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyDeclaration(PseudocodeParser.EmptyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodeParser#simpleDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleDeclaration(PseudocodeParser.SimpleDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodeParser#declSpecifierSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclSpecifierSeq(PseudocodeParser.DeclSpecifierSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodeParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpecifier(PseudocodeParser.TypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodeParser#declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarator(PseudocodeParser.DeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodeParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(PseudocodeParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodeParser#mainFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainFunction(PseudocodeParser.MainFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodeParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclaratorList(PseudocodeParser.InitDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodeParser#initDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclarator(PseudocodeParser.InitDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodeParser#initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer(PseudocodeParser.InitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodeParser#initializerClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializerClause(PseudocodeParser.InitializerClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodeParser#initializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializerList(PseudocodeParser.InitializerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodeParser#parametersAndQualifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametersAndQualifiers(PseudocodeParser.ParametersAndQualifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodeParser#parameterDeclarationClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclarationClause(PseudocodeParser.ParameterDeclarationClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodeParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclaration(PseudocodeParser.ParameterDeclarationContext ctx);
}