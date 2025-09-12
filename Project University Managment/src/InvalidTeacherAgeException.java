public class InvalidTeacherAgeException extends Exception{

    public InvalidTeacherAgeException(String message){
        super(message);
    }


    public static int validateTeacherAge(int teacherAge) throws InvalidTeacherAgeException{
        if(teacherAge < 18){
            throw new InvalidTeacherAgeException("Teacher can only be 18+!");
        }

        return teacherAge;
    }


}
