
import java.util.*;

public class EmployeeIDManagement {
    public static void main(String[] args) {

        // Create a TreeSet to store employee IDs
        TreeSet<Integer> employeeIDs = new TreeSet<>();

        // Add employee IDs
        employeeIDs.add(105);
        employeeIDs.add(102);
        employeeIDs.add(108);
        employeeIDs.add(101);
        employeeIDs.add(106);
        employeeIDs.add(103);
        employeeIDs.add(110);

        // Display all employee IDs in ascending order
        System.out.println("Employee IDs: " + employeeIDs);

        // Add a new employee ID
        employeeIDs.add(104);
        System.out.println("After adding 104: " + employeeIDs);

        // Remove an employee ID
        employeeIDs.remove(106);
        System.out.println("After removing 106: " + employeeIDs);

        // Display smallest and largest employee IDs
        System.out.println("Smallest Employee ID: " + employeeIDs.first());
        System.out.println("Largest Employee ID: " + employeeIDs.last());

        // Find higher and lower IDs
        int id = 104;

        System.out.println("Given ID: " + id);
        System.out.println("Next Higher ID: " + employeeIDs.higher(id));
        System.out.println("Next Lower ID: " + employeeIDs.lower(id));

        // Display IDs smaller than a given ID
        System.out.println("IDs less than 105: " + employeeIDs.headSet(105));

        // Display IDs greater than or equal to a given ID
        System.out.println("IDs from 105 onwards: " + employeeIDs.tailSet(105));

        // Display IDs within a specified range
        System.out.println("IDs between 102 and 108: "
                + employeeIDs.subSet(102, 108));

    }
}
