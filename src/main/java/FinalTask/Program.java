package FinalTask;

public class Program {
    public static void main(String[] args) {
        Goods good1 = new CreateGoods()
                .setCount(100)
                .setPrice(250)
                .setName("Apple 14 PRO")
                .setDescription("Телефон")
                .setStatus("импорт")
                .Create();

        Goods good2 = new CreateGoods()
                .setCount(1000)
                .setPrice(300)
                .setName("Apple 14 PRO MAX")
                .setDescription("Телефон")
                .setStatus("импорт")
                .Create();

        Goods good3 = new CreateGoods()
                .setCount(110)
                .setPrice(150)
                .setName("Apple 13 PRO MAX")
                .setDescription("Телефон")
                .setStatus("Не поставляется")
                .Create();

        Goods good4 = new CreateGoods()
                .setCount(100)
                .setPrice(250)
                .setName("Apple 14 PRO")
                .setDescription("Телефон")
                .setStatus("импорт")
                .Create();

        good1.printGoods();
        good2.printGoods();
        good3.printGoods();
        good4.printGoods();
        System.out.println(good1.equals(good4));

        good3.description += " Новая запись";
        good3.printGoods();
    }
}
