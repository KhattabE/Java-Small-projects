import exceptions.choiceErrorException;
import Exceptions.factionErrorException;
import exceptions.healthErrorException;
import exceptions.levelErrorException;

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

        //Method calling welcomeMenuChoice
        main.welcomeMenuChoice(scanner);
        //Method calling mainMenuInteraction
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

    }

    public void printMainMenuOptions(){
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



        int choice = 0;

        //Keeps looping the menu as long as the user does not choose option 5
        while (choice != 5) {

            //for the while loop of the exception handling
            boolean isValid = false;

            //Prints the main menu after done with one section of the menu
            printMainMenuOptions();

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

                        case 2 -> manager.displayAllCharacters();

                        case 3 ->  manager.searchByFunction();

                        //case 4 ->

                        case 5 -> System.exit(0);

                    }


                } catch (choiceErrorException cee) {
                    System.out.print(cee.getMessage());
                } catch (NumberFormatException nfe) {
                    System.out.print("ONLY INTS ARE ALLOWED!: ");
                }
            }

        }
    }


    //Method to add characters
    void addCharacter(Scanner scanner, CharacterManager manager) {

        System.out.println("Factions you can choose from: ");
        System.out.println("-------------------------------------------------------------");
        System.out.println("| Warrior");
        System.out.println("| Mage:");
        System.out.println("| Archer");
        System.out.println("-------------------------------------------------------------");
        System.out.print("Which faction character would you like to add?: ");

        //Default value so the variable can be used outside the try catch block
        String factionChoice = "";

        //Boolean that will be used for while loop to keep looping until user chooses the right choice
        boolean isFactionChoiceValid = false;

        while (!isFactionChoiceValid) {
            try {
                factionChoice = scanner.nextLine();
                System.out.println("-------------------------------------------------------------");

                factionErrorException.validatefactionChoice(factionChoice);

                isFactionChoiceValid = true;


            } catch (factionErrorException fee) {
                System.out.print(fee.getMessage());
            }
        }


        //If users faction choice is warrior, we wil execute this code
        if (factionChoice.equalsIgnoreCase("Warrior")) {

            //Method calling warriorAddInfo(), has the code for warrior information and adding
            warriorAddInfo(scanner, manager);

        } else if (factionChoice.equalsIgnoreCase("Mage")) {

            //Method calling mageAddInfo(), has the code for mage information and adding
            mageAddInfo(scanner, manager);


        } else if (factionChoice.equalsIgnoreCase("Archer")) {

            //Method calling archerAddInfo(), has the code for archer information and adding
            archerAddInfo(scanner, manager);

        }

    }


    //Method that includes the warrior add information
    public void warriorAddInfo(Scanner scanner, CharacterManager manager) {
        //Ask for warrior name
        System.out.print("Enter Warriors name: ");
        String warriorName = scanner.nextLine();

        while (warriorName.trim().isEmpty()) {
            System.out.print("You must enter a name!: ");
            warriorName = scanner.nextLine();
        }

        System.out.println(warriorName + " has been added!");


        //A default value for warriorLevel, so it can be used outside the try catch blocks
        int warriorLevel = 0;

        //boolean variable that will be used for the while loop, to keep lopping until the user inputs something right
        boolean isLevelValid = false;

        while (!isLevelValid) {
            try {

                //Ask for warrior Level
                System.out.print("Enter Warriors level: ");
                warriorLevel = Integer.parseInt(scanner.nextLine());

                //Calls the method from the custom exception class
                levelErrorException.levelValidator(warriorLevel);

                //If no exception is thrown, this means the input is valid, exist the loop
                isLevelValid = true;

            } catch (levelErrorException lee) {
                System.out.println(lee.getMessage());
            } catch (NumberFormatException nfe) {
                System.out.println("You Must Enter A Number!");
            }
        }

        System.out.println(warriorLevel + " has been added!");
        System.out.println("-------------------------------------------------------------");

        //Default health, so warriorHealth can be used outside the try catch block
        double warriorHealth = 0;

        //Boolean that will be used inside the while loop, to keep looping until the user enters something allowed
        boolean isHealthValid = false;

        while (!isHealthValid) {

            try {
                //Ask for warrior health
                System.out.print("Enter Warriors Health: ");
                warriorHealth = Double.parseDouble(scanner.nextLine());

                //
                healthErrorException.healthValidate(warriorHealth);

                //
                isHealthValid = true;

            } catch (healthErrorException hee) {
                System.out.print(hee.getMessage());
            } catch (NumberFormatException nfe) {
                System.out.println("Must be a number!");
            }

        }

        System.out.println(warriorHealth + " has been added!");
        System.out.println("-------------------------------------------------------------");


        //Ask for warrior Weapon Type
        System.out.print("Enter Warriors Weapon type: ");
        String warriorWeaponType = scanner.nextLine();

        //While loop to make sure the user enters something
        while (warriorWeaponType.trim().isEmpty()) {
            System.out.print("Enter something!: ");
            warriorWeaponType = scanner.nextLine();
        }
        System.out.println(warriorWeaponType + " has been added!");
        System.out.println("-------------------------------------------------------------");


        //Warrior object, with user input based fields
        Warrior warrior = new Warrior(warriorName, warriorLevel, warriorHealth, warriorWeaponType);
        //Adds warrior to the manager object
        manager.addCharacter(warrior);
    }


    //Method that have the mage info code
    public void mageAddInfo(Scanner scanner, CharacterManager manager) {
        System.out.println("-------------------------------------------------------------");
        //Ask for mage name
        System.out.print("Enter the Mage Name: ");
        String mageName = scanner.nextLine();

        //While loop to make sure the user inputs something
        while (mageName.trim().isEmpty()) {
            System.out.print("You must enter a name!: ");
            mageName = scanner.nextLine();
        }

        System.out.println(mageName + " Has been added!");
        System.out.println("-------------------------------------------------------------");


        //Default value, so the mageLevel variable can be used outside the try catch block
        int mageLevel = 0;

        //a boolean variable that will be used for the while loop
        boolean isMageLevelValid = false;

        //While loop that will keep looping, until the input is valid
        while (!isMageLevelValid) {
            //Try catch block to catch any exceptions that might be thrown
            try {
                //Ask for mage level
                System.out.print("Enter Mage Level: ");
                mageLevel = Integer.parseInt(scanner.nextLine());

                //Calling custom validation method
                levelErrorException.levelValidator(mageLevel);

                //If not exception happens or the user inputs correct, will turn true and exist the while loop
                isMageLevelValid = true;
            } catch (NumberFormatException nfe) {
                System.out.println("Must Enter A Number!");
            } catch (levelErrorException lee) {
                System.out.println(lee.getMessage());
            }
        }

        System.out.println(mageLevel + " has been added!");
        System.out.println("-------------------------------------------------------------");


        //Variable assignend default value, so it can be used outside the try catch block
        double mageHealth = 0;

        //Will be used for the while loop, loop
        boolean isMageHealthValid = false;

        while (!isMageHealthValid) {
            //Try catch block to catch exceptions if encountered
            try {
                //Ask for mage health
                System.out.print("Enter Mage Health");
                mageHealth = Double.parseDouble(scanner.nextLine());

                //Calling the cuestom exception method
                healthErrorException.healthValidate(mageHealth);

                //Exist the loop if user input is correct and no exception
                isMageHealthValid = true;


            } catch (NumberFormatException nfe) {
                System.out.println("Must enter a number!");
            } catch (healthErrorException hee) {
                System.out.println(hee.getMessage());
            }
        }

        System.out.println(mageHealth + " has been added!");
        System.out.println("-------------------------------------------------------------");


        //Ask for mage weapon type
        System.out.print("Enter Mage Weapon: ");
        String mageWeapon = scanner.nextLine();

        //While loop to make sure user inputs something
        while (mageWeapon.trim().isEmpty()) {
            System.out.print("You Must Enter A Weapon!");
            mageWeapon = scanner.nextLine();
        }

        //Creates mage object with user input fields
        Mage mage = new Mage(mageName, mageLevel, mageHealth, mageWeapon);
        //Adds mage to the manager object
        manager.addCharacter(mage);

    }


    //Method that contains the archer info
    public void archerAddInfo(Scanner scanner, CharacterManager manager) {

        //Ask for archer name
        System.out.print("Enter Archer name: ");
        String archerName = scanner.nextLine();

        //While loop to make sure the user inputs something
        while (archerName.trim().isEmpty()) {
            System.out.print("You must enter a name!: ");
            archerName = scanner.nextLine();
        }


        //Default value, so the archerLevel variable can be used outside the try catch block
        int archerLevel = 0;

        //a boolean variable that will be used for the while loop
        boolean isarcherLevelValid = false;

        //While loop that will keep looping, until the input is valid
        while (!isarcherLevelValid) {
            //Try catch block to catch any exceptions that might be thrown
            try {
                //Ask for archer level
                System.out.print("Enter Mage Level: ");
                archerLevel = Integer.parseInt(scanner.nextLine());

                //Calling custom validation method
                levelErrorException.levelValidator(archerLevel);

                //If not exception happens or the user inputs correct, will turn true and exist the while loop
                isarcherLevelValid = true;
            } catch (NumberFormatException nfe) {
                System.out.println("Must Enter A Number!");
            } catch (levelErrorException lee) {
                System.out.println(lee.getMessage());
            }
        }

        System.out.println(archerLevel + " has been added!");
        System.out.println("-------------------------------------------------------------");


        //Variable assignend default value, so it can be used outside the try catch block
        double archerHealth = 0;

        //Will be used for the while loop, loop
        boolean isArcherHealthValid = false;

        while (!isArcherHealthValid) {
            //Try catch block to catch exceptions if encountered
            try {
                //Ask for archer health
                System.out.print("Enter Mage Health: ");
                archerHealth = Double.parseDouble(scanner.nextLine());

                //Calling the cuestom exception method
                healthErrorException.healthValidate(archerHealth);

                //Exist the loop if user input is correct and no exception
                isArcherHealthValid = true;


            } catch (NumberFormatException nfe) {
                System.out.println("Must enter a number!");
            } catch (healthErrorException hee) {
                System.out.println(hee.getMessage());
            }
        }

        System.out.println(archerHealth + " has been added!");
        System.out.println("-------------------------------------------------------------");


        //Ask for archer weapon type
        System.out.print("Enter Archer Weapon: ");
        String archerWeapon = scanner.nextLine();

        //While loop to make sure user inputs something
        while (archerWeapon.trim().isEmpty()) {
            System.out.print("You Must Enter A Weapon!");
            archerWeapon = scanner.nextLine();
        }

        //Object that adds the user input as field value
        Archer archer = new Archer(archerName, archerLevel, archerHealth, archerWeapon);
        //Puts the archer with the user input fields into the manager object
        manager.addCharacter(archer);

    }















}