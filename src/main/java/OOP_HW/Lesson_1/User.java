package OOP_HW.Lesson_1;

import java.util.ArrayList;

public class User {
    private String login;
    private String password;
    private Basket purchase = new Basket();

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public User() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Object getBasket() {
        return purchase;
    }

    @Override
    public String toString() {
        return "Логин: " + login +
                ", " + purchase;
    }

    /**
     * Метод добавления товара в корзину конкретного пользователя
     * @param basket Корзина для хранения купленного товара
     * @param count Количество купленной единицы товаров
     * @param shop магазин, сток с которого списываем
     */
    public void addPurchase(Object basket, Double count, Shop shop) {
        purchase.addGoods(basket, count);
        shop.delGoods(basket, count);

    }
}
