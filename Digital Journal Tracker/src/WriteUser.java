import java.util.ArrayList;

public class WriteUser extends User{

    //Creates An arraylist to store the journal entries
    ArrayList<JournalEntry> journalEntries = new ArrayList<>();

    //class constructor
    WriteUser(String name, int age){
        super(name, age);
    }


    public void addJournalEntry(JournalEntry entry){
        journalEntries.add(entry);
    }

    public void listJournalEntries(){
        for(JournalEntry je: journalEntries){
            System.out.println(je.toFormattedString());
        }
    }

    @Override
    public String getRole(){
        return "Writer";
    }



}
