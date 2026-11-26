
import java.util.HashSet;

public class UniqueProductInventory {
    public static void main(String[] args) {

        // Creating HashSet
        HashSet<String> products = new HashSet<>();

        // 1. Store unique product names
        products.add("Laptop");
        products.add("Mobile");
        products.add("Keyboard");
        products.add("Mouse");
        products.add("Monitor");

        System.out.println("Initial Product Inventory:");
        System.out.println(products);

        // 2. Add new products
        products.add("Printer");
        products.add("Headphones");

        System.out.println("\nAfter Adding New Products:");
        System.out.println(products);

        // 3. Attempt to add duplicate products
        products.add("Laptop");
        products.add("Mobile");

        System.out.println("\nAfter Adding Duplicate Products:");
        System.out.println(products);

        // 4. Remove discontinued products
        products.remove("Mouse");

        System.out.println("\nAfter Removing Discontinued Product:");
        System.out.println(products);

        // 5. Search for a product
        String searchProduct = "Laptop";

        if (products.contains(searchProduct)) {
            System.out.println("\n" + searchProduct + " is available.");
        } else {
            System.out.println("\n" + searchProduct + " is not available.");
        }

        // 6. Display all unique products
        System.out.println("\nAll Unique Products:");

        for (String product : products) {
            System.out.println(product);
        }

        // 7. Display total number of unique products
        System.out.println("\nTotal Unique Products: " + products.size());
    }
}
