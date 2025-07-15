// Generated from C:/Users/maisa/product-management-app-main/src/antlr/ParserAngular.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ParserAngular}.
 */
public interface ParserAngularListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ParserAngular#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ParserAngular.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ParserAngular.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#scriptBlock}.
	 * @param ctx the parse tree
	 */
	void enterScriptBlock(ParserAngular.ScriptBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#scriptBlock}.
	 * @param ctx the parse tree
	 */
	void exitScriptBlock(ParserAngular.ScriptBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#tsStatement}.
	 * @param ctx the parse tree
	 */
	void enterTsStatement(ParserAngular.TsStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#tsStatement}.
	 * @param ctx the parse tree
	 */
	void exitTsStatement(ParserAngular.TsStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(ParserAngular.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(ParserAngular.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#importSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterImportSpecifier(ParserAngular.ImportSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#importSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitImportSpecifier(ParserAngular.ImportSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#componentDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterComponentDeclaration(ParserAngular.ComponentDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#componentDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitComponentDeclaration(ParserAngular.ComponentDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(ParserAngular.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(ParserAngular.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#standalone}.
	 * @param ctx the parse tree
	 */
	void enterStandalone(ParserAngular.StandaloneContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#standalone}.
	 * @param ctx the parse tree
	 */
	void exitStandalone(ParserAngular.StandaloneContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#url}.
	 * @param ctx the parse tree
	 */
	void enterUrl(ParserAngular.UrlContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#url}.
	 * @param ctx the parse tree
	 */
	void exitUrl(ParserAngular.UrlContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#imports}.
	 * @param ctx the parse tree
	 */
	void enterImports(ParserAngular.ImportsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#imports}.
	 * @param ctx the parse tree
	 */
	void exitImports(ParserAngular.ImportsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(ParserAngular.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(ParserAngular.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(ParserAngular.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(ParserAngular.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#arrowMethod}.
	 * @param ctx the parse tree
	 */
	void enterArrowMethod(ParserAngular.ArrowMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#arrowMethod}.
	 * @param ctx the parse tree
	 */
	void exitArrowMethod(ParserAngular.ArrowMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ParserAngular.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ParserAngular.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(ParserAngular.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(ParserAngular.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(ParserAngular.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(ParserAngular.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(ParserAngular.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(ParserAngular.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(ParserAngular.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(ParserAngular.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#classMember}.
	 * @param ctx the parse tree
	 */
	void enterClassMember(ParserAngular.ClassMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#classMember}.
	 * @param ctx the parse tree
	 */
	void exitClassMember(ParserAngular.ClassMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#ngOn}.
	 * @param ctx the parse tree
	 */
	void enterNgOn(ParserAngular.NgOnContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#ngOn}.
	 * @param ctx the parse tree
	 */
	void exitNgOn(ParserAngular.NgOnContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#constructorDecleration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDecleration(ParserAngular.ConstructorDeclerationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#constructorDecleration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDecleration(ParserAngular.ConstructorDeclerationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#inputDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInputDeclaration(ParserAngular.InputDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#inputDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInputDeclaration(ParserAngular.InputDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#outputDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterOutputDeclaration(ParserAngular.OutputDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#outputDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitOutputDeclaration(ParserAngular.OutputDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(ParserAngular.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(ParserAngular.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ParserAngular.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ParserAngular.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPropertyDeclaration(ParserAngular.PropertyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPropertyDeclaration(ParserAngular.PropertyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(ParserAngular.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(ParserAngular.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#objectDecleration}.
	 * @param ctx the parse tree
	 */
	void enterObjectDecleration(ParserAngular.ObjectDeclerationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#objectDecleration}.
	 * @param ctx the parse tree
	 */
	void exitObjectDecleration(ParserAngular.ObjectDeclerationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#objectName}.
	 * @param ctx the parse tree
	 */
	void enterObjectName(ParserAngular.ObjectNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#objectName}.
	 * @param ctx the parse tree
	 */
	void exitObjectName(ParserAngular.ObjectNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#objectInit}.
	 * @param ctx the parse tree
	 */
	void enterObjectInit(ParserAngular.ObjectInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#objectInit}.
	 * @param ctx the parse tree
	 */
	void exitObjectInit(ParserAngular.ObjectInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#objectType}.
	 * @param ctx the parse tree
	 */
	void enterObjectType(ParserAngular.ObjectTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#objectType}.
	 * @param ctx the parse tree
	 */
	void exitObjectType(ParserAngular.ObjectTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteral(ParserAngular.ObjectLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteral(ParserAngular.ObjectLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(ParserAngular.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(ParserAngular.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ParserAngular.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ParserAngular.StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PostIncrementExpression}
	 * labeled alternative in {@link ParserAngular#expression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression(ParserAngular.PostIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostIncrementExpression}
	 * labeled alternative in {@link ParserAngular#expression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression(ParserAngular.PostIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DataStructureExpression}
	 * labeled alternative in {@link ParserAngular#expression}.
	 * @param ctx the parse tree
	 */
	void enterDataStructureExpression(ParserAngular.DataStructureExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DataStructureExpression}
	 * labeled alternative in {@link ParserAngular#expression}.
	 * @param ctx the parse tree
	 */
	void exitDataStructureExpression(ParserAngular.DataStructureExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Return}
	 * labeled alternative in {@link ParserAngular#expression}.
	 * @param ctx the parse tree
	 */
	void enterReturn(ParserAngular.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Return}
	 * labeled alternative in {@link ParserAngular#expression}.
	 * @param ctx the parse tree
	 */
	void exitReturn(ParserAngular.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DotExpression}
	 * labeled alternative in {@link ParserAngular#expression}.
	 * @param ctx the parse tree
	 */
	void enterDotExpression(ParserAngular.DotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DotExpression}
	 * labeled alternative in {@link ParserAngular#expression}.
	 * @param ctx the parse tree
	 */
	void exitDotExpression(ParserAngular.DotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectLiteralExpression}
	 * labeled alternative in {@link ParserAngular#expression}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteralExpression(ParserAngular.ObjectLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectLiteralExpression}
	 * labeled alternative in {@link ParserAngular#expression}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteralExpression(ParserAngular.ObjectLiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeCastExpression}
	 * labeled alternative in {@link ParserAngular#expression}.
	 * @param ctx the parse tree
	 */
	void enterTypeCastExpression(ParserAngular.TypeCastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeCastExpression}
	 * labeled alternative in {@link ParserAngular#expression}.
	 * @param ctx the parse tree
	 */
	void exitTypeCastExpression(ParserAngular.TypeCastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link ParserAngular#expression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpression(ParserAngular.LiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link ParserAngular#expression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpression(ParserAngular.LiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallingMethodExpression}
	 * labeled alternative in {@link ParserAngular#expression}.
	 * @param ctx the parse tree
	 */
	void enterCallingMethodExpression(ParserAngular.CallingMethodExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallingMethodExpression}
	 * labeled alternative in {@link ParserAngular#expression}.
	 * @param ctx the parse tree
	 */
	void exitCallingMethodExpression(ParserAngular.CallingMethodExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link ParserAngular#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpression(ParserAngular.IdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link ParserAngular#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpression(ParserAngular.IdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrowMethodExpression}
	 * labeled alternative in {@link ParserAngular#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrowMethodExpression(ParserAngular.ArrowMethodExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrowMethodExpression}
	 * labeled alternative in {@link ParserAngular#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrowMethodExpression(ParserAngular.ArrowMethodExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ThisExpression}
	 * labeled alternative in {@link ParserAngular#expression}.
	 * @param ctx the parse tree
	 */
	void enterThisExpression(ParserAngular.ThisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ThisExpression}
	 * labeled alternative in {@link ParserAngular#expression}.
	 * @param ctx the parse tree
	 */
	void exitThisExpression(ParserAngular.ThisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonExpression}
	 * labeled alternative in {@link ParserAngular#expression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpression(ParserAngular.ComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonExpression}
	 * labeled alternative in {@link ParserAngular#expression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpression(ParserAngular.ComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectNameExpression}
	 * labeled alternative in {@link ParserAngular#expression}.
	 * @param ctx the parse tree
	 */
	void enterObjectNameExpression(ParserAngular.ObjectNameExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectNameExpression}
	 * labeled alternative in {@link ParserAngular#expression}.
	 * @param ctx the parse tree
	 */
	void exitObjectNameExpression(ParserAngular.ObjectNameExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeAssertionExpression}
	 * labeled alternative in {@link ParserAngular#expression}.
	 * @param ctx the parse tree
	 */
	void enterTypeAssertionExpression(ParserAngular.TypeAssertionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeAssertionExpression}
	 * labeled alternative in {@link ParserAngular#expression}.
	 * @param ctx the parse tree
	 */
	void exitTypeAssertionExpression(ParserAngular.TypeAssertionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentExpression}
	 * labeled alternative in {@link ParserAngular#expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(ParserAngular.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentExpression}
	 * labeled alternative in {@link ParserAngular#expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(ParserAngular.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OptionalChainingExpression}
	 * labeled alternative in {@link ParserAngular#expression}.
	 * @param ctx the parse tree
	 */
	void enterOptionalChainingExpression(ParserAngular.OptionalChainingExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OptionalChainingExpression}
	 * labeled alternative in {@link ParserAngular#expression}.
	 * @param ctx the parse tree
	 */
	void exitOptionalChainingExpression(ParserAngular.OptionalChainingExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperatorExpression}
	 * labeled alternative in {@link ParserAngular#expression}.
	 * @param ctx the parse tree
	 */
	void enterOperatorExpression(ParserAngular.OperatorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperatorExpression}
	 * labeled alternative in {@link ParserAngular#expression}.
	 * @param ctx the parse tree
	 */
	void exitOperatorExpression(ParserAngular.OperatorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GenericTypeExpression}
	 * labeled alternative in {@link ParserAngular#expression}.
	 * @param ctx the parse tree
	 */
	void enterGenericTypeExpression(ParserAngular.GenericTypeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GenericTypeExpression}
	 * labeled alternative in {@link ParserAngular#expression}.
	 * @param ctx the parse tree
	 */
	void exitGenericTypeExpression(ParserAngular.GenericTypeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnExp}
	 * labeled alternative in {@link ParserAngular#expression}.
	 * @param ctx the parse tree
	 */
	void enterReturnExp(ParserAngular.ReturnExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnExp}
	 * labeled alternative in {@link ParserAngular#expression}.
	 * @param ctx the parse tree
	 */
	void exitReturnExp(ParserAngular.ReturnExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PostDecrementExpression}
	 * labeled alternative in {@link ParserAngular#expression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression(ParserAngular.PostDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostDecrementExpression}
	 * labeled alternative in {@link ParserAngular#expression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression(ParserAngular.PostDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectDeclarationExpression}
	 * labeled alternative in {@link ParserAngular#expression}.
	 * @param ctx the parse tree
	 */
	void enterObjectDeclarationExpression(ParserAngular.ObjectDeclarationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectDeclarationExpression}
	 * labeled alternative in {@link ParserAngular#expression}.
	 * @param ctx the parse tree
	 */
	void exitObjectDeclarationExpression(ParserAngular.ObjectDeclarationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Await}
	 * labeled alternative in {@link ParserAngular#expression}.
	 * @param ctx the parse tree
	 */
	void enterAwait(ParserAngular.AwaitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Await}
	 * labeled alternative in {@link ParserAngular#expression}.
	 * @param ctx the parse tree
	 */
	void exitAwait(ParserAngular.AwaitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionList}
	 * labeled alternative in {@link ParserAngular#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(ParserAngular.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionList}
	 * labeled alternative in {@link ParserAngular#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(ParserAngular.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(ParserAngular.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(ParserAngular.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#elseIfStatment}.
	 * @param ctx the parse tree
	 */
	void enterElseIfStatment(ParserAngular.ElseIfStatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#elseIfStatment}.
	 * @param ctx the parse tree
	 */
	void exitElseIfStatment(ParserAngular.ElseIfStatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#elseStatment}.
	 * @param ctx the parse tree
	 */
	void enterElseStatment(ParserAngular.ElseStatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#elseStatment}.
	 * @param ctx the parse tree
	 */
	void exitElseStatment(ParserAngular.ElseStatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#shortIf}.
	 * @param ctx the parse tree
	 */
	void enterShortIf(ParserAngular.ShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#shortIf}.
	 * @param ctx the parse tree
	 */
	void exitShortIf(ParserAngular.ShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#shortElseIf}.
	 * @param ctx the parse tree
	 */
	void enterShortElseIf(ParserAngular.ShortElseIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#shortElseIf}.
	 * @param ctx the parse tree
	 */
	void exitShortElseIf(ParserAngular.ShortElseIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#shortelse}.
	 * @param ctx the parse tree
	 */
	void enterShortelse(ParserAngular.ShortelseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#shortelse}.
	 * @param ctx the parse tree
	 */
	void exitShortelse(ParserAngular.ShortelseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#arrowIf}.
	 * @param ctx the parse tree
	 */
	void enterArrowIf(ParserAngular.ArrowIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#arrowIf}.
	 * @param ctx the parse tree
	 */
	void exitArrowIf(ParserAngular.ArrowIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(ParserAngular.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(ParserAngular.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(ParserAngular.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(ParserAngular.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(ParserAngular.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(ParserAngular.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(ParserAngular.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(ParserAngular.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#callingMethod}.
	 * @param ctx the parse tree
	 */
	void enterCallingMethod(ParserAngular.CallingMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#callingMethod}.
	 * @param ctx the parse tree
	 */
	void exitCallingMethod(ParserAngular.CallingMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#dataStructure}.
	 * @param ctx the parse tree
	 */
	void enterDataStructure(ParserAngular.DataStructureContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#dataStructure}.
	 * @param ctx the parse tree
	 */
	void exitDataStructure(ParserAngular.DataStructureContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#itemsStructures}.
	 * @param ctx the parse tree
	 */
	void enterItemsStructures(ParserAngular.ItemsStructuresContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#itemsStructures}.
	 * @param ctx the parse tree
	 */
	void exitItemsStructures(ParserAngular.ItemsStructuresContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#map}.
	 * @param ctx the parse tree
	 */
	void enterMap(ParserAngular.MapContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#map}.
	 * @param ctx the parse tree
	 */
	void exitMap(ParserAngular.MapContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#list}.
	 * @param ctx the parse tree
	 */
	void enterList(ParserAngular.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#list}.
	 * @param ctx the parse tree
	 */
	void exitList(ParserAngular.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(ParserAngular.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(ParserAngular.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#compersion}.
	 * @param ctx the parse tree
	 */
	void enterCompersion(ParserAngular.CompersionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#compersion}.
	 * @param ctx the parse tree
	 */
	void exitCompersion(ParserAngular.CompersionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#eos}.
	 * @param ctx the parse tree
	 */
	void enterEos(ParserAngular.EosContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#eos}.
	 * @param ctx the parse tree
	 */
	void exitEos(ParserAngular.EosContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Describe}
	 * labeled alternative in {@link ParserAngular#jasmineStatement}.
	 * @param ctx the parse tree
	 */
	void enterDescribe(ParserAngular.DescribeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Describe}
	 * labeled alternative in {@link ParserAngular#jasmineStatement}.
	 * @param ctx the parse tree
	 */
	void exitDescribe(ParserAngular.DescribeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code It}
	 * labeled alternative in {@link ParserAngular#jasmineStatement}.
	 * @param ctx the parse tree
	 */
	void enterIt(ParserAngular.ItContext ctx);
	/**
	 * Exit a parse tree produced by the {@code It}
	 * labeled alternative in {@link ParserAngular#jasmineStatement}.
	 * @param ctx the parse tree
	 */
	void exitIt(ParserAngular.ItContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BeforeEach}
	 * labeled alternative in {@link ParserAngular#jasmineStatement}.
	 * @param ctx the parse tree
	 */
	void enterBeforeEach(ParserAngular.BeforeEachContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BeforeEach}
	 * labeled alternative in {@link ParserAngular#jasmineStatement}.
	 * @param ctx the parse tree
	 */
	void exitBeforeEach(ParserAngular.BeforeEachContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AfterEach}
	 * labeled alternative in {@link ParserAngular#jasmineStatement}.
	 * @param ctx the parse tree
	 */
	void enterAfterEach(ParserAngular.AfterEachContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AfterEach}
	 * labeled alternative in {@link ParserAngular#jasmineStatement}.
	 * @param ctx the parse tree
	 */
	void exitAfterEach(ParserAngular.AfterEachContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#jasmineDescribe}.
	 * @param ctx the parse tree
	 */
	void enterJasmineDescribe(ParserAngular.JasmineDescribeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#jasmineDescribe}.
	 * @param ctx the parse tree
	 */
	void exitJasmineDescribe(ParserAngular.JasmineDescribeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#jasmineCallback}.
	 * @param ctx the parse tree
	 */
	void enterJasmineCallback(ParserAngular.JasmineCallbackContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#jasmineCallback}.
	 * @param ctx the parse tree
	 */
	void exitJasmineCallback(ParserAngular.JasmineCallbackContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#jasmineIt}.
	 * @param ctx the parse tree
	 */
	void enterJasmineIt(ParserAngular.JasmineItContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#jasmineIt}.
	 * @param ctx the parse tree
	 */
	void exitJasmineIt(ParserAngular.JasmineItContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#jasmineBeforeEach}.
	 * @param ctx the parse tree
	 */
	void enterJasmineBeforeEach(ParserAngular.JasmineBeforeEachContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#jasmineBeforeEach}.
	 * @param ctx the parse tree
	 */
	void exitJasmineBeforeEach(ParserAngular.JasmineBeforeEachContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#jasmineAfterEach}.
	 * @param ctx the parse tree
	 */
	void enterJasmineAfterEach(ParserAngular.JasmineAfterEachContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#jasmineAfterEach}.
	 * @param ctx the parse tree
	 */
	void exitJasmineAfterEach(ParserAngular.JasmineAfterEachContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElement(ParserAngular.HtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElement(ParserAngular.HtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(ParserAngular.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(ParserAngular.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#htmlAttributes}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttributes(ParserAngular.HtmlAttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#htmlAttributes}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttributes(ParserAngular.HtmlAttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#angularAttribute}.
	 * @param ctx the parse tree
	 */
	void enterAngularAttribute(ParserAngular.AngularAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#angularAttribute}.
	 * @param ctx the parse tree
	 */
	void exitAngularAttribute(ParserAngular.AngularAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#htmlClosingTag}.
	 * @param ctx the parse tree
	 */
	void enterHtmlClosingTag(ParserAngular.HtmlClosingTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#htmlClosingTag}.
	 * @param ctx the parse tree
	 */
	void exitHtmlClosingTag(ParserAngular.HtmlClosingTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttribute(ParserAngular.HtmlAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttribute(ParserAngular.HtmlAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContent(ParserAngular.HtmlContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContent(ParserAngular.HtmlContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#stylesheet}.
	 * @param ctx the parse tree
	 */
	void enterStylesheet(ParserAngular.StylesheetContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#stylesheet}.
	 * @param ctx the parse tree
	 */
	void exitStylesheet(ParserAngular.StylesheetContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#styleBlock}.
	 * @param ctx the parse tree
	 */
	void enterStyleBlock(ParserAngular.StyleBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#styleBlock}.
	 * @param ctx the parse tree
	 */
	void exitStyleBlock(ParserAngular.StyleBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#cssRules}.
	 * @param ctx the parse tree
	 */
	void enterCssRules(ParserAngular.CssRulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#cssRules}.
	 * @param ctx the parse tree
	 */
	void exitCssRules(ParserAngular.CssRulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#cssRule}.
	 * @param ctx the parse tree
	 */
	void enterCssRule(ParserAngular.CssRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#cssRule}.
	 * @param ctx the parse tree
	 */
	void exitCssRule(ParserAngular.CssRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#cssSelector}.
	 * @param ctx the parse tree
	 */
	void enterCssSelector(ParserAngular.CssSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#cssSelector}.
	 * @param ctx the parse tree
	 */
	void exitCssSelector(ParserAngular.CssSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#combinedSelector}.
	 * @param ctx the parse tree
	 */
	void enterCombinedSelector(ParserAngular.CombinedSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#combinedSelector}.
	 * @param ctx the parse tree
	 */
	void exitCombinedSelector(ParserAngular.CombinedSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void enterSimpleSelector(ParserAngular.SimpleSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void exitSimpleSelector(ParserAngular.SimpleSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#elementSelector}.
	 * @param ctx the parse tree
	 */
	void enterElementSelector(ParserAngular.ElementSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#elementSelector}.
	 * @param ctx the parse tree
	 */
	void exitElementSelector(ParserAngular.ElementSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#pseudoClass}.
	 * @param ctx the parse tree
	 */
	void enterPseudoClass(ParserAngular.PseudoClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#pseudoClass}.
	 * @param ctx the parse tree
	 */
	void exitPseudoClass(ParserAngular.PseudoClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#cssDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterCssDeclarations(ParserAngular.CssDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#cssDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitCssDeclarations(ParserAngular.CssDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#cssDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterCssDeclaration(ParserAngular.CssDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#cssDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitCssDeclaration(ParserAngular.CssDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#cssValueList}.
	 * @param ctx the parse tree
	 */
	void enterCssValueList(ParserAngular.CssValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#cssValueList}.
	 * @param ctx the parse tree
	 */
	void exitCssValueList(ParserAngular.CssValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserAngular#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterCssValue(ParserAngular.CssValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserAngular#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitCssValue(ParserAngular.CssValueContext ctx);
}