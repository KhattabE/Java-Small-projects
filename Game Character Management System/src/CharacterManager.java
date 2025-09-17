import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CharacterManager {

    //Array list that will hold all our characters
    ArrayList<GameCharacter> allCharacters;

    //A hashSet that will hold unique names
    HashSet<String> warriorNames;
    HashSet<String> mageNames;
    HashSet<String> archerNames;

    //HashMap with key-pair values
    HashMap<String, HashSet<String>> factionKeyNamePair;

    //Class fields/Objects
    private Warrior warriors;
    private Mage mages;
    private Archer archers;

    //Class constructor
    CharacterManager(Warrior warriors, Mage mages, Archer archers) {
        this.warriors = warriors;
        this.mages = mages;
        this.archers = archers;
    }

    //Getters
    public Warrior getWarriors() {
        return this.warriors;
    }

    public Mage getMages() {
        return this.mages;
    }

    public Archer getArchers() {
        return this.archers;
    }

    //Setters
    public void setWarriors(Warrior warriors) {
        this.warriors = warriors;
    }

    public void setMages(Mage mages) {
        this.mages = mages;
    }

    public void setArchers(Archer archers) {
        this.archers = archers;
    }


    //Method to add characters
    public void addCharacter() {
        //Add the characters to the ArrayList
        allCharacters.add(warriors);
        allCharacters.add(mages);
        allCharacters.add(archers);

        //Add the character names to the hashSet
        warriorNames.add(warriors.getName());
        mageNames.add(mages.getName());
        archerNames.add(archers.getName());

        //Adds key-pair value to the hash map, where the Key is the faction and the Value is the name
        factionKeyNamePair.putIfAbsent(warriors.getFaction(), warriorNames);
        factionKeyNamePair.putIfAbsent(mages.getFaction(), mageNames);
        factionKeyNamePair.putIfAbsent(archers.getFaction(), archerNames);


    }

    //Method to display our characters from the ArrayList
    public void displayAllCharacters() {
        for (GameCharacter character : allCharacters) {
            character.displayInfo();
        }
    }

    //Method to search by function, and check if the function even is there
    public void searchByFunction() {
        if (factionKeyNamePair.containsKey("Warrior")) {
            factionKeyNamePair.get("Warrior");
        } else {
            System.out.println("There is no Warrior faction at this moment!");
        }
        if (factionKeyNamePair.containsKey("Mage")) {
            factionKeyNamePair.get("Mage");
        } else {
            System.out.println("There is no Mage faction at this moment!");
        }
        if (factionKeyNamePair.containsKey("Archer")) {
            factionKeyNamePair.get("Archer");
        } else {
            System.out.println("There is no Archer faction at this moment!");
        }

    }






}
