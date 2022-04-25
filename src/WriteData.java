import java.io.FileNotFoundException;
import java.io.IOException;

public class WriteData {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        java.io.File file = new java.io.File("text10.txt");  // tạo file mới vào truyền Hello vào
        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(0);
        }
        java.io.PrintWriter output = new java.io.PrintWriter(file);
        output.print("Hello");
        output.close();
    }
}