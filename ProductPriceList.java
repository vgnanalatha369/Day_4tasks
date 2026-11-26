
import java.util.ArrayList;
import java.util.Collections;

public class ProductPriceList {
    public static void main(String[] args) {

        // Creating ArrayList
        ArrayList<Double> prices = new ArrayList<>();

        // Adding 10 product prices
        prices.add(100.0);
        prices.add(250.0);
        prices.add(150.0);
        prices.add(500.0);
        prices.add(300.0);
        prices.add(450.0);
        prices.add(200.0);
        prices.add(600.0);
        prices.add(350.0);
        prices.add(400.0);

        // 1. Display all prices
        System.out.println("Product Prices:");
        System.out.println(prices);

        // 2. Update price at a given index
        prices.set(2, 180.0);
        System.out.println("\nAfter Updating Index 2:");
        System.out.println(prices);

        // 3. Find highest price
        System.out.println("\nHighest Price: " +
                Collections.max(prices));

        // 4. Find lowest price
        System.out.println("Lowest Price: " +
                Collections.min(prices));

        // 5. Calculate average price
        double sum = 0;

        for (double price : prices) {
            sum += price;
        }

        double average = sum / prices.size();

        System.out.println("Average Price: " + average);

        // 6. Sort prices in ascending order
        Collections.sort(prices);

        System.out.println("\nSorted Prices:");
        System.out.println(prices);

        // 7. Display prices within a given range
        double minRange = 200.0;
        double maxRange = 400.0;

        System.out.println("\nPrices between "
                + minRange + " and " + maxRange + ":");

        for (double price : prices) {
            if (price >= minRange && price <= maxRange) {
                System.out.println(price);
            }
        }
    }
}
