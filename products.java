
import java.util.*;

public class products {
    public static void main(String[] args) {

        LinkedHashSet<String> products = new LinkedHashSet<>();

        // 1. Add newly viewed products
        products.add("Laptop");
        products.add("Mobile");
        products.add("Headphones");
        products.add("Keyboard");
        products.add("Mouse");

        // 2. Prevent duplicate product names
        products.add("Laptop");
        products.add("Mobile");

        // 3. Display recently viewed products
        System.out.println("Recently Viewed Products:");
        System.out.println(products);

        // 4. Search whether a product was viewed
        String searchProduct = "Mobile";

        if (products.contains(searchProduct)) {
            System.out.println("\nProduct Found: " + searchProduct);
        } else {
            System.out.println("\nProduct Not Found");
        }

        // 5. Remove a product
        products.remove("Keyboard");

        System.out.println("\nAfter Removing Keyboard:");
        System.out.println(products);

        // 6. Display total unique viewed products
        System.out.println("\nTotal Unique Viewed Products: " + products.size());

        // 7. Display products in insertion order
        System.out.println("\nFinal Recently Viewed Products:");

        for (String product : products) {
            System.out.println(product);
        }
    }
}
