package QuanLyCanbo;

public class Main {
    public static void main(String[] args) {
        QuanLyCanbo quanLyCanbo = new QuanLyCanbo();
        System.out.println("Danh sách cán bộ");
        quanLyCanbo.them(new Canbo("Nam",32,"Nam","Vạn Phúc"));
        quanLyCanbo.them(new Canbo("Linh",23,"Nữ","Vạn Phúc"));
        quanLyCanbo.hienThi();

        System.out.println(quanLyCanbo.timKiem("Linh"));
        System.out.println(quanLyCanbo.timKiem("Hoàng"));

        quanLyCanbo.thoat();

    }
}
