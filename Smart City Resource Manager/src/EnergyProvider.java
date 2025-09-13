public class EnergyProvider extends CityEntity implements Payable{

    //Class fields
    private int powerOutput;
    private String region;
    private double baseRate;

    //Class constructor
    EnergyProvider(String name, String cityType, int powerOutput, String region, double baseRate){
        super(name, cityType);

        this.powerOutput = powerOutput;
        this.region = region;
        this.baseRate = baseRate;
    }

    //Getter for readablity
    public int getPowerOutput(){
        return this.powerOutput;
    }

    public String getRegion(){
        return this.region;
    }

    public double getBaseRate(){
        return this.baseRate;
    }


    //Setter for writablity
    public void setPowerOutput(int powerOutput){
        this.powerOutput = powerOutput;
    }

    public void setRegion(String region){
        this.region = region;
    }

    public void setBaseRate(double baseRate){
        this.baseRate = baseRate;
    }

    @Override
    public double calculateSalary(){
        return baseRate * 1.5;
    }

    @Override
    public void displayInfo(){
        System.out.println("----------------------------------------------------------------");
        System.out.println("Name: " + this.getName() +
                "\nCityType: " + this.getCityType() +
                "\nPower Output: " + this.powerOutput +
                "\nRegion: " + this.region +
                "\nbase rate: " + this.baseRate +
                "\nBase rate: " + String.format("%.3f", calculateSalary()));
        System.out.println("----------------------------------------------------------------");
    }







}
