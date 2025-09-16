public abstract class AudioContent {

    //Class fields
    private String title;
    private double duration;

    //Super class constructor
    AudioContent(String title, double duration){
        this.title = title;
        this.duration = duration;
    }


    //Getter method for readability
    public String getTitle(){
        return this.title;
    }
    public double getDuration(){
        return this.duration;
    }

    //Setter methods for writability
    public void setTitle(String title){
        this.title = title;
    }
    public void setDuration(double duration){
        this.duration = duration;
    }


    //Abstract method that will be used by the extending child class
    public abstract void displayAudioInfo();




}
