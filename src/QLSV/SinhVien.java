package QLSV;

public class SinhVien extends Nguoi {
    private double diemSV;

    public SinhVien() {
    }

    public SinhVien(int maSV, String tenSV, int tuoiSV, int namSinh, double diemSV) {
        super(maSV, tenSV, tuoiSV, namSinh);
        this.diemSV = diemSV;
    }

    public double getDiemSV() {
        return diemSV;
    }

    public void setDiemSV(double diemSV) {
        this.diemSV = diemSV;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "Mã SV: " + getMaSV() +
                ", Tên SV: " + getTenSV() +
                ", Tuổi SV: " + getTuoiSV() +
                ", Năm sinh SV: " + getNamSinh() +
                ", Điểm SV = " + diemSV +
                '}';

    }
}
