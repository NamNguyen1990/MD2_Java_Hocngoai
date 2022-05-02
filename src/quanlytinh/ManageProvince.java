package quanlytinh;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManageProvince {
    static List<Province> provinces = new ArrayList<>();

    public static List<Province> getProvinces() {
        return provinces;
    }

    public static void setProvinces(List<Province> provinces) {
        ManageProvince.provinces = provinces;
    }

    static  {

        try {
            ManageProvince.setProvinces(GhiDocFile.readFromFile("KtraMD2.csv", ManageProvince.provinces));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        provinces.add(new Province(1, "HN", 1000, 700));
//        provinces.add(new Province(2, "HCM", 1100, 1000));
//        provinces.add(new Province(3, "QN", 900, 700));
//        provinces.add(new Province(4, "HP", 800, 600));
//        provinces.add(new Province(5, "DN", 800, 500));
////        Scanner sc = new Scanner(System.in);
////        Scanner nhapChu = new Scanner(System.in);
////        System.out.println("Nhập vào thông tin tỉnh");
////        System.out.println("nhập vào: id");
////        int id = sc.nextInt();
////        System.out.println("nhập vào: tỉnh");
////        String name = nhapChu.nextLine();
////        System.out.println("nhập vào: dân số");
////        int population = sc.nextInt();
////        System.out.println("nhập vào: gdp");
////        int gdp = sc.nextInt();
////        provinces.add(new Province(id,name,population,gdp));


    }

    public void add(Province province) {
        provinces.add(province);
    }

    public int findIndexById(int id) {
        for (int i=0; i<provinces.size();i++) {
            if (provinces.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public void printAll() {
        for (Province p: provinces) {
            System.out.println(p);
        }
    }

}

