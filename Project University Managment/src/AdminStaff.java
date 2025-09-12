public class AdminStaff extends Employee implements Payable {

    //Class fields
    private String role;
    private boolean isOnContract;


    //Class constructor
    AdminStaff(String name, int age, String department, double baseSalary, String role, boolean isOnContract) {
        //Calls on the super class constructors, constructor details from the parent class (Employee class, which is inherited from a "Grandparent class") so multilevel-inheritence
        super(name, age, department, baseSalary);

        this.role = role;
        this.isOnContract = isOnContract;

    }


    //Getter method to make the fields readable
    public String getRole() {
        return this.role;
    }

    public boolean getIsOnContract() {
        return this.isOnContract;
    }


    //Setter method to make the fields writable
    public void setRole(String role) {
        this.role = role;
    }

    public void setOnContract(boolean isOnContract) {
        this.isOnContract = isOnContract;
    }

    //Overrides and implements the interface classes method
    @Override
    public double calculateSalary() {

        if (isOnContract) {
            return getBaseSalary() * 0.8;
        } else {
            return getBaseSalary() * 1.1;
        }

    }


    //Overrides the displayInfo method from the parent class
    public void displayInfo(){
        System.out.println("Person name: " + this.getName() +
                "\nPerson age: " + this.getAge() +
                "\nPerson department: " + this.getDepartment() +
                "\nThe base salary: " + this.getBaseSalary() +
                "\nAdmin role: " + this.role  +
                "\nAdmin on contract?: " + isOnContract);


    }



}
