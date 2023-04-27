package OOP_HW.Lesson_7.Core.Model;

import java.util.ArrayList;
import java.util.List;

public class ParseAdapter {
    /**
     * Метод-адаптер для работающего парсера, только в данном случае адаптер позволяет учесть скобки, если они есть в выражении
     * @param inputExpr Математическое выражение в текстовом формате
     * @return Возвращает список отдельных аргументов и математических знаков для дальнейших вычислений
     */
    public List<String> parseInputStr(String inputExpr) {
        List<String> result;
        Parser parser = new Parser();
        result = parser.parseInputStr(inputExpr);
        if (result.toString().contains("(") && result.toString().contains(")")) {
            List<String> checkEmpty = new ArrayList<>();
            checkEmpty.add("");
            result.removeAll(checkEmpty);
        }

        return result;
    }
}
