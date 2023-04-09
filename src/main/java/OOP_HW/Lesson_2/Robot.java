package OOP_HW.Lesson_2;

public class Robot implements Actions {
    private String name;
    private int jumpLimit;
    private int runLimit;
    static int count;

    private int fail;

    public Robot(String name, int runLimit, int jumpLimit) {
        count++;
        this.name = name + " № " + count;
        this.jumpLimit = jumpLimit;
        this.runLimit = runLimit;
        this.fail = 0;
    }
    @Override
    public void run(int distance) {
        if (fail != 1) {
            if (this.runLimit >= distance) {
                System.out.println(name + " преодолел препятствие " + distance + " м");
            } else {
                System.out.println(name + " не способен преодолеть это препятствие");
                fail = 1;
            }
        }
    }
    @Override
    public void jump(int altitude) {
        if (fail != 1) {
            if (this.jumpLimit >= altitude) {
                System.out.println(name + " преодолел препятствие " + altitude + " м");
            } else {
                System.out.println(name + " не способен преодолеть это препятствие");
                fail = 1;
            }
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getFailure() {
        return fail;
    }

    @Override
    public String toString() {
        return name + "(" + runLimit + ", " + jumpLimit + ")";
    }
}
