import java.util.ArrayList;

public class StudentNameManagement {
    public static void main(String[] args) {

        // Create an ArrayList
        ArrayList<String> students = new ArrayList<>();

        // 1. Add 10 student names
        students.add("Rahul");
        students.add("Priya");
        students.add("Kiran");
        students.add("Sneha");
        students.add("Arun");
        students.add("Kavya");
        students.add("Ravi");
        students.add("Divya");
        students.add("Manoj");
        students.add("Anu");

        // 2. Display all student names
        System.out.println("Student Names: " + students);

        // 3. Add a new student at a specific position
        students.add(2, "Ramesh");
        System.out.println("After Adding: " + students);

        // 4. Remove a student using their name
        students.remove("Kiran");
        System.out.println("After Removing: " + students);

        // 5. Update a student name at a particular index
        students.set(0, "Suresh");
        System.out.println("After Updating: " + students);

        // 6. Search whether a student exists
        if (students.contains("Priya")) {
            System.out.println("Priya exists in the list");
        } else {
            System.out.println("Priya does not exist in the list");
        }

        // 7. Display total number of students
        System.out.println("Total Students: " + students.size());
    }
}