package ua.ithillel.www.javapra.Mishnieva.homework.homework4.part1;

public class Main {
    public static void main(String[] args) {

        Obstacle[] obstacles = {
                new Wall(),
                new RunningTrack()
        };

        Participant[] participants = {
                new Human("Vasya", 201.5, 50.45),
                new Cat ("Murzik", 204.0, 45),
                new Robot("Fishka", 0, 39)
        };

        for (Obstacle obstacle : obstacles) {
            for (Participant participant : participants) {
                obstacle.overcome(participant);
            }
        }
    }
}