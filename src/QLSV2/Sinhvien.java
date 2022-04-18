package QLSV2;

public class Sinhvien implements Comparable<Sinhvien> {
    private int id;
    private String ten;
    private int tuoi;

    public Sinhvien() {
    }

    public Sinhvien(int id, String ten, int tuoi) {
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

    @Override
    public String toString() {
        return "Sinhvien{" +
                "id = " + id +
                ", ten = " + ten +
                ", tuoi = " + tuoi +
                '}';
    }

    @Override
    public int compareTo(Sinhvien o) {
        return this.getTuoi() - o.getTuoi();
    }
}
