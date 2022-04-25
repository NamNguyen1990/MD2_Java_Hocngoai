import java.io.IOException;

public class FileWriter {
    public static void main(String[] args) throws IOException {
        String str = "Hello" +
                " World";
        java.io.FileWriter fw = new java.io.FileWriter("output.txt");
        for (int i = 0; i < str.length(); i++)
            fw.write(str.charAt(i));
        System.out.println("Writing successful");
        fw.close();
    }
}
