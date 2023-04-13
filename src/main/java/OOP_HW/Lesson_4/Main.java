package OOP_HW.Lesson_4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        List<Double> ls1 = new ArrayList<>();
        List<Integer> ls2 = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            ls1.add((double) i);
            ls2.add(i);
        }

        System.out.println(calc.sum(ls1));
        System.out.println(calc.sum(ls2));

        System.out.println(calc.multiply(ls1));
        System.out.println(calc.multiply(ls2));

        System.out.println(calc.devide(ls2));
        System.out.println(calc.devide(ls2));

        System.out.println(calc.toBinary("5"));
        System.out.println(calc.toBinary("5ф"));
        System.out.println(calc.toBinary(""));

        System.out.println(calc.toBinary(5));
        System.out.println(calc.toBinary(5.0));

    }


}
