
import java.util.*;

public class event {
    public static void main(String[] args) {

        // Create two HashSets for two events
        HashSet<Integer> event1 = new HashSet<>();
        HashSet<Integer> event2 = new HashSet<>();

        // 1. Store student registration IDs
        event1.add(101);
        event1.add(102);
        event1.add(103);
        event1.add(104);
        event1.add(105);

        // 2. Allow students to register
        event1.add(106);

        // 3. Prevent duplicate registrations
        event1.add(103);

        System.out.println("Event 1 Registrations:");
        System.out.println(event1);

        // 4. Remove registration when student cancels
        event1.remove(105);

        System.out.println("\nAfter Cancellation:");
        System.out.println(event1);

        // 5. Search whether student has registered
        int searchId = 102;

        if (event1.contains(searchId)) {
            System.out.println("\nStudent " + searchId + " is registered.");
        } else {
            System.out.println("\nStudent " + searchId + " is not registered.");
        }

        // 6. Display all registered student IDs
        System.out.println("\nAll Registered Students:");
        System.out.println(event1);

        // 7. Display total unique registrations
        System.out.println("\nTotal Registrations: " + event1.size());

        // 8. Register students for second event
        event2.add(102);
        event2.add(103);
        event2.add(106);
        event2.add(107);
        event2.add(108);

        System.out.println("\nEvent 2 Registrations:");
        System.out.println(event2);

        // Find students registered for both events
        HashSet<Integer> commonStudents = new HashSet<>(event1);
        commonStudents.retainAll(event2);

        System.out.println("\nStudents Registered for Both Events:");
        System.out.println(commonStudents);

        // Combine registrations of both events
        HashSet<Integer> allStudents = new HashSet<>(event1);
        allStudents.addAll(event2);

        System.out.println("\nAll Unique Students from Both Events:");
        System.out.println(allStudents);

        System.out.println("\nTotal Unique Students: " + allStudents.size());
    }
}
