
import java.util.*;

public class tree {
    public static void main(String[] args) {

        TreeMap<Integer, Integer> results = new TreeMap<>();

        // Add student results
        results.put(103, 85);
        results.put(101, 92);
        results.put(105, 76);
        results.put(102, 88);
        results.put(104, 95);

        // Display all student results
        System.out.println("Student Examination Results:");
        System.out.println(results);

        // Update examination result
        results.put(103, 90);
        System.out.println("\nAfter Updating Roll No 103:");
        System.out.println(results);

        // Search marks using roll number
        System.out.println("\nMarks of Roll No 102: " + results.get(102));

        // Find highest marks
        int highest = Collections.max(results.values());
        System.out.println("\nHighest Marks: " + highest);

        // Find lowest marks
        int lowest = Collections.min(results.values());
        System.out.println("Lowest Marks: " + lowest);

        // First and last entries
        System.out.println("\nFirst Entry: " + results.firstEntry());
        System.out.println("Last Entry: " + results.lastEntry());

        // Display students within a roll number range
        System.out.println("\nResults from Roll No 102 to 104:");
        System.out.println(results.subMap(102, true, 104, true));

        // Display results in reverse order
        System.out.println("\nResults in Reverse Roll Number Order:");
        System.out.println(results.descendingMap());
    }
}
