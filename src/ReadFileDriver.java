import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by cohenr on 6/14/17.
 */
public class ReadFileDriver {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner reader = new Scanner(new File("files/","data.txt"));
        String name = reader.nextLine();
        System.out.println("Hello " + name);
    }
}
