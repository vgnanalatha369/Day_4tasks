import java.util.ArrayList;

public class EmployeeAttendance {
    public static void main(String[] args) {

        // Create an ArrayList
        ArrayList<String> employees = new ArrayList<>();

        // 1. Store employee names who are present
        employees.add("Rahul");
        employees.add("Priya");
        employees.add("Kiran");
        employees.add("Sneha");
        employees.add("Arun");

        // 2. Add newly present employees
        employees.add("Divya");
        employees.add("Ravi");

        // 3. Remove employees who are absent
        employees.remove("Kiran");

        // 4. Display attendance list
        System.out.println("Employee Attendance List:");
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }

        // 5. Search for an employee's attendance
        String searchName = "Priya";

        if (employees.contains(searchName)) {
            System.out.println("\n" + searchName + " is Present");
        } else {
            System.out.println("\n" + searchName + " is Absent");
        }

        // 6. Display total number of present employees
        System.out.println("\nTotal Present Employees: " + employees.size());

        // 7. Display employees in reverse order
        System.out.println("\nEmployees in Reverse Order:");

        for (int i = employees.size() - 1; i >= 0; i--) {
            System.out.println(employees.get(i));
        }
    }
}