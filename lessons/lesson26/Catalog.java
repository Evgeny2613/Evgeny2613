package lessons.lesson26;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "CATALOG")
public class Catalog {
    private String name;
    private String size;
    private List<Plant> plants;

    public Catalog() {
    }

    public Catalog(String name, String size, List<Plant> plants) {
        this.name = name;
        this.size = size;
        this.plants = plants;
    }

    public String getName() {
        return name;
    }

    @XmlAttribute(name = "name")
    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    @XmlAttribute(name = "size")
    public void setSize(String size) {
        this.size = size;
    }

    public List<Plant> getPlants() {
        return plants;
    }

    @XmlElement(name = "PLANT")
    public void setPlants(List<Plant> plants) {
        this.plants = plants;
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", plants=" + plants +
                '}';
    }
}
