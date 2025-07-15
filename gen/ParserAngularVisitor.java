// Generated from C:/Users/maisa/product-management-app-main/src/antlr/ParserAngular.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ParserAngular}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParserAngularVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ParserAngular#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ParserAngular.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#scriptBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptBlock(ParserAngular.ScriptBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#tsStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTsStatement(ParserAngular.TsStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(ParserAngular.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#importSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportSpecifier(ParserAngular.ImportSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#componentDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentDeclaration(ParserAngular.ComponentDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(ParserAngular.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#standalone}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandalone(ParserAngular.StandaloneContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#url}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUrl(ParserAngular.UrlContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#imports}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImports(ParserAngular.ImportsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(ParserAngular.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(ParserAngular.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#arrowMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowMethod(ParserAngular.ArrowMethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(ParserAngular.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(ParserAngular.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(ParserAngular.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(ParserAngular.ModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(ParserAngular.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#classMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMember(ParserAngular.ClassMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#ngOn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgOn(ParserAngular.NgOnContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#constructorDecleration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDecleration(ParserAngular.ConstructorDeclerationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#inputDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputDeclaration(ParserAngular.InputDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#outputDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputDeclaration(ParserAngular.OutputDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(ParserAngular.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(ParserAngular.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#propertyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyDeclaration(ParserAngular.PropertyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(ParserAngular.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#objectDecleration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectDecleration(ParserAngular.ObjectDeclerationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#objectName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectName(ParserAngular.ObjectNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#objectInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectInit(ParserAngular.ObjectInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#objectType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectType(ParserAngular.ObjectTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#objectLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteral(ParserAngular.ObjectLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(ParserAngular.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ParserAngular.StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PostIncrementExpression}
	 * labeled alternative in {@link ParserAngular#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression(ParserAngular.PostIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DataStructureExpression}
	 * labeled alternative in {@link ParserAngular#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataStructureExpression(ParserAngular.DataStructureExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Return}
	 * labeled alternative in {@link ParserAngular#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(ParserAngular.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DotExpression}
	 * labeled alternative in {@link ParserAngular#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotExpression(ParserAngular.DotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectLiteralExpression}
	 * labeled alternative in {@link ParserAngular#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteralExpression(ParserAngular.ObjectLiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeCastExpression}
	 * labeled alternative in {@link ParserAngular#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeCastExpression(ParserAngular.TypeCastExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link ParserAngular#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExpression(ParserAngular.LiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CallingMethodExpression}
	 * labeled alternative in {@link ParserAngular#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallingMethodExpression(ParserAngular.CallingMethodExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link ParserAngular#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpression(ParserAngular.IdentifierExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrowMethodExpression}
	 * labeled alternative in {@link ParserAngular#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowMethodExpression(ParserAngular.ArrowMethodExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ThisExpression}
	 * labeled alternative in {@link ParserAngular#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisExpression(ParserAngular.ThisExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonExpression}
	 * labeled alternative in {@link ParserAngular#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpression(ParserAngular.ComparisonExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectNameExpression}
	 * labeled alternative in {@link ParserAngular#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectNameExpression(ParserAngular.ObjectNameExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeAssertionExpression}
	 * labeled alternative in {@link ParserAngular#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAssertionExpression(ParserAngular.TypeAssertionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentExpression}
	 * labeled alternative in {@link ParserAngular#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(ParserAngular.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OptionalChainingExpression}
	 * labeled alternative in {@link ParserAngular#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionalChainingExpression(ParserAngular.OptionalChainingExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperatorExpression}
	 * labeled alternative in {@link ParserAngular#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorExpression(ParserAngular.OperatorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GenericTypeExpression}
	 * labeled alternative in {@link ParserAngular#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericTypeExpression(ParserAngular.GenericTypeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnExp}
	 * labeled alternative in {@link ParserAngular#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnExp(ParserAngular.ReturnExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PostDecrementExpression}
	 * labeled alternative in {@link ParserAngular#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrementExpression(ParserAngular.PostDecrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectDeclarationExpression}
	 * labeled alternative in {@link ParserAngular#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectDeclarationExpression(ParserAngular.ObjectDeclarationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Await}
	 * labeled alternative in {@link ParserAngular#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAwait(ParserAngular.AwaitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionList}
	 * labeled alternative in {@link ParserAngular#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(ParserAngular.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(ParserAngular.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#elseIfStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfStatment(ParserAngular.ElseIfStatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#elseStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStatment(ParserAngular.ElseStatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#shortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortIf(ParserAngular.ShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#shortElseIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortElseIf(ParserAngular.ShortElseIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#shortelse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortelse(ParserAngular.ShortelseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#arrowIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowIf(ParserAngular.ArrowIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(ParserAngular.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(ParserAngular.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(ParserAngular.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(ParserAngular.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#callingMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallingMethod(ParserAngular.CallingMethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#dataStructure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataStructure(ParserAngular.DataStructureContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#itemsStructures}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItemsStructures(ParserAngular.ItemsStructuresContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#map}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap(ParserAngular.MapContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(ParserAngular.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(ParserAngular.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#compersion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompersion(ParserAngular.CompersionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#eos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEos(ParserAngular.EosContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Describe}
	 * labeled alternative in {@link ParserAngular#jasmineStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribe(ParserAngular.DescribeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code It}
	 * labeled alternative in {@link ParserAngular#jasmineStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIt(ParserAngular.ItContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BeforeEach}
	 * labeled alternative in {@link ParserAngular#jasmineStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeforeEach(ParserAngular.BeforeEachContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AfterEach}
	 * labeled alternative in {@link ParserAngular#jasmineStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAfterEach(ParserAngular.AfterEachContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#jasmineDescribe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJasmineDescribe(ParserAngular.JasmineDescribeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#jasmineCallback}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJasmineCallback(ParserAngular.JasmineCallbackContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#jasmineIt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJasmineIt(ParserAngular.JasmineItContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#jasmineBeforeEach}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJasmineBeforeEach(ParserAngular.JasmineBeforeEachContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#jasmineAfterEach}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJasmineAfterEach(ParserAngular.JasmineAfterEachContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElement(ParserAngular.HtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(ParserAngular.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#htmlAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttributes(ParserAngular.HtmlAttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#angularAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAngularAttribute(ParserAngular.AngularAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#htmlClosingTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlClosingTag(ParserAngular.HtmlClosingTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttribute(ParserAngular.HtmlAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContent(ParserAngular.HtmlContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#stylesheet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStylesheet(ParserAngular.StylesheetContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#styleBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleBlock(ParserAngular.StyleBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#cssRules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssRules(ParserAngular.CssRulesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#cssRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssRule(ParserAngular.CssRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#cssSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssSelector(ParserAngular.CssSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#combinedSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCombinedSelector(ParserAngular.CombinedSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#simpleSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleSelector(ParserAngular.SimpleSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#elementSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementSelector(ParserAngular.ElementSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#pseudoClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPseudoClass(ParserAngular.PseudoClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#cssDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssDeclarations(ParserAngular.CssDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#cssDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssDeclaration(ParserAngular.CssDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#cssValueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssValueList(ParserAngular.CssValueListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserAngular#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssValue(ParserAngular.CssValueContext ctx);
}