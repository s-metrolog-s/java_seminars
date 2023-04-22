package OOP_HW.Lesson_6.Core.Model;

public class Product {
    private Integer id;
    private String name;
    private Integer count;
    private Double price;

    public Product() {
        this.id = IdSystem.idProducts++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Наименование(" +
                id + "): " + name +
                ", кол-во: " + count +
                ", цена: " + price;
    }
}
