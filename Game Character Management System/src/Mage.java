import java.util.Objects;

public class Mage extends GameCharacter implements Playable {

    //Class field
    private String magicType;

    //Class instructor
    Mage(String name, int level, double health, String magicType) {
        //Super keyword, to inherit the super class fields
        super(name, level, health);

        this.magicType = magicType;
    }

    //Getters
    public String getMagicType() {
        return this.magicType;
    }

    //Setters
    public void setMagicType(String magicType) {
        this.magicType = magicType;
    }


    //Override method from parent class
    @Override
    public void displayInfo() {

        System.out.println("| Mage name: " + getName() +
                "| Mage level: " + getLevel() +
                "| Mage health: " + getHealth() +
                "| Mage Magic Type: " + this.magicType);
    }

    //Override other method
    @Override
    public String getFaction(){
        return "Magic";
    }

    //implement performAction() method
    public String performAction(){
        return "Casting fire ball";
    }

    //Override the Object class equals() method to check for duplication
    @Override
    public boolean equals(Object mageEquals){
        if(this == mageEquals){
            return true;
        }
        if(!(mageEquals instanceof Mage)){
            return false;
        }
        Mage otherMage = (Mage) mageEquals;
        boolean nameEquals = (getName() == null && otherMage.getName() == null) ||
                (getName() != null && getName().equals(otherMage.getName()));
        return nameEquals;
    }

    //Override the Object class hashCode() method to check for duplication
    @Override
    public int hashCode(){
        return Objects.hashCode(getName());
    }





}
