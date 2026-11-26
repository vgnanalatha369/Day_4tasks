
import java.util.*;

public class ExamScoreRanking {
    public static void main(String[] args) {

        // Create a TreeSet to store unique exam scores
        TreeSet<Integer> scores = new TreeSet<>();

        // Add exam scores
        scores.add(85);
        scores.add(92);
        scores.add(76);
        scores.add(95);
        scores.add(88);
        scores.add(76);
        scores.add(90);
        scores.add(80);

        // Display all unique scores in ascending order
        System.out.println("Exam Scores: " + scores);

        // Find the highest and lowest scores
        System.out.println("Lowest Score: " + scores.first());
        System.out.println("Highest Score: " + scores.last());

        // Find the next higher and lower scores
        int givenScore = 85;

        System.out.println("Given Score: " + givenScore);
        System.out.println("Next Higher Score: " + scores.higher(givenScore));
        System.out.println("Next Lower Score: " + scores.lower(givenScore));

        // Display scores in descending order
        System.out.println("Scores in Descending Order: "
                + scores.descendingSet());

    }
}
