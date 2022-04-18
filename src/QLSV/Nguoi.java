package QLSV;

public class Nguoi {
    private int maSV;
    private String tenSV;
    private int tuoiSV;
    private int namSinh;

    public Nguoi() {
    }

    public Nguoi(int maSV, String tenSV, int tuoiSV, int namSinh) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.tuoiSV = tuoiSV;
        this.namSinh = namSinh;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public int getTuoiSV() {
        return tuoiSV;
    }

    public void setTuoiSV(int tuoiSV) {
        this.tuoiSV = tuoiSV;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }
}
