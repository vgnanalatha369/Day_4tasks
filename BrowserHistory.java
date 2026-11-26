import java.util.LinkedList;

public class BrowserHistory {
    public static void main(String[] args) {

        // Create a LinkedList
        LinkedList<String> history = new LinkedList<>();

        // 1. Store visited website URLs
        history.add("https://www.google.com");
        history.add("https://www.youtube.com");
        history.add("https://www.instagram.com");
        history.add("https://www.github.com");

        // 2. Add newly visited websites
        history.add("https://www.amazon.com");

        // 3. Display browsing history
        System.out.println("Browsing History:");
        for (String website : history) {
            System.out.println(website);
        }

        // 4. Remove the most recently visited website
        history.removeLast();

        System.out.println("\nAfter Removing Last Visited Website:");
        System.out.println(history);

        // 5. Display the first visited website
        System.out.println("\nFirst Visited Website: " + history.getFirst());

        // 6. Display the last visited website
        System.out.println("Last Visited Website: " + history.getLast());

        // 7. Search whether a website was visited
        String searchWebsite = "https://www.youtube.com";

        if (history.contains(searchWebsite)) {
            System.out.println("\nWebsite was visited");
        } else {
            System.out.println("\nWebsite was not visited");
        }

        // 8. Clear browsing history
        history.clear();

        System.out.println("\nAfter Clearing Browsing History:");
        System.out.println(history);

        System.out.println("Total History: " + history.size());
    }
}