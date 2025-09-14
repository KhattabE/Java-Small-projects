public class Person implements Roles{

    //Class fields
    private String name;
    private int id;


    //Class constructor
    Person(String name, int id){
        this.name = name;
        this.id = id;
    }

    //Getter methods for readability
    public String getName(){
        return this.name;
    }


    public int getId(){
        return this.id;
    }


    public void setName(String name){
        this.name = name;
    }

    public void setId(int id){
        this.id = id;
    }

    //Method to display the person information
    public void displayPersonInfo(){
        System.out.println("Person name: " + this.name +
                "\nPersons ID: " + this.id);
    }

    //Overrides the method from the interface Roles class
    @Override
    public String getRole(){
        return "Borrower";
    }




}
