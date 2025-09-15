public class Movie {

    //Class fields
    private String title;
    private String genre;
    private String directorName;
    private int releaseYear;


    //Class constructor
    Movie(String title, String genre, String directorName, int releaseYear){
        this.title = title;
        this.genre = genre;
        this.directorName = directorName;
        this.releaseYear = releaseYear;
    }


    //Getters to make the fields readable
    public String getTitle(){
        return this.title;
    }
    public String getGenre(){
        return this.genre;
    }
    public String getDirectorName(){
        return this.directorName;
    }
    public int getReleaseYear(){
        return this.releaseYear;
    }


    //Setters to make the fields writable
    public void setTitle(String title){
        this.title = title;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
    public void setDirectorName(String directorName){
        this.directorName = directorName;
    }
    public void setReleaseYear(int releaseYear){
        this.releaseYear = releaseYear;
    }

    //DisplayMovieInfo for internal Checking if needed
    public void displayMovieInfo(){
        System.out.println("Movie Title: " +
                this.title +  "\nMovie Genre: " + this.genre +
                "\nMovie Director Name: " + this.directorName +
                "\nMovie Release Year: " + this.releaseYear);
    }




}
