package DNDK;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLyDKDN quanLyDKDN = new QuanLyDKDN();
        Scanner nhapChu = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        int luaChon1;
        System.out.println("=====Menu====");
        System.out.println("0 - Thoát khỏi chương trình");
        System.out.println("1 - Đăng ký tài khoản");
        System.out.println("2 - Đăng nhập tài khoản");
        System.out.println("3 - Sửa thông tin tài khoản");
        System.out.println("4 - Xem thông tin tài khoản");
        System.out.println("5 - Xem lại Menu");
        do {
            System.out.println("Mời bạn chọn chức năng");
            luaChon1 = sc.nextInt();

            if (luaChon1 == 1) {
                System.out.println("Nhập tên đăng ký");
                String tenDK = nhapChu.nextLine();
                System.out.println("Nhập mật khẩu đăng ký");
                String matkhauDK = nhapChu.nextLine();
                System.out.println("Bạn đã đăng ký thành công");

                DKDN dkdn = new DKDN(tenDK,matkhauDK);
                quanLyDKDN.them(dkdn);


            }
            else if (luaChon1 == 2) {
                System.out.println("Nhập tên đăng nhập");
                String tenDN = nhapChu.nextLine();
                System.out.println("Nhập mật khẩu đăng nhập");
                String matkhauDN = nhapChu.nextLine();
                quanLyDKDN.dangNhap(tenDN,matkhauDN);

            }
            else if (luaChon1 == 3) {
                System.out.println("Sửa tên đăng nhập thành");
                String tenDNS = nhapChu.nextLine();
                System.out.println("Sửa mật khẩu đăng nhập thành");
                String matkhauDNS = nhapChu.nextLine();
                System.out.println(quanLyDKDN.timKiemten(tenDNS,matkhauDNS));



            }
            else if (luaChon1 == 4) {
                quanLyDKDN.hienThi();

            }
            else if (luaChon1 == 5) {
                System.out.println("=====Menu====");
                System.out.println("0 - Thoát khỏi chương trình");
                System.out.println("1 - Đăng ký tài khoản");
                System.out.println("2 - Đăng nhập tài khoản");
                System.out.println("3 - Sửa thông tin tài khoản");
                System.out.println("4 - Xem thông tin tài khoản");
                System.out.println("5 - Xem lại Menu");
            }
        }
        while (luaChon1 != 0);

    }
}
