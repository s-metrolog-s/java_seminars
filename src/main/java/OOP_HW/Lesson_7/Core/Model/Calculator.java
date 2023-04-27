package OOP_HW.Lesson_7.Core.Model;

import java.util.List;
import java.lang.Math;

public class Calculator {
    /**
     * Метод для рассчета входящего математического выражения
     * @param inputList Математическое выражение, представленное аргументами и математическими операциями отдельными
     *                  элементами массива
     * @return Возвращает единственный элемента листа с расчетом всего математического выражения
     */
    public String findResult(List<String> inputList) {
        int indexOfAction = 1; // индекс действия
        int indexOfPaste;
        StringBuilder tempResult = new StringBuilder(); // промежуточный результат
        Double firstArg = 1.0;
        Double secondArg = 1.0;
        Double result = 1.0;

        while (inputList.size() > 1) {
            if (inputList.contains("*") && inputList.contains("/")) {
                if (inputList.indexOf("*") < inputList.indexOf("/")) {
                    indexOfAction = inputList.indexOf("*");
                } else {
                    indexOfAction = inputList.indexOf("/");
                }
            } else if (inputList.contains("*") && (!inputList.contains("/"))) {
                indexOfAction = inputList.indexOf("*");
            } else if ((!inputList.contains("*") && (inputList.contains("/")))) {
                indexOfAction = inputList.indexOf("/");
            } else if (inputList.contains("+") && inputList.contains("-")) {
                if (inputList.indexOf("+") < inputList.indexOf("+")) {
                    indexOfAction = inputList.indexOf("+");
                } else {
                    indexOfAction = inputList.indexOf("-");
                }
            } else if (inputList.contains("+") && (!inputList.contains("-"))) {
                indexOfAction = inputList.indexOf("+");
            } else if ((!inputList.contains("+") && (inputList.contains("-")))) {
                indexOfAction = inputList.indexOf("-");
            }
            // Определяем индекс для вставки нового числа и удаления старых элементов выражения
            indexOfPaste = indexOfAction - 1;

            // Определяем аргументы для математических действий
            firstArg = Double.valueOf(inputList.get(indexOfAction - 1));
            secondArg = Double.valueOf(inputList.get(indexOfAction + 1));

            if (inputList.get(indexOfAction).equals("*")) {
                result = firstArg *  secondArg;
            } else if (inputList.get(indexOfAction).equals("/")) {
                result = firstArg /  secondArg;
            } else if (inputList.get(indexOfAction).equals("+")) {
                result = firstArg +  secondArg;
            } else if (inputList.get(indexOfAction).equals("-")) {
                result = firstArg -  secondArg;
            }
            inputList.remove(indexOfPaste + 2);
            inputList.remove(indexOfPaste + 1);
            inputList.remove(indexOfPaste);
            inputList.add(indexOfPaste, result.toString());
        }
        return inputList.get(0);
    }
}
