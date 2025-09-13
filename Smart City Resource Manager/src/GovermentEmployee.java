public class GovermentEmployee extends Person implements Payable{

    //Class fields
    private String department;
    private double baseSalary;


    //Class constructor
    GovermentEmployee(String name, String cityType, int age, String department, double baseSalary){
       //Supper keyword to get the superclasses constructors
        super(name, cityType, age);

        this.department = department;
        this.baseSalary = baseSalary;

    }

    //Getters to make readable
    public String getDepartment(){
        return this.department;
    }

    public double getBaseSalary(){
        return this.baseSalary;
    }

    //Setter to make writable
    public void setDepartment(String department){
        this.department = department;
    }

    public void setBaseSalary(double baseSalary){
        this.baseSalary = baseSalary;
    }

    //Overrides getRole() from Person class
    @Override
    public String getRole(){
        return getName() + " is a Goverment Employee";
    }

    //Overrides payable calculateSalary()
    @Override
    public double calculateSalary(){
        return baseSalary * 1.1;
    }

    //Overrides displayInfo from cityEntity and person
    @Override
    public void displayInfo(){
        System.out.println("----------------------------------------------------------------");
        System.out.println("Name: " + this.getName() +
                "\nCityType: " + this.getCityType() +
                "\nAge: " + this.getAge() +
                "\nDepartment: " + this.department +
                "\nBase Salary: " + this.baseSalary +
                "\n" + getRole() +
                "\nSalary: " + String.format("%.3f", calculateSalary()));
    }





}
