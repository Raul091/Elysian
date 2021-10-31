 import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors

    public class addPeople {
        public static void main(String[] args) {
            try {
                File myObj = new File("users.txt");
                if (myObj.createNewFile()) {
                    System.out.println("File created: " + myObj.getName());
                } else {
                    System.out.println("File already exists.");
                }
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }

            try {
                FileWriter myWriter = new FileWriter("users.txt");
                myWriter.write("Ion Popescu 3500RON  4000EUR");
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    }

