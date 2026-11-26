
import java.util.*;

public class EmployeeSalaryManagement {
    public static void main(String[] args) {

        // Create a HashMap to store employee IDs and salaries
        HashMap<Integer, Double> employees = new HashMap<>();

        // Add employee salary records
        employees.put(101, 25000.0);
        employees.put(102, 30000.0);
        employees.put(103, 45000.0);
        employees.put(104, 35000.0);
        employees.put(105, 40000.0);

        // Display all employee records
        System.out.println("Employee Salary Records: " + employees);

        // Update an employee's salary using replace()
        employees.replace(102, 38000.0);

        System.out.println("After Updating Employee 102: " + employees);

        // Search for an employee using ID
        int searchID = 103;

        if (employees.containsKey(searchID)) {
            System.out.println("Employee ID: " + searchID);
            System.out.println("Employee Salary: " + employees.get(searchID));
        } else {
            System.out.println("Employee ID not found.");
        }

        // Display all employee IDs and salaries
        System.out.println("\nAll Employee Details:");

        for (Map.Entry<Integer, Double> entry : employees.entrySet()) {
            System.out.println("Employee ID: " + entry.getKey()
                    + " | Salary: " + entry.getValue());
        }

        // Find employee with the highest salary
        int highestEmployeeID = 0;
        double highestSalary = 0.0;

        for (Map.Entry<Integer, Double> entry : employees.entrySet()) {

            if (entry.getValue() > highestSalary) {
                highestSalary = entry.getValue();
                highestEmployeeID = entry.getKey();
            }
        }

        System.out.println("\nEmployee with Highest Salary:");
        System.out.println("Employee ID: " + highestEmployeeID);
        System.out.println("Highest Salary: " + highestSalary);

        // Calculate total salary expenditure
        double totalSalary = 0.0;

        for (double salary : employees.values()) {
            totalSalary += salary;
        }

        System.out.println("Total Salary Expenditure: " + totalSalary);
    }
}
