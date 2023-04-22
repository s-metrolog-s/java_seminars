package OOP_HW.Lesson_6.Core.Model;

public class OfflineOrder extends Order {
    @Override
    void makeDelivery() {
        System.out.println("Оформление оффлайн доставки");
        DeliveryChoice dc = new DeliveryChoice();
        dc.chooseVariant(this);
    }
}
