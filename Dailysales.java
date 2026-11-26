
import java.util.*;

public class Dailysales {
    public static void main(String[] args) {

        LinkedHashMap<String, Integer> sales = new LinkedHashMap<>();

        // Add product sales
        sales.put("Laptop", 10);
        sales.put("Mobile", 25);
        sales.put("Keyboard", 15);
        sales.put("Mouse", 30);
        sales.put("Monitor", 8);

        // Display all products and sales
        System.out.println("Daily Sales Report:");
        System.out.println(sales);

        // Update sales quantities
        sales.put("Laptop", 20);
        sales.put("Mobile", 35);

        System.out.println("\nAfter Updating Sales:");
        System.out.println(sales);

        // Calculate total quantity sold
        int total = 0;

        for (int quantity : sales.values()) {
            total = total + quantity;
        }

        System.out.println("\nTotal Quantity Sold: " + total);

        // Find product with highest sales quantity
        String highestProduct = "";
        int highestSales = 0;

        for (Map.Entry<String, Integer> entry : sales.entrySet()) {

            if (entry.getValue() > highestSales) {
                highestSales = entry.getValue();
                highestProduct = entry.getKey();
            }
        }

        System.out.println("\nProduct with Highest Sales: " + highestProduct);
        System.out.println("Highest Sales Quantity: " + highestSales);

        // Display sales report in insertion order
        System.out.println("\nFinal Sales Report:");

        for (Map.Entry<String, Integer> entry : sales.entrySet()) {
            System.out.println("Product: " + entry.getKey()
                    + ", Quantity Sold: " + entry.getValue());
        }
    }
}
