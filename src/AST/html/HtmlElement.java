package AST.html;

import java.util.List;

public class HtmlElement implements HtmlNode {
  private final String tagName;
  private final List<HtmlAttribute> attributes;
  private final List<HtmlNode> children;
  private final boolean selfClosing;

  public HtmlElement(String tagName, List<HtmlAttribute> attributes, List<HtmlNode> children, boolean selfClosing) {
    this.tagName = tagName;
    this.attributes = attributes;
    this.children = children;
    this.selfClosing = selfClosing;
  }

  @Override
  public String toString() {
    return "<" + tagName + ">";
  }

  @Override
  public String toGrammarString(int indent) {
    String prefix = "  ".repeat(indent);
    StringBuilder sb = new StringBuilder();
    sb.append(prefix).append("HtmlElement(").append(tagName).append(")\n");
    for (HtmlAttribute attr : attributes) {
      sb.append(attr.toGrammarString(indent + 1)).append("\n");
    }
    for (HtmlNode child : children) {
      sb.append(child.toGrammarString(indent + 1)).append("\n");
    }
    return sb.toString();
  }
}
