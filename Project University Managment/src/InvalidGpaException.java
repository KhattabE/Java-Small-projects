public class InvalidGpaException extends Exception {

    public InvalidGpaException(String message) {
        super(message);
    }

    public static double validateGPA(double studentGPA) throws InvalidGpaException {
        if (studentGPA < 1.0 || studentGPA > 4.0) {
            throw new InvalidGpaException("The GPA must be between 1.0 and 4.0!");
        }
        return studentGPA;
    }
}
