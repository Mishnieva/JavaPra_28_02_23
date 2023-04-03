package ua.ithillel.www.javapra.Mishnieva.homework.homework4.part1;

public class Robot extends Participant {


    public Robot(String name, double distanceRun, double distanceJump) {
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
    public void run() {
        System.out.println("participant " + getName() + " can't run");
    }
}
