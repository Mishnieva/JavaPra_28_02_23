package ua.ithillel.www.javapra.Mishnieva.homework.homawork5;

import java.util.ArrayList;
import java.util.List;

public class ToList {

    public static void main(String[] args) {
        List<Integer> resultList = toList(new int[]{1,2,3,4,5,6,7,8,9,10});

        for (int i = 0; i < resultList.size(); i++) {
            System.out.print(resultList.get(i));
        }
    }

    public static List toList(int[] intArray) {
        List<Integer> listResult = new ArrayList<>();

        for (int i = 0; i < intArray.length; i++) {
            listResult.add(intArray[i]);
        }

        return listResult;
    }
}
