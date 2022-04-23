package DNDK;

public class Sinhvien implements Comparable<Sinhvien>{
    private int maSV;
    private String ten;
    private int tuoi;
    private int namSinh;
    private int diem;

    public Sinhvien() {
    }

    public Sinhvien(int maSV, String ten, int tuoi, int namSinh, int diem) {
        this.maSV = maSV;
        this.ten = ten;
        this.tuoi = tuoi;
        this.namSinh = namSinh;
        this.diem = diem;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return "Sinhvien{" +
                "Mã SV = " + maSV +
                ", Tên SV = " + ten +
                ", Tuổi SV = " + tuoi +
                ", Năm sinh SV = " + namSinh +
                ", Điểm SV = " + diem +
                '}';
    }

    @Override
    public int compareTo(Sinhvien o) {
        return o.getDiem() - this.getDiem();
    }

}
