package QLSVMangMenu;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        QLSV qlsv = new QLSV();
        Scanner sc = new Scanner(System.in);
        Scanner nhapChu = new Scanner(System.in);
        int luaChon;
        System.out.println("=====Menu====");
        System.out.println("0 - Thoát khỏi chương trình");
        System.out.println("1 - Thêm 1 sinh viên");
        System.out.println("2 - Hiển thị số lượng sinh viên");
        System.out.println("3 - Sửa sinh viên theo tên nhập vào");
        System.out.println("4 - Xóa sinh viên khỏi danh sách");
        System.out.println("5 - Tìm kiếm sinh viên theo tên trong danh sách");
        System.out.println("6 - Tìm kiếm sinh viên theo mã sinh viên trong danh sách");
        System.out.println("7 - Xắp xếp sinh viên có điểm từ cao xuống thấp");
        System.out.println("8 - Hiển thị danh sách sinh viên");
        System.out.println("9 - Xem lại Menu");
        do {
            System.out.println("Mời bạn chọn chức năng");
            System.out.println("Note: Nhấn 9 để xem lại Menu");

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

                Sinhvien sinhvien = new Sinhvien(maSV,tenSV,tuoiSV,namSinhSV,diemSV);
                qlsv.them(sinhvien);

            }
            else if (luaChon == 2) {
                System.out.println("Số lượng sinh viên hiện tại là:");
                System.out.println(qlsv.slSV());
            }
            else if (luaChon == 3) {
                System.out.println("Mời nhập tên sinh viên muốn sửa");
                String tenSVS = nhapChu.nextLine();
                System.out.println("Nhập mã mới của sinh viên");
                int maSVM = sc.nextInt();
                System.out.println("Nhập tên mới cho sinh viên");
                String tenSVM = nhapChu.nextLine();
                System.out.println("Nhập tuổi mới cho sinh viên");
                int tuoiSVM = sc.nextInt();
                System.out.println("Nhập năm sinh mới cho sinh viên");
                int namSinhSVM = sc.nextInt();
                System.out.println("Nhập điểm mới cho sinh viên");
                int diemSVM = sc.nextInt();
                Sinhvien sinhvien1 = new Sinhvien(maSVM,tenSVM,tuoiSVM,namSinhSVM,diemSVM);
                qlsv.suaten(tenSVS,sinhvien1);
//                qlsv.xoaten(tenSVS);
//                qlsv.them(sinhvien1);
//                qlsv.hienThi();
//              System.out.println(qlsv.timKiemten1(tenSVS));

            }
            else if (luaChon == 4) {
                System.out.println("Mời nhập tên sinh viên muốn xóa");
                String tenSVX = nhapChu.nextLine();
                qlsv.xoaten(tenSVX);
                System.out.println("Sinh viên trên đã bị xóa khỏi danh sách");

            }
            else if (luaChon == 5) {
                System.out.println("Mời nhập tên SV cần tìm:");
                String ten;
                ten = nhapChu.nextLine();
                qlsv.timKiemten(ten);
//              System.out.println(qlsv.timKiemten1(ten));

            }
            else if (luaChon == 6) {
                System.out.println("Mời nhập mã SV cần tìm: ");
                int maSV;
                maSV = sc.nextInt();
                qlsv.timKiemmaSV(maSV);
            }
            else if (luaChon == 7) {
                qlsv.xapXepdiem();
                qlsv.hienThi();

            }
            else if (luaChon == 8) {
                System.out.println("Danh sách sinh viên:");
                qlsv.hienThi();
            }
            else if (luaChon == 9) {
                System.out.println("Menu");
                System.out.println("0 - Thoát khỏi chương trình");
                System.out.println("1 - Thêm 1 sinh viên");
                System.out.println("2 - Hiển thị số lượng sinh viên");
                System.out.println("3 - Sửa sinh viên theo tên nhập vào");
                System.out.println("4 - Xóa sinh viên khỏi danh sách");
                System.out.println("5 - Tìm kiếm sinh viên theo tên trong danh sách");
                System.out.println("6 - Tìm kiếm sinh viên theo mã sinh viên trong danh sách");
                System.out.println("7 - Xắp xếp sinh viên có điểm từ cao xuống thấp");
                System.out.println("8 - Hiển thị danh sách sinh viên");
            }

        } while (luaChon != 0);

    }
}
