import java.util.ArrayList;

public interface FileHandler {

    //Method that will be implemnted in the implemented class that will be used to save the written file
    public void saveToFile(ArrayList<LendingRecord> records);

    public ArrayList<LendingRecord> loadFromFile();


}
