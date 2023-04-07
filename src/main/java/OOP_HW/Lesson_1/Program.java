package OOP_HW.Lesson_1;

public class Program {
    public static void main(String[] args) {
        // Заводим карточки товаров
        Goods potato = new Goods("Картошка", 1.25, 5.0);
        Goods carrot = new Goods("Морковь", 2.5, 3.5);
        Goods beet = new Goods("Свекла", 1.5, 4.0);
        Goods banana = new Goods("Банан", 5.60, 4.90);
        Goods orange = new Goods("Апельсин", 4.20, 3.60);
        Goods peach = new Goods("Персик", 7.20, 2.80);

        // Создаем сток магазина
        Shop shop = new Shop();
        shop.addGoods(potato, 30.0);
        shop.addGoods(carrot, 30.0);
        shop.addGoods(potato, 40.0);
        shop.addGoods(beet, 50.0);
        shop.addGoods(banana, 100.0);
        shop.addGoods(orange, 100.0);
        shop.addGoods(peach, 100.0);

        // Вывод списка всех товаров магазина
        System.out.println(shop);

        // Создаем пользователей
        User user1 = new User("123", "123");
        User user2 = new User("234", "123");

        // Производим покупки пользователями
        user1.addPurchase(potato, 20.0, shop);
        user1.addPurchase(potato, 30.0, shop);
        user1.addPurchase(orange, 20.0, shop);

        user2.addPurchase(banana, 10.0, shop);
        user2.addPurchase(peach, 60.0, shop);
        user2.addPurchase(beet, 15.0, shop);

        // Вывод списка покупок пользователей
        System.out.println(user1);
        System.out.println(user2);
        System.out.println("-----------------------------------");

        // Вывод всех товаром магазина после покупок
        System.out.println(shop);

        // Создаем категории товаров
        Category fruits = new Category("Fruits");
        fruits.addCategory(potato);
        fruits.addCategory(carrot);
        fruits.addCategory(beet);

        Category vegetables = new Category("Vegetables");
        vegetables.addCategory(banana);
        vegetables.addCategory(orange);
        vegetables.addCategory(peach);

        System.out.println("-----------------------------------");
        // Вывод состава категорий
        System.out.println(fruits);
        System.out.println(vegetables);
    }
}
