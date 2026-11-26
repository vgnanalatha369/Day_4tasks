
import java.util.*;

public class StudentMarksManagement {
    public static void main(String[] args) {

        // Create a HashMap to store student names and marks
        HashMap<String, Integer> students = new HashMap<>();

        // Add student records
        students.put("Rahul", 85);
        students.put("Priya", 92);
        students.put("Anjali", 78);
        students.put("Kiran", 88);
        students.put("Sneha", 95);

        // Display all student records
        System.out.println("Student Records: " + students);

        // Update marks of an existing student
        students.put("Rahul", 90);

        System.out.println("After Updating Rahul's Marks: " + students);

        // Search for a student's marks
        String searchName = "Priya";

        if (students.containsKey(searchName)) {
            System.out.println(searchName + "'s Marks: "
                    + students.get(searchName));
        } else {
            System.out.println(searchName + " not found.");
        }

        // Remove a student record
        students.remove("Anjali");

        System.out.println("After Removing Anjali: " + students);

        // Display all student names and marks
        System.out.println("\nAll Student Records:");

        for (String name : students.keySet()) {
            System.out.println(name + " : " + students.get(name));
        }

        // Calculate average marks
        int total = 0;

        for (int marks : students.values()) {
            total += marks;
        }

        double average = (double) total / students.size();

        System.out.println("\nTotal Marks: " + total);
        System.out.println("Number of Students: " + students.size());
        System.out.println("Average Marks: " + average);
    }
}
