import java.util.Objects;

public class Archer extends GameCharacter {

    //Class field
    private String arrowCount;

    //Class constructor
    Archer(String name, int level, double health, String arrowCount){
        //super keyword to inherit parent class fields
        super(name, level, health);
        this.arrowCount = arrowCount;
    }

    //Getter
    public String getArrowCount(){
        return this.arrowCount;
    }
    //Setter
    public void setArrowCount(String arrowCount){
        this.arrowCount = arrowCount;
    }

    //Override displayInfo()
    @Override
    public void displayInfo(){
        System.out.println("| Archer name: " + getName() +
                "| Archer level: " + getLevel() +
                "| Archer health: " + getHealth() +
                "| Archer Arrow Count: " + this.arrowCount);
    }

    //Override getFaction()
    @Override
    public String getFaction(){
        return "Archer";
    }

    //Implement performAction() method
    public String performAction(){
        return "Archer shooting arrows!";
    }

    //Override the Object class equals() method to check for duplication
    @Override
    public boolean equals(Object archerEquals){
        if(this == archerEquals){
            return true;
        }
        if(!(archerEquals instanceof Archer)){
            return false;
        }
        Archer otherArcher = (Archer) archerEquals;
        boolean nameEqaul = (getName() == null || otherArcher.getName() == null) ||
                (getName() != null || getName().equals(otherArcher.getName()));
        return nameEqaul;
    }

    //Override the Object class hashCode() method to check for duplication
    @Override
    public int hashCode(){
        return Objects.hashCode(getName());
    }


}