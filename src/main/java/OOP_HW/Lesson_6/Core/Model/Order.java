package OOP_HW.Lesson_6.Core.Model;

import java.util.HashMap;
import java.util.Map;

public abstract class Order {
    protected Integer id;
    protected Map<Product, Integer> basket;

    Integer getId() {
        return this.id;
    }

    public Order() {
        this.id = IdSystem.idOrders++;
        this.basket = new HashMap<>();
    }
    public void addItem(Product product, Integer count) {
        if (basket.containsKey(product)) {
            basket.put(product, basket.get(product) + count);
        } else {
            basket.put(product, count);
        }
    }
    public void delItem(Product product) {
        basket.remove(product);
    }
    public void clearBasket() {
        basket.clear();
    }

    abstract void makeDelivery();

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Состав заказа № " + this.id + "\n");
        for (Map.Entry<Product, Integer> entry : basket.entrySet()) {
            str.append(entry.getKey().getName() + "(" + entry.getKey().getId() + ")" + ": " + entry.getValue() + "\n");
        }
        return str.toString();
    }
}
