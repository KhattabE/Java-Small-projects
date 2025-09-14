import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        //Creating an object of lendingRecordManger
        LendingRecordManager manager = new LendingRecordManager();

        //Instantiating the objects,
        Book book1 = new Book("Maze Runner", "KhatZBoy", 2003, "Sci-Fi");
        Person person1 = new Person("MojoJojo", 345);
        LocalDate lendDate = LocalDate.of(2025, 9, 14);
        LocalDate returnDate = LocalDate.of(2025, 9, 21);

        //Instantiating the objects,
        Book book2 = new Book("Need for Speed", "ZBoyKhat", 2000, "Cars");
        Person person2 = new Person("JojoMojo", 543);
        LocalDate lendDate1 = LocalDate.of(2024, 2, 14);
        LocalDate returnDate1 = LocalDate.of(2025, 11, 29);

        //puts them in the lendingRacord class since it got the toFileString method
        LendingRecord record1 = new LendingRecord(book1, person1, lendDate, returnDate);

        //puts them in the lendingRacord class since it got the toFileString method
        LendingRecord record2 = new LendingRecord(book2, person2, lendDate1, returnDate1);

        //Adding them to the arrayList
        ArrayList<LendingRecord> records = new ArrayList<>();
        records.add(record1);
        records.add(record2);

        //Calling the write method
        manager.saveToFile(records);

        //Calling the file reading method
        ArrayList<LendingRecord> loadedFromFile = manager.loadFromFile();

        //Will loop through the arrayList and print the information from the File
        for (LendingRecord r : loadedFromFile) {
            System.out.println(r.toFileString());
        }








    }



}
