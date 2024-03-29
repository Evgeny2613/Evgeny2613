package lessons.lesson20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Order {
    private List<OrderItem> items = new ArrayList<>();

    public Order(OrderItem ... items) {
        this.items.addAll(Arrays.asList(items));
    }

    public List<OrderItem> getItems() {
        return items;
    }
}
