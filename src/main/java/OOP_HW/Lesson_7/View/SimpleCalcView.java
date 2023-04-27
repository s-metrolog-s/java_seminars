package OOP_HW.Lesson_7.View;

import OOP_HW.Lesson_7.Core.Controller.Status;
import OOP_HW.Lesson_7.Core.Model.CalcAdapter;
import OOP_HW.Lesson_7.Core.Model.Calculator;
import OOP_HW.Lesson_7.Core.Model.ParseAdapter;
import OOP_HW.Lesson_7.Core.Model.Parser;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static OOP_HW.Lesson_7.Client.App.logger;

public class SimpleCalcView {
    public void start() {
        Status status = Status.SIMPLE;
        while (status.equals(Status.SIMPLE)) {
            System.out.println("************************************************");
            System.out.println("Калькулятор рациональных чисел");
            System.out.println("Введите выражение вида 2.0+2,2*2.4");
            Scanner scanner = new Scanner(System.in);
            ParseAdapter parser = new ParseAdapter();
            CalcAdapter calculator = new CalcAdapter();
            List<String> exp = new ArrayList<>();

            String inputExpr = scanner.nextLine();
            System.out.println(
                    "Ответ: " + inputExpr + " = " + calculator.findResult(parser.parseInputStr(inputExpr))
            );
            logger.info("Сделаны расчеты: " + inputExpr + " = " + calculator.findResult(parser.parseInputStr(inputExpr)));
            System.out.println("Продолжить работу в калькуляторе? (y/n)");
            String answer = scanner.next();
            if (!(answer.equals("y") || answer.equals("Y"))) {
                status = Status.WORK;
            }
        }

    }
}
