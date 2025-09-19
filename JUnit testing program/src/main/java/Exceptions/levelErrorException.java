package Exceptions;

public class levelErrorException extends Exception{

    public levelErrorException(String message){
        super(message);
    }

    public static int levelValidator(int level) throws levelErrorException{
        if (level < 1 || level > 100) {
            throw new levelErrorException("Levels must be between 1-100!: ");
        }
        return level;
    }


}