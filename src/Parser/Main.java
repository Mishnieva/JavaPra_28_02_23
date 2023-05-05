package Parser;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static final String PATH = "src/parser/";

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        Parser parcer = new Parser();
        System.out.println("Enter the book");
        String bookName = scan.nextLine();

        List<String> words;
        try {
            words = parcer.readAll(PATH + bookName);
        } catch (IOException e) {
            System.out.println("Title is not correct");
            return;
        }
        Map <String,Long> countingWords = parcer.countWords(words);
        int unique = parcer.countUnique(words);
        System.out.println(words);
        try {
            parcer.saveStatistic(countingWords.toString(), "Unique words: " + unique);
        } catch (IOException e){
            System.out.println("Can't save");
        }
        System.out.println(parcer.countUnique(words));
        System.out.println(countingWords);
        scan.close();
    }
}
