package Homework.hw26;

/* Напишите функцию которая принимает на вход Element
 и складывает значения атрибутов plantid из его дочерних элементов PLANT (579)
 */

import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class Ex1 {
    public static void main(String[] args) {
        try {
            DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document doc = builder.parse(new File("test.xml"));
            Element root = doc.getDocumentElement();

            NodeList plantIdNodeList = root.getElementsByTagName("PLANT");
            System.out.println(summarizingPlantId(plantIdNodeList));

        }
        catch (Exception e) {
            System.err.println(e);
        }

    }

    public static int summarizingPlantId(NodeList plantIdNodeList) {
        int sum = 0;
        for (int i = 0; i < plantIdNodeList.getLength(); i++) {
            Node plantIdNode = plantIdNodeList.item(i);
            NamedNodeMap id = plantIdNode.getAttributes();
            for (int j = 0; j < id.getLength(); j++) {
                Node attribute = id.item(j);
                if (attribute.getNodeName().equals("plantid"))
                    sum += Integer.parseInt(attribute.getNodeValue());
            }
        }
        return sum;
    }
}
