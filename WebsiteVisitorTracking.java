
import java.util.*;

public class WebsiteVisitorTracking {
    public static void main(String[] args) {

        // Create a LinkedHashSet to store visitor IDs
        LinkedHashSet<Integer> visitors = new LinkedHashSet<>();

        // Add visitor IDs
        visitors.add(101);
        visitors.add(102);
        visitors.add(103);
        visitors.add(104);
        visitors.add(105);

        // Display visitors in arrival order
        System.out.println("Visitor IDs: " + visitors);

        // Add new visitor IDs
        visitors.add(106);
        visitors.add(107);

        System.out.println("After Adding New Visitors: " + visitors);

        // Attempt to add duplicate visitor IDs
        visitors.add(102);
        visitors.add(104);

        System.out.println("After Adding Duplicate IDs: " + visitors);

        // Remove a visitor ID
        visitors.remove(103);

        System.out.println("After Removing Visitor 103: " + visitors);

        // Check whether a visitor has already visited
        int searchID = 102;

        if (visitors.contains(searchID)) {
            System.out.println("Visitor " + searchID + " has already visited.");
        } else {
            System.out.println("Visitor " + searchID + " has not visited.");
        }

        // Check another visitor ID
        int searchID2 = 110;

        if (visitors.contains(searchID2)) {
            System.out.println("Visitor " + searchID2 + " has already visited.");
        } else {
            System.out.println("Visitor " + searchID2 + " has not visited.");
        }

        // Display total unique visitors
        System.out.println("Total Unique Visitors: " + visitors.size());

        // Display final visitor arrival order
        System.out.println("Final Visitor Arrival Order: " + visitors);
    }
}
