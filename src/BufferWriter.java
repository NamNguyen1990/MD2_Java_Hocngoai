import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

public class BufferWriter {
    public static void main(String[] args) {
        String tx = "Hello Word";
        FileInputStream fileInputStream = null;
        BufferedInputStream bufferedInputStream = null;
        try {
            fileInputStream = new FileInputStream("text5.text");
            bufferedInputStream = new BufferedInputStream(fileInputStream);




        }catch (Exception e) {

        } finally {

        }

    }
}
