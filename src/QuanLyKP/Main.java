package QuanLyKP;

public class Main {
    public static void main(String[] args) {
        HoGiaDinh hoGiaDinh1 = new HoGiaDinh();

        hoGiaDinh1.them(new Nguoi("Nam",32,"Lập trình viên",12345));
        hoGiaDinh1.them(new Nguoi("Linh",23,"Giáo viên",54321));
        hoGiaDinh1.them(new Nguoi("Vy",1,"Còn nhỏ",0));
        hoGiaDinh1.setDiaChi("Vạn Phúc - Hà Đông");
        hoGiaDinh1.hienThi();

        HoGiaDinh hoGiaDinh2 = new HoGiaDinh();
        hoGiaDinh2.them(new Nguoi("Hoa",20,"Lập trình viên",45687));
        hoGiaDinh2.them(new Nguoi("Hùng",26,"Bác Sỹ",59874));
        hoGiaDinh2.them(new Nguoi("Sơn",29,"Shipper",78459));
        hoGiaDinh2.them(new Nguoi("Công",18,"Sinh viên",85641));
        hoGiaDinh2.setDiaChi("Đa Sỹ - Hà Đông");
        hoGiaDinh2.hienThi();

        System.out.println(hoGiaDinh1.timKiemten("Nam"));

        hoGiaDinh2.suaten("Công",new Nguoi("Công",25,"Nhân viên văn phòng",98715));
        hoGiaDinh2.suaten("Đại",new Nguoi("Công",27,"Nhân viên văn phòng",92215));  // Thử điền sai tên
        hoGiaDinh2.hienThi();

        hoGiaDinh2.xoaten("Hường");
        hoGiaDinh2.hienThi();

    }
}
