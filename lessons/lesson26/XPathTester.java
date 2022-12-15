package lessons.lesson26;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.*;
import java.io.File;
import java.io.IOException;

public class XPathTester {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException, XPathExpressionException {
        DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        Document doc = builder.parse(new File("test.xml"));
        Element root = doc.getDocumentElement();

        XPath XPath = XPathFactory.newInstance().newXPath();
        XPathExpression expression = XPath.compile("//PLANT[@plantid='456']/PRICE");
        Element price = (Element) expression.evaluate(doc, XPathConstants.NODE);

        System.out.println(price.getFirstChild().getTextContent());

    }
}
