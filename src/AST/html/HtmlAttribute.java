package AST.html;

public class HtmlAttribute implements HtmlNode {
  private final String name;
  private final String value;

  public HtmlAttribute(String name, String value) {
    this.name = name;
    this.value = value;
  }

  @Override
  public String toString() {
    return name + "=" + value;
  }

  @Override
  public String toGrammarString(int indent) {
    String prefix = "  ".repeat(indent);
    return prefix + "HtmlAttribute(" + name + "=" + value + ")";
  }
}
