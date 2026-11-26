
import java.util.*;

public class map {
    public static void main(String[] args) {

        TreeMap<Integer, String> students = new TreeMap<>();

        // Add student records
        students.put(103, "Rahul");
        students.put(101, "Anjali");
        students.put(105, "Kiran");
        students.put(102, "Priya");
        students.put(104, "Arun");

        // Display records in ascending order
        System.out.println("Student Records in Ascending Order:");
        System.out.println(students);

        // Update student name
        students.put(103, "Ravi");
        System.out.println("\nAfter Updating Roll No 103:");
        System.out.println(students);

        // Search student using roll number
        System.out.println("\nStudent with Roll No 102: " + students.get(102));

        // Remove student record
        students.remove(105);
        System.out.println("\nAfter Removing Roll No 105:");
        System.out.println(students);

        // First and last roll numbers
        System.out.println("\nFirst Roll Number: " + students.firstKey());
        System.out.println("Last Roll Number: " + students.lastKey());

        // Display records in descending order
        System.out.println("\nStudent Records in Descending Order:");
        System.out.println(students.descendingMap());

        // Display records within a specified range
        System.out.println("\nStudent Records from Roll No 101 to 103:");
        System.out.println(students.subMap(101, true, 103, true));
    }
}
