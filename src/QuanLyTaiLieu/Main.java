package QuanLyTaiLieu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        QLTaiLieu qlTaiLieu = new QLTaiLieu();
//        qlTaiLieu.them(new TaiLieu("Hoa Phượng",1));
//        qlTaiLieu.hienThi();
//        QLSach qlSach = new QLSach();
//        qlSach.them(new Sach("Cây Khế",2,"Xuân Nam",150));
//        qlSach.hienThi();
//        QLTapChi qlTapChi = new QLTapChi();
//        qlTapChi.them(new TapChi("Hoa Phượng",2,10,7));
//        qlTapChi.hienThi();
//
//
//
        QLTaiLieu qlTaiLieu4 = new QLTaiLieu();  // Đây chính là upcasting gọi từ thằng cha xuống thằng con
        qlTaiLieu4.them(new Sach("Phương Nam",40,"Phương Nga",5));
        qlTaiLieu4.them(new TapChi("Hoa Sói",5,15,12));
        qlTaiLieu4.hienThi();

        Scanner sc = new Scanner(System.in);
        Scanner nhapChu = new Scanner(System.in);
        System.out.println("Nhập tên nhà xuất bản");
        String tenNXB = nhapChu.nextLine();
        System.out.println("Nhập số bản PH");
        int soBanPH = sc.nextInt();
        System.out.println("Nhập tên tác giả");
        String tenTG = nhapChu.nextLine();
        System.out.println("Nhập số trang");
        int soTrang = sc.nextInt();
        Sach sach = new Sach(tenNXB,soBanPH,tenTG,soTrang);
        qlTaiLieu4.them(sach);
        qlTaiLieu4.hienThi();

        System.out.println("Nhập tên nhà xuất bản");
        String tenNXB1 = nhapChu.nextLine();
        System.out.println("Nhập số bản PH");
        int soBanPH1 = sc.nextInt();
        System.out.println("Nhập số phát hành");
        int soPH = sc.nextInt();
        System.out.println("Nhập tháng phát hành");
        int thangPH = sc.nextInt();
        TapChi tapChi = new TapChi(tenNXB1,soBanPH1,soPH,thangPH);
        qlTaiLieu4.them(tapChi);
        qlTaiLieu4.hienThi();











//        QLTaiLieu qlTaiLieu1 = new QLTaiLieu();
//        qlTaiLieu1.them(new TaiLieu("Phương Đông",3));
//        qlTaiLieu1.hienThi();
//        QLSach qlSach1 = new QLSach();
//        qlSach1.them(new Sach("Đại Nam",2,"Hoài Linh",124));
//        qlSach1.hienThi();
//        QLTapChi qlTapChi1 = new QLTapChi();
//        qlTapChi1.them(new TapChi("Hoa Hòe",2,15,3));
//        qlTapChi1.hienThi();
//
//
//        QLTaiLieu qlTaiLieu2 = new QLTaiLieu();
//        qlTaiLieu2.them(new TaiLieu("Hoa Khế",6));
//        qlTaiLieu2.hienThi();
//        QLSach qlSach2 = new QLSach();
//        qlSach2.them(new Sach("Cây Khế",2,"Xuân Thu",100));
//        qlSach2.hienThi();
//        QLTapChi qlTapChi2 = new QLTapChi();
//        qlTapChi2.them(new TapChi("Đại Học Bách Khoa",2,40,12));
//        qlTapChi2.hienThi();
    }
}
