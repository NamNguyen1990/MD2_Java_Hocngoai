package quanlytinh;

import java.io.IOException;
import java.util.Scanner;

public class MainManageProvince {
    public static void main(String[] args) throws IOException {
        ManageProvince manageProvince = new ManageProvince();
        Scanner sc = new Scanner(System.in);
        Scanner nhapChu = new Scanner(System.in);
        System.out.println("Nhập vào thông tin tỉnh");
        System.out.println("nhập vào: id");
        int id = sc.nextInt();
        System.out.println("nhập vào: tỉnh");
        String name = nhapChu.nextLine();
        System.out.println("nhập vào: dân số");
        int population = sc.nextInt();
        System.out.println("nhập vào: gdp");
        int gdp = sc.nextInt();
        Province province = new Province(id,name,population,gdp);
        manageProvince.add(province);
        GhiDocFile.writeToFile("KtraMD2.csv", ManageProvince.provinces);
        manageProvince.printAll();



    }
}
