package OOP_HW.Lesson_6.Core.Controller;

import OOP_HW.Lesson_6.Core.Model.OrderBuilder;
import OOP_HW.Lesson_6.Core.Model.Product;
import OOP_HW.Lesson_6.Core.Model.ProductBuilder;
import OOP_HW.Lesson_6.Core.Model.Warehouse;

import java.util.Scanner;

public class Controller {
    Warehouse war;
    ProductBuilder prodBuild;
    OrderBuilder ordBuild;

    public void startWork() {
        Status status = Status.WORK;
        war = new Warehouse();
        while (status.equals(Status.WORK)) {
            System.out.println();
            System.out.println("*********************************************");
            System.out.println(
                    "Выберите действие:\n" +
                            "1 - отображение всех складских запасов\n" +
                            "2 - добавить новый артикул\n" +
                            "3 - удалить артикул из учета\n" +
                            "4 - добавить количество по имеющемуся артикулу\n" +
                            "5 - уменьшить количество по имеющему артикулу\n" +
                            "6 - проверить наличие товара на складе\n" +
                            "7 - оформить заказ\n" +
                            "8 - вывести список заказов\n" +
                            "9 - завершение работы программы");
            Scanner scanner = new Scanner(System.in);
            Integer workMod = scanner.nextInt();
            Integer tempId;
            switch (workMod) {
                case 1:
                    System.out.println(war.toString());
                    break;
                case 2:
                    prodBuild = new ProductBuilder();
                    war.addProduct(prodBuild.addNewProduct());
                    break;
                case 3:
                    System.out.println("Введите ID продукта для удаления:");
                    tempId = scanner.nextInt();
                    if (war.findProduct(tempId) != null) {
                        war.delProduct(war.findProduct(tempId));
                        System.out.println("Операция прошла успешно");
                    } else {
                        System.out.println("Товар не найден на складе");
                    }
                    break;
                case 4:
                    System.out.println("Введите ID для увеличения количества:");
                    tempId = scanner.nextInt();
                    if (war.findProduct(tempId) != null) {
                        System.out.println("Введите количество, на которое увеличить запас:");
                        war.increaseQuantity(war.findProduct(tempId), scanner.nextInt());
                        System.out.println("Операция прошла успешно");
                    } else {
                        System.out.println("Товар не найден на складе");
                    }
                    break;
                case 5:
                    System.out.println("Введите ID для увеличения количества:");
                    tempId = scanner.nextInt();
                    if (war.findProduct(tempId) != null) {
                        System.out.println("Введите количество, на которое уменшить запас:");
                        war.decreaseQuantity(war.findProduct(tempId), scanner.nextInt());
                        System.out.println("Операция прошла успешно");
                    } else {
                        System.out.println("Товар не найден на складе");
                    }
                    break;
                case 6:
                    System.out.println("Введите ID проверки запасов:");
                    tempId = scanner.nextInt();
                    if (war.findProduct(tempId) != null) {
                        System.out.println(war.findProduct(tempId));
                    } else {
                        System.out.println("Товар не найден на складе");
                    }
                    break;
                case 7:
                    ordBuild = new OrderBuilder();
                    war.addBasket(ordBuild.makeOrder(war));
                    break;
                case 8:
                    System.out.println(war.listOrders.toString());
                    break;
                case 9:
                    System.out.println("Работы программы завершена");
                    status = Status.EXIT;
                    break;
                default:
                    System.out.println("Такого режима не существует, попробуйсте снова");
                    break;
            }
        }
    }
}
