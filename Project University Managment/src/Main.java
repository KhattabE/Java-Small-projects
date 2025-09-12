import java.util.ArrayList;

import java.util.Scanner;

public class Main {

    //ArrayList to store all people in one list
    ArrayList<Person> persons = new ArrayList<>();


    public static void main(String[] args) {


        //So we dont need to use static, and this will make the project more oop
        Main app = new Main();

        //Scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Method calling the main Menu app
        app.mainMenu(scanner);


    }

    //Method that contains the options user can choose (Displaying them only, the interactive happens in the Add Student method
    public void mainMenuOptions() {
        //Option menu
        System.out.println("--------------------------------------------------------------------");
        System.out.println("You got the following options: ");
        System.out.println("1: Add student");
        System.out.println("2: Add Teacher");
        System.out.println("3: Add Admin Staff");
        System.out.println("4: Display All People");
        System.out.println("5: Exit");
        System.out.print("Enter your choice: ");
    }


    //Method where you interact with the menu and choose which option you want
    public void mainMenu(Scanner scanner) {

        System.out.println("--------------------------------------------------------------------");
        //Welcomes message
        System.out.println("Welcome to the University Management App!");
        System.out.println("--------------------------------------------------------------------");


        //Asks for the user to enter their name, so they can enter
        System.out.print("Enter your name to get access: ");
        String userName = scanner.nextLine();

        //To make sure user don't enter empty space
        while (userName.trim().isEmpty()) {
            System.out.print("You Must Enter A name!: ");
            userName = scanner.nextLine();
        }

        //Prints out a welcome message to the user when they log in
        System.out.println("Welcome " + userName + "!");
        System.out.println("--------------------------------------------------------------------");

        //Sats the optionChoice to 0, so optionChoice can be used inside the while loop, that loops the main menu, as long as the user does not exit(Choose option 5)
        int optionChoice = 0;

        //The while loop that keeps looping as long as optionChoice does not equal 5
        while (optionChoice != 5) {

            //A try block to catch any exceptions that may occur
            try {

                //Method calling mainMenuOptions(), contains the method options
                mainMenuOptions();

                //OptionChoice user input, here the user will choose an option,
                // Integer.parseInt, better than scanner.nextInt() because it can catch NumberFormatException (If someone enters a string instead of an int)
                optionChoice = Integer.parseInt(scanner.nextLine());

                //This calls the static method validateMainMenuInput() from the custom exception class InvalidMenuInputException
                InvalidMenuInputException.validateMainMenuInput(optionChoice);
                System.out.println("--------------------------------------------------------------------");

                //A switch case to choose the right one based on the user input
                switch (optionChoice) {

                    case 1 -> addStudent(scanner); //Method calls AddStudent()

                    case 2 -> addTeacher(scanner); //Method call addTeacher()
                }

                //Catch blocks to catch the exception if they occur, and then print out a message
            } catch (NumberFormatException nfe) {
                System.out.println("--------------------------------------------------------------------");
                System.out.println("Invalid input. Please enter a NUMBER.");
            } catch (InvalidMenuInputException ime) {
                System.out.println(ime.getMessage());
            }
        }
    }






