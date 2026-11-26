import java.util.LinkedList;

public class MusicPlaylist {
    public static void main(String[] args) {

        // Create a LinkedList
        LinkedList<String> playlist = new LinkedList<>();

        // 1. Add songs to the playlist
        playlist.add("Kesariya");
        playlist.add("Samajavaragamana");
        playlist.add("Butta Bomma");
        playlist.add("Srivalli");

        // 2. Add a song at the beginning
        playlist.addFirst("Tum Hi Ho");

        // 3. Add a song at the end
        playlist.addLast("Inkem Inkem");

        // 4. Display the current playlist
        System.out.println("Current Playlist: " + playlist);

        // 5. Display the first song
        System.out.println("First Song: " + playlist.getFirst());

        // 6. Display the last song
        System.out.println("Last Song: " + playlist.getLast());

        // 7. Remove the first song
        playlist.removeFirst();
        System.out.println("\nAfter Removing First Song: " + playlist);

        // 8. Remove the last song
        playlist.removeLast();
        System.out.println("After Removing Last Song: " + playlist);

        // 9. Search for a particular song
        String searchSong = "Butta Bomma";

        if (playlist.contains(searchSong)) {
            System.out.println("\n" + searchSong + " is available in the playlist");
        } else {
            System.out.println("\n" + searchSong + " is not available in the playlist");
        }

        // 10. Play the next song by removing the current song
        if (!playlist.isEmpty()) {
            System.out.println("\nNow Playing: " + playlist.removeFirst());
        }

        // Display playlist after playing
        System.out.println("Playlist After Playing: " + playlist);
    }
}