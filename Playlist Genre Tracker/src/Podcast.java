public class Podcast extends AudioContent{

    //Class fields
    private String podcastHost;
    private String podcastGuest;
    private String podcastGenre;


    //Class constructor
    Podcast(String title, double duration, String podcastHost, String podcastGuest, String podcastGenre){
        //Superkeyword to get the super class fields to be able to be used by the child class
        super(title, duration);

        this.podcastHost = podcastHost;
        this.podcastGuest = podcastGuest;
        this.podcastGenre = podcastGenre;
    }

    //Getters to make the field readable
    public String getPodcastHost(){
        return this.podcastHost;
    }
    public String getPodcastGuest(){
        return this.podcastGuest;
    }
    public String getPodcastGenre(){
        return this.podcastGenre;
    }

    //Setter methods for writability
    public void setPodcastHost(String podcastHost){
        this.podcastHost = podcastHost;
    }
    public void setPodcastGuest(String podcastGuest){
        this.podcastGuest = podcastGuest;
    }
    public void setPodcastGenre(String podcastGenre){
        this.podcastGenre = podcastGenre;
    }


    //Override the displayAudioInfo() method from the parent class
    @Override
    public void displayAudioInfo(){
        System.out.println("| Podcast Title: " + getTitle() +
                "\n| Podcast Host: " + this.podcastHost +
                "\n| Podcast Guest: " + this.podcastGuest +
                "\n| Podcast Genre: " + this.podcastGenre +
                "\n| Podcast Duration: " + getDuration());
    }

    //Implement the method play() from the interface class
    public String play(){
        return "The Podcast: " + getTitle() + ", By " + this.podcastHost +
                " is now playing and is featuring: " + this.podcastGuest + " as today's guest!";
    }


    //Override the Object class equal() method to prevent duplication
    @Override
    public boolean equals(Object podcastEquals){
        //If statment to check if the object is equal to itself, it will return true if it is and will stop since its a duplicate
        if(this == podcastEquals){
            return true;
        }
        if(!(podcastEquals instanceof Podcast)){
            return false;
        }
        Podcast otherInstanceOfPodcast = (Podcast) podcastEquals;
        boolean titleEquals = (this.getTitle() == null && otherInstanceOfPodcast.getTitle() == null) ||
                (this.getTitle() != null && getTitle().equals(otherInstanceOfPodcast.getTitle()));
        return titleEquals;
    }




}
