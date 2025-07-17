package visitor;

import parser.ParserAngularBaseVisitor;
import parser.ParserAngularParser;
import ast.html.*;

import java.util.ArrayList;
import java.util.List;

public class BaseVisitorAngular extends ParserAngularBaseVisitor<HtmlNode> {

  @Override
  public HtmlNode visitProgram(ParserAngularParser.ProgramContext ctx) {
    List<HtmlNode> nodes = new ArrayList<>();
    for (var child : ctx.children) {
      HtmlNode node = child.accept(this);
      if (node != null) nodes.add(node);
    }
    return new HtmlDocument(nodes);
  }

  @Override
  public HtmlNode visitHtmlStandardElement(ParserAngularParser.HtmlStandardElementContext ctx) {
    String tagName = ctx.HTML_TAG_NAME().getText();
    List<HtmlAttribute> attributes = new ArrayList<>();
    List<HtmlNode> children = new ArrayList<>();

    if (ctx.htmlAttributes() != null)
      for (var attrCtx : ctx.htmlAttributes().children)
        attributes.add((HtmlAttribute) attrCtx.accept(this));

    for (var contentCtx : ctx.htmlContent())
      children.add(contentCtx.accept(this));

    return new HtmlElement(tagName, attributes, children, false);
  }

  @Override
  public HtmlNode visitHtmlSelfClosingElement(ParserAngularParser.HtmlSelfClosingElementContext ctx) {
    String tagName = ctx.HTML_TAG_NAME().getText();
    List<HtmlAttribute> attributes = new ArrayList<>();

    if (ctx.htmlAttributes() != null)
      for (var attrCtx : ctx.htmlAttributes().children)
        attributes.add((HtmlAttribute) attrCtx.accept(this));

    return new HtmlElement(tagName, attributes, new ArrayList<>(), true);
  }

  @Override
  public HtmlNode visitTextContent(ParserAngularParser.TextContentContext ctx) {
    return new HtmlTextNode(ctx.TEXT().getText());
  }

  @Override
  public HtmlNode visitInterpolationContent(ParserAngularParser.InterpolationContentContext ctx) {
    String text = ctx.HTML_INTERPOLATION().getText();
    return new Interpolation(text.substring(2, text.length() - 2).trim());
  }

  @Override
  public HtmlNode visitStandardHtmlAttribute(ParserAngularParser.StandardHtmlAttributeContext ctx) {
    String name = ctx.HTML_ATTRIBUTE_NAME().getText();
    String value = ctx.HTML_ATTRIBUTE_VALUE() != null
      ? ctx.HTML_ATTRIBUTE_VALUE().getText().replaceAll("^['\"]|['\"]$", "")
      : "";
    return new HtmlAttribute(name, value);
  }
}
