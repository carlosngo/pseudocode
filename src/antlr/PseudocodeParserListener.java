// Generated from D:/Documents/La Salle/CMPILER/pseudocode/res\PseudocodeParser.g4 by ANTLR 4.9
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PseudocodeParser}.
 */
public interface PseudocodeParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PseudocodeParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(PseudocodeParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudocodeParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(PseudocodeParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudocodeParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(PseudocodeParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudocodeParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(PseudocodeParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudocodeParser#variableName}.
	 * @param ctx the parse tree
	 */
	void enterVariableName(PseudocodeParser.VariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudocodeParser#variableName}.
	 * @param ctx the parse tree
	 */
	void exitVariableName(PseudocodeParser.VariableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudocodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(PseudocodeParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudocodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(PseudocodeParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudocodeParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(PseudocodeParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudocodeParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(PseudocodeParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudocodeParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(PseudocodeParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudocodeParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(PseudocodeParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudocodeParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(PseudocodeParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudocodeParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(PseudocodeParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudocodeParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(PseudocodeParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudocodeParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(PseudocodeParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudocodeParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(PseudocodeParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudocodeParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(PseudocodeParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudocodeParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(PseudocodeParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudocodeParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(PseudocodeParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudocodeParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(PseudocodeParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudocodeParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(PseudocodeParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudocodeParser#createExpression}.
	 * @param ctx the parse tree
	 */
	void enterCreateExpression(PseudocodeParser.CreateExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudocodeParser#createExpression}.
	 * @param ctx the parse tree
	 */
	void exitCreateExpression(PseudocodeParser.CreateExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudocodeParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(PseudocodeParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudocodeParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(PseudocodeParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudocodeParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(PseudocodeParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudocodeParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(PseudocodeParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudocodeParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(PseudocodeParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudocodeParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(PseudocodeParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudocodeParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(PseudocodeParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudocodeParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(PseudocodeParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudocodeParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(PseudocodeParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudocodeParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(PseudocodeParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudocodeParser#binaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOperator(PseudocodeParser.BinaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudocodeParser#binaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOperator(PseudocodeParser.BinaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudocodeParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(PseudocodeParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudocodeParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(PseudocodeParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudocodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PseudocodeParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudocodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PseudocodeParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudocodeParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(PseudocodeParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudocodeParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(PseudocodeParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudocodeParser#badExpression}.
	 * @param ctx the parse tree
	 */
	void enterBadExpression(PseudocodeParser.BadExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudocodeParser#badExpression}.
	 * @param ctx the parse tree
	 */
	void exitBadExpression(PseudocodeParser.BadExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudocodeParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(PseudocodeParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudocodeParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(PseudocodeParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudocodeParser#badAssignment}.
	 * @param ctx the parse tree
	 */
	void enterBadAssignment(PseudocodeParser.BadAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudocodeParser#badAssignment}.
	 * @param ctx the parse tree
	 */
	void exitBadAssignment(PseudocodeParser.BadAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudocodeParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(PseudocodeParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudocodeParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(PseudocodeParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudocodeParser#scanStatement}.
	 * @param ctx the parse tree
	 */
	void enterScanStatement(PseudocodeParser.ScanStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudocodeParser#scanStatement}.
	 * @param ctx the parse tree
	 */
	void exitScanStatement(PseudocodeParser.ScanStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudocodeParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(PseudocodeParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudocodeParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(PseudocodeParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudocodeParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(PseudocodeParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudocodeParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(PseudocodeParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudocodeParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(PseudocodeParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudocodeParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(PseudocodeParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudocodeParser#badReturn}.
	 * @param ctx the parse tree
	 */
	void enterBadReturn(PseudocodeParser.BadReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudocodeParser#badReturn}.
	 * @param ctx the parse tree
	 */
	void exitBadReturn(PseudocodeParser.BadReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudocodeParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(PseudocodeParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudocodeParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(PseudocodeParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudocodeParser#statementSeq}.
	 * @param ctx the parse tree
	 */
	void enterStatementSeq(PseudocodeParser.StatementSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudocodeParser#statementSeq}.
	 * @param ctx the parse tree
	 */
	void exitStatementSeq(PseudocodeParser.StatementSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudocodeParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectionStatement(PseudocodeParser.SelectionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudocodeParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectionStatement(PseudocodeParser.SelectionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudocodeParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(PseudocodeParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudocodeParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(PseudocodeParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudocodeParser#elseIfStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseIfStatement(PseudocodeParser.ElseIfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudocodeParser#elseIfStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseIfStatement(PseudocodeParser.ElseIfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudocodeParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseStatement(PseudocodeParser.ElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudocodeParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseStatement(PseudocodeParser.ElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudocodeParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatement(PseudocodeParser.IterationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudocodeParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatement(PseudocodeParser.IterationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudocodeParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(PseudocodeParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudocodeParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(PseudocodeParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudocodeParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(PseudocodeParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudocodeParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(PseudocodeParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudocodeParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(PseudocodeParser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudocodeParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(PseudocodeParser.DoWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudocodeParser#iterationInit}.
	 * @param ctx the parse tree
	 */
	void enterIterationInit(PseudocodeParser.IterationInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudocodeParser#iterationInit}.
	 * @param ctx the parse tree
	 */
	void exitIterationInit(PseudocodeParser.IterationInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudocodeParser#badIteration}.
	 * @param ctx the parse tree
	 */
	void enterBadIteration(PseudocodeParser.BadIterationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudocodeParser#badIteration}.
	 * @param ctx the parse tree
	 */
	void exitBadIteration(PseudocodeParser.BadIterationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudocodeParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(PseudocodeParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudocodeParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(PseudocodeParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudocodeParser#simpleDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSimpleDeclaration(PseudocodeParser.SimpleDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudocodeParser#simpleDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSimpleDeclaration(PseudocodeParser.SimpleDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudocodeParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(PseudocodeParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudocodeParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(PseudocodeParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudocodeParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterArrayDeclaration(PseudocodeParser.ArrayDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudocodeParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitArrayDeclaration(PseudocodeParser.ArrayDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudocodeParser#declSpecifierSeq}.
	 * @param ctx the parse tree
	 */
	void enterDeclSpecifierSeq(PseudocodeParser.DeclSpecifierSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudocodeParser#declSpecifierSeq}.
	 * @param ctx the parse tree
	 */
	void exitDeclSpecifierSeq(PseudocodeParser.DeclSpecifierSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudocodeParser#variableSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableSpecifier(PseudocodeParser.VariableSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudocodeParser#variableSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableSpecifier(PseudocodeParser.VariableSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudocodeParser#arraySpecifier}.
	 * @param ctx the parse tree
	 */
	void enterArraySpecifier(PseudocodeParser.ArraySpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudocodeParser#arraySpecifier}.
	 * @param ctx the parse tree
	 */
	void exitArraySpecifier(PseudocodeParser.ArraySpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudocodeParser#badConst}.
	 * @param ctx the parse tree
	 */
	void enterBadConst(PseudocodeParser.BadConstContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudocodeParser#badConst}.
	 * @param ctx the parse tree
	 */
	void exitBadConst(PseudocodeParser.BadConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudocodeParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifier(PseudocodeParser.TypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudocodeParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifier(PseudocodeParser.TypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudocodeParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(PseudocodeParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudocodeParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(PseudocodeParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudocodeParser#mainFunction}.
	 * @param ctx the parse tree
	 */
	void enterMainFunction(PseudocodeParser.MainFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudocodeParser#mainFunction}.
	 * @param ctx the parse tree
	 */
	void exitMainFunction(PseudocodeParser.MainFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudocodeParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclaratorList(PseudocodeParser.InitDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudocodeParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclaratorList(PseudocodeParser.InitDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudocodeParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclarator(PseudocodeParser.InitDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudocodeParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclarator(PseudocodeParser.InitDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudocodeParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(PseudocodeParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudocodeParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(PseudocodeParser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudocodeParser#parametersAndQualifiers}.
	 * @param ctx the parse tree
	 */
	void enterParametersAndQualifiers(PseudocodeParser.ParametersAndQualifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudocodeParser#parametersAndQualifiers}.
	 * @param ctx the parse tree
	 */
	void exitParametersAndQualifiers(PseudocodeParser.ParametersAndQualifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudocodeParser#parameterDeclarationClause}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclarationClause(PseudocodeParser.ParameterDeclarationClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudocodeParser#parameterDeclarationClause}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclarationClause(PseudocodeParser.ParameterDeclarationClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudocodeParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclaration(PseudocodeParser.ParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudocodeParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclaration(PseudocodeParser.ParameterDeclarationContext ctx);
}