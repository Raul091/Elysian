import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class deletePeople {
    public static String fileToString(String filePath) throws Exception{
        String input = null;
        Scanner sc = new Scanner(new File(filePath));
        StringBuffer sb = new StringBuffer();
        while (sc.hasNextLine()) {
            input = sc.nextLine();
            sb.append(input);
        }
        return sb.toString();
    }
    public static void main(String args[]) throws FileNotFoundException {
        String filePath = "users.txt";
        String result = fileToString(filePath);
        System.out.println("Contents of the file: "+result);
        result = result.replaceAll("\\bIon Popescu 3500RON  4000EUR\\b", "");
        PrintWriter writer = new PrintWriter(new File(filePath));
        writer.append(result);
        writer.flush();
        System.out.println("Contents of the file after replacing the desired word:");
        System.out.println(fileToString(filePath));
    }
}