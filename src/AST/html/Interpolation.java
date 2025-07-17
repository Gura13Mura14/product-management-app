package AST.html;

public class Interpolation implements HtmlNode {
  private final String expression;

  public Interpolation(String expression) {
    this.expression = expression;
  }

  @Override
  public String toString() {
    return "{{ " + expression + " }}";
  }

  @Override
  public String toGrammarString(int indent) {
    String prefix = "  ".repeat(indent);
    return prefix + "Interpolation(" + expression + ")";
  }
}
