package OOP_HW.Lesson_4;

import java.util.List;

public class Calculator<T> {
    public Double sum(List<? extends Number> list) {
        Double sum = 0.0;
        for (Number num : list) {
            sum += num.doubleValue();
        }
        return sum;
    }

    public Double multiply(List<? extends Number> list) {
        Double multi = 1.0;
        for (Number num : list) {
            multi *= num.doubleValue();
        }
        return multi;
    }

    public Double devide(List<? extends Number> list) {
        Double dev = 1.0;
        for (Number num : list) {
            dev /= num.doubleValue();
        }
        return dev;
    }

    public String toBinary(T num) {
        int result = 0;
        if (num instanceof String) {
            String str = (String) num;
            if (str == null || str.isEmpty()) {
                return "Введена пустая строка";
            } else {
                for (int i = 0; i < str.length(); i++) {
                    if (!Character.isDigit(str.charAt(i))) {
                        return "Строка должна состоять только из цифр";
                    }
                }
                result = Integer.valueOf(str);
            }
        } else if (num instanceof Double) {
            result = ((Double) num).intValue();
        } else {
            result = (int) num;
        }
        return Integer.toBinaryString(result);
    }
}
