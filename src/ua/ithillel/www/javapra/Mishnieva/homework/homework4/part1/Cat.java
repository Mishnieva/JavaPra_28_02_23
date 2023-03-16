package ua.ithillel.www.javapra.Mishnieva.homework.homework4.part1;

public class Cat extends Participant {


    public Cat(String name, double distanceRun, double distanceJump) {
        super(name, distanceRun, distanceJump);
    }

    @Override
    public void jump() {
        System.out.println("participant " + getName() + " can jump");

        if (getDistanceJump() < getMAX_DIST_JUMP()) {
            System.out.println("participant " + getName() + " didn't pass the obstacle with a result - " + getDistanceJump() + " centimeters, at a distance -  " + getMAX_DIST_JUMP() + " centimeters");
        } else {
            System.out.println("participant " + getName() + " passed the obstacle with a result - " + getDistanceJump() + " centimeters" + " at a distance - " + getMAX_DIST_JUMP() + " centimeters");
        }
        System.out.println();
    }

    @Override
    void run() {
        System.out.println("participant " + getName() + " can run");
        if (getDistanceRun() < getMAX_DIST_RUN()) {
            System.out.println("participant " + getName() + " did not pass the obstacle with a result - " + getDistanceRun() + " meters, at a distance - " + getMAX_DIST_RUN() + " meters");
        } else {
            System.out.println("participant " + getName() + " passed the obstacle with a result - " + getDistanceRun() + " meters" + " at a distance - " + getMAX_DIST_RUN() + " meters");
            System.out.println();
        }
    }
}
