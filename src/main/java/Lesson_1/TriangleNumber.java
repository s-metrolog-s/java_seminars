package Lesson_1;

import java.util.Scanner;

public class TriangleNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число n: ");
        int number = scanner.nextInt();

        int triangleNumber = (number * (number + 1)) / 2;
        System.out.print("Треугольное число от " + number + " равно: ");
        System.out.println(triangleNumber);

        System.out.print("Вывод ряда треугольных чисел до N: ");
        for (int i = 1; i <= number; i++) {
            int temp = (i * (i + 1)) / 2;
            System.out.print(temp + " ");

        }

    }
}
