package OOP_HW.Lesson_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    // Вводим статическую переменную для хранения истории ходов
    static List<String> hisList = new ArrayList<>();
    void startGame() {
        System.out.println("******************************************");
        System.out.println("Приветствуем вас в игре 'Быки и Коровы'");
        System.out.println("Вам доступны варианты: 1 - угадывание числа, 2 - угадывание букв (АНГ.), 3 - угадывание букв (РУС.)");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите игру: ");
        int num = scanner.nextInt();
        GameInterface game = null;

        switch (num) {
            case 1:
                game = new NumberGame();
                break;
            case 2:
                game = new EnGame();
                break;
            case 3:
                game = new RuGame();
                break;
            default:
                System.out.println("Игры с данным номером нет в списке");
        }
        System.out.println("Введите количество символов: ");
        Integer sizeWord = scanner.nextInt();
        System.out.println("Введите максимальное количество попыток: ");
        Integer attempts = scanner.nextInt();

        game.start(sizeWord, attempts);
        System.out.println("Игра началась");
        System.out.println("******************************************");

        while (game.getGameStatus().equals(GameStatus.START)) {
            if (Answer.count == attempts) {
                game.stop();
            }
            System.out.println("Ваш ход № " + Answer.count + " : ");
            String answer = scanner.next();
            Answer answerGame = game.inputValue(answer);
            hisList.add(answer);
            System.out.println("коров - " + answerGame.getCow() + ", быков - " + answerGame.getBull());
        }
        System.out.println("******************************************");
        System.out.println("Игра окончена за " + (Answer.count - 1) + " ходов");
        System.out.println("******************************************");
        System.out.println("*************Результат игры***************");

        // Проверяем статус игры по выходу из цикла
        if (game.getGameStatus().equals(GameStatus.WIN)) {
            System.out.println("Вы выиграли!");
        } else if (game.getGameStatus().equals(GameStatus.LOSE)) {
            System.out.println("Вы проиграли!");
            System.out.println("Загаданная последовательность: " + game.getWord());
        }

        // Вывод истории ходов
        System.out.println("Вывести историю ходов?");
        System.out.println("Введите: y - да, n - нет");
        String histChoice = scanner.next();
        if (histChoice.equals("y")) {
            System.out.println("Ваши попытки:");
            System.out.println(hisList);
        }
        System.out.println("История удалена");
        hisList.clear();


        System.out.println("Спасибо за игру!");
        System.out.println("******************************************");
    }
}
