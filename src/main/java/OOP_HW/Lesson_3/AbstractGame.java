package OOP_HW.Lesson_3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Random;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class AbstractGame implements GameInterface {

    Integer sizeWord;
    Integer attempts;
    String word;
    GameStatus gameStatus = GameStatus.INIT;

    @Override
    public void start(Integer sizeWord, Integer attempts) {
        this.sizeWord = sizeWord;
        this.attempts = attempts;
        word = generateWord();
        gameStatus = GameStatus.START;
    }

    @Override
    public void stop() {
        gameStatus = GameStatus.LOSE;
    }

    @Override
    public Answer inputValue(String value) {
        int bulls = 0;
        int cows = 0;

        for (int i = 0; i < value.length(); i++) {
            if (value.charAt(i) == word.charAt(i)) {
                bulls++;
            }
            Character character = value.charAt(i);
            if (word.contains(character.toString())) {
                cows++;
            }
            // Проверяем условие выигрыша
            if (value.length() == bulls) {
                gameStatus = GameStatus.WIN;
            }
        }
        return new Answer(value, cows, bulls);
    }

    @Override
    public GameStatus getGameStatus() {
        return gameStatus;
    }

    private String generateWord() {
        Random rand = new Random();
        List<String> charList = generateCharList();
        String resWord = "";
        for (int i = 0; i < sizeWord; i++) {
            int randomIndex = rand.nextInt(charList.size());
            resWord = resWord.concat(charList.get(randomIndex));
            charList.remove(randomIndex);
        }

        return resWord;
    }

    abstract List<String> generateCharList();

    public String getWord() {
        return word;
    }
}
