import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        int ch;
        FileReader fr = new FileReader("text2.txt");
        while ((ch=fr.read())!=-1)
            System.out.print((char)ch);
        fr.close();
    }
}
