public class JournalEntry {

    //Class field
    private String date;
    private String mood;
    private String notes;

    //Class counstructor
    JournalEntry(String date, String mood, String notes) {
        this.date = date;
        this.mood = mood;
        this.notes = notes;

    }

    //Getter to make fields readable
    public String getDate() {
        return this.date;
    }

    public String getMood() {
        return this.mood;
    }

    public String getNotes() {
        return this.notes;
    }


    //Setter to male fields writable
    public void setDate(String date) {
        this.date = date;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }


    public String toFormattedString() {
        return "Date: " + this.date +
                "\nMood: " + this.mood +
                "\nNotes: " + this.notes;

    }


}
