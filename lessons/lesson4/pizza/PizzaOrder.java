package lessons.lesson4.pizza;

public class PizzaOrder {
    private Pizza [] pizzas;

    public PizzaOrder(Pizza[] pizzas) {
        this.pizzas = pizzas;
    }

    public int getOrderPrice() {
        int price = 0;

        for (Pizza p: pizzas)
            price += p.calcPrice();
        return price;
    }
}
