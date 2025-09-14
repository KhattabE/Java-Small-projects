import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class LendingRecordManager implements FileHandler {

    //Declare and initialize and empty ArrayList og lendingRecords
    ArrayList<LendingRecord> lendingRecords = new ArrayList<>();


    //The directory file location of where the file writing and reading will be located at
    String filePath = "C:\\Users\\Khatt\\Desktop\\FileHandlingProject\\lendingRecords.txt";

    //A method to write the files
    public void saveToFile(ArrayList<LendingRecord> records) {
        try {
            //We will use BufferedWriter to write or file
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
            //AN enhanced for loop, that will loop through the arraylist and call on the toFileString() method and write that to the file.
            for (LendingRecord record : records) {
                writer.write(record.toFileString());
                writer.newLine();
            }
            writer.close();


        } catch (IOException ioe) {
            System.out.println("Could not write file!");
        }
    }


    //A method to read the files that are written
    public ArrayList<LendingRecord> loadFromFile() {
        ArrayList<LendingRecord> loadedRecords = new ArrayList<>();

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                //This will split a long string(line of text) into smaller chuncks using "|" as a separator
                String[] parts = line.split(" \\| ");

                //.split(": ") method to remove the redundant info
                String title = parts[0].split(": ")[1];
                String name = parts[1].split(": ")[1];
                int id = Integer.parseInt(parts[2].split(": ")[1]);
                LocalDate lendDate = LocalDate.parse(parts[3].split(": ")[1]);
                LocalDate returnDate = LocalDate.parse(parts[4].split(": ")[1]);
                String author = parts[5].split(": ")[1];
                String genre = parts[6].split(": ")[1];
                int yearPublished = Integer.parseInt(parts[7].split(": ")[1]);

                //Put them back in object
                Book book = new Book(title, author, yearPublished, genre);
                Person person = new Person(name, id);
                LendingRecord record = new LendingRecord(book, person, lendDate, returnDate);

                //add them to the arrayList
                loadedRecords.add(record);
            }

        } catch (IOException ioe) {
            System.out.println("Could not find a file with that name!");
        }

        return loadedRecords;
    }


}
