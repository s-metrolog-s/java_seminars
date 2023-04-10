package OOP_HW.Lesson_3;

import java.util.ArrayList;
import java.util.List;

public class RuGame extends AbstractGame {

    @Override
    List<String> generateCharList() {
        List<String> charList = new ArrayList<>();
        for (int i = 'а'; i < 'я'; i++) {
            Character letter = Character.toChars(i)[0];
            charList.add(letter.toString());
        }
        return charList;
    }
}
