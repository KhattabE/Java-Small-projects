public abstract class CityEntity {

    //Abstract class cityentity fields
    private String name;
    private String cityType;

    //Class Constructor
    CityEntity(String name, String cityType){
        this.name = name;
        this.cityType = cityType;
    }


    //Getter method to make the fields readable
    public String getName(){
        return this.name;
    }

   public String getCityType(){
        return this.cityType;
    }


    //Setters to make the class writable
    public void setName(String name){
        this.name = name;
    }

    public void setCityType(String cityType){
        this.cityType = cityType;
    }


    //DisplayInfo method
    public void displayInfo(){
        System.out.println("----------------------------------------------------------------");
        System.out.println("Name: " + this.name +
                "\nCityType: " + this.cityType);
    }




}
