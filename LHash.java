
import java.util.*;

public class LHash {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> orders = new LinkedHashMap<>();

        // Add new orders
        orders.put(101, "Rahul");
        orders.put(102, "Priya");
        orders.put(103, "Anjali");
        orders.put(104, "Kiran");

        // Display all orders
        System.out.println("All Orders:");
        System.out.println(orders);

        // Update customer information
        orders.put(102, "Sneha");
        System.out.println("\nAfter Updating Order 102:");
        System.out.println(orders);

        // Search for an order
        int orderId = 103;

        if (orders.containsKey(orderId)) {
            System.out.println("\nOrder Found: " + orders.get(orderId));
        } else {
            System.out.println("\nOrder Not Found");
        }

        // Cancel an order
        orders.remove(104);
        System.out.println("\nAfter Cancelling Order 104:");
        System.out.println(orders);

        // Display all orders in insertion order
        System.out.println("\nOrders in Insertion Order:");

        for (Map.Entry<Integer, String> entry : orders.entrySet()) {
            System.out.println("Order ID: " + entry.getKey()
                    + ", Customer Name: " + entry.getValue());
        }
    }
}
