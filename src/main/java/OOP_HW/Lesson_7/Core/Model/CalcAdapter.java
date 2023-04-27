package OOP_HW.Lesson_7.Core.Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CalcAdapter {
    /**
     * Метод-адаптер для работающего калькулятора, который позволяет учесть скобки, если они есть в выражении
     * @param inputList Математическое выражение, представленное аргументами и математическими операциями отдельными
     *                  элементами массива
     * @return Возвращает единственный элемента листа с расчетом всего математического выражения
     */

    public String findResult(List<String> inputList) {
        Calculator calculator = new Calculator();

        while (inputList.contains("(") && inputList.contains(")")) {
            inputList.add(inputList.indexOf("("), calculator.findResult(inputList.subList(inputList.indexOf("(") + 1, inputList.indexOf(")"))));
            inputList.subList(inputList.indexOf("("), inputList.indexOf(")") + 1).clear();
        }
        return calculator.findResult(inputList);
    }
}
