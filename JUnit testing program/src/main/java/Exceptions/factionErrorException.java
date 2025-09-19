package Exceptions;

public class factionErrorException extends Exception{

    public factionErrorException(String message){
        super(message);
    }


    public static String validatefactionChoice(String factionChoice) throws factionErrorException{
        if(!factionChoice.equalsIgnoreCase("Warrior") && (!factionChoice.equalsIgnoreCase("Mage")
                && (!factionChoice.equalsIgnoreCase("Archer")))){
            throw new factionErrorException("Must Choose one of the following (Warrior, Mage, Archer)!: ");
        }
        return factionChoice;
    }



}