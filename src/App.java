/**
 * Created by LordwolF on 8/9/2016.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws FileNotFoundException {
        // String fileName = "C:\\Users\\LordwolF\\Desktop\\example.txt"; //note double backslashes
        String fileName = "example.txt";
        File textFile = new File(fileName);

        Scanner in = new Scanner(textFile);

        int value = in.nextInt();
        System.out.println("Read Lines: " + value);

        while (in.hasNextLine()) {
            String line = in.nextLine();

            System.out.println(line);
        }

        in.close();
    }
}
