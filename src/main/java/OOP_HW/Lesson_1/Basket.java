package OOP_HW.Lesson_1;

import java.util.HashMap;
import java.util.Map;

public class Basket {
    private Map<Object, Double> check_goods = new HashMap<>();

    protected Basket() {
    }

    @Override
    public String toString() {
        return "Список покупок: " + check_goods;
    }

    /**
     * Метод для добавления товара в корзину
     * @param goods карточка товара
     * @param count количество единицы товара
     */
    public void addGoods(Object goods, Double count) {
        if (this.check_goods.containsKey(goods)) {
            this.check_goods.put(goods, this.check_goods.get(goods) + count);
        } else {
            this.check_goods.put(goods, count);
        }
    }
}
