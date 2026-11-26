
import java.util.*;

public class FoodDelivery {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedHashMap<Integer, String> orders = new LinkedHashMap<>();

        int choice;

        do {
            System.out.println("\n----- FOOD DELIVERY ORDER TRACKING -----");
            System.out.println("1. Add New Order");
            System.out.println("2. Update Order Status");
            System.out.println("3. Search Order");
            System.out.println("4. Cancel Order");
            System.out.println("5. Display All Orders");
            System.out.println("6. Count Orders by Status");
            System.out.println("7. Exit");

            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Order ID: ");
                    int id = sc.nextInt();

                    if (orders.containsKey(id)) {
                        System.out.println("Order ID Already Exists!");
                    } else {
                        orders.put(id, "Preparing");
                        System.out.println("Order Added Successfully!");
                    }
                    break;

                case 2:
                    System.out.print("Enter Order ID: ");
                    int updateId = sc.nextInt();

                    if (orders.containsKey(updateId)) {

                        System.out.println("1. Preparing");
                        System.out.println("2. Packed");
                        System.out.println("3. Out for Delivery");
                        System.out.println("4. Delivered");

                        System.out.print("Enter New Status: ");
                        int status = sc.nextInt();

                        String newStatus = "";

                        switch (status) {
                            case 1:
                                newStatus = "Preparing";
                                break;
                            case 2:
                                newStatus = "Packed";
                                break;
                            case 3:
                                newStatus = "Out for Delivery";
                                break;
                            case 4:
                                newStatus = "Delivered";
                                break;
                            default:
                                System.out.println("Invalid Status!");
                                break;
                        }

                        if (!newStatus.isEmpty()) {
                            orders.put(updateId, newStatus);
                            System.out.println("Order Status Updated!");
                        }

                    } else {
                        System.out.println("Order Not Found!");
                    }
                    break;

                case 3:
                    System.out.print("Enter Order ID: ");
                    int searchId = sc.nextInt();

                    if (orders.containsKey(searchId)) {
                        System.out.println("Order ID: " + searchId);
                        System.out.println("Order Status: " + orders.get(searchId));
                    } else {
                        System.out.println("Order Not Found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter Order ID: ");
                    int cancelId = sc.nextInt();

                    if (orders.containsKey(cancelId)) {
                        orders.remove(cancelId);
                        System.out.println("Order Cancelled Successfully!");
                    } else {
                        System.out.println("Order Not Found!");
                    }
                    break;

                case 5:
                    System.out.println("\n----- ALL ORDERS -----");

                    if (orders.isEmpty()) {
                        System.out.println("No Active Orders!");
                    } else {
                        for (Map.Entry<Integer, String> entry : orders.entrySet()) {
                            System.out.println("Order ID: " + entry.getKey()
                                    + " | Status: " + entry.getValue());
                        }
                    }
                    break;

                case 6:
                    HashMap<String, Integer> count = new HashMap<>();

                    for (String status : orders.values()) {
                        count.put(status, count.getOrDefault(status, 0) + 1);
                    }

                    System.out.println("\n----- ORDER STATUS COUNT -----");
                    System.out.println("Preparing: " + count.getOrDefault("Preparing", 0));
                    System.out.println("Packed: " + count.getOrDefault("Packed", 0));
                    System.out.println("Out for Delivery: " + count.getOrDefault("Out for Delivery", 0));
                    System.out.println("Delivered: " + count.getOrDefault("Delivered", 0));
                    break;

                case 7:
                    System.out.println("Exiting Food Delivery System...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 7);

        sc.close();
    }
}
