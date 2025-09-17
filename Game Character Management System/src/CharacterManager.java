import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CharacterManager {

    //Array list that will hold all our characters
    public ArrayList<GameCharacter> allCharacters = new ArrayList<>();

    //A hashSet that will hold unique names
    HashSet<String> warriorNames = new HashSet<>();
    HashSet<String> mageNames = new HashSet<>();
    HashSet<String> archerNames = new HashSet<>();

    //HashMap with key-pair values
    HashMap<String, HashSet<String>> factionKeyNamePair = new HashMap<>();

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
    public void addCharacter(GameCharacter character) {
        //Add the characters to the ArrayList
        allCharacters.add(character);

        // Check character type and handle accordingly
        if (character instanceof Warrior) {
            warriorNames.add(character.getName());
            factionKeyNamePair.putIfAbsent(character.getFaction(), warriorNames);
        } else if (character instanceof Mage) {
            mageNames.add(character.getName());
            factionKeyNamePair.putIfAbsent(character.getFaction(), mageNames);
        } else if (character instanceof Archer) {
            archerNames.add(character.getName());
            factionKeyNamePair.putIfAbsent(character.getFaction(), archerNames);
        }

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
