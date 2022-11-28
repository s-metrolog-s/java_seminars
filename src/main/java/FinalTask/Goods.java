package FinalTask;

public class Goods {
    int id;
    int price;
    int count;
    String name;
    String description;
    String status;

    public void printGoods() {
        System.out.println(String.format(
                "ID: %d, Название: %s, Цена: %d, Количество: %d, Описание: %s, Статус: %s",
                id, name, price, count, description, status));
    }

    @Override
    public boolean equals(Object obj) {
        Goods t = ((Goods) obj);
        return this.id == t.id;
    }
}
