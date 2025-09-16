public class AudioBook extends AudioContent implements Playable{

    //Class fields
    private String reader;
    private String audioBookGenre;

    //Class constructor
    AudioBook(String title, double duration, String reader, String audioBookGenre){
        //Super keyword to get the parent class fields to be able to be used by the child class
        super(title, duration);

        this.reader = reader;
        this.audioBookGenre = audioBookGenre;
    }


    //Getter methods for readability
    public String getReader(){
        return this.reader;
    }

    public String getAudioBookGenre(){
        return this.audioBookGenre;
    }

    //Getter method for writablity
    public void setReader(String reader){
        this.reader = reader;
    }

    public void setAudioBookGenre(String audioBookGenre){
        this.audioBookGenre = audioBookGenre;
    }


    //Override the method displayAudioInfo() from the parent class
    @Override
    public void displayAudioInfo(){
        System.out.println("| Audio Book Title: " + this.getTitle() +
                "\n| Audio Book Reader: " + this.reader +
                "\n| Audio Book Genre: " + this.audioBookGenre +
                "\n| Audio Book Duration: " + getDuration());
    }

    //Implements the Playable method from the implemented interface class
    public String play(){
        return "The Audio Book: " + getTitle() + ", By " + this.reader + " is now playing!";
    }


    //Override the Object class method equals(), will be used to prevent duplicates
    @Override
    public boolean equals(Object audioBookEquals){
        //If statment to check if the object is equal to itself, it will return true if it is
        if(this == audioBookEquals){
            return true;
        }
        //If statement to check if audioBookEquals is not an instant of the Object AudioBook, if it is not, it will return false, this is for safe checking, before moving on to the next step
        if(!(audioBookEquals instanceof AudioBook)){
            return false;
        }
        //Type casting audioBookEquals to AudioBook data type
        AudioBook otherInstanceOfAudioBook = (AudioBook) audioBookEquals;
        //Checks if both instances equals null if not, it also checks if they equal each other
        boolean titleEquals = (this.getTitle() == null && otherInstanceOfAudioBook.getTitle() == null) ||
                (getTitle() != null && getTitle().equals(otherInstanceOfAudioBook.getTitle()));
        return titleEquals;
    }


}
