package ua.ithillel.www.javapra.Mishnieva.homework.homework4.part1;

public class Wall extends Obstacle {

    @Override
    void overcome(Participant participant) {
        participant.jump();
        };
    }

