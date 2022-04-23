package QLSV;

import java.util.Scanner;

public class MainQLSV {
    public static void main(String[] args) {
        QuanLySinhVien quanLySinhVien = new QuanLySinhVien();
        int luaChon;
        Scanner sc = new Scanner(System.in);
        Scanner nhapChu = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("0 - Thoát khỏi chương trình");
        System.out.println("1 - Thêm 1 sinh viên");
        System.out.println("2 - Sửa sinh viên theo tên nhập vào");
        System.out.println("3 - Xóa sinh viên khỏi danh sách");
        System.out.println("4 - Tìm kiếm sinh viên trong danh sách");
        System.out.println("5 - Xắp xếp sinh viên có điểm từ cao xuống thấp");
        System.out.println("6 - Hiển thị danh sách sinh viên");
        do{
            System.out.println("Mời nhập lựa chọn");
            try {
                luaChon = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Chỉ được nhập số");
                sc.nextLine();
                luaChon = -1;
            }
            if (luaChon == 1) {
                System.out.println("Nhập mã sinh viên");
                int maSV = sc.nextInt();
                System.out.println("Nhập tên sinh viên");
                String tenSV = nhapChu.nextLine();
                System.out.println("Nhập tuổi sinh viên");
                int tuoiSV = sc.nextInt();
                System.out.println("Nhập năm sinh của sinh viên");
                int namSinhSV = sc.nextInt();
                System.out.println("Nhập điểm của sinh viên");
                int diemSV = sc.nextInt();

                SinhVien sinhVien = new SinhVien(maSV,tenSV,tuoiSV,namSinhSV,diemSV);
                quanLySinhVien.them(sinhVien);
            }
            else if (luaChon == 2) {

            }
            else if (luaChon == 3) {

            }
            else if (luaChon == 4) {
                System.out.println("Mời nhập tên SV cần tìm:");
                String ten;
                ten = nhapChu.nextLine();
                System.out.println(quanLySinhVien.timKiem(ten));

            }
            else if (luaChon == 5) {

            }
            else if (luaChon == 6) {
                quanLySinhVien.hienThi();
            }

        }while (luaChon!=0);
    }
}
