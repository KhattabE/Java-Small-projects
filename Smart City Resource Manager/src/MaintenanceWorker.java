public class MaintenanceWorker extends GovermentEmployee implements MaintainsInfrastructure{

    //class fields
    private String assignedZone;


    //Class constructor
    MaintenanceWorker(String name, String cityType, int age, String department, double baseSalary, String assignedZone){
        //All the inherited class constructores
        super(name, cityType, age, department, baseSalary);

        this.assignedZone = assignedZone;

    }


    //getter for readable
    public String getAssignedZone(){
        return this.assignedZone;
    }

    //setter for writable
    public void setAssignedZone(String assignedZone){
        this.assignedZone = assignedZone;
    }


    @Override
    public void performMaintenance(){
        System.out.println("Worker is currently performing maintenance!");
    }


    @Override
    public String getRole(){
        return getName() + " is a Maintenance Worker";
    }

    @Override
    public void displayInfo(){
        System.out.println("----------------------------------------------------------------");
        System.out.println("Name: " + this.getName() +
                "\nCityType: " + this.getCityType() +
                "\nAge: " + this.getAge() +
                "\nDepartment: " + this.getDepartment() +
                "\nBase Salary: " + this.getBaseSalary() +
                "\nAssigned Zone: " + this.assignedZone +
                "\n" + getRole());
    }






}
