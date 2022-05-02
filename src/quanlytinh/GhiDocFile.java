package quanlytinh;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

public class GhiDocFile {
    public static void writeToFile (String path, List<Province> provinces) throws IOException {
        File file = new File(path);
        PrintWriter pw = new PrintWriter(file);
        String str = "id, tỉnh, dân số, gdp"  +"\n";
        for (Province i: provinces) {
            str += i.getId() + "," + i.getName() + "," + i.getPopulation() + "," + i.getGdp()+"\n";
        }
        pw.write(str);
        pw.close();
    }
    public static List<Province> readFromFile (String path, List<Province> provinces) throws IOException {
        File file = new File(path);
        Scanner sc = new Scanner(file);
        sc.nextLine();
        while (sc.hasNext()) {
            String a = sc.nextLine();
            String[] value = a.split(",");
            provinces.add(new Province(Integer.parseInt(value[0]), value[1], Integer.parseInt(value[2]), Integer.parseInt(value[3])));
            System.out.println(a);
        }
        sc.close();
        return provinces;
    }

}
