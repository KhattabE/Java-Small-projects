import java.util.ArrayList;

public class Main {

    public static void main(String[] args){


        //ArrayList
        ArrayList<CityEntity> cityInformations = new ArrayList<>();

        //Instantiating the objects
        Citizen citizen1 = new Citizen("Marius", "Resident", 27,   "Jobless", false);
        GovermentEmployee govermentEmployee1 = new GovermentEmployee("Pete", "Government", 45, "Counter cyber attack",48.750);
         MaintenanceWorker maintenanceWorker1 = new MaintenanceWorker("Chris", "Utility", 22, "Electric outlook",33.535, "Zone A");
        EnergyProvider energyProvider1 = new EnergyProvider("Mustafa", "India Complex City", 36, "India zone Z", 76.545);

        //Added all the objects that i instantiated into the same arrayList
        cityInformations.add(citizen1);
        cityInformations.add(govermentEmployee1);
        cityInformations.add(maintenanceWorker1);
        cityInformations.add(energyProvider1);

        //Enhanced for loop, to display all the information from displayInfo() method
        for(CityEntity c: cityInformations) {
            c.displayInfo();

        }


















    }


}
