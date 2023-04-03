import ua.ithillel.www.javapra.Mishnieva.homework.homawork5.MyStructure;

import java.util.ArrayList;
import java.util.List;

public class FindOccurance {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("bird");
        stringList.add("bird");
        stringList.add("bird");
        stringList.add("fox");
        stringList.add("fox");
        stringList.add("fox");
        stringList.add("cat");

        System.out.println(findOccurance(stringList));
    }

    public static List<MyStructure> findOccurance(List<String> strList) {
        List<MyStructure> result = new ArrayList<>();
        List<String> bufferList = new ArrayList<>();

        for (int i = 0; i < strList.size(); i++) {
            if(!bufferList.contains(strList.get(i))) {
                bufferList.add(strList.get(i));
                int count = 0;

                for (int j = 0; j < strList.size(); j++) {
                    if(strList.get(i).equals(strList.get(j))) {
                        count++;
                    }
                }

                result.add(new MyStructure(strList.get(i), count));
            }
        }

        return result;
    }

    public static class calcOccurance {
    }
}