package ua.ithillel.www.javapra.Mishnieva.task.train;

import ua.ithillel.www.javapra.Mishnieva.task.train.example1.Exemple1;
import ua.ithillel.www.javapra.Mishnieva.task.train.example1.Exemple2;
import ua.ithillel.www.javapra.Mishnieva.task.train.generiks.User;

public class Generics {

    public static void main(String[] args) {

        Exemple1 <User> exemple1 = new Exemple1<>();
        System.out.println(exemple1.get());
        exemple1.set(new User("Bob", 34));
        System.out.println(exemple1.get());
        System.out.println("--------------------------");

        Exemple1 <User> exemple2 =  new Exemple1<>();
        System.out.println(exemple2.get());
        exemple2.set(new User("Ann",32));
        System.out.println(exemple2.get());
        System.out.println("--------------------------");

        System.out.println();

        Exemple2<User> exemple3 = Exemple2.init(new User());
        System.out.println(exemple3.getInstance());
        exemple3.set(new User("Masha", 43));
        System.out.println(exemple3.getInstance());

    }
}
