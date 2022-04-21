package QuanLyCanbo;

public class Congnhan extends Canbo{
    private int bac;

    public Congnhan() {
    }

    public Congnhan(String ten, int tuoi, String gioiTinh, String diaChi, int bac) {
        super(ten, tuoi, gioiTinh, diaChi);
        this.bac = bac;
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    @Override
    public String toString() {
        return "Congnhan{" +
                "ten=" + getTen()+
                ", tuoi=" + getTuoi() +
                ", gioiTinh='" + getGioiTinh() + '\'' +
                ", diaChi='" + getDiaChi() + '\'' +
                "bac=" + bac +
                '}';
    }
}
