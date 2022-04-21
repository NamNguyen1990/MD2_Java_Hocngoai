package QuanLyCanbo;

public class Nhanvien extends Canbo{
    private String congViec;

    public Nhanvien() {
    }

    public Nhanvien(String ten, int tuoi, String gioiTinh, String diaChi, String congViec) {
        super(ten, tuoi, gioiTinh, diaChi);
        this.congViec = congViec;
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    @Override
    public String toString() {
        return "Nhanvien{" +
                "ten=" + getTen() +
                ", tuoi=" + getTuoi() +
                ", gioiTinh='" + getGioiTinh() + '\'' +
                ", diaChi='" + getDiaChi() + '\'' +
                "congViec='" + congViec + '\'' +
                '}';
    }
}
