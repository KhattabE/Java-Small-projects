import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class RentalManager implements FileHandler{

    //ArrayList
    ArrayList<RentalRecord> rentalRecords = new ArrayList<>();

    //The directory file location of where the file writing and reading will be located at
    String filePath = "C:\\Users\\Khatt\\Desktop\\FileHandlingProject\\lendingMovieRecords.txt";


    //Method to write to file
    public void writeToFile(ArrayList<RentalRecord> rentalRecords){
        try {
            //BufferedWriter to write the file and to where
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
            //For each loop to loop through the arrayList and write the file
            for(RentalRecord rr : rentalRecords){
                writer.write(rr.toFileString());
                writer.newLine();
            }
                writer.close();

        } catch (IOException ioe){
            System.out.println("could not write to file!");
        }
    }

    public ArrayList<RentalRecord> loadFromFile(){
        //A new empty array list where we will store the loaded files back into
        ArrayList<RentalRecord> loadRecords = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        try {
            //Buffered reader to read from the file
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            while((line = reader.readLine()) != null){

                //An array parts that will be used to split the loaded file from their label, so we dont get duplicate label later on
                String[] parts = line.split("\\|");

                String title = parts[0].split(": ")[1];
                String name = parts[1].split(": ")[1];
                String customerEmail = parts[2].split(": ")[1];
                String memberShipID = parts[3].split(": ")[1];
                String genre = parts[4].split(": ")[1];
                String directorName = parts[5].split(": ")[1];
                int releaseYear = Integer.parseInt(parts[6].split(": ")[1]);
                LocalDate lendDate = LocalDate.parse(parts[7].split(":")[1], formatter);
                LocalDate returnDate = LocalDate.parse(parts[8].split(":")[1], formatter);

                Movie movie = new Movie(title, genre, directorName, releaseYear);
                Customer customer = new Customer(name, customerEmail, memberShipID);
                RentalRecord loadedRecords = new RentalRecord(movie, customer, lendDate, returnDate);

                loadRecords.add(loadedRecords);
            }


        } catch (IOException ioe){
            System.out.println("Could not retrieve file information's");
        }

        return loadRecords;

    }





}
