package OOP_HW.Lesson_1;

public class Goods {
    private String name;
    private Double price;
    private Double rate;

    public Goods(String name, Double price, Double rate) {
        this.name = name;
        this.price = price;
        this.rate = rate;
    }

    public Goods() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return name + ", " + price + " руб., " + rate;
    }
}
