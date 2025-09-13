public class Citizen extends Person{

    //Citizen class fields
    private String occupation;
    private boolean isEmployed;


    //Citized class constructor
    Citizen(String name, String cityType, int age, String occupationm, boolean isEmployed){
        //Super keyword to get all the constructors from the multi inheritance
        super(name, cityType, age);

        this.occupation = occupationm;
        this.isEmployed = isEmployed;

    }

    //Getter method for readablity
    public String getOccupation(){
        return this.occupation;
    }

    public boolean getIsEmployed(){
        return this.isEmployed;
    }

    //setter method to make fields writable
    public void setOccupation(String occupation){
        this.occupation = occupation;
    }

    public void setEmployed(boolean isEmployed){
        this.isEmployed = isEmployed;
    }


    //Overrides getRole method
    @Override
    public String getRole(){
        System.out.println("----------------------------------------------------------------");
        return getName() + " is a Citizen";
    }

    //Overrides displayInfo()
    @Override
    public void displayInfo(){
        System.out.println("----------------------------------------------------------------");
        System.out.println("Name: " + this.getName() +
                "\nCityType: " + this.getCityType() +
                "\nAge: " + this.getAge() +
                "\nCitizen Occupation: " + this.occupation +
                "\nIs employed?: " + this.isEmployed +
                "\n" + getRole());
    }







}
