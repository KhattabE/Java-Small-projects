import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class RentalRecord {

    private Movie movie1;
    private Customer customer1;
    private LocalDate lendDate;
    private LocalDate returnDate;


    RentalRecord(Movie movie1, Customer customer1, LocalDate lendDate, LocalDate returnDate) {
        this.movie1 = movie1;
        this.customer1 = customer1;
        this.lendDate = lendDate;
        this.returnDate = returnDate;

    }

    //Getter methods to make the fields readable
    public Movie getMovie1() {
        return movie1;
    }

    public Customer getCustomer1() {
        return customer1;
    }

    public LocalDate getLendDate() {
        return lendDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    //Setters to make the fields readable
    public void setMovie1(Movie movie1) {
        this.movie1 = movie1;
    }

    public void setCustomer1(Customer customer1) {
        this.customer1 = customer1;
    }

    public void setLendDate(LocalDate lendDate) {
        this.lendDate = lendDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    //A method for internal checking if needed
    public void displayRentalInfo() {
        System.out.println("Customer Name: " + customer1.getName() +
                "\nCustomer Email: " + getCustomer1().getCustomerEmail() +
                "\nCustomer Membership ID: " + getCustomer1().getMemberShipID() +
                "\nCustomer role: " + getCustomer1().getRole() +
                "\nMovie Title: " + getMovie1().getTitle() +
                "\nMovie Genre: " + getMovie1().getGenre() +
                "\nMovie Director Name: " + getMovie1().getDirectorName() +
                "\nMovie Release Year: " + getMovie1().getReleaseYear());

    }

    public String toFileString() {
        //a variable of string, to be used to check if the borrowed book has been returned
        DateTimeFormatter returnDateInfo = null;
        String formattedReturnDate = null;
        if (returnDate != null) {
            returnDateInfo = DateTimeFormatter.ISO_LOCAL_DATE;
            formattedReturnDate = returnDate.format(returnDateInfo);
        } else {
            System.out.println("The Book Has Not Been Returned Yet!");
        }

        return "Movie Title: " + movie1.getTitle() +
                " | Customer Name: " + customer1.getName() +
                " | Customer Email: " + customer1.getCustomerEmail() +
                " | Customer Membership ID: " + customer1.getMemberShipID() +
                " | Customer Role: " + customer1.getRole() +
                " | Movie Genre: " + movie1.getGenre() +
                " | Movie Director: " + movie1.getDirectorName() +
                " | Movie Release Year: " + movie1.getReleaseYear();


    }


}
