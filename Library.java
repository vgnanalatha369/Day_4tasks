
import java.util.*;

public class Library {
    public static void main(String[] args) {

        ArrayList<String> books = new ArrayList<>();

        // Add new books
        books.add("Java Programming");
        books.add("Python Programming");
        books.add("Data Structures");
        books.add("Database Management");
        books.add("Web Development");

        // Display all books
        System.out.println("All Library Books:");
        System.out.println(books);

        // Remove damaged or unavailable book
        books.remove("Python Programming");

        System.out.println("\nAfter Removing a Book:");
        System.out.println(books);

        // Update an existing book title
        books.set(1, "Advanced Data Structures");

        System.out.println("\nAfter Updating a Book:");
        System.out.println(books);

        // Search for a book
        String searchBook = "Java Programming";

        if (books.contains(searchBook)) {
            System.out.println("\nBook Found: " + searchBook);
        } else {
            System.out.println("\nBook Not Found");
        }

        // Display total number of books
        System.out.println("\nTotal Number of Books: " + books.size());

        // Display books in reverse order
        Collections.reverse(books);

        System.out.println("\nBooks in Reverse Order:");
        System.out.println(books);
    }
}
