import java.io.*;

public class Main {

    public static void main(String[] args){

        String[] notes = {
                "Hit the gym",
                "Finish the project",
                "Code",
                "Even more code" };

        String filePath = "C:\\Users\\Khatt\\Desktop\\FileHandlingProject\\data\\notes.txt";
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
            for(String n : notes){
                writer.write(n);
                writer.newLine();
            }

            writer.close();
        } catch (IOException ioe){
            System.out.println("The file was not writin");
        }


        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);

            }

            reader.close();
        } catch (IOException ioe){
            System.out.println("The file was not read");
        }







    }


}
