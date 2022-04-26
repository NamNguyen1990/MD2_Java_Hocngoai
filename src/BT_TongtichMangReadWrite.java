import java.io.*;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BT_TongtichMangReadWrite {
    public static void main(String[] args) throws IOException {
        List<Integer> numbers = new ArrayList<>();
        FileReader fr = new FileReader("text10.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = "";

        Scanner sc = new Scanner(fr);
        String [] arr = sc.nextLine().split(" ");
        double sum = 0;
        double tich = 1;
        double max = Double.parseDouble(arr[0]);
        double min = Double.parseDouble(arr[0]);



//        while (true) {
//            line = br.readLine();
//            if (line == null) {
//                break;
//            }
//            System.out.println(line);
//        sum += Integer.parseInt(line);
//        tich = tich*Integer.parseInt(line);

        for (int i = 0; i < arr.length; i++) {
            sum += Double.parseDouble(arr[i]);
            tich *= Double.parseDouble(arr[i]);
            if (max<Double.parseDouble(arr[i])) {
                max = Double.parseDouble(arr[i]);
            }
            if (min>Double.parseDouble(arr[i])) {
                min = Double.parseDouble(arr[i]);
            }

        }
        br.close();
        fr.close();
        System.out.println("Tổng = " + sum);
        System.out.println("Tich = " + tich);
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);

        PrintWriter printWriter = new PrintWriter("ghikq.txt");
        printWriter.println(sum);
        printWriter.println(tich);
        printWriter.println(max);
        printWriter.println(min);
        printWriter.close();

        }

    }


