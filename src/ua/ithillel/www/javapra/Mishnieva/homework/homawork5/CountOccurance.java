package ua.ithillel.www.javapra.Mishnieva.homework.homawork5;

import java.util.ArrayList;
import java.util.List;

public class CountOccurance {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("one");
        stringList.add("two");
        stringList.add("three");
        stringList.add("one");
        stringList.add("two");
        stringList.add("three");
        stringList.add("two");
        stringList.add("one");
        stringList.add("three");
        stringList.add("two");

        System.out.println("number of repetitions 'one' - " + countOccurance(stringList, "one"));
        System.out.println("number of repetitions 'one' - " + countOccurance(stringList, "two"));
        System.out.println("number of repetitions 'one' - " + countOccurance(stringList, "three"));
        System.out.println("number of repetitions 'one' - " + countOccurance(stringList, "four"));
    }

    public static int countOccurance(List<String> stringList, String str) {
        int amount = 0;

        for (int i = 0; i < stringList.size(); i++) {
            if (stringList.get(i).contains(str)) {
                amount++;
            }
        }
        return amount;
    }
}