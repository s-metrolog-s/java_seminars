package OOP_HW.Lesson_2;

public class Track extends Obstacle{
    private int distance;

    public Track(int distance) {
        this.name = "Дорожка";
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return name + " (" + distance + ")";
    }
}
