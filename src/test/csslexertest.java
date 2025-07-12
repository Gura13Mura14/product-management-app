import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class CSSParserTest {
  public static void main(String[] args) {
    String cssCode = """
            .app-container {
                display: flex;
                justify-content: space-between;
                padding: 20px;
            }

            app-product-list {
                flex: 1;
                margin-right: 20px;
            }

            app-product-detail {
                flex: 2;
            }
        """;

    try {
      // Lexer
      CSSLexer lexer = new CSSLexer(CharStreams.fromString(cssCode));
      CommonTokenStream tokens = new CommonTokenStream(lexer);

      // Parser
      CSSParser parser = new CSSParser(tokens);
      ParseTree tree = parser.stylesheet();

      // Print the parse tree
      System.out.println(tree.toStringTree(parser));
    } catch (Exception e) {
      System.err.println("Error: " + e.getMessage());
    }
  }
}
