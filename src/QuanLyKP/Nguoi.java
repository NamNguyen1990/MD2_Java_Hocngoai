package QuanLyKP;

public class Nguoi {
    private String ten;
    private int tuoi;
    private String nghe;
    private int cmnd;

    public Nguoi() {
    }

    public Nguoi(String ten, int tuoi, String nghe, int cmnd) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.nghe = nghe;
        this.cmnd = cmnd;
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

    public String getNghe() {
        return nghe;
    }

    public void setNghe(String nghe) {
        this.nghe = nghe;
    }

    public int getCmnd() {
        return cmnd;
    }

    public void setCmnd(int cmnd) {
        this.cmnd = cmnd;
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "Tên: " + ten +
                ", Tuổi = " + tuoi +
                ", Nghề Nghiệp: " + nghe +
                ", Số CMND: " + cmnd +
                '}';
    }
}
