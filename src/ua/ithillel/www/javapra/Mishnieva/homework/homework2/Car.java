package ua.ithillel.www.javapra.Mishnieva.homework.homework2;

public class Car {
    private void startElectricity() {
        System.out.println("start electricity");
    }

    private void startCommand() {
        System.out.println("start command");
    }
    private void startFuelSystem()  {
        System.out.println("start fuel system");
    }
    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
    }
}
