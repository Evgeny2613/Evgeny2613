package lessons.lesson4.pizza;

public class Pizza {

    public enum PizzaSize {
        SMALL, MEDIUM, LARGE;
    }

    PizzaSize size;
    private int peperoni;
    private int ham;
    private int cheese;
    private int mushrooms;

    public int calcPrice() {
        int price = 0;

        if (size == PizzaSize.SMALL)
            price += 10;
        else if (size == PizzaSize.MEDIUM)
            price += 12;
        else
            price += 14;

        price += (peperoni + ham + cheese + mushrooms) * 2;
        return price;
    }


    public Pizza(PizzaSize size, int peperoni, int ham, int cheese, int mushrooms) {
        this.size = size;
        this.peperoni = peperoni;
        this.ham = ham;
        this.cheese = cheese;
        this.mushrooms = mushrooms;
    }

    public PizzaSize getSize() {
        return size;
    }

    public int getPeperoni() {
        return peperoni;
    }

    public int getHam() {
        return ham;
    }

    public int getCheese() {
        return cheese;
    }

    public int getMushrooms() {
        return mushrooms;
    }
}
