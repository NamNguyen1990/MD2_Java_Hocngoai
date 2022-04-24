package QuanLyTaiLieu;

public class Sach extends TaiLieu{
    private String tenTG;
    public int soTrang;

    public Sach() {
    }

    public Sach(String tenNXB, int soBanPH, String tenTG, int soTrang) {
        super(tenNXB, soBanPH);
        this.tenTG = tenTG;
        this.soTrang = soTrang;
    }

    public String getTenTG() {
        return tenTG;
    }

    public void setTenTG(String tenTG) {
        this.tenTG = tenTG;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return "Sach{" +
                "maTaiLieu= " + getMaTaiLieu() +
                ", tenNXB= " + getTenNXB()  +
                ", soBanPH= " + getSoBanPH() +
                ", tenTG= " + tenTG +
                ", soTrang= " + soTrang +
                '}';
    }
}
