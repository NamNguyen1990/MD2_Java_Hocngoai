package docGhiFile;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class docGhi {
    public static void main(String[] args) throws IOException {
        // Tạo file mới (Chỉ tạo được duy nhất 1 lần file mới)
        File file = new File("Nam1.text");
        file.createNewFile();

        // đưa văn bản vào file Cách 1
        PrintWriter pw = new PrintWriter(file);
        pw.write("Nam dai ca");
        pw.write("Linh");
        pw.write("1234567");
        pw.close();

        // đưa văn bản vào file Cách 2 (thực ra là ko phải, thực chất đây là tạo ra file trc rồi nhập từ đó vào!
        Scanner scanner = new Scanner(file);
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        String s = scanner.nextLine();
        System.out.println(c + "" + d);

        // đọc ra từ file có sẵn (muốn đọc cái gì đó nhập từ màn vào coi màn là 1 file đọc từ file đó ra)
        Scanner sc = new Scanner(file);
        while (sc.hasNext()) {
            String a = sc.nextLine();
            System.out.println(a);
        }
        sc.close();

        //đọc từ 1 file bên ngoài!
        File file1 = new File("text20.txt");
        Scanner sc1 = new Scanner(file1);
        while (sc1.hasNextLine()) {
            String b = sc1.nextLine();
            System.out.println(b);
        }
        sc1.close();

    }
}
