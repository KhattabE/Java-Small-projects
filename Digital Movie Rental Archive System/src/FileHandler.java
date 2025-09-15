import java.util.ArrayList;

public interface FileHandler {

    //Method thait will be used to write the file
    public void writeToFile(ArrayList<RentalRecord> rentalRecords);

    public ArrayList<RentalRecord> loadFromFile();

}
