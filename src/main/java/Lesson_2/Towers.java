package Lesson_2;

public class Towers {

    public static void alg(String with, String on, String some, int count) {
        if (count > 1) alg(with, some, on, count -1);
        System.out.println(with + " -> " + on);
        if (count > 1) alg(some, on, with, count - 1);

    }
    public static void main(String[] args) {
        alg("1", "3", "2", 3);
    }
}
