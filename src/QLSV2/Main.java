package QLSV2;

public class Main {
    public static void main(String[] args) {
        QuanLySinhVien quanLySinhVien = new QuanLySinhVien();

        quanLySinhVien.them(new Sinhvien(10,"Nam",32)); // Thêm
        quanLySinhVien.them(new Sinhvien(15,"Linh",23));
        quanLySinhVien.them(new Sinhvien(16,"Vy",1));
        quanLySinhVien.them(new Sinhvien(15,"Hoàng",25));
        quanLySinhVien.them(new Sinhvien(35,"Tuấn",35));
        quanLySinhVien.hienthi();

        System.out.println(quanLySinhVien.timKiemten("Nam")); // tìm kiếm theo tên
        System.out.println(quanLySinhVien.timKiemID(15));  // tìm kiếm theo id

        quanLySinhVien.suaten("Vy",new Sinhvien(20,"Vy",6));  // sửa theo tên
        quanLySinhVien.hienthi();
        quanLySinhVien.suaid(10, new Sinhvien(15,"Nam",232));
        quanLySinhVien.hienthi();


        quanLySinhVien.xoavitri(1);  // xóa theo vị trí trong Arraylist
        quanLySinhVien.hienthi();
        quanLySinhVien.xoaten("Tuấn");
        quanLySinhVien.hienthi();
        quanLySinhVien.xoaid(15);
        quanLySinhVien.hienthi();


    }
}
