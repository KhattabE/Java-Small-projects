import java.io.*;
import java.util.ArrayList;

public class JournalManager implements FileHandler {

    private static final String FILE_NAME = "C:\\Users\\Khatt\\Desktop\\FileHandlingProject\\data\\journal_entries.txt";


    @Override
    public void saveToFile(ArrayList<JournalEntry> entries) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true));
            for (JournalEntry journals : entries){
                writer.write(journals.toFormattedString());
                writer.newLine();
                writer.close();
            }
        } catch (IOException ioe) {
            System.out.println("Error somethign went wrong!");
        }
    }

    @Override
    public ArrayList<JournalEntry> loadFromFile() {
        ArrayList<JournalEntry> dummyList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line); // just prints the line
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        return dummyList; // still return something to satisfy method signature
    }





}
