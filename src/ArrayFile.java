import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayFile {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("input1.txt");
//        inputFile.createNewFile();
        File outputFile = new File("output1.txt");
        outputFile.createNewFile();
        PrintWriter printWriter = new PrintWriter(outputFile);
        Scanner scanner = new Scanner(inputFile);
        List<Integer> integers = new ArrayList<>();
        while (scanner.hasNext()) {   // duyệt mảng có sẵn
            integers.add(scanner.nextInt());
        }
        System.out.println(integers);
        int sum = 0;
        int max = integers.get(0);
        for (int i : integers
        ) {
            sum += i;
            if (max < i) {
                max = i;
            }
        }

        if (integers.get(0) == 0) {
            if (integers.get(1) == 0) {
                System.out.println("PT vosono");
            }

        }
        printWriter.println(integers);
        printWriter.println("Tổng là: " + sum);
        printWriter.println("Max là: " + max);
        printWriter.close();
    }
}
