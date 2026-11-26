
import java.util.*;

public class word {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a paragraph:");
        String paragraph = sc.nextLine();

        // Convert to lowercase
        paragraph = paragraph.toLowerCase();

        // Remove punctuation marks
        paragraph = paragraph.replaceAll("[^a-z0-9\\s]", "");

        // Split paragraph into words
        String[] words = paragraph.split("\\s+");

        // Create HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Count word frequency
        for (String word : words) {
            if (!word.isEmpty()) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }

        // Display word frequencies
        System.out.println("\nWord Frequencies:");

        for (String word : map.keySet()) {
            System.out.println(word + " : " + map.get(word));
        }

        // Find most frequently occurring word
        String mostFrequentWord = "";
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequentWord = entry.getKey();
            }
        }

        System.out.println("\nMost Frequent Word: " + mostFrequentWord);
        System.out.println("Frequency: " + maxCount);

        // Display unique word count
        System.out.println("Unique Words: " + map.size());

        sc.close();
    }
}
