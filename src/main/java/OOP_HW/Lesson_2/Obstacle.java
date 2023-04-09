package OOP_HW.Lesson_2;

public abstract class Obstacle {
    protected String name;

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }
}
