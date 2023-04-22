package OOP_HW.Lesson_6.Core.Model;

import OOP_HW.Lesson_6.Core.View.AddDelBasket;
import OOP_HW.Lesson_6.Core.View.AddDelProduct;
import OOP_HW.Lesson_6.Core.View.IncDecProduct;
import OOP_HW.Lesson_6.Core.View.Searchable;

import java.util.ArrayList;
import java.util.List;

public class Warehouse implements AddDelProduct, IncDecProduct, Searchable, AddDelBasket {

    List<Product> listOfProducts;
    public List<Order> listOrders;

    public Warehouse() {
        this.listOfProducts = new ArrayList<>();
        this.listOrders = new ArrayList<>();
    }

    @Override
    public void addProduct(Product product) {
        listOfProducts.add(product);
    }

    @Override
    public void delProduct(Product product) {
        listOfProducts.remove(product);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Список товаров на складе:\n");
        for (Product prod : listOfProducts) {
            str.append(prod.toString() + "\n");
        }
        if (str.isEmpty()) {
            return "Склад пуст";
        } else {
            return str.toString();
        }
    }

    @Override
    public void increaseQuantity(Product product, Integer count) {
        product.setCount(product.getCount() + count);
    }

    @Override
    public void decreaseQuantity(Product product, Integer count) {
        product.setCount(product.getCount() - count);
    }

    @Override
    public Product findProduct(Integer id) {
        for (Product element : this.listOfProducts) {
            if (element.getId().equals(id)) {
                return element;
            }
        }
        return null;
    }

    @Override
    public void addBasket(Order order) {
        listOrders.add(order);
    }

    @Override
    public void delBasket(Order order) {
        listOrders.remove(order);
    }
}