import java.util.Objects;

public class Warrior extends GameCharacter {

    //Class fields
    private String weaponType;

    //Class constructor
    Warrior(String name, int level, double health, String weaponType){
        //Super keyword to get superclass fields to this class
        super(name, level, health);

        this.weaponType = weaponType;
    }

    //Getters
    public String getWeaponType(){
        return this.weaponType;
    }

    //Setters
    public void setWeaponType(String weaponType){
        this.weaponType = weaponType;
    }


    //Override the method displayInfo from the parent class
    @Override
    public void displayInfo(){
        System.out.println("| Warrior name: " + getName() +
                "| Warrior level: " + getLevel() +
                "| Warrior health: " + getHealth() +
                "| Warrior Weapon Type: " + this.weaponType);
    }

    //
    @Override
    public String getFaction(){
        return "Warrior";
    }

    //Implements the performAction() method from Playable
    public String performAction(){
        return "*Warrior swings the sword!";
    }

    //Override the Object class equals() method to check for duplication
    @Override
    public boolean equals(Object warriorEqual){
        if(this == warriorEqual){
            return true;
        }
        if(!(warriorEqual instanceof Warrior)){
            return false;
        }
        Warrior otherWarrior = (Warrior) warriorEqual;
        boolean nameEquals = (getName() == null && otherWarrior.getName() == null) ||
                (getName() != null && getName().equals(otherWarrior.getName()));
        return nameEquals;

    }

    //Override the Object class hashCode() method to check for duplication
    @Override
    public int hashCode(){
        return Objects.hash(getName());
    }




}