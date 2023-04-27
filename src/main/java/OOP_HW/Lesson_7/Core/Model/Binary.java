package OOP_HW.Lesson_7.Core.Model;

public class Binary {
    public String toBinary(String num) {
        Integer result = Integer.valueOf(num);
        return Integer.toBinaryString(result);
    }
//        int result = 0;
//        if (num instanceof String) {
//            String str = (String) num;
//            if (str == null || str.isEmpty()) {
//                return "Введена пустая строка";
//            } else {
//                for (int i = 0; i < str.length(); i++) {
//                    if (!Character.isDigit(str.charAt(i))) {
//                        return "Строка должна состоять только из цифр";
//                    }
//                }
//                result = Integer.valueOf(str);
//            }
//        } else if (num instanceof Double) {
//            result = ((Double) num).intValue();
//        } else {
//            result = (int) num;
//        }
//        return Integer.toBinaryString(result);
//    }
}
