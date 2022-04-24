package QuanLyTaiLieu;

public class TaiLieu {
    private static int automaTaiLieu = 0;
    private int maTaiLieu;
    private String tenNXB;
    private int soBanPH;

    public TaiLieu() {
    }

    public TaiLieu(String tenNXB, int soBanPH) {
        this.maTaiLieu = automaTaiLieu;
        automaTaiLieu++;
        this.tenNXB = tenNXB;
        this.soBanPH = soBanPH;
    }

    public int getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(int maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public String getTenNXB() {
        return tenNXB;
    }

    public void setTenNXB(String tenNXB) {
        this.tenNXB = tenNXB;
    }

    public int getSoBanPH() {
        return soBanPH;
    }

    public void setSoBanPH(int soBanPH) {
        this.soBanPH = soBanPH;
    }

    @Override
    public String toString() {
        return "TaiLieu{" +
                "maTaiLieu=" + maTaiLieu +
                ", tenNXB= " + tenNXB  +
                ", soBanPH= " + soBanPH +
                '}';
    }


}
