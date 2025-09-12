public class InvalidTeacherBaseSalaryException extends Exception{

    public InvalidTeacherBaseSalaryException (String message){
        super(message);
    }


    public static double validateTeacherBaseSalary(double teacherBaseSalary) throws InvalidTeacherBaseSalaryException {
        if (teacherBaseSalary < 0) {
            throw new InvalidTeacherBaseSalaryException("The base salary can not be negative!");
        }
        return teacherBaseSalary;
    }






}
