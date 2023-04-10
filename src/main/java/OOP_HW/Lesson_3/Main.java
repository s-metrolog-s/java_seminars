package OOP_HW.Lesson_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Application app = new Application();
        Scanner scanner = new Scanner(System.in);
        String restart;
        do {
            Answer.count = 1;
            app.startGame();
            System.out.println("Хотите перезапустить игру?");
            System.out.println("Введите: y - да, n - нет");
            restart = scanner.nextLine();
        } while (restart.equals("y"));

    }
}


