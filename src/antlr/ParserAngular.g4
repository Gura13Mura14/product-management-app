parser grammar ParserAngular;

options { tokenVocab = LexerAngular; }

program: (doctypeDeclaration | htmlElement | styleBlock | scriptBlock| tsStatement)*EOF;



// ---------------------------------------------
// TypeScript Grammar
// ---------------------------------------------

scriptBlock: SCRIPT_OPEN tsStatement* SCRIPT_CLOSE;

tsStatement:
 importStatement
 | componentDeclaration
 | classDeclaration
 | functionDeclaration
 | statement;



             importStatement
                 : IMPORT (IDENTIFIER | STAR AS IDENTIFIER | importSpecifier) FROM String eos
                 | IMPORT String eos
                 ;

             importSpecifier
                 : LCURLY (IDENTIFIER (AS IDENTIFIER)? (COMMA IDENTIFIER (AS IDENTIFIER)?)*)? RCURLY;

                     componentDeclaration
                         :COMPONENT LPAREN LCURLY (selector|standalone |url | imports)
                         (COMMA(selector|standalone|url| imports))* COMMA? RCURLY RPAREN ;

                     selector:SELECTOR COLON String;

                     standalone:STANDALONE COLON Boolean;

                     url:STYLEURL COLON LSBRACKET String RSBRACKET
                     | TEMPLATEURL COLON String ;

                     imports:IMPORTS COLON LSBRACKET (IDENTIFIER (COMMA IDENTIFIER)*)? RSBRACKET
                     | IMPORTS COLON LSBRACKET IDENTIFIER RSBRACKET;




                      functionDeclaration:
                      (FUNCTION? IDENTIFIER? parameterList  (COLON IDENTIFIER?)? block)
                      |arrowMethod;

                      methodDeclaration:
                     ((modifier)?  IDENTIFIER parameterList (COLON IDENTIFIER? ONEOR? Undefined?)? block)

                      | IDENTIFIER parameterList LCURLY block RCURLY
//|arrowMethod

                      ;

                       arrowMethod:
                       modifier? IDENTIFIER? parameterList  (COLON IDENTIFIER?)?  ARROW LCURLY? statement* RCURLY?
  // | IDENTIFIER? parameterList  (COLON IDENTIFIER?)? LCURLY? statement* RCURLY
                       | (ASYNC)? LPAREN (IDENTIFIER (COMMA IDENTIFIER)*)? RPAREN ARROW block
                       |  LPAREN RPAREN ARROW block

                                                    ;


                       block:
                       LCURLY statement* returnStatement? RCURLY
                       |                        LCURLY variableDeclaration  RCURLY






                       ;

                       parameterList:
                       LPAREN (parameter (COMMA parameter)*)? RPAREN;

                       parameter:
                       (IDENTIFIER COLON IDENTIFIER (EQUAL literal)?)|IDENTIFIER
                       |  modifier (IDENTIFIER COLON IDENTIFIER (EQUAL literal)?)|IDENTIFIER;


             modifier : PUBLIC | PRIVATE | PROTECTED | READONLY | STATIC | ABSTRACT | FINAL | ASYNC | EXPORT  ;

             classDeclaration
                 :(modifier)? CLASS? IDENTIFIER ((EXTENDS| IMPLEMENTS) IDENTIFIER)? LCURLY (classMember)* RCURLY
                  ;

             classMember
                 : inputDeclaration
                 | outputDeclaration
                 | methodDeclaration
                 | propertyDeclaration
                 | variableDeclaration
                 | objectDecleration
                 | constructorDecleration
                 | ngOn


                 ;



             ngOn
             :(NGONINIT|NGONCHANGES) parameterList (COLON IDENTIFIER?)? block;

             constructorDecleration
             :CONSTRUCTOR parameterList block;

             inputDeclaration
                 :( INPUT LPAREN (literal)? RPAREN property) ;


             outputDeclaration
                 :( OUTPUT LPAREN (literal)? RPAREN objectDecleration)eos;

             variableDeclaration
                 :(modifier? type)? IDENTIFIER (COLON expression)?  (EQUAL expression)? (AS IDENTIFIER)? eos
                 |  (modifier? type)? IDENTIFIER (COLON expression)?  (EQUAL expression QUESTION PLUS )? (AS IDENTIFIER)? eos;



             type:(CONST | LET | VAR | INTERFACE );

             propertyDeclaration:(modifier)? property (EQUAL expression)? eos
             | (modifier)?(type)? property (EQUAL expression)? eos;


             property:(IDENTIFIER COLON expression)|imports
             | (IDENTIFIER  QUESTION COLON  expression)
             ;

