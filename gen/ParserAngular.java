// Generated from C:/Users/maisa/product-management-app-main/src/antlr/ParserAngular.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ParserAngular extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TAG_OPEN=1, TEXT=2, SCRIPT_OPEN=3, STYLE_OPEN=4, WS=5, DOCTYPE=6, HTML_TAG_CLOSE=7, 
		HTML_SLASH_CLOSE=8, HTML_SLASH=9, HTML_EQUALS=10, HTML_ATTRIBUTE_VALUE=11, 
		HTML_PROPERTY_BINDING=12, HTML_EVENT_BINDING=13, HTML_TAG_NAME=14, HTML_TWO_WAY_BINDING=15, 
		HTML_STAR_BINDING=16, HTML_INTERPOLATION=17, HTML_ATTRIBUTE_NAME=18, HTML_WS=19, 
		STYLE_CLOSE=20, CSS_PROPERTY=21, CSS_VALUE=22, CSS_CLASS_SELECTOR=23, 
		CSS_ID_SELECTOR=24, CSS_COMBINATOR_WS=25, CSS_LBRACE=26, CSS_RBRACE=27, 
		CSS_COLON=28, CSS_SEMICOLON=29, CSS_WS=30, CSS_IDENTIFIER=31, SCRIPT_CLOSE=32, 
		IF=33, ELSEIF=34, ELSE=35, FOR=36, WHILE=37, SWITCH=38, CASE=39, BREAK=40, 
		CONTINUE=41, DEFAULT=42, DO=43, TRY=44, CATCH=45, FINALLY=46, THROW=47, 
		FUNCTION=48, RETURN=49, CONST=50, LET=51, CONSTRUCTOR=52, VAR=53, CLASS=54, 
		IMPORT=55, IMPORTS=56, EXPORT=57, AS=58, FROM=59, NEW=60, THIS=61, IMPLEMENTS=62, 
		INPUT=63, OUTPUT=64, COMPONENT=65, NGONINIT=66, NGONCHANGES=67, SELECTOR=68, 
		STANDALONE=69, STYLEURL=70, TEMPLATEURL=71, TEMPLATE=72, DESCRIBE=73, 
		INTERFACE=74, IT=75, BEFOREEACH=76, AFTEREACH=77, AWAIT=78, PUBLIC=79, 
		PRIVATE=80, PROTECTED=81, READONLY=82, STATIC=83, ABSTRACT=84, FINAL=85, 
		ASYNC=86, EQUAL=87, ARROW=88, PLUS=89, MINUS=90, STAR=91, DIVIDE=92, MODULO=93, 
		AND=94, OR=95, NOT=96, EQUAL_TO=97, EQUAL_TO3=98, NOT_EQUAL=99, NOT_EQUAL2=100, 
		GREATER_THAN=101, LESS_THAN=102, GREATER_THAN_OR_EQUAL=103, LESS_THAN_OR_EQUAL=104, 
		LPAREN=105, RPAREN=106, LSBRACKET=107, RSBRACKET=108, LCURLY=109, RCURLY=110, 
		COMMA=111, SEMI=112, COLON=113, DOT=114, QUESTION=115, A=116, Integer=117, 
		Float=118, String=119, Boolean=120, Undefined=121, Null=122, ACCESS_MODIFIER=123, 
		SINGLE_LINE_COMMENT=124, COMMENT_BLOCK=125, TS_WS=126, IDENTIFIER=127, 
		EXTENDS=128, QUESITIONMARK=129;
	public static final int
		RULE_program = 0, RULE_scriptBlock = 1, RULE_tsStatement = 2, RULE_importStatement = 3, 
		RULE_importSpecifier = 4, RULE_componentDeclaration = 5, RULE_selector = 6, 
		RULE_standalone = 7, RULE_url = 8, RULE_imports = 9, RULE_functionDeclaration = 10, 
		RULE_methodDeclaration = 11, RULE_arrowMethod = 12, RULE_block = 13, RULE_parameterList = 14, 
		RULE_parameter = 15, RULE_modifier = 16, RULE_classDeclaration = 17, RULE_classMember = 18, 
		RULE_ngOn = 19, RULE_constructorDecleration = 20, RULE_inputDeclaration = 21, 
		RULE_outputDeclaration = 22, RULE_variableDeclaration = 23, RULE_type = 24, 
		RULE_propertyDeclaration = 25, RULE_property = 26, RULE_objectDecleration = 27, 
		RULE_objectName = 28, RULE_objectInit = 29, RULE_objectType = 30, RULE_objectLiteral = 31, 
		RULE_literal = 32, RULE_statement = 33, RULE_expression = 34, RULE_ifStatement = 35, 
		RULE_elseIfStatment = 36, RULE_elseStatment = 37, RULE_shortIf = 38, RULE_shortElseIf = 39, 
		RULE_shortelse = 40, RULE_arrowIf = 41, RULE_forStatement = 42, RULE_whileStatement = 43, 
		RULE_expressionStatement = 44, RULE_returnStatement = 45, RULE_callingMethod = 46, 
		RULE_dataStructure = 47, RULE_itemsStructures = 48, RULE_map = 49, RULE_list = 50, 
		RULE_operator = 51, RULE_compersion = 52, RULE_eos = 53, RULE_jasmineStatement = 54, 
		RULE_jasmineDescribe = 55, RULE_jasmineCallback = 56, RULE_jasmineIt = 57, 
		RULE_jasmineBeforeEach = 58, RULE_jasmineAfterEach = 59, RULE_htmlElement = 60, 
		RULE_declaration = 61, RULE_htmlAttributes = 62, RULE_angularAttribute = 63, 
		RULE_htmlClosingTag = 64, RULE_htmlAttribute = 65, RULE_htmlContent = 66, 
		RULE_stylesheet = 67, RULE_styleBlock = 68, RULE_cssRules = 69, RULE_cssRule = 70, 
		RULE_cssSelector = 71, RULE_combinedSelector = 72, RULE_simpleSelector = 73, 
		RULE_elementSelector = 74, RULE_pseudoClass = 75, RULE_cssDeclarations = 76, 
		RULE_cssDeclaration = 77, RULE_cssValueList = 78, RULE_cssValue = 79;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "scriptBlock", "tsStatement", "importStatement", "importSpecifier", 
			"componentDeclaration", "selector", "standalone", "url", "imports", "functionDeclaration", 
			"methodDeclaration", "arrowMethod", "block", "parameterList", "parameter", 
			"modifier", "classDeclaration", "classMember", "ngOn", "constructorDecleration", 
			"inputDeclaration", "outputDeclaration", "variableDeclaration", "type", 
			"propertyDeclaration", "property", "objectDecleration", "objectName", 
			"objectInit", "objectType", "objectLiteral", "literal", "statement", 
			"expression", "ifStatement", "elseIfStatment", "elseStatment", "shortIf", 
			"shortElseIf", "shortelse", "arrowIf", "forStatement", "whileStatement", 
			"expressionStatement", "returnStatement", "callingMethod", "dataStructure", 
			"itemsStructures", "map", "list", "operator", "compersion", "eos", "jasmineStatement", 
			"jasmineDescribe", "jasmineCallback", "jasmineIt", "jasmineBeforeEach", 
			"jasmineAfterEach", "htmlElement", "declaration", "htmlAttributes", "angularAttribute", 
			"htmlClosingTag", "htmlAttribute", "htmlContent", "stylesheet", "styleBlock", 
			"cssRules", "cssRule", "cssSelector", "combinedSelector", "simpleSelector", 
			"elementSelector", "pseudoClass", "cssDeclarations", "cssDeclaration", 
			"cssValueList", "cssValue"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'<script>'", "'<style>'", null, null, null, "'/>'", 
			null, null, null, null, null, null, null, null, null, null, null, "'</style>'", 
			null, null, null, null, null, null, null, null, null, null, null, "'</script>'", 
			"'if'", "'else if'", "'else'", "'for'", "'while'", "'switch'", "'case'", 
			"'break'", "'continue'", "'default'", "'do'", "'try'", "'catch'", "'finally'", 
			"'throw'", "'function'", "'return'", "'const'", "'let'", "'constructor'", 
			"'var'", "'class'", "'import'", "'imports'", "'export'", "'as'", "'from'", 
			"'new'", "'this'", "'implements'", "'@Input'", "'@Output'", "'@Component'", 
			"'ngOnInit'", "'ngOnChanges'", "'selector'", "'standalone'", "'styleUrls'", 
			"'templateUrl'", "'template'", "'describe'", "'interface'", "'it'", "'beforeEach'", 
			"'afterEach'", "'await'", "'public'", "'private'", "'protected'", "'readonly'", 
			"'static'", "'abstract'", "'final'", "'async'", null, "'=>'", "'+'", 
			"'-'", "'*'", null, "'%'", "'&&'", "'||'", "'!'", "'=='", "'==='", "'!='", 
			"'!=='", null, "'<'", "'>='", "'<='", "'('", "')'", "'['", "']'", null, 
			null, "','", null, null, "'.'", "'?'", "'@'", null, null, null, null, 
			"'undefined'", "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TAG_OPEN", "TEXT", "SCRIPT_OPEN", "STYLE_OPEN", "WS", "DOCTYPE", 
			"HTML_TAG_CLOSE", "HTML_SLASH_CLOSE", "HTML_SLASH", "HTML_EQUALS", "HTML_ATTRIBUTE_VALUE", 
			"HTML_PROPERTY_BINDING", "HTML_EVENT_BINDING", "HTML_TAG_NAME", "HTML_TWO_WAY_BINDING", 
			"HTML_STAR_BINDING", "HTML_INTERPOLATION", "HTML_ATTRIBUTE_NAME", "HTML_WS", 
			"STYLE_CLOSE", "CSS_PROPERTY", "CSS_VALUE", "CSS_CLASS_SELECTOR", "CSS_ID_SELECTOR", 
			"CSS_COMBINATOR_WS", "CSS_LBRACE", "CSS_RBRACE", "CSS_COLON", "CSS_SEMICOLON", 
			"CSS_WS", "CSS_IDENTIFIER", "SCRIPT_CLOSE", "IF", "ELSEIF", "ELSE", "FOR", 
			"WHILE", "SWITCH", "CASE", "BREAK", "CONTINUE", "DEFAULT", "DO", "TRY", 
			"CATCH", "FINALLY", "THROW", "FUNCTION", "RETURN", "CONST", "LET", "CONSTRUCTOR", 
			"VAR", "CLASS", "IMPORT", "IMPORTS", "EXPORT", "AS", "FROM", "NEW", "THIS", 
			"IMPLEMENTS", "INPUT", "OUTPUT", "COMPONENT", "NGONINIT", "NGONCHANGES", 
			"SELECTOR", "STANDALONE", "STYLEURL", "TEMPLATEURL", "TEMPLATE", "DESCRIBE", 
			"INTERFACE", "IT", "BEFOREEACH", "AFTEREACH", "AWAIT", "PUBLIC", "PRIVATE", 
			"PROTECTED", "READONLY", "STATIC", "ABSTRACT", "FINAL", "ASYNC", "EQUAL", 
			"ARROW", "PLUS", "MINUS", "STAR", "DIVIDE", "MODULO", "AND", "OR", "NOT", 
			"EQUAL_TO", "EQUAL_TO3", "NOT_EQUAL", "NOT_EQUAL2", "GREATER_THAN", "LESS_THAN", 
			"GREATER_THAN_OR_EQUAL", "LESS_THAN_OR_EQUAL", "LPAREN", "RPAREN", "LSBRACKET", 
			"RSBRACKET", "LCURLY", "RCURLY", "COMMA", "SEMI", "COLON", "DOT", "QUESTION", 
			"A", "Integer", "Float", "String", "Boolean", "Undefined", "Null", "ACCESS_MODIFIER", 
			"SINGLE_LINE_COMMENT", "COMMENT_BLOCK", "TS_WS", "IDENTIFIER", "EXTENDS", 
			"QUESITIONMARK"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ParserAngular.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ParserAngular(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ParserAngular.EOF, 0); }
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public List<StyleBlockContext> styleBlock() {
			return getRuleContexts(StyleBlockContext.class);
		}
		public StyleBlockContext styleBlock(int i) {
			return getRuleContext(StyleBlockContext.class,i);
		}
		public List<ScriptBlockContext> scriptBlock() {
			return getRuleContexts(ScriptBlockContext.class);
		}
		public ScriptBlockContext scriptBlock(int i) {
			return getRuleContext(ScriptBlockContext.class,i);
		}
		public List<TsStatementContext> tsStatement() {
			return getRuleContexts(TsStatementContext.class);
		}
		public TsStatementContext tsStatement(int i) {
			return getRuleContext(TsStatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2589323709881778202L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 4897687822003076865L) != 0)) {
				{
				setState(164);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TAG_OPEN:
					{
					setState(160);
					htmlElement();
					}
					break;
				case STYLE_OPEN:
					{
					setState(161);
					styleBlock();
					}
					break;
				case SCRIPT_OPEN:
					{
					setState(162);
					scriptBlock();
					}
					break;
				case IF:
				case FOR:
				case WHILE:
				case CATCH:
				case FUNCTION:
				case RETURN:
				case CONST:
				case LET:
				case VAR:
				case CLASS:
				case IMPORT:
				case IMPORTS:
				case EXPORT:
				case THIS:
				case COMPONENT:
				case DESCRIBE:
				case INTERFACE:
				case IT:
				case BEFOREEACH:
				case AFTEREACH:
				case AWAIT:
				case PUBLIC:
				case PRIVATE:
				case PROTECTED:
				case READONLY:
				case STATIC:
				case ABSTRACT:
				case FINAL:
				case ASYNC:
				case PLUS:
				case MINUS:
				case LESS_THAN:
				case LPAREN:
				case LSBRACKET:
				case LCURLY:
				case A:
				case Integer:
				case Float:
				case String:
				case Boolean:
				case Undefined:
				case Null:
				case IDENTIFIER:
					{
					setState(163);
					tsStatement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(169);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ScriptBlockContext extends ParserRuleContext {
		public TerminalNode SCRIPT_OPEN() { return getToken(ParserAngular.SCRIPT_OPEN, 0); }
		public TerminalNode SCRIPT_CLOSE() { return getToken(ParserAngular.SCRIPT_CLOSE, 0); }
		public List<TsStatementContext> tsStatement() {
			return getRuleContexts(TsStatementContext.class);
		}
		public TsStatementContext tsStatement(int i) {
			return getRuleContext(TsStatementContext.class,i);
		}
		public ScriptBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterScriptBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitScriptBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitScriptBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptBlockContext scriptBlock() throws RecognitionException {
		ScriptBlockContext _localctx = new ScriptBlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_scriptBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(SCRIPT_OPEN);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2589323709881778176L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 4897687822003076865L) != 0)) {
				{
				{
				setState(172);
				tsStatement();
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(178);
			match(SCRIPT_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TsStatementContext extends ParserRuleContext {
		public ImportStatementContext importStatement() {
			return getRuleContext(ImportStatementContext.class,0);
		}
		public ComponentDeclarationContext componentDeclaration() {
			return getRuleContext(ComponentDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TsStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tsStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterTsStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitTsStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitTsStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TsStatementContext tsStatement() throws RecognitionException {
		TsStatementContext _localctx = new TsStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tsStatement);
		try {
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				importStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				componentDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(182);
				classDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(183);
				functionDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(184);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(ParserAngular.IMPORT, 0); }
		public TerminalNode FROM() { return getToken(ParserAngular.FROM, 0); }
		public TerminalNode String() { return getToken(ParserAngular.String, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ParserAngular.IDENTIFIER, 0); }
		public TerminalNode STAR() { return getToken(ParserAngular.STAR, 0); }
		public TerminalNode AS() { return getToken(ParserAngular.AS, 0); }
		public ImportSpecifierContext importSpecifier() {
			return getRuleContext(ImportSpecifierContext.class,0);
		}
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importStatement);
		try {
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				match(IMPORT);
				setState(193);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(188);
					match(IDENTIFIER);
					}
					break;
				case STAR:
					{
					setState(189);
					match(STAR);
					setState(190);
					match(AS);
					setState(191);
					match(IDENTIFIER);
					}
					break;
				case LCURLY:
					{
					setState(192);
					importSpecifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(195);
				match(FROM);
				setState(196);
				match(String);
				setState(197);
				eos();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				match(IMPORT);
				setState(199);
				match(String);
				setState(200);
				eos();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportSpecifierContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(ParserAngular.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(ParserAngular.RCURLY, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(ParserAngular.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ParserAngular.IDENTIFIER, i);
		}
		public List<TerminalNode> AS() { return getTokens(ParserAngular.AS); }
		public TerminalNode AS(int i) {
			return getToken(ParserAngular.AS, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ParserAngular.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserAngular.COMMA, i);
		}
		public ImportSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterImportSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitImportSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitImportSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportSpecifierContext importSpecifier() throws RecognitionException {
		ImportSpecifierContext _localctx = new ImportSpecifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_importSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(LCURLY);
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(204);
				match(IDENTIFIER);
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(205);
					match(AS);
					setState(206);
					match(IDENTIFIER);
					}
				}

				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(209);
					match(COMMA);
					setState(210);
					match(IDENTIFIER);
					setState(213);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(211);
						match(AS);
						setState(212);
						match(IDENTIFIER);
						}
					}

					}
					}
					setState(219);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(222);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentDeclarationContext extends ParserRuleContext {
		public TerminalNode COMPONENT() { return getToken(ParserAngular.COMPONENT, 0); }
		public TerminalNode LPAREN() { return getToken(ParserAngular.LPAREN, 0); }
		public TerminalNode LCURLY() { return getToken(ParserAngular.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(ParserAngular.RCURLY, 0); }
		public TerminalNode RPAREN() { return getToken(ParserAngular.RPAREN, 0); }
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public List<StandaloneContext> standalone() {
			return getRuleContexts(StandaloneContext.class);
		}
		public StandaloneContext standalone(int i) {
			return getRuleContext(StandaloneContext.class,i);
		}
		public List<UrlContext> url() {
			return getRuleContexts(UrlContext.class);
		}
		public UrlContext url(int i) {
			return getRuleContext(UrlContext.class,i);
		}
		public List<ImportsContext> imports() {
			return getRuleContexts(ImportsContext.class);
		}
		public ImportsContext imports(int i) {
			return getRuleContext(ImportsContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ParserAngular.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserAngular.COMMA, i);
		}
		public ComponentDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterComponentDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitComponentDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitComponentDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentDeclarationContext componentDeclaration() throws RecognitionException {
		ComponentDeclarationContext _localctx = new ComponentDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_componentDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(COMPONENT);
			setState(225);
			match(LPAREN);
			setState(226);
			match(LCURLY);
			setState(231);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECTOR:
				{
				setState(227);
				selector();
				}
				break;
			case STANDALONE:
				{
				setState(228);
				standalone();
				}
				break;
			case STYLEURL:
			case TEMPLATEURL:
				{
				setState(229);
				url();
				}
				break;
			case IMPORTS:
				{
				setState(230);
				imports();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(233);
				match(COMMA);
				setState(238);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SELECTOR:
					{
					setState(234);
					selector();
					}
					break;
				case STANDALONE:
					{
					setState(235);
					standalone();
					}
					break;
				case STYLEURL:
				case TEMPLATEURL:
					{
					setState(236);
					url();
					}
					break;
				case IMPORTS:
					{
					setState(237);
					imports();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(245);
			match(RCURLY);
			setState(246);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorContext extends ParserRuleContext {
		public TerminalNode SELECTOR() { return getToken(ParserAngular.SELECTOR, 0); }
		public TerminalNode COLON() { return getToken(ParserAngular.COLON, 0); }
		public TerminalNode String() { return getToken(ParserAngular.String, 0); }
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_selector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(SELECTOR);
			setState(249);
			match(COLON);
			setState(250);
			match(String);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StandaloneContext extends ParserRuleContext {
		public TerminalNode STANDALONE() { return getToken(ParserAngular.STANDALONE, 0); }
		public TerminalNode COLON() { return getToken(ParserAngular.COLON, 0); }
		public TerminalNode Boolean() { return getToken(ParserAngular.Boolean, 0); }
		public StandaloneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standalone; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterStandalone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitStandalone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitStandalone(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StandaloneContext standalone() throws RecognitionException {
		StandaloneContext _localctx = new StandaloneContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_standalone);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(STANDALONE);
			setState(253);
			match(COLON);
			setState(254);
			match(Boolean);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UrlContext extends ParserRuleContext {
		public TerminalNode STYLEURL() { return getToken(ParserAngular.STYLEURL, 0); }
		public TerminalNode COLON() { return getToken(ParserAngular.COLON, 0); }
		public TerminalNode LSBRACKET() { return getToken(ParserAngular.LSBRACKET, 0); }
		public TerminalNode String() { return getToken(ParserAngular.String, 0); }
		public TerminalNode RSBRACKET() { return getToken(ParserAngular.RSBRACKET, 0); }
		public TerminalNode TEMPLATEURL() { return getToken(ParserAngular.TEMPLATEURL, 0); }
		public UrlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_url; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterUrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitUrl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitUrl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UrlContext url() throws RecognitionException {
		UrlContext _localctx = new UrlContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_url);
		try {
			setState(264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STYLEURL:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				match(STYLEURL);
				setState(257);
				match(COLON);
				setState(258);
				match(LSBRACKET);
				setState(259);
				match(String);
				setState(260);
				match(RSBRACKET);
				}
				break;
			case TEMPLATEURL:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				match(TEMPLATEURL);
				setState(262);
				match(COLON);
				setState(263);
				match(String);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportsContext extends ParserRuleContext {
		public TerminalNode IMPORTS() { return getToken(ParserAngular.IMPORTS, 0); }
		public TerminalNode COLON() { return getToken(ParserAngular.COLON, 0); }
		public TerminalNode LSBRACKET() { return getToken(ParserAngular.LSBRACKET, 0); }
		public TerminalNode RSBRACKET() { return getToken(ParserAngular.RSBRACKET, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(ParserAngular.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ParserAngular.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ParserAngular.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserAngular.COMMA, i);
		}
		public ImportsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imports; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterImports(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitImports(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitImports(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportsContext imports() throws RecognitionException {
		ImportsContext _localctx = new ImportsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_imports);
		int _la;
		try {
			setState(285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				match(IMPORTS);
				setState(267);
				match(COLON);
				setState(268);
				match(LSBRACKET);
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(269);
					match(IDENTIFIER);
					setState(274);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(270);
						match(COMMA);
						setState(271);
						match(IDENTIFIER);
						}
						}
						setState(276);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(279);
				match(RSBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
				match(IMPORTS);
				setState(281);
				match(COLON);
				setState(282);
				match(LSBRACKET);
				setState(283);
				match(IDENTIFIER);
				setState(284);
				match(RSBRACKET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode FUNCTION() { return getToken(ParserAngular.FUNCTION, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(ParserAngular.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ParserAngular.IDENTIFIER, i);
		}
		public TerminalNode COLON() { return getToken(ParserAngular.COLON, 0); }
		public ArrowMethodContext arrowMethod() {
			return getRuleContext(ArrowMethodContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_functionDeclaration);
		int _la;
		try {
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FUNCTION) {
					{
					setState(287);
					match(FUNCTION);
					}
				}

				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(290);
					match(IDENTIFIER);
					}
				}

				setState(293);
				parameterList();
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(294);
					match(COLON);
					setState(296);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IDENTIFIER) {
						{
						setState(295);
						match(IDENTIFIER);
						}
					}

					}
				}

				setState(300);
				block();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
				arrowMethod();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ParserAngular.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ParserAngular.IDENTIFIER, i);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ParserAngular.COLON, 0); }
		public ArrowMethodContext arrowMethod() {
			return getRuleContext(ArrowMethodContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_methodDeclaration);
		int _la;
		try {
			setState(319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & 1069547521L) != 0)) {
					{
					setState(305);
					modifier();
					}
				}

				setState(308);
				match(IDENTIFIER);
				setState(309);
				parameterList();
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(310);
					match(COLON);
					setState(312);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IDENTIFIER) {
						{
						setState(311);
						match(IDENTIFIER);
						}
					}

					}
				}

				setState(316);
				block();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
				arrowMethod();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrowMethodContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(ParserAngular.ARROW, 0); }
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(ParserAngular.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ParserAngular.IDENTIFIER, i);
		}
		public TerminalNode COLON() { return getToken(ParserAngular.COLON, 0); }
		public TerminalNode LCURLY() { return getToken(ParserAngular.LCURLY, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode RCURLY() { return getToken(ParserAngular.RCURLY, 0); }
		public TerminalNode LPAREN() { return getToken(ParserAngular.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ParserAngular.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ASYNC() { return getToken(ParserAngular.ASYNC, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ParserAngular.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserAngular.COMMA, i);
		}
		public ArrowMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterArrowMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitArrowMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitArrowMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowMethodContext arrowMethod() throws RecognitionException {
		ArrowMethodContext _localctx = new ArrowMethodContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_arrowMethod);
		int _la;
		try {
			int _alt;
			setState(389);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & 1069547521L) != 0)) {
					{
					setState(321);
					modifier();
					}
				}

				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(324);
					match(IDENTIFIER);
					}
				}

				setState(327);
				parameterList();
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(328);
					match(COLON);
					setState(330);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IDENTIFIER) {
						{
						setState(329);
						match(IDENTIFIER);
						}
					}

					}
				}

				setState(334);
				match(ARROW);
				setState(336);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(335);
					match(LCURLY);
					}
					break;
				}
				setState(341);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(338);
						statement();
						}
						} 
					}
					setState(343);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				}
				setState(345);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(344);
					match(RCURLY);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(347);
					match(IDENTIFIER);
					}
				}

				setState(350);
				parameterList();
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(351);
					match(COLON);
					setState(353);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						setState(352);
						match(IDENTIFIER);
						}
						break;
					}
					}
				}

				setState(358);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(357);
					match(LCURLY);
					}
					break;
				}
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2534999039376621568L) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 19131593054699519L) != 0)) {
					{
					{
					setState(360);
					statement();
					}
					}
					setState(365);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(366);
				match(RCURLY);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASYNC) {
					{
					setState(368);
					match(ASYNC);
					}
				}

				setState(371);
				match(LPAREN);
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(372);
					match(IDENTIFIER);
					setState(377);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(373);
						match(COMMA);
						setState(374);
						match(IDENTIFIER);
						}
						}
						setState(379);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(382);
				match(RPAREN);
				setState(383);
				match(ARROW);
				setState(384);
				block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(385);
				match(LPAREN);
				setState(386);
				match(RPAREN);
				setState(387);
				match(ARROW);
				setState(388);
				block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(ParserAngular.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(ParserAngular.RCURLY, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(LCURLY);
			setState(395);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(392);
					statement();
					}
					} 
				}
				setState(397);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			}
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(398);
				returnStatement();
				}
			}

			setState(401);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterListContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ParserAngular.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ParserAngular.RPAREN, 0); }
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ParserAngular.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserAngular.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			match(LPAREN);
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 281474976710911L) != 0)) {
				{
				setState(404);
				parameter();
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(405);
					match(COMMA);
					setState(406);
					parameter();
					}
					}
					setState(411);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(414);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ParserAngular.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ParserAngular.IDENTIFIER, i);
		}
		public TerminalNode COLON() { return getToken(ParserAngular.COLON, 0); }
		public TerminalNode EQUAL() { return getToken(ParserAngular.EQUAL, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_parameter);
		int _la;
		try {
			setState(433);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(416);
				match(IDENTIFIER);
				setState(417);
				match(COLON);
				setState(418);
				match(IDENTIFIER);
				setState(421);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(419);
					match(EQUAL);
					setState(420);
					literal();
					}
				}

				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(423);
				match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(424);
				modifier();
				{
				setState(425);
				match(IDENTIFIER);
				setState(426);
				match(COLON);
				setState(427);
				match(IDENTIFIER);
				setState(430);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(428);
					match(EQUAL);
					setState(429);
					literal();
					}
				}

				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(432);
				match(IDENTIFIER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ModifierContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(ParserAngular.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(ParserAngular.PRIVATE, 0); }
		public TerminalNode PROTECTED() { return getToken(ParserAngular.PROTECTED, 0); }
		public TerminalNode READONLY() { return getToken(ParserAngular.READONLY, 0); }
		public TerminalNode STATIC() { return getToken(ParserAngular.STATIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(ParserAngular.ABSTRACT, 0); }
		public TerminalNode FINAL() { return getToken(ParserAngular.FINAL, 0); }
		public TerminalNode ASYNC() { return getToken(ParserAngular.ASYNC, 0); }
		public TerminalNode EXPORT() { return getToken(ParserAngular.EXPORT, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			_la = _input.LA(1);
			if ( !(((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & 1069547521L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ParserAngular.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ParserAngular.IDENTIFIER, i);
		}
		public TerminalNode LCURLY() { return getToken(ParserAngular.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(ParserAngular.RCURLY, 0); }
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public TerminalNode CLASS() { return getToken(ParserAngular.CLASS, 0); }
		public List<ClassMemberContext> classMember() {
			return getRuleContexts(ClassMemberContext.class);
		}
		public ClassMemberContext classMember(int i) {
			return getRuleContext(ClassMemberContext.class,i);
		}
		public TerminalNode EXTENDS() { return getToken(ParserAngular.EXTENDS, 0); }
		public TerminalNode IMPLEMENTS() { return getToken(ParserAngular.IMPLEMENTS, 0); }
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & 1069547521L) != 0)) {
				{
				setState(437);
				modifier();
				}
			}

			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLASS) {
				{
				setState(440);
				match(CLASS);
				}
			}

			setState(443);
			match(IDENTIFIER);
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS || _la==EXTENDS) {
				{
				setState(444);
				_la = _input.LA(1);
				if ( !(_la==IMPLEMENTS || _la==EXTENDS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(445);
				match(IDENTIFIER);
				}
			}

			setState(448);
			match(LCURLY);
			setState(452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -8990310756138352640L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -9223369837823163379L) != 0)) {
				{
				{
				setState(449);
				classMember();
				}
				}
				setState(454);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(455);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassMemberContext extends ParserRuleContext {
		public InputDeclarationContext inputDeclaration() {
			return getRuleContext(InputDeclarationContext.class,0);
		}
		public OutputDeclarationContext outputDeclaration() {
			return getRuleContext(OutputDeclarationContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public PropertyDeclarationContext propertyDeclaration() {
			return getRuleContext(PropertyDeclarationContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ObjectDeclerationContext objectDecleration() {
			return getRuleContext(ObjectDeclerationContext.class,0);
		}
		public ConstructorDeclerationContext constructorDecleration() {
			return getRuleContext(ConstructorDeclerationContext.class,0);
		}
		public NgOnContext ngOn() {
			return getRuleContext(NgOnContext.class,0);
		}
		public ClassMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterClassMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitClassMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitClassMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMemberContext classMember() throws RecognitionException {
		ClassMemberContext _localctx = new ClassMemberContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_classMember);
		try {
			setState(465);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(457);
				inputDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(458);
				outputDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(459);
				methodDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(460);
				propertyDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(461);
				variableDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(462);
				objectDecleration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(463);
				constructorDecleration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(464);
				ngOn();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NgOnContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode NGONINIT() { return getToken(ParserAngular.NGONINIT, 0); }
		public TerminalNode NGONCHANGES() { return getToken(ParserAngular.NGONCHANGES, 0); }
		public TerminalNode COLON() { return getToken(ParserAngular.COLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ParserAngular.IDENTIFIER, 0); }
		public NgOnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngOn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterNgOn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitNgOn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitNgOn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgOnContext ngOn() throws RecognitionException {
		NgOnContext _localctx = new NgOnContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ngOn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			_la = _input.LA(1);
			if ( !(_la==NGONINIT || _la==NGONCHANGES) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(468);
			parameterList();
			setState(473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(469);
				match(COLON);
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(470);
					match(IDENTIFIER);
					}
				}

				}
			}

			setState(475);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorDeclerationContext extends ParserRuleContext {
		public TerminalNode CONSTRUCTOR() { return getToken(ParserAngular.CONSTRUCTOR, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ConstructorDeclerationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDecleration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterConstructorDecleration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitConstructorDecleration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitConstructorDecleration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclerationContext constructorDecleration() throws RecognitionException {
		ConstructorDeclerationContext _localctx = new ConstructorDeclerationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_constructorDecleration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			match(CONSTRUCTOR);
			setState(478);
			parameterList();
			setState(479);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InputDeclarationContext extends ParserRuleContext {
		public TerminalNode INPUT() { return getToken(ParserAngular.INPUT, 0); }
		public TerminalNode LPAREN() { return getToken(ParserAngular.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ParserAngular.RPAREN, 0); }
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public InputDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterInputDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitInputDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitInputDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputDeclarationContext inputDeclaration() throws RecognitionException {
		InputDeclarationContext _localctx = new InputDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_inputDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(481);
			match(INPUT);
			setState(482);
			match(LPAREN);
			setState(484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & 4539628425194766337L) != 0)) {
				{
				setState(483);
				literal();
				}
			}

			setState(486);
			match(RPAREN);
			setState(487);
			property();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OutputDeclarationContext extends ParserRuleContext {
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TerminalNode OUTPUT() { return getToken(ParserAngular.OUTPUT, 0); }
		public TerminalNode LPAREN() { return getToken(ParserAngular.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ParserAngular.RPAREN, 0); }
		public ObjectDeclerationContext objectDecleration() {
			return getRuleContext(ObjectDeclerationContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public OutputDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterOutputDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitOutputDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitOutputDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputDeclarationContext outputDeclaration() throws RecognitionException {
		OutputDeclarationContext _localctx = new OutputDeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_outputDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(489);
			match(OUTPUT);
			setState(490);
			match(LPAREN);
			setState(492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & 4539628425194766337L) != 0)) {
				{
				setState(491);
				literal();
				}
			}

			setState(494);
			match(RPAREN);
			setState(495);
			objectDecleration();
			}
			setState(497);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ParserAngular.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ParserAngular.IDENTIFIER, i);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ParserAngular.COLON, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(ParserAngular.EQUAL, 0); }
		public TerminalNode AS() { return getToken(ParserAngular.AS, 0); }
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & 136918859915L) != 0)) {
				{
				setState(500);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & 1069547521L) != 0)) {
					{
					setState(499);
					modifier();
					}
				}

				setState(502);
				type();
				}
			}

			setState(505);
			match(IDENTIFIER);
			setState(508);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(506);
				match(COLON);
				setState(507);
				expression(0);
				}
				break;
			}
			setState(512);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(510);
				match(EQUAL);
				setState(511);
				expression(0);
				}
				break;
			}
			setState(516);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(514);
				match(AS);
				setState(515);
				match(IDENTIFIER);
				}
				break;
			}
			setState(518);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(ParserAngular.CONST, 0); }
		public TerminalNode LET() { return getToken(ParserAngular.LET, 0); }
		public TerminalNode VAR() { return getToken(ParserAngular.VAR, 0); }
		public TerminalNode INTERFACE() { return getToken(ParserAngular.INTERFACE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			_la = _input.LA(1);
			if ( !(((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & 16777227L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyDeclarationContext extends ParserRuleContext {
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(ParserAngular.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public PropertyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterPropertyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitPropertyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitPropertyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyDeclarationContext propertyDeclaration() throws RecognitionException {
		PropertyDeclarationContext _localctx = new PropertyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_propertyDeclaration);
		int _la;
		try {
			setState(545);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(523);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & 1069547521L) != 0)) {
					{
					setState(522);
					modifier();
					}
				}

				setState(525);
				property();
				setState(528);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(526);
					match(EQUAL);
					setState(527);
					expression(0);
					}
				}

				setState(530);
				eos();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(533);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & 1069547521L) != 0)) {
					{
					setState(532);
					modifier();
					}
				}

				setState(536);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & 16777227L) != 0)) {
					{
					setState(535);
					type();
					}
				}

				setState(538);
				property();
				setState(541);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(539);
					match(EQUAL);
					setState(540);
					expression(0);
					}
				}

				setState(543);
				eos();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ParserAngular.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(ParserAngular.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ImportsContext imports() {
			return getRuleContext(ImportsContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(ParserAngular.QUESTION, 0); }
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_property);
		try {
			setState(556);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(547);
				match(IDENTIFIER);
				setState(548);
				match(COLON);
				setState(549);
				expression(0);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(550);
				imports();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(551);
				match(IDENTIFIER);
				setState(552);
				match(QUESTION);
				setState(553);
				match(COLON);
				setState(554);
				expression(0);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(555);
				imports();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectDeclerationContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(ParserAngular.EQUAL, 0); }
		public ObjectInitContext objectInit() {
			return getRuleContext(ObjectInitContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public ObjectNameContext objectName() {
			return getRuleContext(ObjectNameContext.class,0);
		}
		public ObjectDeclerationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectDecleration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterObjectDecleration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitObjectDecleration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitObjectDecleration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectDeclerationContext objectDecleration() throws RecognitionException {
		ObjectDeclerationContext _localctx = new ObjectDeclerationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_objectDecleration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(558);
				property();
				}
				break;
			case 2:
				{
				setState(559);
				objectName();
				}
				break;
			}
			setState(562);
			match(EQUAL);
			setState(563);
			objectInit();
			setState(564);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ParserAngular.IDENTIFIER, 0); }
		public ObjectTypeContext objectType() {
			return getRuleContext(ObjectTypeContext.class,0);
		}
		public ObjectNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterObjectName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitObjectName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitObjectName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectNameContext objectName() throws RecognitionException {
		ObjectNameContext _localctx = new ObjectNameContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_objectName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			match(IDENTIFIER);
			setState(568);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(567);
				objectType();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectInitContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(ParserAngular.NEW, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ParserAngular.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(ParserAngular.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ParserAngular.RPAREN, 0); }
		public ObjectTypeContext objectType() {
			return getRuleContext(ObjectTypeContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ParserAngular.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserAngular.COMMA, i);
		}
		public ObjectInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterObjectInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitObjectInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitObjectInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectInitContext objectInit() throws RecognitionException {
		ObjectInitContext _localctx = new ObjectInitContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_objectInit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			match(NEW);
			setState(571);
			match(IDENTIFIER);
			setState(573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(572);
				objectType();
				}
			}

			setState(575);
			match(LPAREN);
			setState(584);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2522613925652987904L) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 597862282959359L) != 0)) {
				{
				setState(576);
				expression(0);
				setState(581);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(577);
					match(COMMA);
					setState(578);
					expression(0);
					}
					}
					setState(583);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(586);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectTypeContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(ParserAngular.LESS_THAN, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(ParserAngular.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ParserAngular.IDENTIFIER, i);
		}
		public TerminalNode GREATER_THAN() { return getToken(ParserAngular.GREATER_THAN, 0); }
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ParserAngular.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserAngular.COMMA, i);
		}
		public ObjectTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterObjectType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitObjectType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitObjectType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectTypeContext objectType() throws RecognitionException {
		ObjectTypeContext _localctx = new ObjectTypeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_objectType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			match(LESS_THAN);
			setState(589);
			match(IDENTIFIER);
			setState(591);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LSBRACKET || _la==LCURLY) {
				{
				setState(590);
				list();
				}
			}

			setState(600);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(593);
				match(COMMA);
				setState(594);
				match(IDENTIFIER);
				setState(596);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LSBRACKET || _la==LCURLY) {
					{
					setState(595);
					list();
					}
				}

				}
				}
				setState(602);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(603);
			match(GREATER_THAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectLiteralContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(ParserAngular.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(ParserAngular.RCURLY, 0); }
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ParserAngular.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserAngular.COMMA, i);
		}
		public ObjectLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterObjectLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitObjectLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitObjectLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectLiteralContext objectLiteral() throws RecognitionException {
		ObjectLiteralContext _localctx = new ObjectLiteralContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_objectLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
			match(LCURLY);
			setState(614);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPORTS || _la==IDENTIFIER) {
				{
				setState(606);
				property();
				setState(611);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(607);
						match(COMMA);
						setState(608);
						property();
						}
						} 
					}
					setState(613);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
				}
				}
			}

			setState(617);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(616);
				match(COMMA);
				}
			}

			setState(619);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode Integer() { return getToken(ParserAngular.Integer, 0); }
		public TerminalNode PLUS() { return getToken(ParserAngular.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ParserAngular.MINUS, 0); }
		public TerminalNode Float() { return getToken(ParserAngular.Float, 0); }
		public TerminalNode String() { return getToken(ParserAngular.String, 0); }
		public TerminalNode Boolean() { return getToken(ParserAngular.Boolean, 0); }
		public TerminalNode Null() { return getToken(ParserAngular.Null, 0); }
		public TerminalNode Undefined() { return getToken(ParserAngular.Undefined, 0); }
		public TerminalNode THIS() { return getToken(ParserAngular.THIS, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_literal);
		int _la;
		try {
			setState(634);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(622);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(621);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(624);
				match(Integer);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(626);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(625);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(628);
				match(Float);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(629);
				match(String);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(630);
				match(Boolean);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(631);
				match(Null);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(632);
				match(Undefined);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(633);
				match(THIS);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public TerminalNode LCURLY() { return getToken(ParserAngular.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(ParserAngular.RCURLY, 0); }
		public ObjectDeclerationContext objectDecleration() {
			return getRuleContext(ObjectDeclerationContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public JasmineStatementContext jasmineStatement() {
			return getRuleContext(JasmineStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_statement);
		int _la;
		try {
			setState(650);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(636);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(638);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LCURLY) {
					{
					setState(637);
					match(LCURLY);
					}
				}

				setState(640);
				variableDeclaration();
				setState(642);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(641);
					match(RCURLY);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(644);
				objectDecleration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(645);
				ifStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(646);
				forStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(647);
				whileStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(648);
				jasmineStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(649);
				expressionStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PostIncrementExpressionContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(ParserAngular.IDENTIFIER, 0); }
		public List<TerminalNode> PLUS() { return getTokens(ParserAngular.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(ParserAngular.PLUS, i);
		}
		public PostIncrementExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterPostIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitPostIncrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitPostIncrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DataStructureExpressionContext extends ExpressionContext {
		public DataStructureContext dataStructure() {
			return getRuleContext(DataStructureContext.class,0);
		}
		public DataStructureExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterDataStructureExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitDataStructureExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitDataStructureExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnContext extends ExpressionContext {
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ReturnContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DotExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DOT() { return getToken(ParserAngular.DOT, 0); }
		public DotExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterDotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitDotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitDotExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectLiteralExpressionContext extends ExpressionContext {
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public ObjectLiteralExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterObjectLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitObjectLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitObjectLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeCastExpressionContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(ParserAngular.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(ParserAngular.AS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ParserAngular.IDENTIFIER, 0); }
		public TerminalNode RPAREN() { return getToken(ParserAngular.RPAREN, 0); }
		public TypeCastExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterTypeCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitTypeCastExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitTypeCastExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralExpressionContext extends ExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CallingMethodExpressionContext extends ExpressionContext {
		public CallingMethodContext callingMethod() {
			return getRuleContext(CallingMethodContext.class,0);
		}
		public CallingMethodExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterCallingMethodExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitCallingMethodExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitCallingMethodExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierExpressionContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(ParserAngular.IDENTIFIER, 0); }
		public IdentifierExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitIdentifierExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitIdentifierExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrowMethodExpressionContext extends ExpressionContext {
		public ArrowMethodContext arrowMethod() {
			return getRuleContext(ArrowMethodContext.class,0);
		}
		public ArrowMethodExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterArrowMethodExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitArrowMethodExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitArrowMethodExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ThisExpressionContext extends ExpressionContext {
		public TerminalNode THIS() { return getToken(ParserAngular.THIS, 0); }
		public ThisExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterThisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitThisExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitThisExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CompersionContext compersion() {
			return getRuleContext(CompersionContext.class,0);
		}
		public ComparisonExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitComparisonExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectNameExpressionContext extends ExpressionContext {
		public ObjectNameContext objectName() {
			return getRuleContext(ObjectNameContext.class,0);
		}
		public ObjectNameExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterObjectNameExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitObjectNameExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitObjectNameExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeAssertionExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(ParserAngular.AS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ParserAngular.IDENTIFIER, 0); }
		public TypeAssertionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterTypeAssertionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitTypeAssertionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitTypeAssertionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(ParserAngular.EQUAL, 0); }
		public DataStructureContext dataStructure() {
			return getRuleContext(DataStructureContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public AssignmentExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OptionalChainingExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode QUESTION() { return getToken(ParserAngular.QUESTION, 0); }
		public TerminalNode DOT() { return getToken(ParserAngular.DOT, 0); }
		public OptionalChainingExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterOptionalChainingExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitOptionalChainingExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitOptionalChainingExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OperatorExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public OperatorExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterOperatorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitOperatorExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitOperatorExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GenericTypeExpressionContext extends ExpressionContext {
		public TerminalNode LESS_THAN() { return getToken(ParserAngular.LESS_THAN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode GREATER_THAN() { return getToken(ParserAngular.GREATER_THAN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ParserAngular.IDENTIFIER, 0); }
		public GenericTypeExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterGenericTypeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitGenericTypeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitGenericTypeExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnExpContext extends ExpressionContext {
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public TerminalNode LCURLY() { return getToken(ParserAngular.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(ParserAngular.RCURLY, 0); }
		public ReturnExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterReturnExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitReturnExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitReturnExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PostDecrementExpressionContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(ParserAngular.IDENTIFIER, 0); }
		public List<TerminalNode> MINUS() { return getTokens(ParserAngular.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(ParserAngular.MINUS, i);
		}
		public PostDecrementExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterPostDecrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitPostDecrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitPostDecrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectDeclarationExpressionContext extends ExpressionContext {
		public ObjectDeclerationContext objectDecleration() {
			return getRuleContext(ObjectDeclerationContext.class,0);
		}
		public ObjectDeclarationExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterObjectDeclarationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitObjectDeclarationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitObjectDeclarationExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AwaitContext extends ExpressionContext {
		public TerminalNode AWAIT() { return getToken(ParserAngular.AWAIT, 0); }
		public AwaitContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterAwait(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitAwait(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitAwait(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionListContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ExpressionListContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				_localctx = new ObjectLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(653);
				objectLiteral();
				}
				break;
			case 2:
				{
				_localctx = new ObjectDeclarationExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(654);
				objectDecleration();
				}
				break;
			case 3:
				{
				_localctx = new ObjectNameExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(655);
				objectName();
				}
				break;
			case 4:
				{
				_localctx = new ArrowMethodExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(656);
				arrowMethod();
				}
				break;
			case 5:
				{
				_localctx = new ThisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(657);
				match(THIS);
				}
				break;
			case 6:
				{
				_localctx = new AwaitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(658);
				match(AWAIT);
				}
				break;
			case 7:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(659);
				match(IDENTIFIER);
				}
				break;
			case 8:
				{
				_localctx = new PostIncrementExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(660);
				match(IDENTIFIER);
				setState(661);
				match(PLUS);
				setState(662);
				match(PLUS);
				}
				break;
			case 9:
				{
				_localctx = new PostDecrementExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(663);
				match(IDENTIFIER);
				setState(664);
				match(MINUS);
				setState(665);
				match(MINUS);
				}
				break;
			case 10:
				{
				_localctx = new LiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(666);
				literal();
				}
				break;
			case 11:
				{
				_localctx = new CallingMethodExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(667);
				callingMethod();
				}
				break;
			case 12:
				{
				_localctx = new GenericTypeExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(668);
				match(LESS_THAN);
				setState(669);
				expression(0);
				setState(670);
				match(GREATER_THAN);
				setState(671);
				match(IDENTIFIER);
				}
				break;
			case 13:
				{
				_localctx = new TypeCastExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(673);
				match(LPAREN);
				setState(674);
				expression(0);
				setState(675);
				match(AS);
				setState(676);
				match(IDENTIFIER);
				setState(677);
				match(RPAREN);
				}
				break;
			case 14:
				{
				_localctx = new DataStructureExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(679);
				dataStructure();
				}
				break;
			case 15:
				{
				_localctx = new ReturnContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(680);
				returnStatement();
				}
				break;
			case 16:
				{
				_localctx = new ReturnExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(682);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LCURLY) {
					{
					setState(681);
					match(LCURLY);
					}
				}

				setState(684);
				returnStatement();
				setState(686);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					{
					setState(685);
					match(RCURLY);
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(718);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(716);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
					case 1:
						{
						_localctx = new DotExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(690);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(691);
						match(DOT);
						setState(692);
						expression(11);
						}
						break;
					case 2:
						{
						_localctx = new OptionalChainingExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(693);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(694);
						match(QUESTION);
						setState(695);
						match(DOT);
						setState(696);
						expression(10);
						}
						break;
					case 3:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(697);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(698);
						compersion();
						setState(699);
						expression(9);
						}
						break;
					case 4:
						{
						_localctx = new OperatorExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(701);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(702);
						operator();
						setState(703);
						expression(8);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionListContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(705);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(706);
						list();
						}
						break;
					case 6:
						{
						_localctx = new AssignmentExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(707);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(708);
						match(EQUAL);
						setState(711);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case LSBRACKET:
						case LCURLY:
							{
							setState(709);
							dataStructure();
							}
							break;
						case THIS:
						case PLUS:
						case MINUS:
						case Integer:
						case Float:
						case String:
						case Boolean:
						case Undefined:
						case Null:
							{
							setState(710);
							literal();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					case 7:
						{
						_localctx = new TypeAssertionExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(713);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(714);
						match(AS);
						setState(715);
						match(IDENTIFIER);
						}
						break;
					}
					} 
				}
				setState(720);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ParserAngular.IF, 0); }
		public TerminalNode LPAREN() { return getToken(ParserAngular.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ParserAngular.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<ElseIfStatmentContext> elseIfStatment() {
			return getRuleContexts(ElseIfStatmentContext.class);
		}
		public ElseIfStatmentContext elseIfStatment(int i) {
			return getRuleContext(ElseIfStatmentContext.class,i);
		}
		public ElseStatmentContext elseStatment() {
			return getRuleContext(ElseStatmentContext.class,0);
		}
		public ShortIfContext shortIf() {
			return getRuleContext(ShortIfContext.class,0);
		}
		public ArrowIfContext arrowIf() {
			return getRuleContext(ArrowIfContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_ifStatement);
		try {
			int _alt;
			setState(737);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(721);
				match(IF);
				setState(722);
				match(LPAREN);
				setState(723);
				expression(0);
				setState(724);
				match(RPAREN);
				setState(725);
				block();
				setState(729);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(726);
						elseIfStatment();
						}
						} 
					}
					setState(731);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
				}
				setState(733);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
				case 1:
					{
					setState(732);
					elseStatment();
					}
					break;
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(735);
				shortIf();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(736);
				arrowIf();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElseIfStatmentContext extends ParserRuleContext {
		public TerminalNode ELSEIF() { return getToken(ParserAngular.ELSEIF, 0); }
		public TerminalNode LPAREN() { return getToken(ParserAngular.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ParserAngular.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseIfStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfStatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterElseIfStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitElseIfStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitElseIfStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfStatmentContext elseIfStatment() throws RecognitionException {
		ElseIfStatmentContext _localctx = new ElseIfStatmentContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_elseIfStatment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(739);
			match(ELSEIF);
			setState(740);
			match(LPAREN);
			setState(741);
			expression(0);
			setState(742);
			match(RPAREN);
			setState(743);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElseStatmentContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(ParserAngular.ELSE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterElseStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitElseStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitElseStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatmentContext elseStatment() throws RecognitionException {
		ElseStatmentContext _localctx = new ElseStatmentContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_elseStatment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(745);
			match(ELSE);
			setState(746);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ShortIfContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode QUESITIONMARK() { return getToken(ParserAngular.QUESITIONMARK, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ShortelseContext shortelse() {
			return getRuleContext(ShortelseContext.class,0);
		}
		public List<TerminalNode> LPAREN() { return getTokens(ParserAngular.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(ParserAngular.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(ParserAngular.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(ParserAngular.RPAREN, i);
		}
		public List<ShortElseIfContext> shortElseIf() {
			return getRuleContexts(ShortElseIfContext.class);
		}
		public ShortElseIfContext shortElseIf(int i) {
			return getRuleContext(ShortElseIfContext.class,i);
		}
		public ShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitShortIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShortIfContext shortIf() throws RecognitionException {
		ShortIfContext _localctx = new ShortIfContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_shortIf);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				{
				setState(748);
				match(LPAREN);
				}
				break;
			}
			setState(751);
			expression(0);
			setState(753);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RPAREN) {
				{
				setState(752);
				match(RPAREN);
				}
			}

			setState(755);
			match(QUESITIONMARK);
			setState(757);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(756);
				match(LPAREN);
				}
				break;
			}
			setState(759);
			statement();
			setState(761);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RPAREN) {
				{
				setState(760);
				match(RPAREN);
				}
			}

			setState(766);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(763);
					shortElseIf();
					}
					} 
				}
				setState(768);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			}
			setState(769);
			shortelse();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ShortElseIfContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(ParserAngular.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode QUESITIONMARK() { return getToken(ParserAngular.QUESITIONMARK, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<TerminalNode> LPAREN() { return getTokens(ParserAngular.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(ParserAngular.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(ParserAngular.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(ParserAngular.RPAREN, i);
		}
		public ShortElseIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortElseIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterShortElseIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitShortElseIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitShortElseIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShortElseIfContext shortElseIf() throws RecognitionException {
		ShortElseIfContext _localctx = new ShortElseIfContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_shortElseIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(771);
			match(COLON);
			setState(773);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				{
				setState(772);
				match(LPAREN);
				}
				break;
			}
			setState(775);
			expression(0);
			setState(777);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RPAREN) {
				{
				setState(776);
				match(RPAREN);
				}
			}

			setState(779);
			match(QUESITIONMARK);
			setState(781);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				{
				setState(780);
				match(LPAREN);
				}
				break;
			}
			setState(783);
			statement();
			setState(785);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RPAREN) {
				{
				setState(784);
				match(RPAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ShortelseContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(ParserAngular.COLON, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ParserAngular.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ParserAngular.RPAREN, 0); }
		public ShortelseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortelse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterShortelse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitShortelse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitShortelse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShortelseContext shortelse() throws RecognitionException {
		ShortelseContext _localctx = new ShortelseContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_shortelse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(787);
			match(COLON);
			setState(789);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				{
				setState(788);
				match(LPAREN);
				}
				break;
			}
			setState(791);
			statement();
			setState(793);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(792);
				match(RPAREN);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrowIfContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ARROW() { return getToken(ParserAngular.ARROW, 0); }
		public TerminalNode LPAREN() { return getToken(ParserAngular.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ParserAngular.RPAREN, 0); }
		public ArrowIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterArrowIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitArrowIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitArrowIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowIfContext arrowIf() throws RecognitionException {
		ArrowIfContext _localctx = new ArrowIfContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_arrowIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				{
				setState(795);
				match(LPAREN);
				}
				break;
			}
			setState(798);
			expression(0);
			setState(800);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RPAREN) {
				{
				setState(799);
				match(RPAREN);
				}
			}

			setState(802);
			match(ARROW);
			setState(803);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(ParserAngular.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(ParserAngular.LPAREN, 0); }
		public List<TerminalNode> SEMI() { return getTokens(ParserAngular.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(ParserAngular.SEMI, i);
		}
		public TerminalNode RPAREN() { return getToken(ParserAngular.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(805);
			match(FOR);
			setState(806);
			match(LPAREN);
			setState(809);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				{
				setState(807);
				variableDeclaration();
				}
				break;
			case 2:
				{
				setState(808);
				expression(0);
				}
				break;
			}
			setState(811);
			match(SEMI);
			setState(813);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2522613925652987904L) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 597862282959359L) != 0)) {
				{
				setState(812);
				expression(0);
				}
			}

			setState(815);
			match(SEMI);
			setState(817);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2522613925652987904L) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 597862282959359L) != 0)) {
				{
				setState(816);
				expression(0);
				}
			}

			setState(819);
			match(RPAREN);
			setState(820);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(ParserAngular.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(ParserAngular.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ParserAngular.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(822);
			match(WHILE);
			setState(823);
			match(LPAREN);
			setState(824);
			expression(0);
			setState(825);
			match(RPAREN);
			setState(826);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(828);
			expression(0);
			setState(829);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(ParserAngular.RETURN, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ParserAngular.LPAREN, 0); }
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ParserAngular.RPAREN, 0); }
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(831);
			match(RETURN);
			setState(833);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				{
				setState(832);
				match(LPAREN);
				}
				break;
			}
			setState(836);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				{
				setState(835);
				expressionStatement();
				}
				break;
			}
			setState(839);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				{
				setState(838);
				match(RPAREN);
				}
				break;
			}
			setState(841);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CallingMethodContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ParserAngular.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ParserAngular.RPAREN, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(ParserAngular.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ParserAngular.IDENTIFIER, i);
		}
		public TerminalNode CATCH() { return getToken(ParserAngular.CATCH, 0); }
		public List<DataStructureContext> dataStructure() {
			return getRuleContexts(DataStructureContext.class);
		}
		public DataStructureContext dataStructure(int i) {
			return getRuleContext(DataStructureContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(ParserAngular.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ParserAngular.DOT, i);
		}
		public List<CallingMethodContext> callingMethod() {
			return getRuleContexts(CallingMethodContext.class);
		}
		public CallingMethodContext callingMethod(int i) {
			return getRuleContext(CallingMethodContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ParserAngular.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserAngular.COMMA, i);
		}
		public TerminalNode A() { return getToken(ParserAngular.A, 0); }
		public CallingMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callingMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterCallingMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitCallingMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitCallingMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallingMethodContext callingMethod() throws RecognitionException {
		CallingMethodContext _localctx = new CallingMethodContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_callingMethod);
		int _la;
		try {
			int _alt;
			setState(897);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(843);
				_la = _input.LA(1);
				if ( !(_la==CATCH || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(844);
				match(LPAREN);
				setState(853);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2522613925652987904L) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 597862282959359L) != 0)) {
					{
					setState(845);
					expression(0);
					setState(850);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(846);
						match(COMMA);
						setState(847);
						expression(0);
						}
						}
						setState(852);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(855);
				match(RPAREN);
				}
				setState(865);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(863);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case DOT:
							{
							{
							setState(857);
							match(DOT);
							setState(860);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
							case 1:
								{
								setState(858);
								callingMethod();
								}
								break;
							case 2:
								{
								setState(859);
								match(IDENTIFIER);
								}
								break;
							}
							}
							}
							break;
						case LSBRACKET:
						case LCURLY:
							{
							setState(862);
							dataStructure();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(867);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(871);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case A:
					{
					setState(868);
					match(A);
					setState(869);
					match(IDENTIFIER);
					}
					break;
				case CATCH:
					{
					setState(870);
					match(CATCH);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(873);
				match(LPAREN);
				setState(882);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2522613925652987904L) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 597862282959359L) != 0)) {
					{
					setState(874);
					expression(0);
					setState(879);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(875);
						match(COMMA);
						setState(876);
						expression(0);
						}
						}
						setState(881);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(884);
				match(RPAREN);
				}
				setState(894);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(892);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case DOT:
							{
							{
							setState(886);
							match(DOT);
							setState(889);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
							case 1:
								{
								setState(887);
								callingMethod();
								}
								break;
							case 2:
								{
								setState(888);
								match(IDENTIFIER);
								}
								break;
							}
							}
							}
							break;
						case LSBRACKET:
						case LCURLY:
							{
							setState(891);
							dataStructure();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(896);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DataStructureContext extends ParserRuleContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public MapContext map() {
			return getRuleContext(MapContext.class,0);
		}
		public DataStructureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataStructure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterDataStructure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitDataStructure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitDataStructure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataStructureContext dataStructure() throws RecognitionException {
		DataStructureContext _localctx = new DataStructureContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_dataStructure);
		try {
			setState(901);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(899);
				list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(900);
				map();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ItemsStructuresContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ParserAngular.IDENTIFIER, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public MapContext map() {
			return getRuleContext(MapContext.class,0);
		}
		public CallingMethodContext callingMethod() {
			return getRuleContext(CallingMethodContext.class,0);
		}
		public ItemsStructuresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_itemsStructures; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterItemsStructures(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitItemsStructures(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitItemsStructures(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemsStructuresContext itemsStructures() throws RecognitionException {
		ItemsStructuresContext _localctx = new ItemsStructuresContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_itemsStructures);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(908);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				{
				setState(903);
				literal();
				}
				break;
			case 2:
				{
				setState(904);
				match(IDENTIFIER);
				}
				break;
			case 3:
				{
				setState(905);
				list();
				}
				break;
			case 4:
				{
				setState(906);
				map();
				}
				break;
			case 5:
				{
				setState(907);
				callingMethod();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MapContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(ParserAngular.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(ParserAngular.RCURLY, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ParserAngular.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserAngular.COMMA, i);
		}
		public List<ItemsStructuresContext> itemsStructures() {
			return getRuleContexts(ItemsStructuresContext.class);
		}
		public ItemsStructuresContext itemsStructures(int i) {
			return getRuleContext(ItemsStructuresContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(ParserAngular.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(ParserAngular.COLON, i);
		}
		public MapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitMap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitMap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapContext map() throws RecognitionException {
		MapContext _localctx = new MapContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_map);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(910);
			match(LCURLY);
			setState(925);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CATCH || _la==THIS || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & 291924869123L) != 0)) {
				{
				{
				setState(911);
				itemsStructures();
				setState(912);
				match(COLON);
				setState(913);
				itemsStructures();
				}
				setState(922);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(915);
						match(COMMA);
						{
						setState(916);
						itemsStructures();
						setState(917);
						match(COLON);
						setState(918);
						itemsStructures();
						}
						}
						} 
					}
					setState(924);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
				}
				}
			}

			setState(928);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(927);
				match(COMMA);
				}
			}

			setState(930);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListContext extends ParserRuleContext {
		public TerminalNode LSBRACKET() { return getToken(ParserAngular.LSBRACKET, 0); }
		public TerminalNode RSBRACKET() { return getToken(ParserAngular.RSBRACKET, 0); }
		public List<ItemsStructuresContext> itemsStructures() {
			return getRuleContexts(ItemsStructuresContext.class);
		}
		public ItemsStructuresContext itemsStructures(int i) {
			return getRuleContext(ItemsStructuresContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ParserAngular.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserAngular.COMMA, i);
		}
		public TerminalNode LCURLY() { return getToken(ParserAngular.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(ParserAngular.RCURLY, 0); }
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_list);
		int _la;
		try {
			int _alt;
			setState(968);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(932);
				match(LSBRACKET);
				setState(941);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CATCH || _la==THIS || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & 291924869123L) != 0)) {
					{
					setState(933);
					itemsStructures();
					setState(938);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(934);
							match(COMMA);
							setState(935);
							itemsStructures();
							}
							} 
						}
						setState(940);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
					}
					}
				}

				setState(944);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(943);
					match(COMMA);
					}
				}

				setState(946);
				match(RSBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(948);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LCURLY) {
					{
					setState(947);
					match(LCURLY);
					}
				}

				setState(950);
				match(LSBRACKET);
				setState(959);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CATCH || _la==THIS || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & 291924869123L) != 0)) {
					{
					setState(951);
					itemsStructures();
					setState(956);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(952);
							match(COMMA);
							setState(953);
							itemsStructures();
							}
							} 
						}
						setState(958);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
					}
					}
				}

				setState(962);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(961);
					match(COMMA);
					}
				}

				setState(964);
				match(RSBRACKET);
				setState(966);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
				case 1:
					{
					setState(965);
					match(RCURLY);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(ParserAngular.EQUAL, 0); }
		public TerminalNode PLUS() { return getToken(ParserAngular.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ParserAngular.MINUS, 0); }
		public TerminalNode STAR() { return getToken(ParserAngular.STAR, 0); }
		public TerminalNode DIVIDE() { return getToken(ParserAngular.DIVIDE, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_operator);
		try {
			setState(979);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(970);
				match(EQUAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(971);
				match(PLUS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(972);
				match(MINUS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(973);
				match(STAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(974);
				match(DIVIDE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(975);
				match(PLUS);
				setState(976);
				match(EQUAL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(977);
				match(MINUS);
				setState(978);
				match(EQUAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompersionContext extends ParserRuleContext {
		public TerminalNode GREATER_THAN() { return getToken(ParserAngular.GREATER_THAN, 0); }
		public TerminalNode LESS_THAN() { return getToken(ParserAngular.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN_OR_EQUAL() { return getToken(ParserAngular.GREATER_THAN_OR_EQUAL, 0); }
		public TerminalNode LESS_THAN_OR_EQUAL() { return getToken(ParserAngular.LESS_THAN_OR_EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(ParserAngular.NOT_EQUAL, 0); }
		public TerminalNode EQUAL_TO() { return getToken(ParserAngular.EQUAL_TO, 0); }
		public TerminalNode AND() { return getToken(ParserAngular.AND, 0); }
		public TerminalNode OR() { return getToken(ParserAngular.OR, 0); }
		public TerminalNode EQUAL_TO3() { return getToken(ParserAngular.EQUAL_TO3, 0); }
		public TerminalNode NOT_EQUAL2() { return getToken(ParserAngular.NOT_EQUAL2, 0); }
		public CompersionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compersion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterCompersion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitCompersion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitCompersion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompersionContext compersion() throws RecognitionException {
		CompersionContext _localctx = new CompersionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_compersion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(981);
			_la = _input.LA(1);
			if ( !(((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & 2043L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EosContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(ParserAngular.SEMI, 0); }
		public EosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterEos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitEos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitEos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EosContext eos() throws RecognitionException {
		EosContext _localctx = new EosContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_eos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(984);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				{
				setState(983);
				match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JasmineStatementContext extends ParserRuleContext {
		public JasmineStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jasmineStatement; }
	 
		public JasmineStatementContext() { }
		public void copyFrom(JasmineStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DescribeContext extends JasmineStatementContext {
		public JasmineDescribeContext jasmineDescribe() {
			return getRuleContext(JasmineDescribeContext.class,0);
		}
		public DescribeContext(JasmineStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterDescribe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitDescribe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitDescribe(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BeforeEachContext extends JasmineStatementContext {
		public JasmineBeforeEachContext jasmineBeforeEach() {
			return getRuleContext(JasmineBeforeEachContext.class,0);
		}
		public BeforeEachContext(JasmineStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterBeforeEach(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitBeforeEach(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitBeforeEach(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AfterEachContext extends JasmineStatementContext {
		public JasmineAfterEachContext jasmineAfterEach() {
			return getRuleContext(JasmineAfterEachContext.class,0);
		}
		public AfterEachContext(JasmineStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterAfterEach(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitAfterEach(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitAfterEach(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ItContext extends JasmineStatementContext {
		public JasmineItContext jasmineIt() {
			return getRuleContext(JasmineItContext.class,0);
		}
		public ItContext(JasmineStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterIt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitIt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitIt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JasmineStatementContext jasmineStatement() throws RecognitionException {
		JasmineStatementContext _localctx = new JasmineStatementContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_jasmineStatement);
		try {
			setState(990);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DESCRIBE:
				_localctx = new DescribeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(986);
				jasmineDescribe();
				}
				break;
			case IT:
				_localctx = new ItContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(987);
				jasmineIt();
				}
				break;
			case BEFOREEACH:
				_localctx = new BeforeEachContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(988);
				jasmineBeforeEach();
				}
				break;
			case AFTEREACH:
				_localctx = new AfterEachContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(989);
				jasmineAfterEach();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JasmineDescribeContext extends ParserRuleContext {
		public TerminalNode DESCRIBE() { return getToken(ParserAngular.DESCRIBE, 0); }
		public TerminalNode LPAREN() { return getToken(ParserAngular.LPAREN, 0); }
		public TerminalNode String() { return getToken(ParserAngular.String, 0); }
		public TerminalNode COMMA() { return getToken(ParserAngular.COMMA, 0); }
		public JasmineCallbackContext jasmineCallback() {
			return getRuleContext(JasmineCallbackContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ParserAngular.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(ParserAngular.SEMI, 0); }
		public ArrowMethodContext arrowMethod() {
			return getRuleContext(ArrowMethodContext.class,0);
		}
		public JasmineDescribeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jasmineDescribe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterJasmineDescribe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitJasmineDescribe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitJasmineDescribe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JasmineDescribeContext jasmineDescribe() throws RecognitionException {
		JasmineDescribeContext _localctx = new JasmineDescribeContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_jasmineDescribe);
		try {
			setState(1011);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(992);
				match(DESCRIBE);
				setState(993);
				match(LPAREN);
				setState(994);
				match(String);
				setState(995);
				match(COMMA);
				setState(996);
				jasmineCallback();
				setState(998);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
				case 1:
					{
					setState(997);
					match(RPAREN);
					}
					break;
				}
				setState(1001);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
				case 1:
					{
					setState(1000);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1003);
				match(DESCRIBE);
				setState(1004);
				match(LPAREN);
				setState(1005);
				match(String);
				setState(1006);
				match(COMMA);
				setState(1007);
				arrowMethod();
				setState(1008);
				match(RPAREN);
				setState(1009);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JasmineCallbackContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(ParserAngular.ARROW, 0); }
		public TerminalNode LCURLY() { return getToken(ParserAngular.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(ParserAngular.RCURLY, 0); }
		public TerminalNode ASYNC() { return getToken(ParserAngular.ASYNC, 0); }
		public List<JasmineStatementContext> jasmineStatement() {
			return getRuleContexts(JasmineStatementContext.class);
		}
		public JasmineStatementContext jasmineStatement(int i) {
			return getRuleContext(JasmineStatementContext.class,i);
		}
		public JasmineCallbackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jasmineCallback; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterJasmineCallback(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitJasmineCallback(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitJasmineCallback(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JasmineCallbackContext jasmineCallback() throws RecognitionException {
		JasmineCallbackContext _localctx = new JasmineCallbackContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_jasmineCallback);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1014);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASYNC) {
				{
				setState(1013);
				match(ASYNC);
				}
			}

			setState(1016);
			parameterList();
			setState(1017);
			match(ARROW);
			setState(1018);
			match(LCURLY);
			setState(1022);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 29L) != 0)) {
				{
				{
				setState(1019);
				jasmineStatement();
				}
				}
				setState(1024);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1025);
			match(RCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JasmineItContext extends ParserRuleContext {
		public TerminalNode IT() { return getToken(ParserAngular.IT, 0); }
		public TerminalNode LPAREN() { return getToken(ParserAngular.LPAREN, 0); }
		public List<TerminalNode> String() { return getTokens(ParserAngular.String); }
		public TerminalNode String(int i) {
			return getToken(ParserAngular.String, i);
		}
		public TerminalNode COMMA() { return getToken(ParserAngular.COMMA, 0); }
		public ArrowMethodContext arrowMethod() {
			return getRuleContext(ArrowMethodContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ParserAngular.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(ParserAngular.SEMI, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ParserAngular.IDENTIFIER, 0); }
		public JasmineItContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jasmineIt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterJasmineIt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitJasmineIt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitJasmineIt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JasmineItContext jasmineIt() throws RecognitionException {
		JasmineItContext _localctx = new JasmineItContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_jasmineIt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1027);
			match(IT);
			setState(1028);
			match(LPAREN);
			setState(1029);
			match(String);
			setState(1031);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(1030);
				match(IDENTIFIER);
				}
			}

			setState(1034);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==String) {
				{
				setState(1033);
				match(String);
				}
			}

			setState(1036);
			match(COMMA);
			setState(1037);
			arrowMethod();
			setState(1038);
			match(RPAREN);
			setState(1039);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JasmineBeforeEachContext extends ParserRuleContext {
		public TerminalNode BEFOREEACH() { return getToken(ParserAngular.BEFOREEACH, 0); }
		public TerminalNode LPAREN() { return getToken(ParserAngular.LPAREN, 0); }
		public ArrowMethodContext arrowMethod() {
			return getRuleContext(ArrowMethodContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ParserAngular.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(ParserAngular.SEMI, 0); }
		public JasmineBeforeEachContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jasmineBeforeEach; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterJasmineBeforeEach(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitJasmineBeforeEach(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitJasmineBeforeEach(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JasmineBeforeEachContext jasmineBeforeEach() throws RecognitionException {
		JasmineBeforeEachContext _localctx = new JasmineBeforeEachContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_jasmineBeforeEach);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1041);
			match(BEFOREEACH);
			setState(1042);
			match(LPAREN);
			setState(1043);
			arrowMethod();
			setState(1044);
			match(RPAREN);
			setState(1045);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JasmineAfterEachContext extends ParserRuleContext {
		public TerminalNode AFTEREACH() { return getToken(ParserAngular.AFTEREACH, 0); }
		public TerminalNode LPAREN() { return getToken(ParserAngular.LPAREN, 0); }
		public ArrowMethodContext arrowMethod() {
			return getRuleContext(ArrowMethodContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ParserAngular.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(ParserAngular.SEMI, 0); }
		public JasmineAfterEachContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jasmineAfterEach; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterJasmineAfterEach(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitJasmineAfterEach(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitJasmineAfterEach(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JasmineAfterEachContext jasmineAfterEach() throws RecognitionException {
		JasmineAfterEachContext _localctx = new JasmineAfterEachContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_jasmineAfterEach);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1047);
			match(AFTEREACH);
			setState(1048);
			match(LPAREN);
			setState(1049);
			arrowMethod();
			setState(1050);
			match(RPAREN);
			setState(1051);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementContext extends ParserRuleContext {
		public TerminalNode TAG_OPEN() { return getToken(ParserAngular.TAG_OPEN, 0); }
		public TerminalNode HTML_TAG_NAME() { return getToken(ParserAngular.HTML_TAG_NAME, 0); }
		public TerminalNode HTML_TAG_CLOSE() { return getToken(ParserAngular.HTML_TAG_CLOSE, 0); }
		public HtmlClosingTagContext htmlClosingTag() {
			return getRuleContext(HtmlClosingTagContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public HtmlAttributesContext htmlAttributes() {
			return getRuleContext(HtmlAttributesContext.class,0);
		}
		public List<HtmlContentContext> htmlContent() {
			return getRuleContexts(HtmlContentContext.class);
		}
		public HtmlContentContext htmlContent(int i) {
			return getRuleContext(HtmlContentContext.class,i);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TerminalNode HTML_SLASH_CLOSE() { return getToken(ParserAngular.HTML_SLASH_CLOSE, 0); }
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterHtmlElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitHtmlElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitHtmlElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_htmlElement);
		int _la;
		try {
			int _alt;
			setState(1084);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1053);
				match(TAG_OPEN);
				setState(1055);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOCTYPE) {
					{
					setState(1054);
					declaration();
					}
				}

				setState(1057);
				match(HTML_TAG_NAME);
				setState(1059);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
				case 1:
					{
					setState(1058);
					htmlAttributes();
					}
					break;
				}
				setState(1061);
				match(HTML_TAG_CLOSE);
				setState(1065);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1062);
						htmlContent();
						}
						} 
					}
					setState(1067);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
				}
				setState(1068);
				htmlClosingTag();
				setState(1070);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
				case 1:
					{
					setState(1069);
					eos();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1072);
				match(TAG_OPEN);
				setState(1074);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOCTYPE) {
					{
					setState(1073);
					declaration();
					}
				}

				setState(1076);
				match(HTML_TAG_NAME);
				setState(1078);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
				case 1:
					{
					setState(1077);
					htmlAttributes();
					}
					break;
				}
				setState(1080);
				match(HTML_SLASH_CLOSE);
				setState(1082);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
				case 1:
					{
					setState(1081);
					eos();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode DOCTYPE() { return getToken(ParserAngular.DOCTYPE, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1086);
			match(DOCTYPE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAttributesContext extends ParserRuleContext {
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public List<AngularAttributeContext> angularAttribute() {
			return getRuleContexts(AngularAttributeContext.class);
		}
		public AngularAttributeContext angularAttribute(int i) {
			return getRuleContext(AngularAttributeContext.class,i);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public HtmlAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterHtmlAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitHtmlAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitHtmlAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAttributesContext htmlAttributes() throws RecognitionException {
		HtmlAttributesContext _localctx = new HtmlAttributesContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_htmlAttributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1092);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 503808L) != 0)) {
				{
				setState(1090);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
				case 1:
					{
					setState(1088);
					htmlAttribute();
					}
					break;
				case 2:
					{
					setState(1089);
					angularAttribute();
					}
					break;
				}
				}
				setState(1094);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1096);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				{
				setState(1095);
				eos();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AngularAttributeContext extends ParserRuleContext {
		public TerminalNode HTML_PROPERTY_BINDING() { return getToken(ParserAngular.HTML_PROPERTY_BINDING, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TerminalNode HTML_EVENT_BINDING() { return getToken(ParserAngular.HTML_EVENT_BINDING, 0); }
		public TerminalNode HTML_TWO_WAY_BINDING() { return getToken(ParserAngular.HTML_TWO_WAY_BINDING, 0); }
		public TerminalNode HTML_STAR_BINDING() { return getToken(ParserAngular.HTML_STAR_BINDING, 0); }
		public TerminalNode HTML_INTERPOLATION() { return getToken(ParserAngular.HTML_INTERPOLATION, 0); }
		public AngularAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_angularAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterAngularAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitAngularAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitAngularAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AngularAttributeContext angularAttribute() throws RecognitionException {
		AngularAttributeContext _localctx = new AngularAttributeContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_angularAttribute);
		try {
			setState(1118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_PROPERTY_BINDING:
				enterOuterAlt(_localctx, 1);
				{
				setState(1098);
				match(HTML_PROPERTY_BINDING);
				setState(1100);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
				case 1:
					{
					setState(1099);
					eos();
					}
					break;
				}
				}
				break;
			case HTML_EVENT_BINDING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1102);
				match(HTML_EVENT_BINDING);
				setState(1104);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
				case 1:
					{
					setState(1103);
					eos();
					}
					break;
				}
				}
				break;
			case HTML_TWO_WAY_BINDING:
				enterOuterAlt(_localctx, 3);
				{
				setState(1106);
				match(HTML_TWO_WAY_BINDING);
				setState(1108);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
				case 1:
					{
					setState(1107);
					eos();
					}
					break;
				}
				}
				break;
			case HTML_STAR_BINDING:
				enterOuterAlt(_localctx, 4);
				{
				setState(1110);
				match(HTML_STAR_BINDING);
				setState(1112);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
				case 1:
					{
					setState(1111);
					eos();
					}
					break;
				}
				}
				break;
			case HTML_INTERPOLATION:
				enterOuterAlt(_localctx, 5);
				{
				setState(1114);
				match(HTML_INTERPOLATION);
				setState(1116);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
				case 1:
					{
					setState(1115);
					eos();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlClosingTagContext extends ParserRuleContext {
		public TerminalNode TAG_OPEN() { return getToken(ParserAngular.TAG_OPEN, 0); }
		public TerminalNode HTML_SLASH() { return getToken(ParserAngular.HTML_SLASH, 0); }
		public TerminalNode HTML_TAG_NAME() { return getToken(ParserAngular.HTML_TAG_NAME, 0); }
		public TerminalNode HTML_TAG_CLOSE() { return getToken(ParserAngular.HTML_TAG_CLOSE, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public HtmlClosingTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlClosingTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterHtmlClosingTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitHtmlClosingTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitHtmlClosingTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlClosingTagContext htmlClosingTag() throws RecognitionException {
		HtmlClosingTagContext _localctx = new HtmlClosingTagContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_htmlClosingTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1120);
			match(TAG_OPEN);
			setState(1121);
			match(HTML_SLASH);
			setState(1122);
			match(HTML_TAG_NAME);
			setState(1123);
			match(HTML_TAG_CLOSE);
			setState(1125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				{
				setState(1124);
				eos();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAttributeContext extends ParserRuleContext {
		public TerminalNode HTML_ATTRIBUTE_NAME() { return getToken(ParserAngular.HTML_ATTRIBUTE_NAME, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TerminalNode HTML_EQUALS() { return getToken(ParserAngular.HTML_EQUALS, 0); }
		public TerminalNode HTML_ATTRIBUTE_VALUE() { return getToken(ParserAngular.HTML_ATTRIBUTE_VALUE, 0); }
		public TerminalNode HTML_PROPERTY_BINDING() { return getToken(ParserAngular.HTML_PROPERTY_BINDING, 0); }
		public TerminalNode HTML_EVENT_BINDING() { return getToken(ParserAngular.HTML_EVENT_BINDING, 0); }
		public TerminalNode HTML_TWO_WAY_BINDING() { return getToken(ParserAngular.HTML_TWO_WAY_BINDING, 0); }
		public TerminalNode HTML_STAR_BINDING() { return getToken(ParserAngular.HTML_STAR_BINDING, 0); }
		public HtmlAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterHtmlAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitHtmlAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitHtmlAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAttributeContext htmlAttribute() throws RecognitionException {
		HtmlAttributeContext _localctx = new HtmlAttributeContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_htmlAttribute);
		int _la;
		try {
			setState(1157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_ATTRIBUTE_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(1127);
				match(HTML_ATTRIBUTE_NAME);
				setState(1130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HTML_EQUALS) {
					{
					setState(1128);
					match(HTML_EQUALS);
					setState(1129);
					match(HTML_ATTRIBUTE_VALUE);
					}
				}

				setState(1132);
				eos();
				}
				break;
			case HTML_PROPERTY_BINDING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1133);
				match(HTML_PROPERTY_BINDING);
				setState(1136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HTML_EQUALS) {
					{
					setState(1134);
					match(HTML_EQUALS);
					setState(1135);
					match(HTML_ATTRIBUTE_VALUE);
					}
				}

				setState(1138);
				eos();
				}
				break;
			case HTML_EVENT_BINDING:
				enterOuterAlt(_localctx, 3);
				{
				setState(1139);
				match(HTML_EVENT_BINDING);
				setState(1142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HTML_EQUALS) {
					{
					setState(1140);
					match(HTML_EQUALS);
					setState(1141);
					match(HTML_ATTRIBUTE_VALUE);
					}
				}

				setState(1144);
				eos();
				}
				break;
			case HTML_TWO_WAY_BINDING:
				enterOuterAlt(_localctx, 4);
				{
				setState(1145);
				match(HTML_TWO_WAY_BINDING);
				setState(1148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HTML_EQUALS) {
					{
					setState(1146);
					match(HTML_EQUALS);
					setState(1147);
					match(HTML_ATTRIBUTE_VALUE);
					}
				}

				setState(1150);
				eos();
				}
				break;
			case HTML_STAR_BINDING:
				enterOuterAlt(_localctx, 5);
				{
				setState(1151);
				match(HTML_STAR_BINDING);
				setState(1154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HTML_EQUALS) {
					{
					setState(1152);
					match(HTML_EQUALS);
					setState(1153);
					match(HTML_ATTRIBUTE_VALUE);
					}
				}

				setState(1156);
				eos();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContentContext extends ParserRuleContext {
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TerminalNode HTML_INTERPOLATION() { return getToken(ParserAngular.HTML_INTERPOLATION, 0); }
		public TerminalNode TEXT() { return getToken(ParserAngular.TEXT, 0); }
		public HtmlContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterHtmlContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitHtmlContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitHtmlContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContentContext htmlContent() throws RecognitionException {
		HtmlContentContext _localctx = new HtmlContentContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_htmlContent);
		try {
			setState(1166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAG_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1159);
				htmlElement();
				setState(1160);
				eos();
				}
				break;
			case HTML_INTERPOLATION:
				enterOuterAlt(_localctx, 2);
				{
				setState(1162);
				match(HTML_INTERPOLATION);
				setState(1163);
				eos();
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1164);
				match(TEXT);
				setState(1165);
				eos();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StylesheetContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ParserAngular.EOF, 0); }
		public StyleBlockContext styleBlock() {
			return getRuleContext(StyleBlockContext.class,0);
		}
		public StylesheetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stylesheet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterStylesheet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitStylesheet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitStylesheet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StylesheetContext stylesheet() throws RecognitionException {
		StylesheetContext _localctx = new StylesheetContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_stylesheet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STYLE_OPEN) {
				{
				setState(1168);
				styleBlock();
				}
			}

			setState(1171);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StyleBlockContext extends ParserRuleContext {
		public TerminalNode STYLE_OPEN() { return getToken(ParserAngular.STYLE_OPEN, 0); }
		public CssRulesContext cssRules() {
			return getRuleContext(CssRulesContext.class,0);
		}
		public TerminalNode STYLE_CLOSE() { return getToken(ParserAngular.STYLE_CLOSE, 0); }
		public StyleBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterStyleBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitStyleBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitStyleBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleBlockContext styleBlock() throws RecognitionException {
		StyleBlockContext _localctx = new StyleBlockContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_styleBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1173);
			match(STYLE_OPEN);
			setState(1174);
			cssRules();
			setState(1175);
			match(STYLE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssRulesContext extends ParserRuleContext {
		public List<CssRuleContext> cssRule() {
			return getRuleContexts(CssRuleContext.class);
		}
		public CssRuleContext cssRule(int i) {
			return getRuleContext(CssRuleContext.class,i);
		}
		public CssRulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssRules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterCssRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitCssRules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitCssRules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssRulesContext cssRules() throws RecognitionException {
		CssRulesContext _localctx = new CssRulesContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_cssRules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2172649472L) != 0)) {
				{
				{
				setState(1177);
				cssRule();
				}
				}
				setState(1182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssRuleContext extends ParserRuleContext {
		public CssSelectorContext cssSelector() {
			return getRuleContext(CssSelectorContext.class,0);
		}
		public TerminalNode CSS_LBRACE() { return getToken(ParserAngular.CSS_LBRACE, 0); }
		public TerminalNode CSS_RBRACE() { return getToken(ParserAngular.CSS_RBRACE, 0); }
		public CssDeclarationsContext cssDeclarations() {
			return getRuleContext(CssDeclarationsContext.class,0);
		}
		public CssRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterCssRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitCssRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitCssRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssRuleContext cssRule() throws RecognitionException {
		CssRuleContext _localctx = new CssRuleContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_cssRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1183);
			cssSelector();
			setState(1184);
			match(CSS_LBRACE);
			setState(1186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CSS_PROPERTY) {
				{
				setState(1185);
				cssDeclarations();
				}
			}

			setState(1188);
			match(CSS_RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssSelectorContext extends ParserRuleContext {
		public List<CombinedSelectorContext> combinedSelector() {
			return getRuleContexts(CombinedSelectorContext.class);
		}
		public CombinedSelectorContext combinedSelector(int i) {
			return getRuleContext(CombinedSelectorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ParserAngular.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserAngular.COMMA, i);
		}
		public CssSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterCssSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitCssSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitCssSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssSelectorContext cssSelector() throws RecognitionException {
		CssSelectorContext _localctx = new CssSelectorContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_cssSelector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1190);
			combinedSelector();
			setState(1195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1191);
				match(COMMA);
				setState(1192);
				combinedSelector();
				}
				}
				setState(1197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CombinedSelectorContext extends ParserRuleContext {
		public List<SimpleSelectorContext> simpleSelector() {
			return getRuleContexts(SimpleSelectorContext.class);
		}
		public SimpleSelectorContext simpleSelector(int i) {
			return getRuleContext(SimpleSelectorContext.class,i);
		}
		public CombinedSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_combinedSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterCombinedSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitCombinedSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitCombinedSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CombinedSelectorContext combinedSelector() throws RecognitionException {
		CombinedSelectorContext _localctx = new CombinedSelectorContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_combinedSelector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1198);
			simpleSelector();
			setState(1202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2172649472L) != 0)) {
				{
				{
				setState(1199);
				simpleSelector();
				}
				}
				setState(1204);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleSelectorContext extends ParserRuleContext {
		public List<TerminalNode> CSS_CLASS_SELECTOR() { return getTokens(ParserAngular.CSS_CLASS_SELECTOR); }
		public TerminalNode CSS_CLASS_SELECTOR(int i) {
			return getToken(ParserAngular.CSS_CLASS_SELECTOR, i);
		}
		public List<TerminalNode> CSS_ID_SELECTOR() { return getTokens(ParserAngular.CSS_ID_SELECTOR); }
		public TerminalNode CSS_ID_SELECTOR(int i) {
			return getToken(ParserAngular.CSS_ID_SELECTOR, i);
		}
		public List<ElementSelectorContext> elementSelector() {
			return getRuleContexts(ElementSelectorContext.class);
		}
		public ElementSelectorContext elementSelector(int i) {
			return getRuleContext(ElementSelectorContext.class,i);
		}
		public PseudoClassContext pseudoClass() {
			return getRuleContext(PseudoClassContext.class,0);
		}
		public SimpleSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterSimpleSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitSimpleSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitSimpleSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleSelectorContext simpleSelector() throws RecognitionException {
		SimpleSelectorContext _localctx = new SimpleSelectorContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_simpleSelector);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1208); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(1208);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case CSS_CLASS_SELECTOR:
						{
						setState(1205);
						match(CSS_CLASS_SELECTOR);
						}
						break;
					case CSS_ID_SELECTOR:
						{
						setState(1206);
						match(CSS_ID_SELECTOR);
						}
						break;
					case CSS_IDENTIFIER:
						{
						setState(1207);
						elementSelector();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1210); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,182,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CSS_COLON) {
				{
				setState(1212);
				pseudoClass();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElementSelectorContext extends ParserRuleContext {
		public TerminalNode CSS_IDENTIFIER() { return getToken(ParserAngular.CSS_IDENTIFIER, 0); }
		public ElementSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterElementSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitElementSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitElementSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementSelectorContext elementSelector() throws RecognitionException {
		ElementSelectorContext _localctx = new ElementSelectorContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_elementSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1215);
			match(CSS_IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PseudoClassContext extends ParserRuleContext {
		public TerminalNode CSS_COLON() { return getToken(ParserAngular.CSS_COLON, 0); }
		public TerminalNode CSS_IDENTIFIER() { return getToken(ParserAngular.CSS_IDENTIFIER, 0); }
		public PseudoClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudoClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterPseudoClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitPseudoClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitPseudoClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PseudoClassContext pseudoClass() throws RecognitionException {
		PseudoClassContext _localctx = new PseudoClassContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_pseudoClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1217);
			match(CSS_COLON);
			setState(1218);
			match(CSS_IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssDeclarationsContext extends ParserRuleContext {
		public List<CssDeclarationContext> cssDeclaration() {
			return getRuleContexts(CssDeclarationContext.class);
		}
		public CssDeclarationContext cssDeclaration(int i) {
			return getRuleContext(CssDeclarationContext.class,i);
		}
		public List<TerminalNode> CSS_SEMICOLON() { return getTokens(ParserAngular.CSS_SEMICOLON); }
		public TerminalNode CSS_SEMICOLON(int i) {
			return getToken(ParserAngular.CSS_SEMICOLON, i);
		}
		public CssDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterCssDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitCssDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitCssDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssDeclarationsContext cssDeclarations() throws RecognitionException {
		CssDeclarationsContext _localctx = new CssDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_cssDeclarations);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1220);
			cssDeclaration();
			setState(1225);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1221);
					match(CSS_SEMICOLON);
					setState(1222);
					cssDeclaration();
					}
					} 
				}
				setState(1227);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
			}
			setState(1229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CSS_SEMICOLON) {
				{
				setState(1228);
				match(CSS_SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssDeclarationContext extends ParserRuleContext {
		public TerminalNode CSS_PROPERTY() { return getToken(ParserAngular.CSS_PROPERTY, 0); }
		public TerminalNode CSS_COLON() { return getToken(ParserAngular.CSS_COLON, 0); }
		public CssValueListContext cssValueList() {
			return getRuleContext(CssValueListContext.class,0);
		}
		public CssDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterCssDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitCssDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitCssDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssDeclarationContext cssDeclaration() throws RecognitionException {
		CssDeclarationContext _localctx = new CssDeclarationContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_cssDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1231);
			match(CSS_PROPERTY);
			setState(1232);
			match(CSS_COLON);
			setState(1233);
			cssValueList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssValueListContext extends ParserRuleContext {
		public List<CssValueContext> cssValue() {
			return getRuleContexts(CssValueContext.class);
		}
		public CssValueContext cssValue(int i) {
			return getRuleContext(CssValueContext.class,i);
		}
		public CssValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssValueList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterCssValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitCssValueList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitCssValueList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssValueListContext cssValueList() throws RecognitionException {
		CssValueListContext _localctx = new CssValueListContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_cssValueList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1235);
			cssValue();
			setState(1239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_PROPERTY || _la==CSS_VALUE) {
				{
				{
				setState(1236);
				cssValue();
				}
				}
				setState(1241);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssValueContext extends ParserRuleContext {
		public TerminalNode CSS_VALUE() { return getToken(ParserAngular.CSS_VALUE, 0); }
		public TerminalNode CSS_PROPERTY() { return getToken(ParserAngular.CSS_PROPERTY, 0); }
		public CssValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).enterCssValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserAngularListener ) ((ParserAngularListener)listener).exitCssValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserAngularVisitor ) return ((ParserAngularVisitor<? extends T>)visitor).visitCssValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssValueContext cssValue() throws RecognitionException {
		CssValueContext _localctx = new CssValueContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_cssValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1242);
			_la = _input.LA(1);
			if ( !(_la==CSS_PROPERTY || _la==CSS_VALUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 34:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 23);
		case 5:
			return precpred(_ctx, 18);
		case 6:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0081\u04dd\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u00a5\b"+
		"\u0000\n\u0000\f\u0000\u00a8\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0005\u0001\u00ae\b\u0001\n\u0001\f\u0001\u00b1\t\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002\u00ba\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00c2\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00ca"+
		"\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00d0"+
		"\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00d6"+
		"\b\u0004\u0005\u0004\u00d8\b\u0004\n\u0004\f\u0004\u00db\t\u0004\u0003"+
		"\u0004\u00dd\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00e8"+
		"\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u00ef\b\u0005\u0005\u0005\u00f1\b\u0005\n\u0005\f\u0005\u00f4\t"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0109"+
		"\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u0111\b\t"+
		"\n\t\f\t\u0114\t\t\u0003\t\u0116\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u011e\b\t\u0001\n\u0003\n\u0121\b\n\u0001\n\u0003\n"+
		"\u0124\b\n\u0001\n\u0001\n\u0001\n\u0003\n\u0129\b\n\u0003\n\u012b\b\n"+
		"\u0001\n\u0001\n\u0001\n\u0003\n\u0130\b\n\u0001\u000b\u0003\u000b\u0133"+
		"\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0139"+
		"\b\u000b\u0003\u000b\u013b\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u0140\b\u000b\u0001\f\u0003\f\u0143\b\f\u0001\f\u0003\f\u0146"+
		"\b\f\u0001\f\u0001\f\u0001\f\u0003\f\u014b\b\f\u0003\f\u014d\b\f\u0001"+
		"\f\u0001\f\u0003\f\u0151\b\f\u0001\f\u0005\f\u0154\b\f\n\f\f\f\u0157\t"+
		"\f\u0001\f\u0003\f\u015a\b\f\u0001\f\u0003\f\u015d\b\f\u0001\f\u0001\f"+
		"\u0001\f\u0003\f\u0162\b\f\u0003\f\u0164\b\f\u0001\f\u0003\f\u0167\b\f"+
		"\u0001\f\u0005\f\u016a\b\f\n\f\f\f\u016d\t\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u0172\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u0178\b\f\n\f\f\f"+
		"\u017b\t\f\u0003\f\u017d\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u0186\b\f\u0001\r\u0001\r\u0005\r\u018a\b\r\n\r\f\r"+
		"\u018d\t\r\u0001\r\u0003\r\u0190\b\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0198\b\u000e\n\u000e\f\u000e"+
		"\u019b\t\u000e\u0003\u000e\u019d\b\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u01a6"+
		"\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u01af\b\u000f\u0001\u000f\u0003\u000f\u01b2"+
		"\b\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0003\u0011\u01b7\b\u0011"+
		"\u0001\u0011\u0003\u0011\u01ba\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u01bf\b\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u01c3\b"+
		"\u0011\n\u0011\f\u0011\u01c6\t\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u01d2\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u01d8\b\u0013\u0003\u0013\u01da\b\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u01e5\b\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u01ed"+
		"\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0003\u0017\u01f5\b\u0017\u0001\u0017\u0003\u0017\u01f8\b\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u01fd\b\u0017\u0001\u0017"+
		"\u0001\u0017\u0003\u0017\u0201\b\u0017\u0001\u0017\u0001\u0017\u0003\u0017"+
		"\u0205\b\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0003\u0019\u020c\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019"+
		"\u0211\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0216\b"+
		"\u0019\u0001\u0019\u0003\u0019\u0219\b\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0003\u0019\u021e\b\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0222"+
		"\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u022d\b\u001a\u0001"+
		"\u001b\u0001\u001b\u0003\u001b\u0231\b\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0003\u001c\u0239\b\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u023e\b\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u0244\b\u001d\n\u001d\f\u001d"+
		"\u0247\t\u001d\u0003\u001d\u0249\b\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0250\b\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0003\u001e\u0255\b\u001e\u0005\u001e\u0257\b\u001e"+
		"\n\u001e\f\u001e\u025a\t\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u0262\b\u001f\n\u001f\f\u001f"+
		"\u0265\t\u001f\u0003\u001f\u0267\b\u001f\u0001\u001f\u0003\u001f\u026a"+
		"\b\u001f\u0001\u001f\u0001\u001f\u0001 \u0003 \u026f\b \u0001 \u0001 "+
		"\u0003 \u0273\b \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u027b"+
		"\b \u0001!\u0001!\u0003!\u027f\b!\u0001!\u0001!\u0003!\u0283\b!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u028b\b!\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0003\"\u02ab\b\"\u0001\"\u0001\"\u0003\"\u02af\b\"\u0003\"\u02b1\b"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0003\"\u02c8\b\"\u0001\"\u0001\"\u0001\"\u0005"+
		"\"\u02cd\b\"\n\"\f\"\u02d0\t\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0005#\u02d8\b#\n#\f#\u02db\t#\u0001#\u0003#\u02de\b#\u0001#\u0001#"+
		"\u0003#\u02e2\b#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001%\u0001"+
		"%\u0001%\u0001&\u0003&\u02ee\b&\u0001&\u0001&\u0003&\u02f2\b&\u0001&\u0001"+
		"&\u0003&\u02f6\b&\u0001&\u0001&\u0003&\u02fa\b&\u0001&\u0005&\u02fd\b"+
		"&\n&\f&\u0300\t&\u0001&\u0001&\u0001\'\u0001\'\u0003\'\u0306\b\'\u0001"+
		"\'\u0001\'\u0003\'\u030a\b\'\u0001\'\u0001\'\u0003\'\u030e\b\'\u0001\'"+
		"\u0001\'\u0003\'\u0312\b\'\u0001(\u0001(\u0003(\u0316\b(\u0001(\u0001"+
		"(\u0003(\u031a\b(\u0001)\u0003)\u031d\b)\u0001)\u0001)\u0003)\u0321\b"+
		")\u0001)\u0001)\u0001)\u0001*\u0001*\u0001*\u0001*\u0003*\u032a\b*\u0001"+
		"*\u0001*\u0003*\u032e\b*\u0001*\u0001*\u0003*\u0332\b*\u0001*\u0001*\u0001"+
		"*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001"+
		"-\u0001-\u0003-\u0342\b-\u0001-\u0003-\u0345\b-\u0001-\u0003-\u0348\b"+
		"-\u0001-\u0001-\u0001.\u0001.\u0001.\u0001.\u0001.\u0005.\u0351\b.\n."+
		"\f.\u0354\t.\u0003.\u0356\b.\u0001.\u0001.\u0001.\u0001.\u0001.\u0003"+
		".\u035d\b.\u0001.\u0005.\u0360\b.\n.\f.\u0363\t.\u0001.\u0001.\u0001."+
		"\u0003.\u0368\b.\u0001.\u0001.\u0001.\u0001.\u0005.\u036e\b.\n.\f.\u0371"+
		"\t.\u0003.\u0373\b.\u0001.\u0001.\u0001.\u0001.\u0001.\u0003.\u037a\b"+
		".\u0001.\u0005.\u037d\b.\n.\f.\u0380\t.\u0003.\u0382\b.\u0001/\u0001/"+
		"\u0003/\u0386\b/\u00010\u00010\u00010\u00010\u00010\u00030\u038d\b0\u0001"+
		"1\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u0005"+
		"1\u0399\b1\n1\f1\u039c\t1\u00031\u039e\b1\u00011\u00031\u03a1\b1\u0001"+
		"1\u00011\u00012\u00012\u00012\u00012\u00052\u03a9\b2\n2\f2\u03ac\t2\u0003"+
		"2\u03ae\b2\u00012\u00032\u03b1\b2\u00012\u00012\u00032\u03b5\b2\u0001"+
		"2\u00012\u00012\u00012\u00052\u03bb\b2\n2\f2\u03be\t2\u00032\u03c0\b2"+
		"\u00012\u00032\u03c3\b2\u00012\u00012\u00032\u03c7\b2\u00032\u03c9\b2"+
		"\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u0003"+
		"3\u03d4\b3\u00014\u00014\u00015\u00035\u03d9\b5\u00016\u00016\u00016\u0001"+
		"6\u00036\u03df\b6\u00017\u00017\u00017\u00017\u00017\u00017\u00037\u03e7"+
		"\b7\u00017\u00037\u03ea\b7\u00017\u00017\u00017\u00017\u00017\u00017\u0001"+
		"7\u00017\u00037\u03f4\b7\u00018\u00038\u03f7\b8\u00018\u00018\u00018\u0001"+
		"8\u00058\u03fd\b8\n8\f8\u0400\t8\u00018\u00018\u00019\u00019\u00019\u0001"+
		"9\u00039\u0408\b9\u00019\u00039\u040b\b9\u00019\u00019\u00019\u00019\u0001"+
		"9\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001<\u0001<\u0003<\u0420\b<\u0001<\u0001<\u0003<\u0424"+
		"\b<\u0001<\u0001<\u0005<\u0428\b<\n<\f<\u042b\t<\u0001<\u0001<\u0003<"+
		"\u042f\b<\u0001<\u0001<\u0003<\u0433\b<\u0001<\u0001<\u0003<\u0437\b<"+
		"\u0001<\u0001<\u0003<\u043b\b<\u0003<\u043d\b<\u0001=\u0001=\u0001>\u0001"+
		">\u0005>\u0443\b>\n>\f>\u0446\t>\u0001>\u0003>\u0449\b>\u0001?\u0001?"+
		"\u0003?\u044d\b?\u0001?\u0001?\u0003?\u0451\b?\u0001?\u0001?\u0003?\u0455"+
		"\b?\u0001?\u0001?\u0003?\u0459\b?\u0001?\u0001?\u0003?\u045d\b?\u0003"+
		"?\u045f\b?\u0001@\u0001@\u0001@\u0001@\u0001@\u0003@\u0466\b@\u0001A\u0001"+
		"A\u0001A\u0003A\u046b\bA\u0001A\u0001A\u0001A\u0001A\u0003A\u0471\bA\u0001"+
		"A\u0001A\u0001A\u0001A\u0003A\u0477\bA\u0001A\u0001A\u0001A\u0001A\u0003"+
		"A\u047d\bA\u0001A\u0001A\u0001A\u0001A\u0003A\u0483\bA\u0001A\u0003A\u0486"+
		"\bA\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0003B\u048f\bB\u0001"+
		"C\u0003C\u0492\bC\u0001C\u0001C\u0001D\u0001D\u0001D\u0001D\u0001E\u0005"+
		"E\u049b\bE\nE\fE\u049e\tE\u0001F\u0001F\u0001F\u0003F\u04a3\bF\u0001F"+
		"\u0001F\u0001G\u0001G\u0001G\u0005G\u04aa\bG\nG\fG\u04ad\tG\u0001H\u0001"+
		"H\u0005H\u04b1\bH\nH\fH\u04b4\tH\u0001I\u0001I\u0001I\u0004I\u04b9\bI"+
		"\u000bI\fI\u04ba\u0001I\u0003I\u04be\bI\u0001J\u0001J\u0001K\u0001K\u0001"+
		"K\u0001L\u0001L\u0001L\u0005L\u04c8\bL\nL\fL\u04cb\tL\u0001L\u0003L\u04ce"+
		"\bL\u0001M\u0001M\u0001M\u0001M\u0001N\u0001N\u0005N\u04d6\bN\nN\fN\u04d9"+
		"\tN\u0001O\u0001O\u0001O\u0000\u0001DP\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u0000\b\u0002\u0000"+
		"99OV\u0002\u0000>>\u0080\u0080\u0001\u0000BC\u0003\u00002355JJ\u0001\u0000"+
		"YZ\u0002\u0000--\u007f\u007f\u0002\u0000^_ah\u0001\u0000\u0015\u0016\u058f"+
		"\u0000\u00a6\u0001\u0000\u0000\u0000\u0002\u00ab\u0001\u0000\u0000\u0000"+
		"\u0004\u00b9\u0001\u0000\u0000\u0000\u0006\u00c9\u0001\u0000\u0000\u0000"+
		"\b\u00cb\u0001\u0000\u0000\u0000\n\u00e0\u0001\u0000\u0000\u0000\f\u00f8"+
		"\u0001\u0000\u0000\u0000\u000e\u00fc\u0001\u0000\u0000\u0000\u0010\u0108"+
		"\u0001\u0000\u0000\u0000\u0012\u011d\u0001\u0000\u0000\u0000\u0014\u012f"+
		"\u0001\u0000\u0000\u0000\u0016\u013f\u0001\u0000\u0000\u0000\u0018\u0185"+
		"\u0001\u0000\u0000\u0000\u001a\u0187\u0001\u0000\u0000\u0000\u001c\u0193"+
		"\u0001\u0000\u0000\u0000\u001e\u01b1\u0001\u0000\u0000\u0000 \u01b3\u0001"+
		"\u0000\u0000\u0000\"\u01b6\u0001\u0000\u0000\u0000$\u01d1\u0001\u0000"+
		"\u0000\u0000&\u01d3\u0001\u0000\u0000\u0000(\u01dd\u0001\u0000\u0000\u0000"+
		"*\u01e1\u0001\u0000\u0000\u0000,\u01e9\u0001\u0000\u0000\u0000.\u01f7"+
		"\u0001\u0000\u0000\u00000\u0208\u0001\u0000\u0000\u00002\u0221\u0001\u0000"+
		"\u0000\u00004\u022c\u0001\u0000\u0000\u00006\u0230\u0001\u0000\u0000\u0000"+
		"8\u0236\u0001\u0000\u0000\u0000:\u023a\u0001\u0000\u0000\u0000<\u024c"+
		"\u0001\u0000\u0000\u0000>\u025d\u0001\u0000\u0000\u0000@\u027a\u0001\u0000"+
		"\u0000\u0000B\u028a\u0001\u0000\u0000\u0000D\u02b0\u0001\u0000\u0000\u0000"+
		"F\u02e1\u0001\u0000\u0000\u0000H\u02e3\u0001\u0000\u0000\u0000J\u02e9"+
		"\u0001\u0000\u0000\u0000L\u02ed\u0001\u0000\u0000\u0000N\u0303\u0001\u0000"+
		"\u0000\u0000P\u0313\u0001\u0000\u0000\u0000R\u031c\u0001\u0000\u0000\u0000"+
		"T\u0325\u0001\u0000\u0000\u0000V\u0336\u0001\u0000\u0000\u0000X\u033c"+
		"\u0001\u0000\u0000\u0000Z\u033f\u0001\u0000\u0000\u0000\\\u0381\u0001"+
		"\u0000\u0000\u0000^\u0385\u0001\u0000\u0000\u0000`\u038c\u0001\u0000\u0000"+
		"\u0000b\u038e\u0001\u0000\u0000\u0000d\u03c8\u0001\u0000\u0000\u0000f"+
		"\u03d3\u0001\u0000\u0000\u0000h\u03d5\u0001\u0000\u0000\u0000j\u03d8\u0001"+
		"\u0000\u0000\u0000l\u03de\u0001\u0000\u0000\u0000n\u03f3\u0001\u0000\u0000"+
		"\u0000p\u03f6\u0001\u0000\u0000\u0000r\u0403\u0001\u0000\u0000\u0000t"+
		"\u0411\u0001\u0000\u0000\u0000v\u0417\u0001\u0000\u0000\u0000x\u043c\u0001"+
		"\u0000\u0000\u0000z\u043e\u0001\u0000\u0000\u0000|\u0444\u0001\u0000\u0000"+
		"\u0000~\u045e\u0001\u0000\u0000\u0000\u0080\u0460\u0001\u0000\u0000\u0000"+
		"\u0082\u0485\u0001\u0000\u0000\u0000\u0084\u048e\u0001\u0000\u0000\u0000"+
		"\u0086\u0491\u0001\u0000\u0000\u0000\u0088\u0495\u0001\u0000\u0000\u0000"+
		"\u008a\u049c\u0001\u0000\u0000\u0000\u008c\u049f\u0001\u0000\u0000\u0000"+
		"\u008e\u04a6\u0001\u0000\u0000\u0000\u0090\u04ae\u0001\u0000\u0000\u0000"+
		"\u0092\u04b8\u0001\u0000\u0000\u0000\u0094\u04bf\u0001\u0000\u0000\u0000"+
		"\u0096\u04c1\u0001\u0000\u0000\u0000\u0098\u04c4\u0001\u0000\u0000\u0000"+
		"\u009a\u04cf\u0001\u0000\u0000\u0000\u009c\u04d3\u0001\u0000\u0000\u0000"+
		"\u009e\u04da\u0001\u0000\u0000\u0000\u00a0\u00a5\u0003x<\u0000\u00a1\u00a5"+
		"\u0003\u0088D\u0000\u00a2\u00a5\u0003\u0002\u0001\u0000\u00a3\u00a5\u0003"+
		"\u0004\u0002\u0000\u00a4\u00a0\u0001\u0000\u0000\u0000\u00a4\u00a1\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a8\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a9\u0001"+
		"\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005"+
		"\u0000\u0000\u0001\u00aa\u0001\u0001\u0000\u0000\u0000\u00ab\u00af\u0005"+
		"\u0003\u0000\u0000\u00ac\u00ae\u0003\u0004\u0002\u0000\u00ad\u00ac\u0001"+
		"\u0000\u0000\u0000\u00ae\u00b1\u0001\u0000\u0000\u0000\u00af\u00ad\u0001"+
		"\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005"+
		" \u0000\u0000\u00b3\u0003\u0001\u0000\u0000\u0000\u00b4\u00ba\u0003\u0006"+
		"\u0003\u0000\u00b5\u00ba\u0003\n\u0005\u0000\u00b6\u00ba\u0003\"\u0011"+
		"\u0000\u00b7\u00ba\u0003\u0014\n\u0000\u00b8\u00ba\u0003B!\u0000\u00b9"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b9\u00b5\u0001\u0000\u0000\u0000\u00b9"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9"+
		"\u00b8\u0001\u0000\u0000\u0000\u00ba\u0005\u0001\u0000\u0000\u0000\u00bb"+
		"\u00c1\u00057\u0000\u0000\u00bc\u00c2\u0005\u007f\u0000\u0000\u00bd\u00be"+
		"\u0005[\u0000\u0000\u00be\u00bf\u0005:\u0000\u0000\u00bf\u00c2\u0005\u007f"+
		"\u0000\u0000\u00c0\u00c2\u0003\b\u0004\u0000\u00c1\u00bc\u0001\u0000\u0000"+
		"\u0000\u00c1\u00bd\u0001\u0000\u0000\u0000\u00c1\u00c0\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005;\u0000\u0000"+
		"\u00c4\u00c5\u0005w\u0000\u0000\u00c5\u00ca\u0003j5\u0000\u00c6\u00c7"+
		"\u00057\u0000\u0000\u00c7\u00c8\u0005w\u0000\u0000\u00c8\u00ca\u0003j"+
		"5\u0000\u00c9\u00bb\u0001\u0000\u0000\u0000\u00c9\u00c6\u0001\u0000\u0000"+
		"\u0000\u00ca\u0007\u0001\u0000\u0000\u0000\u00cb\u00dc\u0005m\u0000\u0000"+
		"\u00cc\u00cf\u0005\u007f\u0000\u0000\u00cd\u00ce\u0005:\u0000\u0000\u00ce"+
		"\u00d0\u0005\u007f\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf"+
		"\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d9\u0001\u0000\u0000\u0000\u00d1"+
		"\u00d2\u0005o\u0000\u0000\u00d2\u00d5\u0005\u007f\u0000\u0000\u00d3\u00d4"+
		"\u0005:\u0000\u0000\u00d4\u00d6\u0005\u007f\u0000\u0000\u00d5\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d8\u0001"+
		"\u0000\u0000\u0000\u00d7\u00d1\u0001\u0000\u0000\u0000\u00d8\u00db\u0001"+
		"\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00d9\u00da\u0001"+
		"\u0000\u0000\u0000\u00da\u00dd\u0001\u0000\u0000\u0000\u00db\u00d9\u0001"+
		"\u0000\u0000\u0000\u00dc\u00cc\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001"+
		"\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de\u00df\u0005"+
		"n\u0000\u0000\u00df\t\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005A\u0000"+
		"\u0000\u00e1\u00e2\u0005i\u0000\u0000\u00e2\u00e7\u0005m\u0000\u0000\u00e3"+
		"\u00e8\u0003\f\u0006\u0000\u00e4\u00e8\u0003\u000e\u0007\u0000\u00e5\u00e8"+
		"\u0003\u0010\b\u0000\u00e6\u00e8\u0003\u0012\t\u0000\u00e7\u00e3\u0001"+
		"\u0000\u0000\u0000\u00e7\u00e4\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001"+
		"\u0000\u0000\u0000\u00e7\u00e6\u0001\u0000\u0000\u0000\u00e8\u00f2\u0001"+
		"\u0000\u0000\u0000\u00e9\u00ee\u0005o\u0000\u0000\u00ea\u00ef\u0003\f"+
		"\u0006\u0000\u00eb\u00ef\u0003\u000e\u0007\u0000\u00ec\u00ef\u0003\u0010"+
		"\b\u0000\u00ed\u00ef\u0003\u0012\t\u0000\u00ee\u00ea\u0001\u0000\u0000"+
		"\u0000\u00ee\u00eb\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000"+
		"\u0000\u00ee\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f1\u0001\u0000\u0000"+
		"\u0000\u00f0\u00e9\u0001\u0000\u0000\u0000\u00f1\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000"+
		"\u0000\u00f3\u00f5\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000"+
		"\u0000\u00f5\u00f6\u0005n\u0000\u0000\u00f6\u00f7\u0005j\u0000\u0000\u00f7"+
		"\u000b\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005D\u0000\u0000\u00f9\u00fa"+
		"\u0005q\u0000\u0000\u00fa\u00fb\u0005w\u0000\u0000\u00fb\r\u0001\u0000"+
		"\u0000\u0000\u00fc\u00fd\u0005E\u0000\u0000\u00fd\u00fe\u0005q\u0000\u0000"+
		"\u00fe\u00ff\u0005x\u0000\u0000\u00ff\u000f\u0001\u0000\u0000\u0000\u0100"+
		"\u0101\u0005F\u0000\u0000\u0101\u0102\u0005q\u0000\u0000\u0102\u0103\u0005"+
		"k\u0000\u0000\u0103\u0104\u0005w\u0000\u0000\u0104\u0109\u0005l\u0000"+
		"\u0000\u0105\u0106\u0005G\u0000\u0000\u0106\u0107\u0005q\u0000\u0000\u0107"+
		"\u0109\u0005w\u0000\u0000\u0108\u0100\u0001\u0000\u0000\u0000\u0108\u0105"+
		"\u0001\u0000\u0000\u0000\u0109\u0011\u0001\u0000\u0000\u0000\u010a\u010b"+
		"\u00058\u0000\u0000\u010b\u010c\u0005q\u0000\u0000\u010c\u0115\u0005k"+
		"\u0000\u0000\u010d\u0112\u0005\u007f\u0000\u0000\u010e\u010f\u0005o\u0000"+
		"\u0000\u010f\u0111\u0005\u007f\u0000\u0000\u0110\u010e\u0001\u0000\u0000"+
		"\u0000\u0111\u0114\u0001\u0000\u0000\u0000\u0112\u0110\u0001\u0000\u0000"+
		"\u0000\u0112\u0113\u0001\u0000\u0000\u0000\u0113\u0116\u0001\u0000\u0000"+
		"\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0115\u010d\u0001\u0000\u0000"+
		"\u0000\u0115\u0116\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000"+
		"\u0000\u0117\u011e\u0005l\u0000\u0000\u0118\u0119\u00058\u0000\u0000\u0119"+
		"\u011a\u0005q\u0000\u0000\u011a\u011b\u0005k\u0000\u0000\u011b\u011c\u0005"+
		"\u007f\u0000\u0000\u011c\u011e\u0005l\u0000\u0000\u011d\u010a\u0001\u0000"+
		"\u0000\u0000\u011d\u0118\u0001\u0000\u0000\u0000\u011e\u0013\u0001\u0000"+
		"\u0000\u0000\u011f\u0121\u00050\u0000\u0000\u0120\u011f\u0001\u0000\u0000"+
		"\u0000\u0120\u0121\u0001\u0000\u0000\u0000\u0121\u0123\u0001\u0000\u0000"+
		"\u0000\u0122\u0124\u0005\u007f\u0000\u0000\u0123\u0122\u0001\u0000\u0000"+
		"\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u0124\u0125\u0001\u0000\u0000"+
		"\u0000\u0125\u012a\u0003\u001c\u000e\u0000\u0126\u0128\u0005q\u0000\u0000"+
		"\u0127\u0129\u0005\u007f\u0000\u0000\u0128\u0127\u0001\u0000\u0000\u0000"+
		"\u0128\u0129\u0001\u0000\u0000\u0000\u0129\u012b\u0001\u0000\u0000\u0000"+
		"\u012a\u0126\u0001\u0000\u0000\u0000\u012a\u012b\u0001\u0000\u0000\u0000"+
		"\u012b\u012c\u0001\u0000\u0000\u0000\u012c\u012d\u0003\u001a\r\u0000\u012d"+
		"\u0130\u0001\u0000\u0000\u0000\u012e\u0130\u0003\u0018\f\u0000\u012f\u0120"+
		"\u0001\u0000\u0000\u0000\u012f\u012e\u0001\u0000\u0000\u0000\u0130\u0015"+
		"\u0001\u0000\u0000\u0000\u0131\u0133\u0003 \u0010\u0000\u0132\u0131\u0001"+
		"\u0000\u0000\u0000\u0132\u0133\u0001\u0000\u0000\u0000\u0133\u0134\u0001"+
		"\u0000\u0000\u0000\u0134\u0135\u0005\u007f\u0000\u0000\u0135\u013a\u0003"+
		"\u001c\u000e\u0000\u0136\u0138\u0005q\u0000\u0000\u0137\u0139\u0005\u007f"+
		"\u0000\u0000\u0138\u0137\u0001\u0000\u0000\u0000\u0138\u0139\u0001\u0000"+
		"\u0000\u0000\u0139\u013b\u0001\u0000\u0000\u0000\u013a\u0136\u0001\u0000"+
		"\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b\u013c\u0001\u0000"+
		"\u0000\u0000\u013c\u013d\u0003\u001a\r\u0000\u013d\u0140\u0001\u0000\u0000"+
		"\u0000\u013e\u0140\u0003\u0018\f\u0000\u013f\u0132\u0001\u0000\u0000\u0000"+
		"\u013f\u013e\u0001\u0000\u0000\u0000\u0140\u0017\u0001\u0000\u0000\u0000"+
		"\u0141\u0143\u0003 \u0010\u0000\u0142\u0141\u0001\u0000\u0000\u0000\u0142"+
		"\u0143\u0001\u0000\u0000\u0000\u0143\u0145\u0001\u0000\u0000\u0000\u0144"+
		"\u0146\u0005\u007f\u0000\u0000\u0145\u0144\u0001\u0000\u0000\u0000\u0145"+
		"\u0146\u0001\u0000\u0000\u0000\u0146\u0147\u0001\u0000\u0000\u0000\u0147"+
		"\u014c\u0003\u001c\u000e\u0000\u0148\u014a\u0005q\u0000\u0000\u0149\u014b"+
		"\u0005\u007f\u0000\u0000\u014a\u0149\u0001\u0000\u0000\u0000\u014a\u014b"+
		"\u0001\u0000\u0000\u0000\u014b\u014d\u0001\u0000\u0000\u0000\u014c\u0148"+
		"\u0001\u0000\u0000\u0000\u014c\u014d\u0001\u0000\u0000\u0000\u014d\u014e"+
		"\u0001\u0000\u0000\u0000\u014e\u0150\u0005X\u0000\u0000\u014f\u0151\u0005"+
		"m\u0000\u0000\u0150\u014f\u0001\u0000\u0000\u0000\u0150\u0151\u0001\u0000"+
		"\u0000\u0000\u0151\u0155\u0001\u0000\u0000\u0000\u0152\u0154\u0003B!\u0000"+
		"\u0153\u0152\u0001\u0000\u0000\u0000\u0154\u0157\u0001\u0000\u0000\u0000"+
		"\u0155\u0153\u0001\u0000\u0000\u0000\u0155\u0156\u0001\u0000\u0000\u0000"+
		"\u0156\u0159\u0001\u0000\u0000\u0000\u0157\u0155\u0001\u0000\u0000\u0000"+
		"\u0158\u015a\u0005n\u0000\u0000\u0159\u0158\u0001\u0000\u0000\u0000\u0159"+
		"\u015a\u0001\u0000\u0000\u0000\u015a\u0186\u0001\u0000\u0000\u0000\u015b"+
		"\u015d\u0005\u007f\u0000\u0000\u015c\u015b\u0001\u0000\u0000\u0000\u015c"+
		"\u015d\u0001\u0000\u0000\u0000\u015d\u015e\u0001\u0000\u0000\u0000\u015e"+
		"\u0163\u0003\u001c\u000e\u0000\u015f\u0161\u0005q\u0000\u0000\u0160\u0162"+
		"\u0005\u007f\u0000\u0000\u0161\u0160\u0001\u0000\u0000\u0000\u0161\u0162"+
		"\u0001\u0000\u0000\u0000\u0162\u0164\u0001\u0000\u0000\u0000\u0163\u015f"+
		"\u0001\u0000\u0000\u0000\u0163\u0164\u0001\u0000\u0000\u0000\u0164\u0166"+
		"\u0001\u0000\u0000\u0000\u0165\u0167\u0005m\u0000\u0000\u0166\u0165\u0001"+
		"\u0000\u0000\u0000\u0166\u0167\u0001\u0000\u0000\u0000\u0167\u016b\u0001"+
		"\u0000\u0000\u0000\u0168\u016a\u0003B!\u0000\u0169\u0168\u0001\u0000\u0000"+
		"\u0000\u016a\u016d\u0001\u0000\u0000\u0000\u016b\u0169\u0001\u0000\u0000"+
		"\u0000\u016b\u016c\u0001\u0000\u0000\u0000\u016c\u016e\u0001\u0000\u0000"+
		"\u0000\u016d\u016b\u0001\u0000\u0000\u0000\u016e\u016f\u0005n\u0000\u0000"+
		"\u016f\u0186\u0001\u0000\u0000\u0000\u0170\u0172\u0005V\u0000\u0000\u0171"+
		"\u0170\u0001\u0000\u0000\u0000\u0171\u0172\u0001\u0000\u0000\u0000\u0172"+
		"\u0173\u0001\u0000\u0000\u0000\u0173\u017c\u0005i\u0000\u0000\u0174\u0179"+
		"\u0005\u007f\u0000\u0000\u0175\u0176\u0005o\u0000\u0000\u0176\u0178\u0005"+
		"\u007f\u0000\u0000\u0177\u0175\u0001\u0000\u0000\u0000\u0178\u017b\u0001"+
		"\u0000\u0000\u0000\u0179\u0177\u0001\u0000\u0000\u0000\u0179\u017a\u0001"+
		"\u0000\u0000\u0000\u017a\u017d\u0001\u0000\u0000\u0000\u017b\u0179\u0001"+
		"\u0000\u0000\u0000\u017c\u0174\u0001\u0000\u0000\u0000\u017c\u017d\u0001"+
		"\u0000\u0000\u0000\u017d\u017e\u0001\u0000\u0000\u0000\u017e\u017f\u0005"+
		"j\u0000\u0000\u017f\u0180\u0005X\u0000\u0000\u0180\u0186\u0003\u001a\r"+
		"\u0000\u0181\u0182\u0005i\u0000\u0000\u0182\u0183\u0005j\u0000\u0000\u0183"+
		"\u0184\u0005X\u0000\u0000\u0184\u0186\u0003\u001a\r\u0000\u0185\u0142"+
		"\u0001\u0000\u0000\u0000\u0185\u015c\u0001\u0000\u0000\u0000\u0185\u0171"+
		"\u0001\u0000\u0000\u0000\u0185\u0181\u0001\u0000\u0000\u0000\u0186\u0019"+
		"\u0001\u0000\u0000\u0000\u0187\u018b\u0005m\u0000\u0000\u0188\u018a\u0003"+
		"B!\u0000\u0189\u0188\u0001\u0000\u0000\u0000\u018a\u018d\u0001\u0000\u0000"+
		"\u0000\u018b\u0189\u0001\u0000\u0000\u0000\u018b\u018c\u0001\u0000\u0000"+
		"\u0000\u018c\u018f\u0001\u0000\u0000\u0000\u018d\u018b\u0001\u0000\u0000"+
		"\u0000\u018e\u0190\u0003Z-\u0000\u018f\u018e\u0001\u0000\u0000\u0000\u018f"+
		"\u0190\u0001\u0000\u0000\u0000\u0190\u0191\u0001\u0000\u0000\u0000\u0191"+
		"\u0192\u0005n\u0000\u0000\u0192\u001b\u0001\u0000\u0000\u0000\u0193\u019c"+
		"\u0005i\u0000\u0000\u0194\u0199\u0003\u001e\u000f\u0000\u0195\u0196\u0005"+
		"o\u0000\u0000\u0196\u0198\u0003\u001e\u000f\u0000\u0197\u0195\u0001\u0000"+
		"\u0000\u0000\u0198\u019b\u0001\u0000\u0000\u0000\u0199\u0197\u0001\u0000"+
		"\u0000\u0000\u0199\u019a\u0001\u0000\u0000\u0000\u019a\u019d\u0001\u0000"+
		"\u0000\u0000\u019b\u0199\u0001\u0000\u0000\u0000\u019c\u0194\u0001\u0000"+
		"\u0000\u0000\u019c\u019d\u0001\u0000\u0000\u0000\u019d\u019e\u0001\u0000"+
		"\u0000\u0000\u019e\u019f\u0005j\u0000\u0000\u019f\u001d\u0001\u0000\u0000"+
		"\u0000\u01a0\u01a1\u0005\u007f\u0000\u0000\u01a1\u01a2\u0005q\u0000\u0000"+
		"\u01a2\u01a5\u0005\u007f\u0000\u0000\u01a3\u01a4\u0005W\u0000\u0000\u01a4"+
		"\u01a6\u0003@ \u0000\u01a5\u01a3\u0001\u0000\u0000\u0000\u01a5\u01a6\u0001"+
		"\u0000\u0000\u0000\u01a6\u01b2\u0001\u0000\u0000\u0000\u01a7\u01b2\u0005"+
		"\u007f\u0000\u0000\u01a8\u01a9\u0003 \u0010\u0000\u01a9\u01aa\u0005\u007f"+
		"\u0000\u0000\u01aa\u01ab\u0005q\u0000\u0000\u01ab\u01ae\u0005\u007f\u0000"+
		"\u0000\u01ac\u01ad\u0005W\u0000\u0000\u01ad\u01af\u0003@ \u0000\u01ae"+
		"\u01ac\u0001\u0000\u0000\u0000\u01ae\u01af\u0001\u0000\u0000\u0000\u01af"+
		"\u01b2\u0001\u0000\u0000\u0000\u01b0\u01b2\u0005\u007f\u0000\u0000\u01b1"+
		"\u01a0\u0001\u0000\u0000\u0000\u01b1\u01a7\u0001\u0000\u0000\u0000\u01b1"+
		"\u01a8\u0001\u0000\u0000\u0000\u01b1\u01b0\u0001\u0000\u0000\u0000\u01b2"+
		"\u001f\u0001\u0000\u0000\u0000\u01b3\u01b4\u0007\u0000\u0000\u0000\u01b4"+
		"!\u0001\u0000\u0000\u0000\u01b5\u01b7\u0003 \u0010\u0000\u01b6\u01b5\u0001"+
		"\u0000\u0000\u0000\u01b6\u01b7\u0001\u0000\u0000\u0000\u01b7\u01b9\u0001"+
		"\u0000\u0000\u0000\u01b8\u01ba\u00056\u0000\u0000\u01b9\u01b8\u0001\u0000"+
		"\u0000\u0000\u01b9\u01ba\u0001\u0000\u0000\u0000\u01ba\u01bb\u0001\u0000"+
		"\u0000\u0000\u01bb\u01be\u0005\u007f\u0000\u0000\u01bc\u01bd\u0007\u0001"+
		"\u0000\u0000\u01bd\u01bf\u0005\u007f\u0000\u0000\u01be\u01bc\u0001\u0000"+
		"\u0000\u0000\u01be\u01bf\u0001\u0000\u0000\u0000\u01bf\u01c0\u0001\u0000"+
		"\u0000\u0000\u01c0\u01c4\u0005m\u0000\u0000\u01c1\u01c3\u0003$\u0012\u0000"+
		"\u01c2\u01c1\u0001\u0000\u0000\u0000\u01c3\u01c6\u0001\u0000\u0000\u0000"+
		"\u01c4\u01c2\u0001\u0000\u0000\u0000\u01c4\u01c5\u0001\u0000\u0000\u0000"+
		"\u01c5\u01c7\u0001\u0000\u0000\u0000\u01c6\u01c4\u0001\u0000\u0000\u0000"+
		"\u01c7\u01c8\u0005n\u0000\u0000\u01c8#\u0001\u0000\u0000\u0000\u01c9\u01d2"+
		"\u0003*\u0015\u0000\u01ca\u01d2\u0003,\u0016\u0000\u01cb\u01d2\u0003\u0016"+
		"\u000b\u0000\u01cc\u01d2\u00032\u0019\u0000\u01cd\u01d2\u0003.\u0017\u0000"+
		"\u01ce\u01d2\u00036\u001b\u0000\u01cf\u01d2\u0003(\u0014\u0000\u01d0\u01d2"+
		"\u0003&\u0013\u0000\u01d1\u01c9\u0001\u0000\u0000\u0000\u01d1\u01ca\u0001"+
		"\u0000\u0000\u0000\u01d1\u01cb\u0001\u0000\u0000\u0000\u01d1\u01cc\u0001"+
		"\u0000\u0000\u0000\u01d1\u01cd\u0001\u0000\u0000\u0000\u01d1\u01ce\u0001"+
		"\u0000\u0000\u0000\u01d1\u01cf\u0001\u0000\u0000\u0000\u01d1\u01d0\u0001"+
		"\u0000\u0000\u0000\u01d2%\u0001\u0000\u0000\u0000\u01d3\u01d4\u0007\u0002"+
		"\u0000\u0000\u01d4\u01d9\u0003\u001c\u000e\u0000\u01d5\u01d7\u0005q\u0000"+
		"\u0000\u01d6\u01d8\u0005\u007f\u0000\u0000\u01d7\u01d6\u0001\u0000\u0000"+
		"\u0000\u01d7\u01d8\u0001\u0000\u0000\u0000\u01d8\u01da\u0001\u0000\u0000"+
		"\u0000\u01d9\u01d5\u0001\u0000\u0000\u0000\u01d9\u01da\u0001\u0000\u0000"+
		"\u0000\u01da\u01db\u0001\u0000\u0000\u0000\u01db\u01dc\u0003\u001a\r\u0000"+
		"\u01dc\'\u0001\u0000\u0000\u0000\u01dd\u01de\u00054\u0000\u0000\u01de"+
		"\u01df\u0003\u001c\u000e\u0000\u01df\u01e0\u0003\u001a\r\u0000\u01e0)"+
		"\u0001\u0000\u0000\u0000\u01e1\u01e2\u0005?\u0000\u0000\u01e2\u01e4\u0005"+
		"i\u0000\u0000\u01e3\u01e5\u0003@ \u0000\u01e4\u01e3\u0001\u0000\u0000"+
		"\u0000\u01e4\u01e5\u0001\u0000\u0000\u0000\u01e5\u01e6\u0001\u0000\u0000"+
		"\u0000\u01e6\u01e7\u0005j\u0000\u0000\u01e7\u01e8\u00034\u001a\u0000\u01e8"+
		"+\u0001\u0000\u0000\u0000\u01e9\u01ea\u0005@\u0000\u0000\u01ea\u01ec\u0005"+
		"i\u0000\u0000\u01eb\u01ed\u0003@ \u0000\u01ec\u01eb\u0001\u0000\u0000"+
		"\u0000\u01ec\u01ed\u0001\u0000\u0000\u0000\u01ed\u01ee\u0001\u0000\u0000"+
		"\u0000\u01ee\u01ef\u0005j\u0000\u0000\u01ef\u01f0\u00036\u001b\u0000\u01f0"+
		"\u01f1\u0001\u0000\u0000\u0000\u01f1\u01f2\u0003j5\u0000\u01f2-\u0001"+
		"\u0000\u0000\u0000\u01f3\u01f5\u0003 \u0010\u0000\u01f4\u01f3\u0001\u0000"+
		"\u0000\u0000\u01f4\u01f5\u0001\u0000\u0000\u0000\u01f5\u01f6\u0001\u0000"+
		"\u0000\u0000\u01f6\u01f8\u00030\u0018\u0000\u01f7\u01f4\u0001\u0000\u0000"+
		"\u0000\u01f7\u01f8\u0001\u0000\u0000\u0000\u01f8\u01f9\u0001\u0000\u0000"+
		"\u0000\u01f9\u01fc\u0005\u007f\u0000\u0000\u01fa\u01fb\u0005q\u0000\u0000"+
		"\u01fb\u01fd\u0003D\"\u0000\u01fc\u01fa\u0001\u0000\u0000\u0000\u01fc"+
		"\u01fd\u0001\u0000\u0000\u0000\u01fd\u0200\u0001\u0000\u0000\u0000\u01fe"+
		"\u01ff\u0005W\u0000\u0000\u01ff\u0201\u0003D\"\u0000\u0200\u01fe\u0001"+
		"\u0000\u0000\u0000\u0200\u0201\u0001\u0000\u0000\u0000\u0201\u0204\u0001"+
		"\u0000\u0000\u0000\u0202\u0203\u0005:\u0000\u0000\u0203\u0205\u0005\u007f"+
		"\u0000\u0000\u0204\u0202\u0001\u0000\u0000\u0000\u0204\u0205\u0001\u0000"+
		"\u0000\u0000\u0205\u0206\u0001\u0000\u0000\u0000\u0206\u0207\u0003j5\u0000"+
		"\u0207/\u0001\u0000\u0000\u0000\u0208\u0209\u0007\u0003\u0000\u0000\u0209"+
		"1\u0001\u0000\u0000\u0000\u020a\u020c\u0003 \u0010\u0000\u020b\u020a\u0001"+
		"\u0000\u0000\u0000\u020b\u020c\u0001\u0000\u0000\u0000\u020c\u020d\u0001"+
		"\u0000\u0000\u0000\u020d\u0210\u00034\u001a\u0000\u020e\u020f\u0005W\u0000"+
		"\u0000\u020f\u0211\u0003D\"\u0000\u0210\u020e\u0001\u0000\u0000\u0000"+
		"\u0210\u0211\u0001\u0000\u0000\u0000\u0211\u0212\u0001\u0000\u0000\u0000"+
		"\u0212\u0213\u0003j5\u0000\u0213\u0222\u0001\u0000\u0000\u0000\u0214\u0216"+
		"\u0003 \u0010\u0000\u0215\u0214\u0001\u0000\u0000\u0000\u0215\u0216\u0001"+
		"\u0000\u0000\u0000\u0216\u0218\u0001\u0000\u0000\u0000\u0217\u0219\u0003"+
		"0\u0018\u0000\u0218\u0217\u0001\u0000\u0000\u0000\u0218\u0219\u0001\u0000"+
		"\u0000\u0000\u0219\u021a\u0001\u0000\u0000\u0000\u021a\u021d\u00034\u001a"+
		"\u0000\u021b\u021c\u0005W\u0000\u0000\u021c\u021e\u0003D\"\u0000\u021d"+
		"\u021b\u0001\u0000\u0000\u0000\u021d\u021e\u0001\u0000\u0000\u0000\u021e"+
		"\u021f\u0001\u0000\u0000\u0000\u021f\u0220\u0003j5\u0000\u0220\u0222\u0001"+
		"\u0000\u0000\u0000\u0221\u020b\u0001\u0000\u0000\u0000\u0221\u0215\u0001"+
		"\u0000\u0000\u0000\u02223\u0001\u0000\u0000\u0000\u0223\u0224\u0005\u007f"+
		"\u0000\u0000\u0224\u0225\u0005q\u0000\u0000\u0225\u022d\u0003D\"\u0000"+
		"\u0226\u022d\u0003\u0012\t\u0000\u0227\u0228\u0005\u007f\u0000\u0000\u0228"+
		"\u0229\u0005s\u0000\u0000\u0229\u022a\u0005q\u0000\u0000\u022a\u022d\u0003"+
		"D\"\u0000\u022b\u022d\u0003\u0012\t\u0000\u022c\u0223\u0001\u0000\u0000"+
		"\u0000\u022c\u0226\u0001\u0000\u0000\u0000\u022c\u0227\u0001\u0000\u0000"+
		"\u0000\u022c\u022b\u0001\u0000\u0000\u0000\u022d5\u0001\u0000\u0000\u0000"+
		"\u022e\u0231\u00034\u001a\u0000\u022f\u0231\u00038\u001c\u0000\u0230\u022e"+
		"\u0001\u0000\u0000\u0000\u0230\u022f\u0001\u0000\u0000\u0000\u0231\u0232"+
		"\u0001\u0000\u0000\u0000\u0232\u0233\u0005W\u0000\u0000\u0233\u0234\u0003"+
		":\u001d\u0000\u0234\u0235\u0003j5\u0000\u02357\u0001\u0000\u0000\u0000"+
		"\u0236\u0238\u0005\u007f\u0000\u0000\u0237\u0239\u0003<\u001e\u0000\u0238"+
		"\u0237\u0001\u0000\u0000\u0000\u0238\u0239\u0001\u0000\u0000\u0000\u0239"+
		"9\u0001\u0000\u0000\u0000\u023a\u023b\u0005<\u0000\u0000\u023b\u023d\u0005"+
		"\u007f\u0000\u0000\u023c\u023e\u0003<\u001e\u0000\u023d\u023c\u0001\u0000"+
		"\u0000\u0000\u023d\u023e\u0001\u0000\u0000\u0000\u023e\u023f\u0001\u0000"+
		"\u0000\u0000\u023f\u0248\u0005i\u0000\u0000\u0240\u0245\u0003D\"\u0000"+
		"\u0241\u0242\u0005o\u0000\u0000\u0242\u0244\u0003D\"\u0000\u0243\u0241"+
		"\u0001\u0000\u0000\u0000\u0244\u0247\u0001\u0000\u0000\u0000\u0245\u0243"+
		"\u0001\u0000\u0000\u0000\u0245\u0246\u0001\u0000\u0000\u0000\u0246\u0249"+
		"\u0001\u0000\u0000\u0000\u0247\u0245\u0001\u0000\u0000\u0000\u0248\u0240"+
		"\u0001\u0000\u0000\u0000\u0248\u0249\u0001\u0000\u0000\u0000\u0249\u024a"+
		"\u0001\u0000\u0000\u0000\u024a\u024b\u0005j\u0000\u0000\u024b;\u0001\u0000"+
		"\u0000\u0000\u024c\u024d\u0005f\u0000\u0000\u024d\u024f\u0005\u007f\u0000"+
		"\u0000\u024e\u0250\u0003d2\u0000\u024f\u024e\u0001\u0000\u0000\u0000\u024f"+
		"\u0250\u0001\u0000\u0000\u0000\u0250\u0258\u0001\u0000\u0000\u0000\u0251"+
		"\u0252\u0005o\u0000\u0000\u0252\u0254\u0005\u007f\u0000\u0000\u0253\u0255"+
		"\u0003d2\u0000\u0254\u0253\u0001\u0000\u0000\u0000\u0254\u0255\u0001\u0000"+
		"\u0000\u0000\u0255\u0257\u0001\u0000\u0000\u0000\u0256\u0251\u0001\u0000"+
		"\u0000\u0000\u0257\u025a\u0001\u0000\u0000\u0000\u0258\u0256\u0001\u0000"+
		"\u0000\u0000\u0258\u0259\u0001\u0000\u0000\u0000\u0259\u025b\u0001\u0000"+
		"\u0000\u0000\u025a\u0258\u0001\u0000\u0000\u0000\u025b\u025c\u0005e\u0000"+
		"\u0000\u025c=\u0001\u0000\u0000\u0000\u025d\u0266\u0005m\u0000\u0000\u025e"+
		"\u0263\u00034\u001a\u0000\u025f\u0260\u0005o\u0000\u0000\u0260\u0262\u0003"+
		"4\u001a\u0000\u0261\u025f\u0001\u0000\u0000\u0000\u0262\u0265\u0001\u0000"+
		"\u0000\u0000\u0263\u0261\u0001\u0000\u0000\u0000\u0263\u0264\u0001\u0000"+
		"\u0000\u0000\u0264\u0267\u0001\u0000\u0000\u0000\u0265\u0263\u0001\u0000"+
		"\u0000\u0000\u0266\u025e\u0001\u0000\u0000\u0000\u0266\u0267\u0001\u0000"+
		"\u0000\u0000\u0267\u0269\u0001\u0000\u0000\u0000\u0268\u026a\u0005o\u0000"+
		"\u0000\u0269\u0268\u0001\u0000\u0000\u0000\u0269\u026a\u0001\u0000\u0000"+
		"\u0000\u026a\u026b\u0001\u0000\u0000\u0000\u026b\u026c\u0005n\u0000\u0000"+
		"\u026c?\u0001\u0000\u0000\u0000\u026d\u026f\u0007\u0004\u0000\u0000\u026e"+
		"\u026d\u0001\u0000\u0000\u0000\u026e\u026f\u0001\u0000\u0000\u0000\u026f"+
		"\u0270\u0001\u0000\u0000\u0000\u0270\u027b\u0005u\u0000\u0000\u0271\u0273"+
		"\u0007\u0004\u0000\u0000\u0272\u0271\u0001\u0000\u0000\u0000\u0272\u0273"+
		"\u0001\u0000\u0000\u0000\u0273\u0274\u0001\u0000\u0000\u0000\u0274\u027b"+
		"\u0005v\u0000\u0000\u0275\u027b\u0005w\u0000\u0000\u0276\u027b\u0005x"+
		"\u0000\u0000\u0277\u027b\u0005z\u0000\u0000\u0278\u027b\u0005y\u0000\u0000"+
		"\u0279\u027b\u0005=\u0000\u0000\u027a\u026e\u0001\u0000\u0000\u0000\u027a"+
		"\u0272\u0001\u0000\u0000\u0000\u027a\u0275\u0001\u0000\u0000\u0000\u027a"+
		"\u0276\u0001\u0000\u0000\u0000\u027a\u0277\u0001\u0000\u0000\u0000\u027a"+
		"\u0278\u0001\u0000\u0000\u0000\u027a\u0279\u0001\u0000\u0000\u0000\u027b"+
		"A\u0001\u0000\u0000\u0000\u027c\u028b\u0003.\u0017\u0000\u027d\u027f\u0005"+
		"m\u0000\u0000\u027e\u027d\u0001\u0000\u0000\u0000\u027e\u027f\u0001\u0000"+
		"\u0000\u0000\u027f\u0280\u0001\u0000\u0000\u0000\u0280\u0282\u0003.\u0017"+
		"\u0000\u0281\u0283\u0005n\u0000\u0000\u0282\u0281\u0001\u0000\u0000\u0000"+
		"\u0282\u0283\u0001\u0000\u0000\u0000\u0283\u028b\u0001\u0000\u0000\u0000"+
		"\u0284\u028b\u00036\u001b\u0000\u0285\u028b\u0003F#\u0000\u0286\u028b"+
		"\u0003T*\u0000\u0287\u028b\u0003V+\u0000\u0288\u028b\u0003l6\u0000\u0289"+
		"\u028b\u0003X,\u0000\u028a\u027c\u0001\u0000\u0000\u0000\u028a\u027e\u0001"+
		"\u0000\u0000\u0000\u028a\u0284\u0001\u0000\u0000\u0000\u028a\u0285\u0001"+
		"\u0000\u0000\u0000\u028a\u0286\u0001\u0000\u0000\u0000\u028a\u0287\u0001"+
		"\u0000\u0000\u0000\u028a\u0288\u0001\u0000\u0000\u0000\u028a\u0289\u0001"+
		"\u0000\u0000\u0000\u028bC\u0001\u0000\u0000\u0000\u028c\u028d\u0006\""+
		"\uffff\uffff\u0000\u028d\u02b1\u0003>\u001f\u0000\u028e\u02b1\u00036\u001b"+
		"\u0000\u028f\u02b1\u00038\u001c\u0000\u0290\u02b1\u0003\u0018\f\u0000"+
		"\u0291\u02b1\u0005=\u0000\u0000\u0292\u02b1\u0005N\u0000\u0000\u0293\u02b1"+
		"\u0005\u007f\u0000\u0000\u0294\u0295\u0005\u007f\u0000\u0000\u0295\u0296"+
		"\u0005Y\u0000\u0000\u0296\u02b1\u0005Y\u0000\u0000\u0297\u0298\u0005\u007f"+
		"\u0000\u0000\u0298\u0299\u0005Z\u0000\u0000\u0299\u02b1\u0005Z\u0000\u0000"+
		"\u029a\u02b1\u0003@ \u0000\u029b\u02b1\u0003\\.\u0000\u029c\u029d\u0005"+
		"f\u0000\u0000\u029d\u029e\u0003D\"\u0000\u029e\u029f\u0005e\u0000\u0000"+
		"\u029f\u02a0\u0005\u007f\u0000\u0000\u02a0\u02b1\u0001\u0000\u0000\u0000"+
		"\u02a1\u02a2\u0005i\u0000\u0000\u02a2\u02a3\u0003D\"\u0000\u02a3\u02a4"+
		"\u0005:\u0000\u0000\u02a4\u02a5\u0005\u007f\u0000\u0000\u02a5\u02a6\u0005"+
		"j\u0000\u0000\u02a6\u02b1\u0001\u0000\u0000\u0000\u02a7\u02b1\u0003^/"+
		"\u0000\u02a8\u02b1\u0003Z-\u0000\u02a9\u02ab\u0005m\u0000\u0000\u02aa"+
		"\u02a9\u0001\u0000\u0000\u0000\u02aa\u02ab\u0001\u0000\u0000\u0000\u02ab"+
		"\u02ac\u0001\u0000\u0000\u0000\u02ac\u02ae\u0003Z-\u0000\u02ad\u02af\u0005"+
		"n\u0000\u0000\u02ae\u02ad\u0001\u0000\u0000\u0000\u02ae\u02af\u0001\u0000"+
		"\u0000\u0000\u02af\u02b1\u0001\u0000\u0000\u0000\u02b0\u028c\u0001\u0000"+
		"\u0000\u0000\u02b0\u028e\u0001\u0000\u0000\u0000\u02b0\u028f\u0001\u0000"+
		"\u0000\u0000\u02b0\u0290\u0001\u0000\u0000\u0000\u02b0\u0291\u0001\u0000"+
		"\u0000\u0000\u02b0\u0292\u0001\u0000\u0000\u0000\u02b0\u0293\u0001\u0000"+
		"\u0000\u0000\u02b0\u0294\u0001\u0000\u0000\u0000\u02b0\u0297\u0001\u0000"+
		"\u0000\u0000\u02b0\u029a\u0001\u0000\u0000\u0000\u02b0\u029b\u0001\u0000"+
		"\u0000\u0000\u02b0\u029c\u0001\u0000\u0000\u0000\u02b0\u02a1\u0001\u0000"+
		"\u0000\u0000\u02b0\u02a7\u0001\u0000\u0000\u0000\u02b0\u02a8\u0001\u0000"+
		"\u0000\u0000\u02b0\u02aa\u0001\u0000\u0000\u0000\u02b1\u02ce\u0001\u0000"+
		"\u0000\u0000\u02b2\u02b3\n\n\u0000\u0000\u02b3\u02b4\u0005r\u0000\u0000"+
		"\u02b4\u02cd\u0003D\"\u000b\u02b5\u02b6\n\t\u0000\u0000\u02b6\u02b7\u0005"+
		"s\u0000\u0000\u02b7\u02b8\u0005r\u0000\u0000\u02b8\u02cd\u0003D\"\n\u02b9"+
		"\u02ba\n\b\u0000\u0000\u02ba\u02bb\u0003h4\u0000\u02bb\u02bc\u0003D\""+
		"\t\u02bc\u02cd\u0001\u0000\u0000\u0000\u02bd\u02be\n\u0007\u0000\u0000"+
		"\u02be\u02bf\u0003f3\u0000\u02bf\u02c0\u0003D\"\b\u02c0\u02cd\u0001\u0000"+
		"\u0000\u0000\u02c1\u02c2\n\u0017\u0000\u0000\u02c2\u02cd\u0003d2\u0000"+
		"\u02c3\u02c4\n\u0012\u0000\u0000\u02c4\u02c7\u0005W\u0000\u0000\u02c5"+
		"\u02c8\u0003^/\u0000\u02c6\u02c8\u0003@ \u0000\u02c7\u02c5\u0001\u0000"+
		"\u0000\u0000\u02c7\u02c6\u0001\u0000\u0000\u0000\u02c8\u02cd\u0001\u0000"+
		"\u0000\u0000\u02c9\u02ca\n\u0004\u0000\u0000\u02ca\u02cb\u0005:\u0000"+
		"\u0000\u02cb\u02cd\u0005\u007f\u0000\u0000\u02cc\u02b2\u0001\u0000\u0000"+
		"\u0000\u02cc\u02b5\u0001\u0000\u0000\u0000\u02cc\u02b9\u0001\u0000\u0000"+
		"\u0000\u02cc\u02bd\u0001\u0000\u0000\u0000\u02cc\u02c1\u0001\u0000\u0000"+
		"\u0000\u02cc\u02c3\u0001\u0000\u0000\u0000\u02cc\u02c9\u0001\u0000\u0000"+
		"\u0000\u02cd\u02d0\u0001\u0000\u0000\u0000\u02ce\u02cc\u0001\u0000\u0000"+
		"\u0000\u02ce\u02cf\u0001\u0000\u0000\u0000\u02cfE\u0001\u0000\u0000\u0000"+
		"\u02d0\u02ce\u0001\u0000\u0000\u0000\u02d1\u02d2\u0005!\u0000\u0000\u02d2"+
		"\u02d3\u0005i\u0000\u0000\u02d3\u02d4\u0003D\"\u0000\u02d4\u02d5\u0005"+
		"j\u0000\u0000\u02d5\u02d9\u0003\u001a\r\u0000\u02d6\u02d8\u0003H$\u0000"+
		"\u02d7\u02d6\u0001\u0000\u0000\u0000\u02d8\u02db\u0001\u0000\u0000\u0000"+
		"\u02d9\u02d7\u0001\u0000\u0000\u0000\u02d9\u02da\u0001\u0000\u0000\u0000"+
		"\u02da\u02dd\u0001\u0000\u0000\u0000\u02db\u02d9\u0001\u0000\u0000\u0000"+
		"\u02dc\u02de\u0003J%\u0000\u02dd\u02dc\u0001\u0000\u0000\u0000\u02dd\u02de"+
		"\u0001\u0000\u0000\u0000\u02de\u02e2\u0001\u0000\u0000\u0000\u02df\u02e2"+
		"\u0003L&\u0000\u02e0\u02e2\u0003R)\u0000\u02e1\u02d1\u0001\u0000\u0000"+
		"\u0000\u02e1\u02df\u0001\u0000\u0000\u0000\u02e1\u02e0\u0001\u0000\u0000"+
		"\u0000\u02e2G\u0001\u0000\u0000\u0000\u02e3\u02e4\u0005\"\u0000\u0000"+
		"\u02e4\u02e5\u0005i\u0000\u0000\u02e5\u02e6\u0003D\"\u0000\u02e6\u02e7"+
		"\u0005j\u0000\u0000\u02e7\u02e8\u0003\u001a\r\u0000\u02e8I\u0001\u0000"+
		"\u0000\u0000\u02e9\u02ea\u0005#\u0000\u0000\u02ea\u02eb\u0003\u001a\r"+
		"\u0000\u02ebK\u0001\u0000\u0000\u0000\u02ec\u02ee\u0005i\u0000\u0000\u02ed"+
		"\u02ec\u0001\u0000\u0000\u0000\u02ed\u02ee\u0001\u0000\u0000\u0000\u02ee"+
		"\u02ef\u0001\u0000\u0000\u0000\u02ef\u02f1\u0003D\"\u0000\u02f0\u02f2"+
		"\u0005j\u0000\u0000\u02f1\u02f0\u0001\u0000\u0000\u0000\u02f1\u02f2\u0001"+
		"\u0000\u0000\u0000\u02f2\u02f3\u0001\u0000\u0000\u0000\u02f3\u02f5\u0005"+
		"\u0081\u0000\u0000\u02f4\u02f6\u0005i\u0000\u0000\u02f5\u02f4\u0001\u0000"+
		"\u0000\u0000\u02f5\u02f6\u0001\u0000\u0000\u0000\u02f6\u02f7\u0001\u0000"+
		"\u0000\u0000\u02f7\u02f9\u0003B!\u0000\u02f8\u02fa\u0005j\u0000\u0000"+
		"\u02f9\u02f8\u0001\u0000\u0000\u0000\u02f9\u02fa\u0001\u0000\u0000\u0000"+
		"\u02fa\u02fe\u0001\u0000\u0000\u0000\u02fb\u02fd\u0003N\'\u0000\u02fc"+
		"\u02fb\u0001\u0000\u0000\u0000\u02fd\u0300\u0001\u0000\u0000\u0000\u02fe"+
		"\u02fc\u0001\u0000\u0000\u0000\u02fe\u02ff\u0001\u0000\u0000\u0000\u02ff"+
		"\u0301\u0001\u0000\u0000\u0000\u0300\u02fe\u0001\u0000\u0000\u0000\u0301"+
		"\u0302\u0003P(\u0000\u0302M\u0001\u0000\u0000\u0000\u0303\u0305\u0005"+
		"q\u0000\u0000\u0304\u0306\u0005i\u0000\u0000\u0305\u0304\u0001\u0000\u0000"+
		"\u0000\u0305\u0306\u0001\u0000\u0000\u0000\u0306\u0307\u0001\u0000\u0000"+
		"\u0000\u0307\u0309\u0003D\"\u0000\u0308\u030a\u0005j\u0000\u0000\u0309"+
		"\u0308\u0001\u0000\u0000\u0000\u0309\u030a\u0001\u0000\u0000\u0000\u030a"+
		"\u030b\u0001\u0000\u0000\u0000\u030b\u030d\u0005\u0081\u0000\u0000\u030c"+
		"\u030e\u0005i\u0000\u0000\u030d\u030c\u0001\u0000\u0000\u0000\u030d\u030e"+
		"\u0001\u0000\u0000\u0000\u030e\u030f\u0001\u0000\u0000\u0000\u030f\u0311"+
		"\u0003B!\u0000\u0310\u0312\u0005j\u0000\u0000\u0311\u0310\u0001\u0000"+
		"\u0000\u0000\u0311\u0312\u0001\u0000\u0000\u0000\u0312O\u0001\u0000\u0000"+
		"\u0000\u0313\u0315\u0005q\u0000\u0000\u0314\u0316\u0005i\u0000\u0000\u0315"+
		"\u0314\u0001\u0000\u0000\u0000\u0315\u0316\u0001\u0000\u0000\u0000\u0316"+
		"\u0317\u0001\u0000\u0000\u0000\u0317\u0319\u0003B!\u0000\u0318\u031a\u0005"+
		"j\u0000\u0000\u0319\u0318\u0001\u0000\u0000\u0000\u0319\u031a\u0001\u0000"+
		"\u0000\u0000\u031aQ\u0001\u0000\u0000\u0000\u031b\u031d\u0005i\u0000\u0000"+
		"\u031c\u031b\u0001\u0000\u0000\u0000\u031c\u031d\u0001\u0000\u0000\u0000"+
		"\u031d\u031e\u0001\u0000\u0000\u0000\u031e\u0320\u0003D\"\u0000\u031f"+
		"\u0321\u0005j\u0000\u0000\u0320\u031f\u0001\u0000\u0000\u0000\u0320\u0321"+
		"\u0001\u0000\u0000\u0000\u0321\u0322\u0001\u0000\u0000\u0000\u0322\u0323"+
		"\u0005X\u0000\u0000\u0323\u0324\u0003D\"\u0000\u0324S\u0001\u0000\u0000"+
		"\u0000\u0325\u0326\u0005$\u0000\u0000\u0326\u0329\u0005i\u0000\u0000\u0327"+
		"\u032a\u0003.\u0017\u0000\u0328\u032a\u0003D\"\u0000\u0329\u0327\u0001"+
		"\u0000\u0000\u0000\u0329\u0328\u0001\u0000\u0000\u0000\u0329\u032a\u0001"+
		"\u0000\u0000\u0000\u032a\u032b\u0001\u0000\u0000\u0000\u032b\u032d\u0005"+
		"p\u0000\u0000\u032c\u032e\u0003D\"\u0000\u032d\u032c\u0001\u0000\u0000"+
		"\u0000\u032d\u032e\u0001\u0000\u0000\u0000\u032e\u032f\u0001\u0000\u0000"+
		"\u0000\u032f\u0331\u0005p\u0000\u0000\u0330\u0332\u0003D\"\u0000\u0331"+
		"\u0330\u0001\u0000\u0000\u0000\u0331\u0332\u0001\u0000\u0000\u0000\u0332"+
		"\u0333\u0001\u0000\u0000\u0000\u0333\u0334\u0005j\u0000\u0000\u0334\u0335"+
		"\u0003\u001a\r\u0000\u0335U\u0001\u0000\u0000\u0000\u0336\u0337\u0005"+
		"%\u0000\u0000\u0337\u0338\u0005i\u0000\u0000\u0338\u0339\u0003D\"\u0000"+
		"\u0339\u033a\u0005j\u0000\u0000\u033a\u033b\u0003\u001a\r\u0000\u033b"+
		"W\u0001\u0000\u0000\u0000\u033c\u033d\u0003D\"\u0000\u033d\u033e\u0003"+
		"j5\u0000\u033eY\u0001\u0000\u0000\u0000\u033f\u0341\u00051\u0000\u0000"+
		"\u0340\u0342\u0005i\u0000\u0000\u0341\u0340\u0001\u0000\u0000\u0000\u0341"+
		"\u0342\u0001\u0000\u0000\u0000\u0342\u0344\u0001\u0000\u0000\u0000\u0343"+
		"\u0345\u0003X,\u0000\u0344\u0343\u0001\u0000\u0000\u0000\u0344\u0345\u0001"+
		"\u0000\u0000\u0000\u0345\u0347\u0001\u0000\u0000\u0000\u0346\u0348\u0005"+
		"j\u0000\u0000\u0347\u0346\u0001\u0000\u0000\u0000\u0347\u0348\u0001\u0000"+
		"\u0000\u0000\u0348\u0349\u0001\u0000\u0000\u0000\u0349\u034a\u0003j5\u0000"+
		"\u034a[\u0001\u0000\u0000\u0000\u034b\u034c\u0007\u0005\u0000\u0000\u034c"+
		"\u0355\u0005i\u0000\u0000\u034d\u0352\u0003D\"\u0000\u034e\u034f\u0005"+
		"o\u0000\u0000\u034f\u0351\u0003D\"\u0000\u0350\u034e\u0001\u0000\u0000"+
		"\u0000\u0351\u0354\u0001\u0000\u0000\u0000\u0352\u0350\u0001\u0000\u0000"+
		"\u0000\u0352\u0353\u0001\u0000\u0000\u0000\u0353\u0356\u0001\u0000\u0000"+
		"\u0000\u0354\u0352\u0001\u0000\u0000\u0000\u0355\u034d\u0001\u0000\u0000"+
		"\u0000\u0355\u0356\u0001\u0000\u0000\u0000\u0356\u0357\u0001\u0000\u0000"+
		"\u0000\u0357\u0358\u0005j\u0000\u0000\u0358\u0361\u0001\u0000\u0000\u0000"+
		"\u0359\u035c\u0005r\u0000\u0000\u035a\u035d\u0003\\.\u0000\u035b\u035d"+
		"\u0005\u007f\u0000\u0000\u035c\u035a\u0001\u0000\u0000\u0000\u035c\u035b"+
		"\u0001\u0000\u0000\u0000\u035d\u0360\u0001\u0000\u0000\u0000\u035e\u0360"+
		"\u0003^/\u0000\u035f\u0359\u0001\u0000\u0000\u0000\u035f\u035e\u0001\u0000"+
		"\u0000\u0000\u0360\u0363\u0001\u0000\u0000\u0000\u0361\u035f\u0001\u0000"+
		"\u0000\u0000\u0361\u0362\u0001\u0000\u0000\u0000\u0362\u0382\u0001\u0000"+
		"\u0000\u0000\u0363\u0361\u0001\u0000\u0000\u0000\u0364\u0365\u0005t\u0000"+
		"\u0000\u0365\u0368\u0005\u007f\u0000\u0000\u0366\u0368\u0005-\u0000\u0000"+
		"\u0367\u0364\u0001\u0000\u0000\u0000\u0367\u0366\u0001\u0000\u0000\u0000"+
		"\u0368\u0369\u0001\u0000\u0000\u0000\u0369\u0372\u0005i\u0000\u0000\u036a"+
		"\u036f\u0003D\"\u0000\u036b\u036c\u0005o\u0000\u0000\u036c\u036e\u0003"+
		"D\"\u0000\u036d\u036b\u0001\u0000\u0000\u0000\u036e\u0371\u0001\u0000"+
		"\u0000\u0000\u036f\u036d\u0001\u0000\u0000\u0000\u036f\u0370\u0001\u0000"+
		"\u0000\u0000\u0370\u0373\u0001\u0000\u0000\u0000\u0371\u036f\u0001\u0000"+
		"\u0000\u0000\u0372\u036a\u0001\u0000\u0000\u0000\u0372\u0373\u0001\u0000"+
		"\u0000\u0000\u0373\u0374\u0001\u0000\u0000\u0000\u0374\u0375\u0005j\u0000"+
		"\u0000\u0375\u037e\u0001\u0000\u0000\u0000\u0376\u0379\u0005r\u0000\u0000"+
		"\u0377\u037a\u0003\\.\u0000\u0378\u037a\u0005\u007f\u0000\u0000\u0379"+
		"\u0377\u0001\u0000\u0000\u0000\u0379\u0378\u0001\u0000\u0000\u0000\u037a"+
		"\u037d\u0001\u0000\u0000\u0000\u037b\u037d\u0003^/\u0000\u037c\u0376\u0001"+
		"\u0000\u0000\u0000\u037c\u037b\u0001\u0000\u0000\u0000\u037d\u0380\u0001"+
		"\u0000\u0000\u0000\u037e\u037c\u0001\u0000\u0000\u0000\u037e\u037f\u0001"+
		"\u0000\u0000\u0000\u037f\u0382\u0001\u0000\u0000\u0000\u0380\u037e\u0001"+
		"\u0000\u0000\u0000\u0381\u034b\u0001\u0000\u0000\u0000\u0381\u0367\u0001"+
		"\u0000\u0000\u0000\u0382]\u0001\u0000\u0000\u0000\u0383\u0386\u0003d2"+
		"\u0000\u0384\u0386\u0003b1\u0000\u0385\u0383\u0001\u0000\u0000\u0000\u0385"+
		"\u0384\u0001\u0000\u0000\u0000\u0386_\u0001\u0000\u0000\u0000\u0387\u038d"+
		"\u0003@ \u0000\u0388\u038d\u0005\u007f\u0000\u0000\u0389\u038d\u0003d"+
		"2\u0000\u038a\u038d\u0003b1\u0000\u038b\u038d\u0003\\.\u0000\u038c\u0387"+
		"\u0001\u0000\u0000\u0000\u038c\u0388\u0001\u0000\u0000\u0000\u038c\u0389"+
		"\u0001\u0000\u0000\u0000\u038c\u038a\u0001\u0000\u0000\u0000\u038c\u038b"+
		"\u0001\u0000\u0000\u0000\u038da\u0001\u0000\u0000\u0000\u038e\u039d\u0005"+
		"m\u0000\u0000\u038f\u0390\u0003`0\u0000\u0390\u0391\u0005q\u0000\u0000"+
		"\u0391\u0392\u0003`0\u0000\u0392\u039a\u0001\u0000\u0000\u0000\u0393\u0394"+
		"\u0005o\u0000\u0000\u0394\u0395\u0003`0\u0000\u0395\u0396\u0005q\u0000"+
		"\u0000\u0396\u0397\u0003`0\u0000\u0397\u0399\u0001\u0000\u0000\u0000\u0398"+
		"\u0393\u0001\u0000\u0000\u0000\u0399\u039c\u0001\u0000\u0000\u0000\u039a"+
		"\u0398\u0001\u0000\u0000\u0000\u039a\u039b\u0001\u0000\u0000\u0000\u039b"+
		"\u039e\u0001\u0000\u0000\u0000\u039c\u039a\u0001\u0000\u0000\u0000\u039d"+
		"\u038f\u0001\u0000\u0000\u0000\u039d\u039e\u0001\u0000\u0000\u0000\u039e"+
		"\u03a0\u0001\u0000\u0000\u0000\u039f\u03a1\u0005o\u0000\u0000\u03a0\u039f"+
		"\u0001\u0000\u0000\u0000\u03a0\u03a1\u0001\u0000\u0000\u0000\u03a1\u03a2"+
		"\u0001\u0000\u0000\u0000\u03a2\u03a3\u0005n\u0000\u0000\u03a3c\u0001\u0000"+
		"\u0000\u0000\u03a4\u03ad\u0005k\u0000\u0000\u03a5\u03aa\u0003`0\u0000"+
		"\u03a6\u03a7\u0005o\u0000\u0000\u03a7\u03a9\u0003`0\u0000\u03a8\u03a6"+
		"\u0001\u0000\u0000\u0000\u03a9\u03ac\u0001\u0000\u0000\u0000\u03aa\u03a8"+
		"\u0001\u0000\u0000\u0000\u03aa\u03ab\u0001\u0000\u0000\u0000\u03ab\u03ae"+
		"\u0001\u0000\u0000\u0000\u03ac\u03aa\u0001\u0000\u0000\u0000\u03ad\u03a5"+
		"\u0001\u0000\u0000\u0000\u03ad\u03ae\u0001\u0000\u0000\u0000\u03ae\u03b0"+
		"\u0001\u0000\u0000\u0000\u03af\u03b1\u0005o\u0000\u0000\u03b0\u03af\u0001"+
		"\u0000\u0000\u0000\u03b0\u03b1\u0001\u0000\u0000\u0000\u03b1\u03b2\u0001"+
		"\u0000\u0000\u0000\u03b2\u03c9\u0005l\u0000\u0000\u03b3\u03b5\u0005m\u0000"+
		"\u0000\u03b4\u03b3\u0001\u0000\u0000\u0000\u03b4\u03b5\u0001\u0000\u0000"+
		"\u0000\u03b5\u03b6\u0001\u0000\u0000\u0000\u03b6\u03bf\u0005k\u0000\u0000"+
		"\u03b7\u03bc\u0003`0\u0000\u03b8\u03b9\u0005o\u0000\u0000\u03b9\u03bb"+
		"\u0003`0\u0000\u03ba\u03b8\u0001\u0000\u0000\u0000\u03bb\u03be\u0001\u0000"+
		"\u0000\u0000\u03bc\u03ba\u0001\u0000\u0000\u0000\u03bc\u03bd\u0001\u0000"+
		"\u0000\u0000\u03bd\u03c0\u0001\u0000\u0000\u0000\u03be\u03bc\u0001\u0000"+
		"\u0000\u0000\u03bf\u03b7\u0001\u0000\u0000\u0000\u03bf\u03c0\u0001\u0000"+
		"\u0000\u0000\u03c0\u03c2\u0001\u0000\u0000\u0000\u03c1\u03c3\u0005o\u0000"+
		"\u0000\u03c2\u03c1\u0001\u0000\u0000\u0000\u03c2\u03c3\u0001\u0000\u0000"+
		"\u0000\u03c3\u03c4\u0001\u0000\u0000\u0000\u03c4\u03c6\u0005l\u0000\u0000"+
		"\u03c5\u03c7\u0005n\u0000\u0000\u03c6\u03c5\u0001\u0000\u0000\u0000\u03c6"+
		"\u03c7\u0001\u0000\u0000\u0000\u03c7\u03c9\u0001\u0000\u0000\u0000\u03c8"+
		"\u03a4\u0001\u0000\u0000\u0000\u03c8\u03b4\u0001\u0000\u0000\u0000\u03c9"+
		"e\u0001\u0000\u0000\u0000\u03ca\u03d4\u0005W\u0000\u0000\u03cb\u03d4\u0005"+
		"Y\u0000\u0000\u03cc\u03d4\u0005Z\u0000\u0000\u03cd\u03d4\u0005[\u0000"+
		"\u0000\u03ce\u03d4\u0005\\\u0000\u0000\u03cf\u03d0\u0005Y\u0000\u0000"+
		"\u03d0\u03d4\u0005W\u0000\u0000\u03d1\u03d2\u0005Z\u0000\u0000\u03d2\u03d4"+
		"\u0005W\u0000\u0000\u03d3\u03ca\u0001\u0000\u0000\u0000\u03d3\u03cb\u0001"+
		"\u0000\u0000\u0000\u03d3\u03cc\u0001\u0000\u0000\u0000\u03d3\u03cd\u0001"+
		"\u0000\u0000\u0000\u03d3\u03ce\u0001\u0000\u0000\u0000\u03d3\u03cf\u0001"+
		"\u0000\u0000\u0000\u03d3\u03d1\u0001\u0000\u0000\u0000\u03d4g\u0001\u0000"+
		"\u0000\u0000\u03d5\u03d6\u0007\u0006\u0000\u0000\u03d6i\u0001\u0000\u0000"+
		"\u0000\u03d7\u03d9\u0005p\u0000\u0000\u03d8\u03d7\u0001\u0000\u0000\u0000"+
		"\u03d8\u03d9\u0001\u0000\u0000\u0000\u03d9k\u0001\u0000\u0000\u0000\u03da"+
		"\u03df\u0003n7\u0000\u03db\u03df\u0003r9\u0000\u03dc\u03df\u0003t:\u0000"+
		"\u03dd\u03df\u0003v;\u0000\u03de\u03da\u0001\u0000\u0000\u0000\u03de\u03db"+
		"\u0001\u0000\u0000\u0000\u03de\u03dc\u0001\u0000\u0000\u0000\u03de\u03dd"+
		"\u0001\u0000\u0000\u0000\u03dfm\u0001\u0000\u0000\u0000\u03e0\u03e1\u0005"+
		"I\u0000\u0000\u03e1\u03e2\u0005i\u0000\u0000\u03e2\u03e3\u0005w\u0000"+
		"\u0000\u03e3\u03e4\u0005o\u0000\u0000\u03e4\u03e6\u0003p8\u0000\u03e5"+
		"\u03e7\u0005j\u0000\u0000\u03e6\u03e5\u0001\u0000\u0000\u0000\u03e6\u03e7"+
		"\u0001\u0000\u0000\u0000\u03e7\u03e9\u0001\u0000\u0000\u0000\u03e8\u03ea"+
		"\u0005p\u0000\u0000\u03e9\u03e8\u0001\u0000\u0000\u0000\u03e9\u03ea\u0001"+
		"\u0000\u0000\u0000\u03ea\u03f4\u0001\u0000\u0000\u0000\u03eb\u03ec\u0005"+
		"I\u0000\u0000\u03ec\u03ed\u0005i\u0000\u0000\u03ed\u03ee\u0005w\u0000"+
		"\u0000\u03ee\u03ef\u0005o\u0000\u0000\u03ef\u03f0\u0003\u0018\f\u0000"+
		"\u03f0\u03f1\u0005j\u0000\u0000\u03f1\u03f2\u0005p\u0000\u0000\u03f2\u03f4"+
		"\u0001\u0000\u0000\u0000\u03f3\u03e0\u0001\u0000\u0000\u0000\u03f3\u03eb"+
		"\u0001\u0000\u0000\u0000\u03f4o\u0001\u0000\u0000\u0000\u03f5\u03f7\u0005"+
		"V\u0000\u0000\u03f6\u03f5\u0001\u0000\u0000\u0000\u03f6\u03f7\u0001\u0000"+
		"\u0000\u0000\u03f7\u03f8\u0001\u0000\u0000\u0000\u03f8\u03f9\u0003\u001c"+
		"\u000e\u0000\u03f9\u03fa\u0005X\u0000\u0000\u03fa\u03fe\u0005m\u0000\u0000"+
		"\u03fb\u03fd\u0003l6\u0000\u03fc\u03fb\u0001\u0000\u0000\u0000\u03fd\u0400"+
		"\u0001\u0000\u0000\u0000\u03fe\u03fc\u0001\u0000\u0000\u0000\u03fe\u03ff"+
		"\u0001\u0000\u0000\u0000\u03ff\u0401\u0001\u0000\u0000\u0000\u0400\u03fe"+
		"\u0001\u0000\u0000\u0000\u0401\u0402\u0005n\u0000\u0000\u0402q\u0001\u0000"+
		"\u0000\u0000\u0403\u0404\u0005K\u0000\u0000\u0404\u0405\u0005i\u0000\u0000"+
		"\u0405\u0407\u0005w\u0000\u0000\u0406\u0408\u0005\u007f\u0000\u0000\u0407"+
		"\u0406\u0001\u0000\u0000\u0000\u0407\u0408\u0001\u0000\u0000\u0000\u0408"+
		"\u040a\u0001\u0000\u0000\u0000\u0409\u040b\u0005w\u0000\u0000\u040a\u0409"+
		"\u0001\u0000\u0000\u0000\u040a\u040b\u0001\u0000\u0000\u0000\u040b\u040c"+
		"\u0001\u0000\u0000\u0000\u040c\u040d\u0005o\u0000\u0000\u040d\u040e\u0003"+
		"\u0018\f\u0000\u040e\u040f\u0005j\u0000\u0000\u040f\u0410\u0005p\u0000"+
		"\u0000\u0410s\u0001\u0000\u0000\u0000\u0411\u0412\u0005L\u0000\u0000\u0412"+
		"\u0413\u0005i\u0000\u0000\u0413\u0414\u0003\u0018\f\u0000\u0414\u0415"+
		"\u0005j\u0000\u0000\u0415\u0416\u0005p\u0000\u0000\u0416u\u0001\u0000"+
		"\u0000\u0000\u0417\u0418\u0005M\u0000\u0000\u0418\u0419\u0005i\u0000\u0000"+
		"\u0419\u041a\u0003\u0018\f\u0000\u041a\u041b\u0005j\u0000\u0000\u041b"+
		"\u041c\u0005p\u0000\u0000\u041cw\u0001\u0000\u0000\u0000\u041d\u041f\u0005"+
		"\u0001\u0000\u0000\u041e\u0420\u0003z=\u0000\u041f\u041e\u0001\u0000\u0000"+
		"\u0000\u041f\u0420\u0001\u0000\u0000\u0000\u0420\u0421\u0001\u0000\u0000"+
		"\u0000\u0421\u0423\u0005\u000e\u0000\u0000\u0422\u0424\u0003|>\u0000\u0423"+
		"\u0422\u0001\u0000\u0000\u0000\u0423\u0424\u0001\u0000\u0000\u0000\u0424"+
		"\u0425\u0001\u0000\u0000\u0000\u0425\u0429\u0005\u0007\u0000\u0000\u0426"+
		"\u0428\u0003\u0084B\u0000\u0427\u0426\u0001\u0000\u0000\u0000\u0428\u042b"+
		"\u0001\u0000\u0000\u0000\u0429\u0427\u0001\u0000\u0000\u0000\u0429\u042a"+
		"\u0001\u0000\u0000\u0000\u042a\u042c\u0001\u0000\u0000\u0000\u042b\u0429"+
		"\u0001\u0000\u0000\u0000\u042c\u042e\u0003\u0080@\u0000\u042d\u042f\u0003"+
		"j5\u0000\u042e\u042d\u0001\u0000\u0000\u0000\u042e\u042f\u0001\u0000\u0000"+
		"\u0000\u042f\u043d\u0001\u0000\u0000\u0000\u0430\u0432\u0005\u0001\u0000"+
		"\u0000\u0431\u0433\u0003z=\u0000\u0432\u0431\u0001\u0000\u0000\u0000\u0432"+
		"\u0433\u0001\u0000\u0000\u0000\u0433\u0434\u0001\u0000\u0000\u0000\u0434"+
		"\u0436\u0005\u000e\u0000\u0000\u0435\u0437\u0003|>\u0000\u0436\u0435\u0001"+
		"\u0000\u0000\u0000\u0436\u0437\u0001\u0000\u0000\u0000\u0437\u0438\u0001"+
		"\u0000\u0000\u0000\u0438\u043a\u0005\b\u0000\u0000\u0439\u043b\u0003j"+
		"5\u0000\u043a\u0439\u0001\u0000\u0000\u0000\u043a\u043b\u0001\u0000\u0000"+
		"\u0000\u043b\u043d\u0001\u0000\u0000\u0000\u043c\u041d\u0001\u0000\u0000"+
		"\u0000\u043c\u0430\u0001\u0000\u0000\u0000\u043dy\u0001\u0000\u0000\u0000"+
		"\u043e\u043f\u0005\u0006\u0000\u0000\u043f{\u0001\u0000\u0000\u0000\u0440"+
		"\u0443\u0003\u0082A\u0000\u0441\u0443\u0003~?\u0000\u0442\u0440\u0001"+
		"\u0000\u0000\u0000\u0442\u0441\u0001\u0000\u0000\u0000\u0443\u0446\u0001"+
		"\u0000\u0000\u0000\u0444\u0442\u0001\u0000\u0000\u0000\u0444\u0445\u0001"+
		"\u0000\u0000\u0000\u0445\u0448\u0001\u0000\u0000\u0000\u0446\u0444\u0001"+
		"\u0000\u0000\u0000\u0447\u0449\u0003j5\u0000\u0448\u0447\u0001\u0000\u0000"+
		"\u0000\u0448\u0449\u0001\u0000\u0000\u0000\u0449}\u0001\u0000\u0000\u0000"+
		"\u044a\u044c\u0005\f\u0000\u0000\u044b\u044d\u0003j5\u0000\u044c\u044b"+
		"\u0001\u0000\u0000\u0000\u044c\u044d\u0001\u0000\u0000\u0000\u044d\u045f"+
		"\u0001\u0000\u0000\u0000\u044e\u0450\u0005\r\u0000\u0000\u044f\u0451\u0003"+
		"j5\u0000\u0450\u044f\u0001\u0000\u0000\u0000\u0450\u0451\u0001\u0000\u0000"+
		"\u0000\u0451\u045f\u0001\u0000\u0000\u0000\u0452\u0454\u0005\u000f\u0000"+
		"\u0000\u0453\u0455\u0003j5\u0000\u0454\u0453\u0001\u0000\u0000\u0000\u0454"+
		"\u0455\u0001\u0000\u0000\u0000\u0455\u045f\u0001\u0000\u0000\u0000\u0456"+
		"\u0458\u0005\u0010\u0000\u0000\u0457\u0459\u0003j5\u0000\u0458\u0457\u0001"+
		"\u0000\u0000\u0000\u0458\u0459\u0001\u0000\u0000\u0000\u0459\u045f\u0001"+
		"\u0000\u0000\u0000\u045a\u045c\u0005\u0011\u0000\u0000\u045b\u045d\u0003"+
		"j5\u0000\u045c\u045b\u0001\u0000\u0000\u0000\u045c\u045d\u0001\u0000\u0000"+
		"\u0000\u045d\u045f\u0001\u0000\u0000\u0000\u045e\u044a\u0001\u0000\u0000"+
		"\u0000\u045e\u044e\u0001\u0000\u0000\u0000\u045e\u0452\u0001\u0000\u0000"+
		"\u0000\u045e\u0456\u0001\u0000\u0000\u0000\u045e\u045a\u0001\u0000\u0000"+
		"\u0000\u045f\u007f\u0001\u0000\u0000\u0000\u0460\u0461\u0005\u0001\u0000"+
		"\u0000\u0461\u0462\u0005\t\u0000\u0000\u0462\u0463\u0005\u000e\u0000\u0000"+
		"\u0463\u0465\u0005\u0007\u0000\u0000\u0464\u0466\u0003j5\u0000\u0465\u0464"+
		"\u0001\u0000\u0000\u0000\u0465\u0466\u0001\u0000\u0000\u0000\u0466\u0081"+
		"\u0001\u0000\u0000\u0000\u0467\u046a\u0005\u0012\u0000\u0000\u0468\u0469"+
		"\u0005\n\u0000\u0000\u0469\u046b\u0005\u000b\u0000\u0000\u046a\u0468\u0001"+
		"\u0000\u0000\u0000\u046a\u046b\u0001\u0000\u0000\u0000\u046b\u046c\u0001"+
		"\u0000\u0000\u0000\u046c\u0486\u0003j5\u0000\u046d\u0470\u0005\f\u0000"+
		"\u0000\u046e\u046f\u0005\n\u0000\u0000\u046f\u0471\u0005\u000b\u0000\u0000"+
		"\u0470\u046e\u0001\u0000\u0000\u0000\u0470\u0471\u0001\u0000\u0000\u0000"+
		"\u0471\u0472\u0001\u0000\u0000\u0000\u0472\u0486\u0003j5\u0000\u0473\u0476"+
		"\u0005\r\u0000\u0000\u0474\u0475\u0005\n\u0000\u0000\u0475\u0477\u0005"+
		"\u000b\u0000\u0000\u0476\u0474\u0001\u0000\u0000\u0000\u0476\u0477\u0001"+
		"\u0000\u0000\u0000\u0477\u0478\u0001\u0000\u0000\u0000\u0478\u0486\u0003"+
		"j5\u0000\u0479\u047c\u0005\u000f\u0000\u0000\u047a\u047b\u0005\n\u0000"+
		"\u0000\u047b\u047d\u0005\u000b\u0000\u0000\u047c\u047a\u0001\u0000\u0000"+
		"\u0000\u047c\u047d\u0001\u0000\u0000\u0000\u047d\u047e\u0001\u0000\u0000"+
		"\u0000\u047e\u0486\u0003j5\u0000\u047f\u0482\u0005\u0010\u0000\u0000\u0480"+
		"\u0481\u0005\n\u0000\u0000\u0481\u0483\u0005\u000b\u0000\u0000\u0482\u0480"+
		"\u0001\u0000\u0000\u0000\u0482\u0483\u0001\u0000\u0000\u0000\u0483\u0484"+
		"\u0001\u0000\u0000\u0000\u0484\u0486\u0003j5\u0000\u0485\u0467\u0001\u0000"+
		"\u0000\u0000\u0485\u046d\u0001\u0000\u0000\u0000\u0485\u0473\u0001\u0000"+
		"\u0000\u0000\u0485\u0479\u0001\u0000\u0000\u0000\u0485\u047f\u0001\u0000"+
		"\u0000\u0000\u0486\u0083\u0001\u0000\u0000\u0000\u0487\u0488\u0003x<\u0000"+
		"\u0488\u0489\u0003j5\u0000\u0489\u048f\u0001\u0000\u0000\u0000\u048a\u048b"+
		"\u0005\u0011\u0000\u0000\u048b\u048f\u0003j5\u0000\u048c\u048d\u0005\u0002"+
		"\u0000\u0000\u048d\u048f\u0003j5\u0000\u048e\u0487\u0001\u0000\u0000\u0000"+
		"\u048e\u048a\u0001\u0000\u0000\u0000\u048e\u048c\u0001\u0000\u0000\u0000"+
		"\u048f\u0085\u0001\u0000\u0000\u0000\u0490\u0492\u0003\u0088D\u0000\u0491"+
		"\u0490\u0001\u0000\u0000\u0000\u0491\u0492\u0001\u0000\u0000\u0000\u0492"+
		"\u0493\u0001\u0000\u0000\u0000\u0493\u0494\u0005\u0000\u0000\u0001\u0494"+
		"\u0087\u0001\u0000\u0000\u0000\u0495\u0496\u0005\u0004\u0000\u0000\u0496"+
		"\u0497\u0003\u008aE\u0000\u0497\u0498\u0005\u0014\u0000\u0000\u0498\u0089"+
		"\u0001\u0000\u0000\u0000\u0499\u049b\u0003\u008cF\u0000\u049a\u0499\u0001"+
		"\u0000\u0000\u0000\u049b\u049e\u0001\u0000\u0000\u0000\u049c\u049a\u0001"+
		"\u0000\u0000\u0000\u049c\u049d\u0001\u0000\u0000\u0000\u049d\u008b\u0001"+
		"\u0000\u0000\u0000\u049e\u049c\u0001\u0000\u0000\u0000\u049f\u04a0\u0003"+
		"\u008eG\u0000\u04a0\u04a2\u0005\u001a\u0000\u0000\u04a1\u04a3\u0003\u0098"+
		"L\u0000\u04a2\u04a1\u0001\u0000\u0000\u0000\u04a2\u04a3\u0001\u0000\u0000"+
		"\u0000\u04a3\u04a4\u0001\u0000\u0000\u0000\u04a4\u04a5\u0005\u001b\u0000"+
		"\u0000\u04a5\u008d\u0001\u0000\u0000\u0000\u04a6\u04ab\u0003\u0090H\u0000"+
		"\u04a7\u04a8\u0005o\u0000\u0000\u04a8\u04aa\u0003\u0090H\u0000\u04a9\u04a7"+
		"\u0001\u0000\u0000\u0000\u04aa\u04ad\u0001\u0000\u0000\u0000\u04ab\u04a9"+
		"\u0001\u0000\u0000\u0000\u04ab\u04ac\u0001\u0000\u0000\u0000\u04ac\u008f"+
		"\u0001\u0000\u0000\u0000\u04ad\u04ab\u0001\u0000\u0000\u0000\u04ae\u04b2"+
		"\u0003\u0092I\u0000\u04af\u04b1\u0003\u0092I\u0000\u04b0\u04af\u0001\u0000"+
		"\u0000\u0000\u04b1\u04b4\u0001\u0000\u0000\u0000\u04b2\u04b0\u0001\u0000"+
		"\u0000\u0000\u04b2\u04b3\u0001\u0000\u0000\u0000\u04b3\u0091\u0001\u0000"+
		"\u0000\u0000\u04b4\u04b2\u0001\u0000\u0000\u0000\u04b5\u04b9\u0005\u0017"+
		"\u0000\u0000\u04b6\u04b9\u0005\u0018\u0000\u0000\u04b7\u04b9\u0003\u0094"+
		"J\u0000\u04b8\u04b5\u0001\u0000\u0000\u0000\u04b8\u04b6\u0001\u0000\u0000"+
		"\u0000\u04b8\u04b7\u0001\u0000\u0000\u0000\u04b9\u04ba\u0001\u0000\u0000"+
		"\u0000\u04ba\u04b8\u0001\u0000\u0000\u0000\u04ba\u04bb\u0001\u0000\u0000"+
		"\u0000\u04bb\u04bd\u0001\u0000\u0000\u0000\u04bc\u04be\u0003\u0096K\u0000"+
		"\u04bd\u04bc\u0001\u0000\u0000\u0000\u04bd\u04be\u0001\u0000\u0000\u0000"+
		"\u04be\u0093\u0001\u0000\u0000\u0000\u04bf\u04c0\u0005\u001f\u0000\u0000"+
		"\u04c0\u0095\u0001\u0000\u0000\u0000\u04c1\u04c2\u0005\u001c\u0000\u0000"+
		"\u04c2\u04c3\u0005\u001f\u0000\u0000\u04c3\u0097\u0001\u0000\u0000\u0000"+
		"\u04c4\u04c9\u0003\u009aM\u0000\u04c5\u04c6\u0005\u001d\u0000\u0000\u04c6"+
		"\u04c8\u0003\u009aM\u0000\u04c7\u04c5\u0001\u0000\u0000\u0000\u04c8\u04cb"+
		"\u0001\u0000\u0000\u0000\u04c9\u04c7\u0001\u0000\u0000\u0000\u04c9\u04ca"+
		"\u0001\u0000\u0000\u0000\u04ca\u04cd\u0001\u0000\u0000\u0000\u04cb\u04c9"+
		"\u0001\u0000\u0000\u0000\u04cc\u04ce\u0005\u001d\u0000\u0000\u04cd\u04cc"+
		"\u0001\u0000\u0000\u0000\u04cd\u04ce\u0001\u0000\u0000\u0000\u04ce\u0099"+
		"\u0001\u0000\u0000\u0000\u04cf\u04d0\u0005\u0015\u0000\u0000\u04d0\u04d1"+
		"\u0005\u001c\u0000\u0000\u04d1\u04d2\u0003\u009cN\u0000\u04d2\u009b\u0001"+
		"\u0000\u0000\u0000\u04d3\u04d7\u0003\u009eO\u0000\u04d4\u04d6\u0003\u009e"+
		"O\u0000\u04d5\u04d4\u0001\u0000\u0000\u0000\u04d6\u04d9\u0001\u0000\u0000"+
		"\u0000\u04d7\u04d5\u0001\u0000\u0000\u0000\u04d7\u04d8\u0001\u0000\u0000"+
		"\u0000\u04d8\u009d\u0001\u0000\u0000\u0000\u04d9\u04d7\u0001\u0000\u0000"+
		"\u0000\u04da\u04db\u0007\u0007\u0000\u0000\u04db\u009f\u0001\u0000\u0000"+
		"\u0000\u00bb\u00a4\u00a6\u00af\u00b9\u00c1\u00c9\u00cf\u00d5\u00d9\u00dc"+
		"\u00e7\u00ee\u00f2\u0108\u0112\u0115\u011d\u0120\u0123\u0128\u012a\u012f"+
		"\u0132\u0138\u013a\u013f\u0142\u0145\u014a\u014c\u0150\u0155\u0159\u015c"+
		"\u0161\u0163\u0166\u016b\u0171\u0179\u017c\u0185\u018b\u018f\u0199\u019c"+
		"\u01a5\u01ae\u01b1\u01b6\u01b9\u01be\u01c4\u01d1\u01d7\u01d9\u01e4\u01ec"+
		"\u01f4\u01f7\u01fc\u0200\u0204\u020b\u0210\u0215\u0218\u021d\u0221\u022c"+
		"\u0230\u0238\u023d\u0245\u0248\u024f\u0254\u0258\u0263\u0266\u0269\u026e"+
		"\u0272\u027a\u027e\u0282\u028a\u02aa\u02ae\u02b0\u02c7\u02cc\u02ce\u02d9"+
		"\u02dd\u02e1\u02ed\u02f1\u02f5\u02f9\u02fe\u0305\u0309\u030d\u0311\u0315"+
		"\u0319\u031c\u0320\u0329\u032d\u0331\u0341\u0344\u0347\u0352\u0355\u035c"+
		"\u035f\u0361\u0367\u036f\u0372\u0379\u037c\u037e\u0381\u0385\u038c\u039a"+
		"\u039d\u03a0\u03aa\u03ad\u03b0\u03b4\u03bc\u03bf\u03c2\u03c6\u03c8\u03d3"+
		"\u03d8\u03de\u03e6\u03e9\u03f3\u03f6\u03fe\u0407\u040a\u041f\u0423\u0429"+
		"\u042e\u0432\u0436\u043a\u043c\u0442\u0444\u0448\u044c\u0450\u0454\u0458"+
		"\u045c\u045e\u0465\u046a\u0470\u0476\u047c\u0482\u0485\u048e\u0491\u049c"+
		"\u04a2\u04ab\u04b2\u04b8\u04ba\u04bd\u04c9\u04cd\u04d7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}