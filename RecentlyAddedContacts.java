
import java.util.*;

public class RecentlyAddedContacts {
    public static void main(String[] args) {

        // Create a LinkedHashSet to store contact names
        LinkedHashSet<String> contacts = new LinkedHashSet<>();

        // Add contact names
        contacts.add("Rahul");
        contacts.add("Priya");
        contacts.add("Anjali");
        contacts.add("Kiran");
        contacts.add("Sneha");

        // Display all contacts in insertion order
        System.out.println("Contact List: " + contacts);

        // Add new contacts
        contacts.add("Arjun");
        contacts.add("Divya");

        System.out.println("After Adding Contacts: " + contacts);

        // Attempt to add a duplicate contact
        contacts.add("Rahul");

        System.out.println("After Adding Duplicate: " + contacts);

        // Remove a contact
        contacts.remove("Kiran");

        System.out.println("After Removing Kiran: " + contacts);

        // Search for a contact
        String searchName = "Priya";

        if (contacts.contains(searchName)) {
            System.out.println(searchName + " is present in the contact list.");
        } else {
            System.out.println(searchName + " is not present in the contact list.");
        }

        // Search for a contact that does not exist
        String searchName2 = "Ravi";

        if (contacts.contains(searchName2)) {
            System.out.println(searchName2 + " is present in the contact list.");
        } else {
            System.out.println(searchName2 + " is not present in the contact list.");
        }

        // Display final contacts in insertion order
        System.out.println("Final Contact List: " + contacts);
    }
}
