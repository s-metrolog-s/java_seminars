package OOP_HW.Lesson_6.Core.Model;

import java.util.Scanner;

public class OrderBuilder {
    Order order;

    public Order makeOrder(Warehouse war) {
        order = new OnlineOrder();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Заказ № " + order.getId() + " создан");

        boolean answer = true;
        System.out.println("Добавить товары в корзину?\n1 - да, 2 - нет");
        answer = (scanner.nextInt() == 1 ? true : false);
        while (answer) {
            System.out.println("Введите ID товара:");
            Integer productID = scanner.nextInt();
            System.out.println("Введите количество, которое необходимо добавить в корзину:");
            Integer basketCount = scanner.nextInt();
            if (war.findProduct(productID) != null) {
                if (war.findProduct(productID).getCount() > basketCount) {
                    order.addItem(war.findProduct(productID), basketCount);
                    war.findProduct(productID).setCount(war.findProduct(productID).getCount() - basketCount);
                } else {
                    System.out.println("Введено количество больше, чем есть на складе");
                }
            } else {
                System.out.println("Такого товара нет на складе");
            }
            System.out.println("Добавить товары в корзину?\n1 - да, 2 - нет");
            answer = (scanner.nextInt() == 1 ? true : false);
        }
        return order;
    }
}
