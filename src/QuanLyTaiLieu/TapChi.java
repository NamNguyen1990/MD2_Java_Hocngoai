package QuanLyTaiLieu;

public class TapChi extends TaiLieu{
    private int soPH;
    private int thangPH;

    public TapChi() {
    }

    public TapChi(String tenNXB, int soBanPH, int soPH, int thangPH) {
        super(tenNXB, soBanPH);
        this.soPH = soPH;
        this.thangPH = thangPH;
    }

    public int getSoPH() {
        return soPH;
    }

    public void setSoPH(int soPH) {
        this.soPH = soPH;
    }

    public int getThangPH() {
        return thangPH;
    }

    public void setThangPH(int thangPH) {
        this.thangPH = thangPH;
    }

    @Override
    public String toString() {
        return "TapChi{" +
                "maTaiLieu= " + getMaTaiLieu() +
                ", tenNXB= " + getTenNXB()  +
                ", soBanPH= " + getSoBanPH() +
                ", soPH= " + soPH +
                ", thangPH= " + thangPH +
                '}';
    }
}
