public class InvalidStudentYearLevelException extends Exception{

    // Constructor with message
    public InvalidStudentYearLevelException(String message) {
        super(message);
    }


    public static int validateStudentYear(int studentYearLevel) throws InvalidStudentYearLevelException {
        if(studentYearLevel < 1 || studentYearLevel > 6){
            System.out.println("--------------------------------------------------------------------");
            throw new InvalidStudentYearLevelException("The choice must be between 1 and 6!");
        }
            return studentYearLevel;

    }


}
