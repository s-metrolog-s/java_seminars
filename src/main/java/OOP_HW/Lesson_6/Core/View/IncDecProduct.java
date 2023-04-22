package OOP_HW.Lesson_6.Core.View;

import OOP_HW.Lesson_6.Core.Model.Product;

public interface IncDecProduct {
    void increaseQuantity(Product product, Integer count);
    void decreaseQuantity(Product product, Integer count);


}
