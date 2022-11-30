package lessons.lesson26;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class JaxbTester {
    public static void main(String[] args) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Catalog.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Catalog catalog = (Catalog) unmarshaller.unmarshal(new File("test.xml"));

        System.out.println(catalog);
        System.out.println(catalog.getPlants().get(1).getPrice());
    }
}