objectDecleration:
             (property|objectName ) EQUAL objectInit eos;

             objectName:
            modifier? IDENTIFIER  objectType? ;

             objectInit:
             NEW IDENTIFIER objectType?  LPAREN (expression (COMMA expression)*)? RPAREN;

             objectType:
             LESS_THAN IDENTIFIER list? (COMMA IDENTIFIER list?)* GREATER_THAN
             ;

             objectLiteral:LCURLY (property (COMMA property)*)? COMMA? RCURLY;

             literal
                 : (PLUS | MINUS)? Integer |(PLUS | MINUS)? Float | String | Boolean | Null | Undefined|THIS ;

                 statement
                     : variableDeclaration
                     |LCURLY? variableDeclaration RCURLY?
                     | objectDecleration
                     | ifStatement
                     | forStatement
                     | whileStatement
                     | jasmineStatement
                     | expressionStatement
                     ;

                     expression
                         : expression list                                   #ExpressionList//
                         | objectLiteral                                     #ObjectLiteralExpression//
                         | objectDecleration                                 #ObjectDeclarationExpression//
                         | objectName                                        #ObjectNameExpression//
                         | arrowMethod                                       #ArrowMethodExpression//
                         | expression EQUAL (dataStructure | literal)        #AssignmentExpression//
                         | THIS                                              #ThisExpression//
                         | AWAIT                                             #Await//
                         | IDENTIFIER                                        #IdentifierExpression//
                         | IDENTIFIER PLUS PLUS                              #PostIncrementExpression//
                         | IDENTIFIER MINUS MINUS                            #PostDecrementExpression//
                         | literal                                           #LiteralExpression//
                         | callingMethod                                     #CallingMethodExpression//
                         | expression DOT expression                          #DotExpression//


                         | expression QUESTION DOT expression                #OptionalChainingExpression
| EQUAL LCURLY? DOT DOT DOT expression RCURLY?                               #EXTRADOT
                         | expression compersion expression                  #ComparisonExpression//
                         |  compersion  IDENTIFIER                           #ComparisonExpressionid//
                         | expression operator expression                    #OperatorExpression//
                         | LESS_THAN expression GREATER_THAN IDENTIFIER      #GenericTypeExpression
                         | LPAREN expression AS IDENTIFIER RPAREN            #TypeCastExpression//
                         | expression AS IDENTIFIER                          #TypeAssertionExpression//
                         | dataStructure                                     #DataStructureExpression//
                         | returnStatement                                               #Return//
                         | LCURLY? returnStatement RCURLY?                    #ReturnExp//
                         |expression ONEOR expression                                   #ONEOR

                         ;



             ifStatement
                 :( IF LPAREN expression  RPAREN block elseIfStatment* elseStatment?)
                 |shortIf
                 |arrowIf;

             elseIfStatment:ELSEIF LPAREN expression RPAREN block;
             elseStatment:ELSE block;

             shortIf:LPAREN? expression  RPAREN? QUESITIONMARK LPAREN?  statement RPAREN?  (shortElseIf )* shortelse ;
             shortElseIf:COLON LPAREN? expression  RPAREN? QUESITIONMARK LPAREN?  statement RPAREN?;
             shortelse:COLON LPAREN?  statement RPAREN?;

             arrowIf:LPAREN? expression  RPAREN? ARROW expression
             | LPAREN expression ARROW block RPAREN eos
             | LPAREN expression ARROW expression RPAREN eos;

             forStatement
                 : FOR LPAREN (variableDeclaration | expression)? SEMI expression? SEMI expression? RPAREN block;

whileStatement
                 : WHILE LPAREN expression RPAREN block;

             expressionStatement
                 : expression eos;

             returnStatement
                 : RETURN LPAREN? expressionStatement? RPAREN? eos
|  RETURN expression eos
                    ;


                 callingMethod
                 :((IDENTIFIER|CATCH) LPAREN (expression (COMMA expression)*)? RPAREN) ((DOT (callingMethod|IDENTIFIER))|dataStructure)*
                 |((A IDENTIFIER|CATCH) LPAREN (expression (COMMA expression)*)? RPAREN) ((DOT (callingMethod|IDENTIFIER))|dataStructure)*
|  LCURLY? DOT DOT DOT expression RCURLY?
;
                 dataStructure:list|map;

                 itemsStructures:(literal|IDENTIFIER|list|map|callingMethod | expression);

             map:LCURLY ((itemsStructures COLON itemsStructures) (COMMA (itemsStructures COLON itemsStructures))*)? COMMA? RCURLY;

             list:LSBRACKET (itemsStructures (COMMA itemsStructures)*)? COMMA? RSBRACKET
             | LCURLY? LSBRACKET (itemsStructures (COMMA itemsStructures)*)? COMMA? RSBRACKET RCURLY? ;

             operator
                 : EQUAL | PLUS | MINUS | STAR | DIVIDE |PLUS EQUAL|MINUS EQUAL;

                 compersion
                 :GREATER_THAN|LESS_THAN|GREATER_THAN_OR_EQUAL|LESS_THAN_OR_EQUAL|NOT_EQUAL|EQUAL_TO| AND | OR|EQUAL_TO3|NOT_EQUAL2;
                 eos:SEMI?;


   jasmineStatement
           : jasmineDescribe              #Describe
           | jasmineIt                     #It
           | jasmineBeforeEach             #BeforeEach
           | jasmineAfterEach              #AfterEach
           ;


