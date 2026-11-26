
import java.util.*;

public class rank {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> students = new HashMap<>();
        TreeSet<Integer> uniqueMarks = new TreeSet<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        // Accept student names and marks
        for (int i = 1; i <= n; i++) {

            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            System.out.print("Enter marks: ");
            int marks = sc.nextInt();
            sc.nextLine();

            students.put(name, marks);
            uniqueMarks.add(marks);
        }

        // Display all students and marks
        System.out.println("\nStudent Details:");

        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        if (students.isEmpty()) {
            System.out.println("No student records available.");
            sc.close();
            return;
        }

        // Highest and lowest marks
        System.out.println("\nHighest Marks: " + uniqueMarks.last());
        System.out.println("Lowest Marks: " + uniqueMarks.first());

        // Display unique marks in ascending order
        System.out.println("\nUnique Marks in Ascending Order:");
        for (int mark : uniqueMarks) {
            System.out.println(mark);
        }

        // Students who scored above 80
        System.out.println("\nStudents Scoring Above 80:");

        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            if (entry.getValue() > 80) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }

        // Calculate class average
        int total = 0;

        for (int mark : students.values()) {
            total += mark;
        }

        double average = (double) total / students.size();

        System.out.println("\nClass Average: " + average);

        // Find top-performing student(s)
        int highest = uniqueMarks.last();

        System.out.println("\nTop Performing Student(s):");

        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            if (entry.getValue() == highest) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }

        // Count passed and failed students
        int passed = 0;
        int failed = 0;

        for (int mark : students.values()) {
            if (mark >= 35) {
                passed++;
            } else {
                failed++;
            }
        }

        System.out.println("\nPassed Students: " + passed);
        System.out.println("Failed Students: " + failed);

        sc.close();
    }
}
