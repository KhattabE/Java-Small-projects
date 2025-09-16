public class Song extends AudioContent implements Playable {

    //Class fields
    private String artist;
    private String songGenre;

    //Class constructor
    Song(String title, double songDuration, String artist, String songGenre) {
        //Super keyword to get the super class fields to be able to be used in the child class
        super(title, songDuration);

        this.artist = artist;
        this.songGenre = songGenre;
    }

    //Getters for readability
    public String getArtist() {
        return this.artist;
    }

    public String getSongGenre() {
        return this.songGenre;
    }

    //Setter methods to make the fields writable
    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setGenre(String songGenre) {
        this.songGenre = songGenre;
    }


    //Override the displayAudioInfo() method from the parent class
    @Override
    public void displayAudioInfo() {
        System.out.println("| Song title: " + this.getTitle() +
                "\n| Song Artist: " + this.artist +
                "\n| Song Genre: " + this.songGenre +
                "\n| Song Duration: " + this.getDuration());
    }

    //Implement the method play() From the interface class that this child class implements
    public String play() {
        return "The Song: " + getTitle() + ", By " + this.artist + " is now playing!";
    }

    //We override the equals() Method to check for equality, and so we can avoid duplicates
    @Override
    public boolean equals(Object songEquals){
        //If statement to check if the Object is equal to itself
        if(songEquals == this){
            return true;
        }
        //If statement to check if the object is not an instanceOf Song(The class)
        if (!(songEquals instanceof Song)){
            return false;
        }
        Song otherInstanceOfSong = (Song)songEquals;
        boolean titleEquals = (this.getTitle() == null && otherInstanceOfSong.getTitle() == null) ||
                (this.getTitle() != null && this.getTitle().equals(otherInstanceOfSong.getTitle()));
        return titleEquals;


    }


}
