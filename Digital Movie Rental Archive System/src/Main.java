import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        RentalManager manager = new RentalManager();

    Movie movie1 = new Movie("The Running Runner", "Sport", "Mark Runner", 2025);
    Customer customer1 = new Customer("Josef", "Josef@gmail.com", "M2123");
    LocalDate lendDate = LocalDate.of(2025, 12, 24);
    LocalDate returnDate = LocalDate.of(2025, 12, 31);

    RentalRecord rentalRecords =  new RentalRecord(movie1, customer1, lendDate, returnDate);

        ArrayList<RentalRecord> records = new ArrayList<>();
        records.add(rentalRecords);

        manager.writeToFile(records);

        ArrayList<RentalRecord> loadedFromFile = manager.loadFromFile();

        for(RentalRecord rr : loadedFromFile){
            System.out.println(rr.toFileString());
        }









    }

}
