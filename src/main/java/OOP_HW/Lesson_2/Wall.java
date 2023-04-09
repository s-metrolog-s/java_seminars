package OOP_HW.Lesson_2;

public class Wall extends Obstacle{
    private int altitude;

    public Wall(int altitude) {
        this.name = "Стена";
        this.altitude = altitude;
    }

    public int getAltitude() {
        return altitude;
    }
    @Override
    public String toString() {
        return name + " (" + altitude + ")";
    }
}
