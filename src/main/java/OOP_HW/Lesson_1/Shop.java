package OOP_HW.Lesson_1;

import java.util.HashMap;
import java.util.Map;

public class Shop {
    public Map<Object, Double> stock = new HashMap<>();

    public Shop(Map<Object, Double> stock) {
        this.stock = stock;
    }

    public Shop() {
    }

    /**
     * Метод для добавления товара на сток магазина
     * @param goods Единица товара
     * @param count Количество товара
     */
    public void addGoods(Object goods, Double count) {
        if (this.stock.containsKey(goods)) {
            this.stock.put(goods, this.stock.get(goods) + count);
        } else {
            this.stock.put(goods, count);
        }
    }
    /**
     * Метод для удаления товара со стока магазина
     * @param goods Единица товара
     * @param count Количество товара
     */
    public void delGoods(Object goods, Double count) {
        if (this.stock.containsKey(goods)) {
            this.stock.put(goods, this.stock.get(goods) - count);
        } else {
            System.out.println("Такого товара нет на стоке");;
        }
    }

    @Override
    public String toString() {
        return "Список товаров: " + stock;
    }
}

