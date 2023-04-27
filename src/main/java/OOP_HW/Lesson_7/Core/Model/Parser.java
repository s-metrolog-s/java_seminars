package OOP_HW.Lesson_7.Core.Model;

import java.util.ArrayList;
import java.util.List;

public class Parser {
    /**
     * Метод для перевода строки в числовое представление аргументов выражения и математических знаков
     * при вводе проходит проверка на знаки точки или запятой для разделения дробной и целой части аргументов
     * и приводится к единому формату для дальнейших вычислений
     *
     * @param inputExpr Входная строка1 для парсинга строки
     * @return Возвращает список отдельных аргументов и математических знаков для дальнейших вычислений
     */
    public List<String> parseInputStr(String inputExpr) {
        StringBuilder tempResult = new StringBuilder();
        List<String> result = new ArrayList<>();
        int endOfString = inputExpr.length();

        // Меняем все запятые на точки
        inputExpr = inputExpr.replace(",", ".");

        if (inputExpr.contains("i")) {
            inputExpr.replace("i", "");
            endOfString--;
        }

        for (int i = 0; i < endOfString; i++) {
            if ((inputExpr.charAt(0) == '-') && i == 0) {
                tempResult.append(inputExpr.charAt(0));
            } else if (Character.isDigit(inputExpr.charAt(i))) {
                tempResult.append(inputExpr.charAt(i));
            } else if ((inputExpr.charAt(i) == '-') && ((inputExpr.charAt(i - 1) == '*') || (inputExpr.charAt(i - 1) == '/'))) {
                tempResult.append(inputExpr.charAt(i));
            } else if ((inputExpr.charAt(i) == '.') || (inputExpr.charAt(i) == ',')) {
                tempResult.append(inputExpr.charAt(i));
            } else {
                result.add(tempResult.toString());
                tempResult.delete(0, tempResult.length());
                tempResult.append(inputExpr.charAt(i));
                result.add(tempResult.toString());
                tempResult.delete(0, tempResult.length());
            }
            if ((i == endOfString - 1)){
                result.add(tempResult.toString());
                tempResult.delete(0, tempResult.length());
            }
        }
        if (inputExpr.contains("i")) {
            result.set(1, result.get(1) + result.get(2));
            result.remove(2);
        }
        return result;
    }
}

