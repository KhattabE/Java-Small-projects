public class Customer {

    //Class fields
    private String name;
    private String customerEmail;
    private String memberShipID;


    //Class constructor
    Customer(String name, String customerEmail, String memberShipID){
        this.name = name;
        this.customerEmail = customerEmail;
        this.memberShipID = memberShipID;
    }

    //Getters method to make the fields readable
    public String getName(){
        return this.name;
    }

    public String getCustomerEmail(){
        return this.customerEmail;
    }

    public String getMemberShipID(){
        return this.memberShipID;
    }


    //Setter methods to make the fields writable
    public void setName(String name){
        this.name = name;
    }

    public void setCustomerEmail(String customerEmail){
        this.customerEmail = customerEmail;
    }

    public void setMemberShipID(String memberShipID){
        this.memberShipID = memberShipID;
    }


    //DisplayCustomerInfo method for internal use if needed
    public void displayCustomerInfo(){
        System.out.println("Customer name: " + this.name +
                "\nCustomer Email: " + this.customerEmail +
                "\nCustomer MemberShip ID: " + this.memberShipID +
                "\nCustomers Role: " + getRole());
    }

    //Implements the method from Roles class
    public String getRole(){
        return "Customer";
    }



}
