package lessons.lesson26;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.List;

public class JaxbTester {
    public static void main(String[] args) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Catalog.class);

        // Загружаем обьект из XML файла
//        Unmarshaller unmarshaller = context.createUnmarshaller();
//        Catalog catalog = (Catalog) unmarshaller.unmarshal(new File("test.xml"));
//        System.out.println(catalog);
//        System.out.println(catalog.getPlants().get(1).getPrice());

        // загружаем обьект в XML файл
        Plant aloe = new Plant("123", "c", "b", "z", "l", "p,", "a");
        Catalog catalog = new Catalog("c", "s", List.of(aloe));
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(catalog, new File("newcatalog.xml"));
    }
}
