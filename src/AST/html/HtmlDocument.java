package AST.html;

import java.util.List;

public class HtmlDocument implements HtmlNode {
  private final List<HtmlNode> children;

  public HtmlDocument(List<HtmlNode> children) {
    this.children = children;
  }

  public List<HtmlNode> getChildren() {
    return children;
  }

  @Override
  public String toString() {
    return children.toString();
  }

  @Override
  public String toGrammarString(int indent) {
    StringBuilder sb = new StringBuilder();
    for (HtmlNode child : children) {
      sb.append(child.toGrammarString(indent)).append("\n");
    }
    return sb.toString();
  }
}
