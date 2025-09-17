import java.util.Scanner;

public class Main {

    //--------------------------------------------TEMP Character Objects---------------------------------------
    Warrior defaultWarrior = new Warrior("Temp", 1, 100, "Sword");
    Mage defaultMage = new Mage("Temp", 1, 100, "Staff");
    Archer defaultArcher = new Archer("Temp", 1, 100, "Bow");

    CharacterManager manager = new CharacterManager(defaultWarrior, defaultMage, defaultArcher);
    //--------------------------------------------TEMP Character Objects---------------------------------------



    public static void main(String[] args) {


        //To make the code more oop
        Main main = new Main();

        //Scanner for userinput
        Scanner scanner = new Scanner(System.in);






        main.welcomeMenuChoice(scanner);
        main.mainMenuInteraction(scanner);


    }


    void welcomeMenuChoice(Scanner scanner) {

        System.out.println("-------------------------------------------------------------");
        System.out.println("Welcome to the Game Character Management System!");
        System.out.println("-------------------------------------------------------------");

        //Asks the user for their username to access
        System.out.print("Enter your name to continue: ");
        String userName = scanner.nextLine();
        System.out.println("-------------------------------------------------------------");
        //while loop to make sure the user does not enter am empty name
        while (userName.trim().isEmpty()) {
            System.out.print("You must enter a name!: ");
            userName = scanner.nextLine();
        }

        System.out.println("Welcome " + userName + "!");
        System.out.println("-------------------------------------------------------------");


        //shows the option the user got
        System.out.println("You got the following options you can choose");
        System.out.println("1: Add Character");
        System.out.println("2: Display All Characters");
        System.out.println("3: Search by Faction");
        System.out.println("4: Play character");
        System.out.println("5: Exist");
        System.out.print("Enter your choice!: ");
    }


    void mainMenuInteraction(Scanner scanner) {

        boolean isValid = false;

        int choice = 0;

        while (!isValid) {
            try {

                //User enters choice here
                choice = Integer.parseInt(scanner.nextLine());
                System.out.println("-------------------------------------------------------------");

                //Calls the method from the custom exception class
                choiceErrorException.choiceValidater(choice);

                isValid = true;

                switch (choice) {
                    case 1 -> addCharacter(scanner, manager);

                    //case 2 ->
                }


            } catch (choiceErrorException cee) {
                System.out.print(cee.getMessage());
            } catch (NumberFormatException nfe) {
                System.out.print("ONLY INTS ARE ALLOWED!: ");
            }
        }

    }


    void addCharacter (Scanner scanner, CharacterManager manager){

        System.out.println("Factions you can choose from: ");
        System.out.println("Warrior:");
        System.out.println("Mage:");
        System.out.println("Archer");
        System.out.print("Which faction character would you like to add?: ");
        String factionChoice = scanner.nextLine();

        if(factionChoice.equalsIgnoreCase("Warrior")){

            //Ask for warrior name
            System.out.print("Enter Warriors name: ");
            String warriorName = scanner.nextLine();



            //Ask for warrior Level
            System.out.print("Enter Warriors level: ");
            int warriorLevel = Integer.parseInt(scanner.nextLine());


            //Ask for warrior health
            System.out.print("Enter Warriors Health: ");
            double warriorHealth = Double.parseDouble(scanner.nextLine());


            //Ask for warrior Weapon Type
            System.out.print("Enter Warriors Weapon type: ");
            String warriorWeaponType = scanner.nextLine();

            Warrior warrior = new Warrior(warriorName, warriorLevel, warriorHealth, warriorWeaponType);
            manager.addCharacter(warrior);


        } else if(factionChoice.equalsIgnoreCase("Mage")){

            //Ask for mage name


            //Ask for mage level


            //Ask for mage health


            //Ask for mage weapon type

        } else if (factionChoice.equalsIgnoreCase("Archer")) {

            //Ask for archer name


            //Ask for archer level


            //Ask for archer health


            //Ask for archer weapon type

        }

    }





}