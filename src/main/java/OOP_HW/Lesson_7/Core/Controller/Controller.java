package OOP_HW.Lesson_7.Core.Controller;

import OOP_HW.Lesson_7.Client.App;
import OOP_HW.Lesson_7.View.BinaryCalcView;
import OOP_HW.Lesson_7.View.ComplexCalcView;
import OOP_HW.Lesson_7.View.SimpleCalcView;

import java.util.Scanner;

import static OOP_HW.Lesson_7.Client.App.logger;

public class Controller {
    public void startWork() {
        logger.info("Запуск главного окна программы");
        Status status = Status.WORK;
        SimpleCalcView scv = new SimpleCalcView();
        ComplexCalcView ccv = new ComplexCalcView();
        BinaryCalcView bcv = new BinaryCalcView();
        while (!status.equals(Status.EXIT)) {
            System.out.println("************************************************");
            System.out.println("Введите число для выбора режима калькулятора:\n" +
                    "1 - Обычный калькулятор, в том числе рациональные числа\n" +
                    "2 - Действия с комплексаными числами\n" +
                    "3 - Перевод десятичного числа в двоичное представление\n" +
                    "9 - Выход и программы");
            Scanner scanner = new Scanner(System.in);
            Integer mode = scanner.nextInt();
            switch (mode) {
                case 1:
                    logger.info("Выбран калькулятор для работы с рациональными числами");
                    scv.start();
                    break;
                case 2:
                    logger.info("Выбран калькулятор для работы с комплексными числами");
                    ccv.start();
                    break;
                case 3:
                    logger.info("Выбран перевод в двоичное представление");
                    bcv.start();
                    break;
                case 9:
                    logger.info("Выход из программы");
                    status = Status.EXIT;
                    break;
                default:
                    break;
            }

        }
        System.out.println("Работа программы завершена,\n спасибо за пользование нашей программой!");
    }
}
