
import java.util.*;

public class employee {
    public static void main(String[] args) {

        TreeMap<Integer, String> employees = new TreeMap<>();

        // 1. Add new employee records
        employees.put(105, "HR");
        employees.put(102, "IT");
        employees.put(104, "Finance");
        employees.put(101, "Marketing");
        employees.put(103, "Sales");

        // 2. Display all employees in ascending order
        System.out.println("Employee Records in Ascending Order:");
        System.out.println(employees);

        // 3. Update employee department
        employees.put(103, "IT");

        System.out.println("\nAfter Updating Employee 103:");
        System.out.println(employees);

        // 4. Search employee using ID
        int searchId = 102;

        if (employees.containsKey(searchId)) {
            System.out.println("\nEmployee Found!");
            System.out.println("Employee ID: " + searchId);
            System.out.println("Department: " + employees.get(searchId));
        } else {
            System.out.println("\nEmployee Not Found!");
        }

        // 5. Remove employee record
        employees.remove(105);

        System.out.println("\nAfter Removing Employee 105:");
        System.out.println(employees);

        // 6. Display first and last employee IDs
        System.out.println("\nFirst Employee ID: " + employees.firstKey());
        System.out.println("Last Employee ID: " + employees.lastKey());

        // 7. Display employees in descending order
        System.out.println("\nEmployee Records in Descending Order:");
        System.out.println(employees.descendingMap());

        // 8. Display employees within a given ID range
        System.out.println("\nEmployees from ID 101 to 103:");
        System.out.println(employees.subMap(101, true, 103, true));
    }
}
