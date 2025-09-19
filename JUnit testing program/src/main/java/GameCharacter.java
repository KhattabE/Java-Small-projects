public abstract class GameCharacter {

    //Class fields
    private String name;
    private int level;
    private double health;


    //Class constructor
    GameCharacter(String name, int level, double health){
        this.name = name;
        this.level = level;
        this.health = health;
    }


    //Getters
    public String getName(){
        return this.name;
    }
    public int getLevel(){
        return this.level;
    }
    public double getHealth(){
        return this.health;
    }

    //Setters
    public void setName(String name){
        this.name = name;
    }
    public void setLevel(int level){
        this.level = level;
    }
    public void setHealth(double health){
        this.health = health;
    }

    //Abstract Display info method
    public abstract void displayInfo();
    public abstract String getFaction();



}