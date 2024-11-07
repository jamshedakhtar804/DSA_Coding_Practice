package msAccademyAssignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class HighestRepeatingWordInFile {
    public static String findMostFrequentWord(String filePath) throws IOException {
        Map<String, Integer> wordCount = new HashMap<>();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        
        while ((line = reader.readLine()) != null) {
            String[] words = line.split("\\s+");
            for (String word : words) {
                word = word.toLowerCase().replaceAll("[^a-z]", ""); // Normalize words
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }
        reader.close();
        
        String mostFrequentWord = null;
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequentWord = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        
        return mostFrequentWord;
    }

    public static void main(String[] args) {
        String filePath = "/Users/jamshed/Documents/workspace-spring-tool-suite-4-4.23.1.RELEASE/DSAAssignment/src/msAccademyAssignment/file.txt";
        try {
            String mostFrequentWord = findMostFrequentWord(filePath);
            System.out.println("The most frequently occurring word is: " + mostFrequentWord);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
