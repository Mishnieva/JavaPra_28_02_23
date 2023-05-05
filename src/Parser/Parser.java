package Parser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Parser {
    public List <String> readAll (String name) throws IOException {
        List <String> words;

        try (BufferedReader reader = new BufferedReader(new FileReader(name))) {
            words = reader.lines().flatMap(s -> Arrays.stream(s.split(" ")))
                    .map(s -> s.replace(",","").replace("!", ""))
                    .filter(s -> s.length() > 2).collect(Collectors.toList());
        }
        return words;
    }
    public Map <String, Long> countWords(List <String> words) {
        return words.stream().collect(Collectors.groupingBy(word -> word,Collectors.counting()))
                .entrySet().stream().sorted((l,r) -> Math.toIntExact(r.getValue() - l.getValue()))
                .limit(10).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
    public int countUnique (List<String> words){
        return new HashSet<>(words).size();
    }
    public void saveStatistic (String... words) throws IOException {
        try(FileWriter writer = new FileWriter("statistic.txt")) {
            for (String word : words) {
                writer.write(word);
            }
        }
    }
}
