package AST.html;

public class HtmlTextNode implements HtmlNode {
  private final String text;

  public HtmlTextNode(String text) {
    this.text = text;
  }

  @Override
  public String toString() {
    return text;
  }

  @Override
  public String toGrammarString(int indent) {
    String prefix = "  ".repeat(indent);
    return prefix + "Text(\"" + text + "\")";
  }
}
