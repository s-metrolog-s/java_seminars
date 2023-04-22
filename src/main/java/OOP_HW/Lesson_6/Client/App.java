package OOP_HW.Lesson_6.Client;

import OOP_HW.Lesson_6.Core.Controller.Controller;
import OOP_HW.Lesson_6.Core.Controller.Status;
import OOP_HW.Lesson_6.Core.Model.Order;
import OOP_HW.Lesson_6.Core.Model.Product;
import OOP_HW.Lesson_6.Core.Model.Warehouse;

public class App {
    public static void main(String[] args) {
        /*
        Создать систему управления складом(SOLID)
            +a) Product должен хранит информацию о товаре, такую как название, количество, цена и тд.
            (decreaseQuantity(int amount) , increaseQuantity(int amount))
            +b) Warehouse должен управлять запасами товаров на складе, обеспечивает их хранение и выдачу.
            (добавление/удаление продукта, увеличение/уменьшение количества продукта)
            +c) Order должен отвечать за обработку заказов на товары со склада.
            (processOrder(Product product, int amount)- обработка заказа)

        S - product, warehouse, order - занимаются только своими функциями
        O - расширять можно за счет других способов доставки и других типов заказов,
            которые будут наследоваться от абстрактного
        L - изначально делал один класс Order, все работал. Потом сделал его абстрактным,
            и сделал двух потомков для разного типа заказа, все также продолжило работать, код не пришлось менять
        I - принцип заложен в реализации интерфейсов для добавление/удаление продукта, увеличение/уменьшение и поиска
        D - достигается за счет введения дополнительных классов для создания заказов и товаров,
            в случае добавления полей их можно будет доавить через интерфейс в классы Buidler
         */

        System.out.println("Добро пожаловать в систему управления товарными запасами");
        Controller controller = new Controller();
        controller.startWork();
    }
}

