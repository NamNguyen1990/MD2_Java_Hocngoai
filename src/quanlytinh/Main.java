package quanlytinh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManagePerson managePerson = new ManagePerson();
        ManageProvince manageProvince = new ManageProvince();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào thông tin người dùng!");
        System.out.println("Nhập mã: ");
        int id = scanner.nextInt();
        System.out.println("Nhập tên:");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi");
        int age = scanner.nextInt();
        System.out.println("Chọn tỉnh: (nhập mã)");
        manageProvince.printAll();
        int idOfProvince = scanner.nextInt();
        managePerson.add(new Person(id, name, age, ManageProvince.provinces.get(manageProvince.findIndexById(idOfProvince))));
        managePerson.printAll();
    }
}
