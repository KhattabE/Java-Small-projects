public abstract class Person extends CityEntity {

    //Person class fields
    private int age;


    //Person class constructor
    Person(String name, String cityType, int age){
        //Super keyword to get the superclass constructor
        super(name, cityType);

        this.age = age;

    }

    //Getter to make field readable
    public int getAge(){
        return this.age;
    }

    //Setter to make the field writable
    public void setAge(int age){
        this.age = age;
    }


    public abstract String getRole();


    @Override
    //DisplayInfo method from supper class
    public void displayInfo(){
        System.out.println("----------------------------------------------------------------");
        System.out.println("Name: " + this.getName() +
                "\nCityType: " + this.getCityType() +
                "\nAge: " + this.age);
    }




}
