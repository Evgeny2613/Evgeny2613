package lessons.lesson26;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class XmlTester {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        Document doc = builder.parse(new File("test.xml"));
        Element root = doc.getDocumentElement(); // корневой элемент

        // Цена
        NodeList priceNodeList = root.getElementsByTagName("PRICE");
        for (int i = 0; i < priceNodeList.getLength(); i++) {
            Node priceNode = priceNodeList.item(i);
            System.out.println(priceNode.getFirstChild().getTextContent());
        }


        NodeList plantNodeList = root.getElementsByTagName("PLANT");
        for (int j = 0; j < plantNodeList.getLength(); j++) {
            Node plantNode = plantNodeList.item(j); // узел элемента
            NamedNodeMap atts = plantNode.getAttributes(); // атрибуты узла
            for (int k = 0; k < atts.getLength(); k++) {
                Node attribute = atts.item(k);
                System.out.println(attribute.getNodeName() + ":" + attribute.getNodeValue());
            }

        }

        NodeList zoneNodeList = root.getElementsByTagName("ZONE");
        int sumZone = 0;
        for (int i = 0; i < zoneNodeList.getLength(); i++) {
            Node zoneNode = zoneNodeList.item(i);
            sumZone += Integer.parseInt(zoneNode.getFirstChild().getTextContent());
        }
        System.out.println(sumZone);



    }
}
