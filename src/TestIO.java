import java.io.File;
import java.io.IOException;

public class TestIO {
    public static void main(String[] args) throws IOException {
        File file = new File("text1.txt");
        if (file.exists()) {
            System.out.println("Đã tồn tại File" + file.getAbsolutePath());
//            file.delete();
            System.exit(0);
        }
        else {
            System.out.println("Chưa tồn tại File");
            file.createNewFile();
        }
        java.io.PrintWriter output = new java.io.PrintWriter(file);  // Chỉ ghi khi file chưa tồn tại


        output.print("Hello");
        output.close();

    }
}
