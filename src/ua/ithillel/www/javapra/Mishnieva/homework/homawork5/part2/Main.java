package ua.ithillel.www.javapra.Mishnieva.homework.homawork5.part2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Phonebook myPhonebook1 = new Phonebook();
        List<Integer> phoneNumber1 = new ArrayList<>();
        phoneNumber1.add(111111111);
        phoneNumber1.add(222222222);

        myPhonebook1.add("Masha", 123456789, 987654321, 123454321);
        myPhonebook1.add(new Recording("Sasha", phoneNumber1));

        List<Integer> phoneNumber2 = new ArrayList<>();
        phoneNumber2.add(333333333);
        phoneNumber2.add(444444444);
        List<Integer> phoneNumber3 = new ArrayList<>();
        phoneNumber3.add(555555555);
        phoneNumber3.add(666666666);
        List<Integer> phoneNumber4 = new ArrayList<>();
        phoneNumber4.add(777777777);
        phoneNumber4.add(888888888);

        List<Recording> myRecording = new ArrayList<>();
        myRecording.add(new Recording("Natasha", phoneNumber2));
        myRecording.add(new Recording("Oleg", phoneNumber3));
        myRecording.add(new Recording("Tamara", phoneNumber4));

        Phonebook myPhonebook2 = new Phonebook(myRecording);

        System.out.print("Find Sasha in myPhonebook1: ");
        System.out.println(myPhonebook1.find("Sasha"));

        System.out.print("Find Natasha in myPhonebook1: ");
        System.out.println(myPhonebook1.find("Natasha")); //null

        System.out.print("Find Tamara in myPhonebook2: ");
        System.out.println(myPhonebook2.find("Tamara"));

        System.out.print("Find Test in myPhonebook2: ");
        System.out.println(myPhonebook2.find("Test")); //null

        System.out.print("FindAll Masha, Sasha, Natasha in myPhonebook1: ");
        System.out.println(myPhonebook1.findAll("Masha", "Sasha", "Natasha")); //null

        System.out.print("FindAll Tamara, Oleg, Natasha in myPhonebook2: ");
        System.out.println(myPhonebook2.findAll("Tamara", "Oleg", "Natasha"));

        System.out.print("FindAll Oleg in myPhonebook2: ");
        System.out.println(myPhonebook2.findAll("Oleg"));

        System.out.print("FindAll Semen in myPhonebook2: ");
        System.out.println(myPhonebook2.findAll("Semen")); //null
    }
}