package OOP_HW.Lesson_6.Core.Model;

public class OnlineOrder extends Order {

    @Override
    void makeDelivery() {
        System.out.println("Оформление онлайн доставки");
        DeliveryChoice dc = new DeliveryChoice();
        dc.chooseVariant(this);
    }
}
