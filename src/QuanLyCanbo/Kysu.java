package QuanLyCanbo;

public class Kysu extends Canbo{
    private String nganh;

    public Kysu() {
    }

    public Kysu(String ten, int tuoi, String gioiTinh, String diaChi, String nganh) {
        super(ten, tuoi, gioiTinh, diaChi);
        this.nganh = nganh;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    @Override
    public String toString() {
        return "Kysu{" +
                "ten=" + getTen() +
                ", tuoi=" + getTuoi() +
                ", gioiTinh='" + getGioiTinh() + '\'' +
                ", diaChi='" + getDiaChi() + '\'' +
                "nganh='" + nganh + '\'' +
                '}';
    }
}
