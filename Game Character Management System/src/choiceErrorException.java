public class choiceErrorException extends Exception{


    public choiceErrorException(String message) {
        super(message);
    }

    public static int choiceValidater(int choice) throws choiceErrorException{
        if(choice < 1 || choice > 5){
            throw new choiceErrorException("CHOICE MUST BE BETWEEN 1-5: ");
        }
        return  choice;
    }
    
    
}
