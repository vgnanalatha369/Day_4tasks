
import java.util.*;

public class customer {
    public static void main(String[] args) {

        LinkedList<String> queue = new LinkedList<>();

        // 1. Add customers to the queue
        queue.addLast("Rahul");
        queue.addLast("Priya");
        queue.addLast("Anjali");
        queue.addLast("Kiran");

        System.out.println("Customer Service Queue:");
        System.out.println(queue);

        // 2. Add emergency customer at the beginning
        queue.addFirst("Emergency Customer");

        System.out.println("\nAfter Adding Emergency Customer:");
        System.out.println(queue);

        // 3. Display all waiting customers
        System.out.println("\nAll Waiting Customers:");
        System.out.println(queue);

        // 4. Serve the first customer
        String served = queue.poll();
        System.out.println("\nServing Customer: " + served);

        // 5. Display next customer to be served
        System.out.println("\nNext Customer: " + queue.peek());

        // 6. Remove a particular customer
        queue.remove("Anjali");

        System.out.println("\nAfter Removing Anjali:");
        System.out.println(queue);

        // 7. Display total waiting customers
        System.out.println("\nTotal Waiting Customers: " + queue.size());

        // 8. Continue serving until queue becomes empty
        System.out.println("\nServing All Remaining Customers:");

        while (!queue.isEmpty()) {
            System.out.println("Serving: " + queue.poll());
        }

        System.out.println("\nIs Queue Empty? " + queue.isEmpty());
    }
}
