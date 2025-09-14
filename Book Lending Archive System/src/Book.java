public class Book {

    //Class fields
    private String title;
    private String author;
    private int yearPublished;
    private String genre;


    //class constructor
    Book(String title, String author, int yearPublished, String genre) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.genre = genre;

    }

    //Getter for readability
    public String getTitle(){
        return this.title;
    }

    public String getAuthor(){
        return this.author;
    }

    public int getYearPublished(){
        return this.yearPublished;
    }

    public String getGenre(){
        return this.genre;
    }

    //Setters for writability
    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setYearPublished(int yearPublished){
        this.yearPublished = yearPublished;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }


    //Method to display book information
    public void displayBookInfo(){
        System.out.println("Book Title: " + this.title +
                "\nBook Author: " + this.author +
                "\nBook Year Published: " + this.yearPublished +
                "\nBook Genre: " + this.genre);
    }




}
