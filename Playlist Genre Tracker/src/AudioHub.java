import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class AudioHub {

    //Hashset to hold titles from the various classes
    HashSet<String> titlesOfVariousAudios = new HashSet<>();

    //Hash map key-pair value genre-title
    HashMap<String, HashSet<String>> genreKeyAndTitleValueMap = new HashMap<>();




    //Class fields which in this case are a declaration of other classes
    private Song songs;
    private AudioBook audioBooks;
    private Podcast podcasts;

    AudioHub(Song songs, AudioBook audioBooks, Podcast podcasts) {
        this.songs = songs;
        this.audioBooks = audioBooks;
        this.podcasts = podcasts;

        titlesOfVariousAudios.add(songs.getTitle());
        titlesOfVariousAudios.add(audioBooks.getTitle());
        titlesOfVariousAudios.add(podcasts.getTitle());
    }



    public void putGenreAndTitleToHashMap() {

        // Check if the songs genre is already in the map.
        // If not, add it with an empty HashSet as the starting value.
        genreKeyAndTitleValueMap.putIfAbsent(songs.getGenre(), new HashSet<>());
        // Now safely add the song title to the HashSet for that genre.
        genreKeyAndTitleValueMap.get(songs.getGenre()).add(songs.getTitle());

        genreKeyAndTitleValueMap.putIfAbsent(audioBooks.getGenre(), new HashSet<>());
        genreKeyAndTitleValueMap.get(audioBooks.getGenre()).add(audioBooks.getTitle());

        genreKeyAndTitleValueMap.putIfAbsent(podcasts.getGenre(), new HashSet<>());
        genreKeyAndTitleValueMap.get(podcasts.getGenre()).add(podcasts.getTitle());

    }




    public void addContentFromUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What type of content do you want to add? (Song, AudioBook, Podcast): ");
        String type = scanner.nextLine();

        System.out.print("Enter title: ");
        String title = scanner.nextLine();

        System.out.print("Enter duration (in minutes): ");
        double duration = scanner.nextDouble();
        scanner.nextLine(); // consume newline

        System.out.print("Enter genre: ");
        String genre = scanner.nextLine();

        // Check if title already exists
        if (titlesOfVariousAudios.contains(title)) {
            System.out.println("❌ This title already exists. Duplicate not allowed.");
            return;
        }

        // Add new content based on type
        if (type.equalsIgnoreCase("Song")) {
            System.out.print("Enter artist: ");
            String artist = scanner.nextLine();

            Song newSong = new Song(title, duration, artist, genre);
            titlesOfVariousAudios.add(title);

            genreKeyAndTitleValueMap.putIfAbsent(genre, new HashSet<>());
            genreKeyAndTitleValueMap.get(genre).add(title);

            System.out.println("✅ Song added!");

        } else if (type.equalsIgnoreCase("AudioBook")) {
            System.out.print("Enter reader: ");
            String reader = scanner.nextLine();

            AudioBook newBook = new AudioBook(title, duration, reader, genre);
            titlesOfVariousAudios.add(title);

            genreKeyAndTitleValueMap.putIfAbsent(genre, new HashSet<>());
            genreKeyAndTitleValueMap.get(genre).add(title);

            System.out.println("✅ Audiobook added!");

        } else if (type.equalsIgnoreCase("Podcast")) {
            System.out.print("Enter host: ");
            String host = scanner.nextLine();

            System.out.print("Enter guest: ");
            String guest = scanner.nextLine();

            Podcast newPodcast = new Podcast(title, duration, host, guest, genre);
            titlesOfVariousAudios.add(title);

            genreKeyAndTitleValueMap.putIfAbsent(genre, new HashSet<>());
            genreKeyAndTitleValueMap.get(genre).add(title);

            System.out.println("✅ Podcast added!");

        } else {
            System.out.println("❌ Invalid content type.");
        }
    }







}



