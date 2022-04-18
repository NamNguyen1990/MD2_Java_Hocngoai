package quanly;

public class SinhVien {
    private int id;
    private String ten;
    private int tuoi;

    public SinhVien() {
    }

    public SinhVien(int id, String ten, int tuoi) {
        this.id = id;
        this.ten = ten;
        this.tuoi = tuoi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
