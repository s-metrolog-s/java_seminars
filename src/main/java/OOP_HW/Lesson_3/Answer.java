package OOP_HW.Lesson_3;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@AllArgsConstructor
@NoArgsConstructor
public class Answer {
//    private Integer numAttempts;
    private String userInput;
    private Integer cow;
    private Integer bull;
    static int count = 1;

    public Answer(String userInput, Integer cow, Integer bull) {
        this.userInput = userInput;
        this.cow = cow;
        this.bull = bull;
        count++;
    }
}
