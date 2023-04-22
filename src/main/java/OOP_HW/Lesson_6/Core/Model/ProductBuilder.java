package OOP_HW.Lesson_6.Core.Model;

import java.util.Scanner;

public class ProductBuilder {
    Product product;

    public Product addNewProduct() {
        product = new Product();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя товара:");
        product.setName(scanner.nextLine());
        System.out.println("Введите количество товара:");
        product.setCount(scanner.nextInt());
        System.out.println("Введите стоимость товара (используйте запятую - пр. 2,56):");
        product.setPrice(scanner.nextDouble());
        System.out.println();
        return product;
    }
}
