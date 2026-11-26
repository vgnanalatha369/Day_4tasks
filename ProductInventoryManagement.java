
import java.util.*;

public class ProductInventoryManagement {
    public static void main(String[] args) {

        // Create a HashMap to store product IDs and quantities
        HashMap<Integer, Integer> products = new HashMap<>();

        // Add new products
        products.put(101, 10);
        products.put(102, 8);
        products.put(103, 4);
        products.put(104, 15);
        products.put(105, 2);
        products.put(106, 0);

        // Display all products
        System.out.println("Product Inventory: " + products);

        // Update product quantity
        products.put(101, 20);

        System.out.println("After Updating Product 101: " + products);

        // Reduce quantity when products are sold
        int productID = 102;
        int soldQuantity = 3;

        if (products.containsKey(productID)) {
            int currentQuantity = products.get(productID);

            if (currentQuantity >= soldQuantity) {
                products.put(productID, currentQuantity - soldQuantity);
                System.out.println("Product " + productID + " sold successfully.");
            } else {
                System.out.println("Insufficient stock.");
            }
        } else {
            System.out.println("Product not found.");
        }

        System.out.println("After Selling Products: " + products);

        // Search for a product using its ID
        int searchID = 103;

        if (products.containsKey(searchID)) {
            System.out.println("Product ID: " + searchID);
            System.out.println("Available Quantity: " + products.get(searchID));
        } else {
            System.out.println("Product not found.");
        }

        // Use getOrDefault() to search for an ID
        int unknownID = 110;

        int quantity = products.getOrDefault(unknownID, 0);

        System.out.println("Quantity of Product " + unknownID + ": " + quantity);

        // Display products with quantities below 5
        System.out.println("\nProducts with Quantity Below 5:");

        for (Map.Entry<Integer, Integer> entry : products.entrySet()) {

            if (entry.getValue() < 5) {
                System.out.println("Product ID: " + entry.getKey()
                        + " | Quantity: " + entry.getValue());
            }
        }

        // Remove products that are out of stock
        products.entrySet().removeIf(entry -> entry.getValue() == 0);

        // Display final inventory
        System.out.println("\nFinal Product Inventory: " + products);
    }
}
