public class Validator extends Exception{

    public static int validateStudentAge(int studentAge) throws IllegalArgumentException {
        if (studentAge < 16) {
            System.out.println("--------------------------------------------------------------------");
            throw new IllegalArgumentException("Age must be 16 or older.");
        }
        return studentAge;
    }
}
