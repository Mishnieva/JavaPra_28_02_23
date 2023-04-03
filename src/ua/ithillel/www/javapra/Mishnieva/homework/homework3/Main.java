package ua.ithillel.www.javapra.Mishnieva.homework.homework3;

import java.util.Arrays;

public class Main {
        public static void main(String[] args) {
            System.out.println(isAnagram("anagram", "nagaram"));
            System.out.println(isAnagram("rat", "cat"));
        }

        public static boolean isAnagram(String s, String t) {

            if (s.length() != t.length()) return false;

            char[] arrayS = s.toCharArray();
            char[] arrayT = t.toCharArray();

            Arrays.sort(arrayS);
            Arrays.sort(arrayT);

            for (int i = 0; i < arrayS.length; i++) {
                if (arrayS[i] != arrayT[i])
                    return false;
            }
            return true;
        }
    }
