package OOP_HW.Lesson_6.Core.Model;

public class DeliveryChoice {

    public DeliveryChoice() {
    }
    void chooseVariant(Order order) {
        if (order instanceof OnlineOrder) {
            System.out.println("Заказ поехал курьерской службой");;
        } else {
            System.out.println("Заказ поехал внутренней логистикой");;
        }
    }
}
