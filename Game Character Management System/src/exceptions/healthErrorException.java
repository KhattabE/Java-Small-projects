package exceptions;

public class healthErrorException extends RuntimeException {
    public healthErrorException(String message) {
      super(message);
    }

    public static double healthValidate(double health) throws  healthErrorException{
      if(health < 1 || health > 100){
        throw new healthErrorException("Health can Only Be between 1-100!: ");
      }
      return health;
    }


}
