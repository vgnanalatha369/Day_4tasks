
import java.util.HashSet;

public class UniqueStudentRegistration {
    public static void main(String[] args) {

        // Creating HashSet
        HashSet<Integer> studentIds = new HashSet<>();

        // 1. Store student registration IDs
        studentIds.add(101);
        studentIds.add(102);
        studentIds.add(103);
        studentIds.add(104);
        studentIds.add(105);

        // 2. Prevent duplicate registration IDs
        studentIds.add(101);
        System.out.println("After Adding Duplicate ID:");
        System.out.println(studentIds);

        // 3. Add new student ID
        studentIds.add(106);
        System.out.println("\nAfter Adding New Student ID:");
        System.out.println(studentIds);

        // 4. Remove a student ID
        studentIds.remove(103);
        System.out.println("\nAfter Removing Student ID 103:");
        System.out.println(studentIds);

        // 5. Search whether an ID exists
        int searchId = 102;

        if (studentIds.contains(searchId)) {
            System.out.println("\nStudent ID " + searchId + " exists.");
        } else {
            System.out.println("\nStudent ID " + searchId + " does not exist.");
        }

        // 6. Display all registered student IDs
        System.out.println("\nAll Registered Student IDs:");

        for (int id : studentIds) {
            System.out.println(id);
        }

        // 7. Display total unique registrations
        System.out.println("\nTotal Unique Registrations: "
                + studentIds.size());
    }
}
