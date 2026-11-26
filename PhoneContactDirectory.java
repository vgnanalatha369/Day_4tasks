
import java.util.*;

public class PhoneContactDirectory {
    public static void main(String[] args) {

        // Create a HashMap to store contact names and phone numbers
        HashMap<String, String> contacts = new HashMap<>();

        // Add new contacts
        contacts.put("Rahul", "9876543210");
        contacts.put("Priya", "9876543211");
        contacts.put("Anjali", "9876543212");
        contacts.put("Kiran", "9876543213");
        contacts.put("Sneha", "9876543214");

        // Display all contacts
        System.out.println("Contact Directory: " + contacts);

        // Update an existing phone number
        contacts.put("Rahul", "9123456780");

        System.out.println("After Updating Rahul's Number: " + contacts);

        // Search for a contact
        String searchName = "Priya";

        if (contacts.containsKey(searchName)) {
            System.out.println(searchName + "'s Phone Number: "
                    + contacts.get(searchName));
        } else {
            System.out.println(searchName + " not found.");
        }

        // Delete a contact
        contacts.remove("Anjali");

        System.out.println("After Deleting Anjali: " + contacts);

        // Check whether a phone number is already saved
        String searchNumber = "9876543213";

        if (contacts.containsValue(searchNumber)) {
            System.out.println(searchNumber + " is already saved.");
        } else {
            System.out.println(searchNumber + " is not saved.");
        }

        // Display all contacts using entrySet()
        System.out.println("\nAll Contact Details:");

        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            System.out.println("Name: " + entry.getKey()
                    + " | Phone Number: " + entry.getValue());
        }
    }
}