jasmineDescribe
    : DESCRIBE LPAREN String COMMA jasmineCallback RPAREN? SEMI?
           | DESCRIBE LPAREN String COMMA arrowMethod RPAREN SEMI;



jasmineCallback
    : (ASYNC)? parameterList ARROW LCURLY jasmineStatement* RCURLY
    ;

    //jasmineDescribe
      // : DESCRIBE LPAREN String COMMA arrowMethod RPAREN SEMI;


   jasmineIt
           : IT LPAREN String IDENTIFIER? String? COMMA arrowMethod RPAREN SEMI
           ;

    jasmineBeforeEach
        : BEFOREEACH LPAREN arrowMethod RPAREN SEMI
        ;

    jasmineAfterEach
        : AFTEREACH LPAREN arrowMethod RPAREN SEMI
            ;


htmlElement
    : doctypeDeclaration eos?                                        #htmlDoctype
    | TAG_OPEN HTML_TAG_NAME htmlAttributes? HTML_TAG_CLOSE htmlContent* htmlClosingTag eos? #htmlStandardElement
    | TAG_OPEN HTML_TAG_NAME htmlAttributes? HTML_SLASH_CLOSE eos?  #htmlSelfClosingElement
    ;

doctypeDeclaration
    : DOCTYPE eos? #doctype
    ;

htmlAttributes
    : (htmlAttribute | angularAttribute)* eos? #htmlAttributeList
    ;

angularAttribute
    : HTML_PROPERTY_BINDING eos?         #propertyBinding
    | HTML_EVENT_BINDING eos?            #eventBinding
    | HTML_TWO_WAY_BINDING eos?          #twoWayBinding
    | HTML_STAR_BINDING eos?             #structuralBinding
    | HTML_INTERPOLATION eos?            #interpolationBinding
    ;

htmlClosingTag
    : TAG_OPEN HTML_SLASH HTML_TAG_NAME HTML_TAG_CLOSE eos? #htmlClosing
    ;

htmlAttribute
    : HTML_ATTRIBUTE_NAME (HTML_EQUALS HTML_ATTRIBUTE_VALUE)? eos                  #standardHtmlAttribute
    | HTML_PROPERTY_BINDING (HTML_EQUALS HTML_ATTRIBUTE_VALUE)? eos               #propertyBindingWithValue
    | HTML_EVENT_BINDING (HTML_EQUALS HTML_ATTRIBUTE_VALUE)? eos                  #eventBindingWithValue
    | HTML_TWO_WAY_BINDING (HTML_EQUALS HTML_ATTRIBUTE_VALUE)? eos                #twoWayBindingWithValue
    | HTML_STAR_BINDING (HTML_EQUALS HTML_ATTRIBUTE_VALUE)? eos                   #structuralBindingWithValue
    ;

htmlContent
    : htmlElement eos             #elementContent
    | HTML_INTERPOLATION eos     #interpolationContent
    | TEXT eos                   #textContent
    ;

// ---------- CSS Parsing ----------
stylesheet
    : styleBlock? EOF #stylesheetRoot
    ;

styleBlock
    : STYLE_OPEN cssRules STYLE_CLOSE #cssStyleBlock
    ;

cssRules
    : cssRule* #cssRulesList
    ;

cssRule
    : cssSelector CSS_LBRACE cssDeclarations? CSS_RBRACE #cssRuleBlock
    ;

cssSelector
    : combinedSelector (COMMA combinedSelector)* #cssSelectorList
    ;

combinedSelector
    : simpleSelector (simpleSelector)* #combinedSelectorChain
    ;

simpleSelector
    : (CSS_CLASS_SELECTOR | CSS_ID_SELECTOR | elementSelector)+ pseudoClass? #simpleSelectorNode
    ;

elementSelector
    : CSS_IDENTIFIER #elementSelectorId
    ;

pseudoClass
    : CSS_COLON CSS_IDENTIFIER #pseudoClassSelector
    ;

cssDeclarations
    : cssDeclaration (CSS_SEMICOLON cssDeclaration)* CSS_SEMICOLON? #cssDeclarationsBlock
    ;

cssDeclaration
    : CSS_PROPERTY CSS_COLON cssValueList #cssDeclarationPair
    ;

cssValueList
    : cssValue (cssValue)* #cssValueListNode
    ;

cssValue
    : CSS_VALUE         #cssRawValue
    | CSS_PROPERTY      #cssPropertyAsValue
    ;
