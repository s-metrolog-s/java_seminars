package OOP_HW.Lesson_2;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();

        // Создаем массив с препятствиями и заполняем его объектами
        Obstacle[] obstacles = new Obstacle[10];

        for (int i = 0; i < obstacles.length; i++) {
            if (rand.nextInt(2) == 1) {
                obstacles[i] = new Track(rand.nextInt(1, 100));
            } else {
                obstacles[i] = new Wall(rand.nextInt(1, 5));
            }
        }
        System.out.println(Arrays.toString(obstacles));

        // Создаем массив с участниками и заполняем его объектами
        Actions[] competitors = new Actions[10];
        for (int i = 0; i < competitors.length; i++) {
            switch (rand.nextInt(3)) {
                case (0):
                    competitors[i] = new Cat("Кот", rand.nextInt(50), rand.nextInt(2));
                    break;
                case (1):
                    competitors[i] = new Human("Человек", rand.nextInt(100), rand.nextInt(3));
                    break;
                case (2):
                    competitors[i] = new Robot("Робот", rand.nextInt(200), rand.nextInt(5));
                    break;
            }
        }
        System.out.println(Arrays.toString(competitors));

        // Проходим полосу препятствий
        for (int i = 0; i < competitors.length; i++) {
            System.out.println("--------------------");
            System.out.println(competitors[i].getName() + " начал соревнование");
            for (int j = 0; j < obstacles.length; j++) {
                if (obstacles[j] instanceof Wall) {
                    competitors[i].jump(((Wall) obstacles[j]).getAltitude());
                } else {
                    competitors[i].run(((Track) obstacles[j]).getDistance());
                }
            }
            System.out.println(competitors[i].getName() + " закончил соревнование");
            if (competitors[i].getFailure() == 0) {
                System.out.println(
                        competitors[i].getName() + " успешно закончил полосу препятствий!"
                );
            } else if (competitors[i].getFailure() == 1) {
                System.out.println(
                        competitors[i].getName() + " провалил испытание!"
                );
            }
        }

    }
}
