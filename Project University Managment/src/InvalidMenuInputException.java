public class InvalidMenuInputException extends Exception {

    public InvalidMenuInputException(String message) {
        super(message);
    }

    public static void validateMainMenuInput(int optionChoice) throws InvalidMenuInputException {
        if (optionChoice < 1 || optionChoice > 5) {
            System.out.println("--------------------------------------------------------------------");
            throw new InvalidMenuInputException("Your choice must be between 1 and 5!");
        }
    }
}
