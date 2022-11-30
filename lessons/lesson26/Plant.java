package lessons.lesson26;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Plant {
    private String plantId;
    private String common;
    private String botanical;
    private String zone;
    private String light;
    private String price;
    private String availability;

    public Plant() {
    }

    public Plant(String plantId, String common, String botanical, String zone, String light, String price, String availability) {
        this.plantId = plantId;
        this.common = common;
        this.botanical = botanical;
        this.zone = zone;
        this.light = light;
        this.price = price;
        this.availability = availability;
    }

    public String getPlantId() {
        return plantId;
    }

    @XmlAttribute(name = "plantid")
    public void setPlantId(String plantId) {
        this.plantId = plantId;
    }


    public String getCommon() {
        return common;
    }
    @XmlElement(name = "COMMON")
    public void setCommon(String common) {
        this.common = common;
    }

    public String getBotanical() {
        return botanical;
    }

    @XmlElement(name = "BOTANICAL")
    public void setBotanical(String botanical) {
        this.botanical = botanical;
    }

    public String getZone() {
        return zone;
    }

    @XmlElement(name = "ZONE")
    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getLight() {
        return light;
    }

    @XmlElement(name = "LIGHT")
    public void setLight(String light) {
        this.light = light;
    }

    public String getPrice() {
        return price;
    }

    @XmlElement(name = "PRICE")
    public void setPrice(String price) {
        this.price = price;
    }

    public String getAvailability() {
        return availability;
    }

    @XmlElement(name = "AVAILABILITY")
    public void setAvailability(String availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "plantId='" + plantId + '\'' +
                ", common='" + common + '\'' +
                ", botanical='" + botanical + '\'' +
                ", zone='" + zone + '\'' +
                ", light='" + light + '\'' +
                ", price='" + price + '\'' +
                ", availability='" + availability + '\'' +
                '}';
    }
}
