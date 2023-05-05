package ua.ithillel.www.javapra.Mishnieva.homework.homework4.part1;

public abstract class Participant {

    abstract void run();

    abstract void jump();

    private String name;
    private double distanceRun;
    private double distanceJump;


    private final double MAX_DIST_RUN = 200;
    private final double MAX_DIST_JUMP = 40;

    public double getMAX_DIST_RUN() {
        return MAX_DIST_RUN;
    }

    public double getMAX_DIST_JUMP() {
        return MAX_DIST_JUMP;
    }

    public String getName() {
        return name;
    }

    public double getDistanceRun() {
        return distanceRun;
    }

    public double getDistanceJump() {
        return distanceJump;
    }

    public Participant(String name, double distanceRun, double distanceJump) {
        this.name = name;
        this.distanceRun = distanceRun;
        this.distanceJump = distanceJump;
    }
}
