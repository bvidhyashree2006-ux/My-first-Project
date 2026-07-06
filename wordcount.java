import java.util.*;

public class wordcount {
    public static void main(String[] args) {
        // Sample text to analyze
        String text = "hello world hello mapreduce java program hello java";
        
        // This simulates the Map process: breaking text into single words
        String[] words = text.toLowerCase().split("\\s+");
        
        // This simulates the Reduce process: counting the frequency of each word
        Map<String, Integer> wordCounts = new HashMap<>();
        
        for (String word : words) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }
        
        // Displaying the word frequencies
        System.out.println("Word Frequency Counts:");
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}