    //Method to add students
    public void addStudent(Scanner scanner) {
        System.out.println("--------------------------------------------------------------------");


        //Asks the user to enter the student name
        System.out.print("Enter Student name: ");
        String studentName = scanner.nextLine();

        //A while loop to make sure the user enters something
        while (studentName.trim().isEmpty()) {
            System.out.print("You must enter a name!: ");
            studentName = scanner.nextLine();
        }

        //Prints a message when a student has been successfully added
        System.out.println(studentName + " has been added!");
        System.out.println("--------------------------------------------------------------------");



        //A boolean variable so I can make my while loop
        boolean isValid = false;

        int studentAge = 0;

        //While loop to be able to keep looping and asking the user to try again, if the user enters wrong or encounters and exception error
        while (!isValid) {

            //Try block to catch any exceptions that may occur
            try {
                //Asks the user to enter the student age
                System.out.print("Enter student age(16+): ");
                //Integer.parseInt, better than scanner.nextInt() because it can catch NumberFormatException (If someone enters a string instead of an int)
                studentAge = Integer.parseInt(scanner.nextLine());

                //
                Validator.validateStudentAge(studentAge);

                isValid = true;

                //Prints a message when a student age has been successfully added
                System.out.println(studentAge + " has been added!");
                System.out.println("--------------------------------------------------------------------");

            } catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage());
            }
        }



        //Asks user to enter student major
        System.out.print("Enter students major: ");
        String studentMajor = scanner.nextLine();

        //While loop to make sure the user enter something valid
        while (studentMajor.trim().isEmpty()) {
            System.out.print("You must enter a major: ");
            studentMajor = scanner.nextLine();
        }

        //Prints a message when a major has been successfully added
        System.out.println(studentMajor + " has been added");
        System.out.println("--------------------------------------------------------------------");



        //Boolean to use in a while loop
        boolean isYearValid = false;

        int studentYearLevel = 0;

        //While the boolean is false, it will keeep lopping
        while (!isYearValid) {

            try {
                //Asks user to enter the students year level
                System.out.print("Enter student year level(1-6): ");
                studentYearLevel = Integer.parseInt(scanner.nextLine());

                //This calls the static method from the custom exception class
                InvalidStudentYearLevelException.validateStudentYear(studentYearLevel);

                isYearValid = true;

            } catch (InvalidStudentYearLevelException isyle) {
                System.out.println(isyle.getMessage());
            } catch (NumberFormatException nfe){
                System.out.println("--------------------------------------------------------------------");
                System.out.println("Please enter a valid number!");
                System.out.println("--------------------------------------------------------------------");
            }

        }

        //Boolean to use inside the while loop
        boolean isGPAValid = false;

        double studentGPA = 0.0;

        //Keeps looping as long as the boolean is false
        while (!isGPAValid) {

            try {
                //asks user to enter student gpa
                System.out.print("Enter student gpa(1.0-4.0): ");
                studentGPA = Double.parseDouble(scanner.nextLine());

                InvalidGpaException.validateGPA(studentGPA);

                isGPAValid = true;

            } catch (InvalidGpaException ige) {
                System.out.println(ige.getMessage());
            } catch (NumberFormatException nfe){
                System.out.println("You must enter a decimal number!");
            }
        }

        //Instancing the Student object
        Student students = new Student(studentName, studentAge, studentMajor, studentYearLevel, studentGPA );
        //Add the object to the arraylist with its information
        persons.add(students);


    }



    public void addTeacher(Scanner scanner){

        //Asks for teacher name
        System.out.print("Enter teacher name: ");
        String teacherName = scanner.nextLine();

        while (teacherName.trim().isEmpty()){
            System.out.print("Enter valid name: ");
            teacherName = scanner.nextLine();
        }


        int teacherAge = 0;

        //For the while loop
        boolean teacherAgeValid = false;

        //While loop to keep looping until valid input
        while (!teacherAgeValid) {
            try {
                //Asks for teacher age
                System.out.print("Enter teacher age: ");
                teacherAge = Integer.parseInt(scanner.nextLine());

                InvalidTeacherAgeException.validateTeacherAge(teacherAge);

                teacherAgeValid = true;

            } catch (NumberFormatException nfe) {
                System.out.println("Must be an integer!");
            } catch (InvalidTeacherAgeException itae) {
                System.out.println(itae.getMessage());
            }

        }

        //Asks for teacher department
        System.out.print("Enter teachers department: ");
        String teacherDepartment = scanner.nextLine();

        //While loop to make sure that the user inputs something
        while (teacherDepartment.trim().isEmpty()){
            System.out.print("You must enter a department!: " );
            teacherDepartment = scanner.nextLine();
        }
































    }


}