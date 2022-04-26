import java.io.*;
import java.io.FileWriter;

public class BufferWriter {
    public static void main(String[] args) throws IOException {
        String txt = "Hello Word";
        try {
            FileWriter fw = new FileWriter("data.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(txt);
            bw.close();
            fw.close();

        }catch (Exception e) {
        }

        FileReader fr = new FileReader("text2.txt");
        BufferedReader br = new BufferedReader(fr);
        String s = "";
        while (true) {
            s = br.readLine();
            if (s == null) {
                break;
            }
            System.out.println(s);
        }
        br.close();
        fr.close();
    }
}
