import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LendingRecord {

    //Classs fields (Creating objects)
    private Book book1;
    private Person person1;
    private LocalDate lendDate;
    private LocalDate returnDate;


    //Class constructor
    LendingRecord(Book book1, Person person1, LocalDate lendDate, LocalDate returnDate) {
        this.book1 = book1;
        this.person1 = person1;
        this.lendDate = lendDate;
        this.returnDate = returnDate;
    }


    //Getter for readability
    public Book getBook1() {
        return this.book1;
    }

    public Person getPerson1() {
        return this.person1;
    }

    public LocalDate getLendDate() {
        return this.lendDate;
    }

    public LocalDate getReturnDate() {
        return this.returnDate;
    }

    //Setter method for writablity
    public void setBook1(Book book1) {
        this.book1 = book1;
    }

    public void setPerson1(Person person1) {
        this.person1 = person1;
    }

    public void setLendDate(LocalDate lendDate) {
        this.lendDate = lendDate;
    }

    public void setReturnDate(LocalDate returnDate){
        this.returnDate = returnDate;
    }


    //Method to display person and book information
    public void displayDetailsOfLend(){
        System.out.println("Person Name: " + getPerson1().getName() +
                "\nPerson ID: " + getPerson1().getId() +
                "\nPersons role: " + getPerson1().getRole() +
                "\nBook Title: " + getBook1().getTitle() +
                "\nBook Author: " + getBook1().getAuthor() +
                "\nBook Published Year: " + getBook1().getYearPublished() +
                "\nBook Genre: " + getBook1().getGenre());
    }


    public String toFileString() {
        //a variable of string, to be used to check if the borrowed book has been returned
        DateTimeFormatter returnDateInfo = null;
        String formattedReturnDate = null;
        if(returnDate != null){
            returnDateInfo = DateTimeFormatter.ISO_LOCAL_DATE;
            formattedReturnDate = returnDate.format(returnDateInfo);
        } else{
            System.out.println("The Book Has Not Been Returned Yet!");
        }

        return "Book: " + book1.getTitle() +
                " | Borrower: " + person1.getName() +
                " | Borrowers ID: " + person1.getId() +
                " | Lend Date: " + lendDate +
                " | Return Date: " + formattedReturnDate +
                " | Book Author: " + book1.getAuthor() +
                " | Book Genre: " + book1.getGenre() +
                " | Book Release Year: " + book1.getYearPublished();
    }




}
