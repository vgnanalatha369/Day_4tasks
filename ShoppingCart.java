import java.util.ArrayList;

public class ShoppingCart {
    public static void main(String[] args) {

        // Create ArrayLists
        ArrayList<String> products = new ArrayList<>();
        ArrayList<Integer> quantities = new ArrayList<>();

        // 1. Add products to cart
        products.add("Laptop");
        quantities.add(1);

        products.add("Mobile");
        quantities.add(2);

        products.add("Headphones");
        quantities.add(1);

        products.add("Keyboard");
        quantities.add(3);

        // 2. Display all cart products
        System.out.println("Shopping Cart:");
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i) + " - Quantity: " + quantities.get(i));
        }

        // 3. Remove a product from cart
        int index = products.indexOf("Mobile");

        if (index != -1) {
            products.remove(index);
            quantities.remove(index);
        }

        System.out.println("\nAfter Removing Mobile:");
        System.out.println(products);

        // 4. Update quantity of a product
        index = products.indexOf("Laptop");

        if (index != -1) {
            quantities.set(index, 5);
        }

        System.out.println("\nAfter Updating Laptop Quantity:");
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i) + " - Quantity: " + quantities.get(i));
        }

        // 5. Check whether a product exists
        if (products.contains("Headphones")) {
            System.out.println("\nHeadphones exists in the cart");
        } else {
            System.out.println("\nHeadphones does not exist in the cart");
        }

        // 6. Calculate total number of products
        int total = 0;

        for (int quantity : quantities) {
            total = total + quantity;
        }

        System.out.println("\nTotal Number of Products: " + total);

        // 7. Clear cart after checkout
        products.clear();
        quantities.clear();

        System.out.println("\nCart after Checkout: " + products);
        System.out.println("Total Products after Checkout: " + products.size());
    }
}