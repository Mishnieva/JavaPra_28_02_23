package ua.ithillel.www.javapra.Mishnieva.homework.homawork5;

import java.util.ArrayList;
import java.util.List;

public class calcOccurance {

        public static void main(String[] args) {
            List<String> stringList = new ArrayList<>();
            stringList.add("bird");
            stringList.add("bird");
            stringList.add("bird");
            stringList.add("bird");
            stringList.add("fox");
            stringList.add("cat");
            stringList.add("fox");
            stringList.add("fox");
            stringList.add("fox");
            stringList.add("fox");
            stringList.add("fox");
            stringList.add("cat");
            stringList.add("cat");
            stringList.add("cat");
            stringList.add("cat");


            calcOccurance(stringList);
        }

        public static void calcOccurance(List<String> strList) {
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

                    System.out.println(strList.get(i) + ": " + count);
                }
            }
        }
    }
