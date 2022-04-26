import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadDataScanner {
    public static void main(String[] args) throws FileNotFoundException {
        java.io.File file = new java.io.File("text2.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();  // in ra lần lượt từng dòng 1
            System.out.println(line);
        }
    }
}
