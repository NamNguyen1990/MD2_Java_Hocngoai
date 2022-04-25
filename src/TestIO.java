import java.io.File;
import java.io.IOException;

public class TestIO {
    public static void main(String[] args) throws IOException {
        File file = new File("text5.txt");
        if (file.isFile()) {
            file.delete();
            System.out.println("Đây là File Text" + file.getAbsolutePath());
        }
        else {
            System.out.println("Đây không không phải là File");
            file.createNewFile();
        }
    }
}
