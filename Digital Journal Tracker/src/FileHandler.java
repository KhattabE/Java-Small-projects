import java.util.ArrayList;

public interface FileHandler {

    public void saveToFile(ArrayList<JournalEntry> entries);

    public ArrayList<JournalEntry> loadFromFile();


}
