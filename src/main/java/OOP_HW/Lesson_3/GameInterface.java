package OOP_HW.Lesson_3;

public interface GameInterface {
    void start(Integer sizeWord, Integer attempts);

    void stop();
    Answer inputValue(String value);
    GameStatus getGameStatus();

    String getWord();
}
