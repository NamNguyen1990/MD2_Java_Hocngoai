package QuanLyKP;

import java.util.ArrayList;
import java.util.List;

public class HoGiaDinh {
    List<Nguoi> giaDinh = new ArrayList<>();
    private String diaChi;
    private int soThanhvien = 0;

    public HoGiaDinh() {
    }

    public HoGiaDinh(List<Nguoi> giaDinh, String diaChi, int soThanhvien) {
        this.giaDinh = giaDinh;
        this.diaChi = diaChi;
        this.soThanhvien = soThanhvien;
    }

    public List<Nguoi> getGiaDinh() {
        return giaDinh;
    }

    public void setGiaDinh(List<Nguoi> giaDinh) {
        this.giaDinh = giaDinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getSoThanhvien() {
        return soThanhvien;
    }

    public void setSoThanhvien(int soThanhvien) {
        this.soThanhvien = soThanhvien;
    }

    public void them(Nguoi nguoi) {
        giaDinh.add(nguoi);
        soThanhvien++;
    }

    public int timKiemten (String ten) {
        for (int i=0; i< giaDinh.size(); i++) {
            if (giaDinh.get(i).getTen().equals(ten)) {   // do tìm theo tên kiểu String nên phải dùng equals.
                return i;
            }
        }
        return -1;
    }

    public void timKiemten1 (String ten) {  // Tìm theo tên đúng thì hiển thị ra thông tin
        for (int i=0; i< giaDinh.size(); i++) {
            if (giaDinh.get(i).getTen().equals(ten)) {
                System.out.println(giaDinh.get(i));;
            }
        }
    }

    public void hienThi() {
        System.out.println("Danh sách hộ gia đình:");
        for (int i=0; i<giaDinh.size();i++) {
            System.out.println(giaDinh.get(i));
        }
        System.out.println("Địa chỉ: " + diaChi +"      " + "Số lượng thành viên: " + soThanhvien);
        System.out.println("------------------------------------------------------------");
    }

    public void suaten (String ten, Nguoi nguoi) {
        int indexOf = timKiemten(ten);
        if (indexOf == -1) {
            System.out.println("Không có thành viên này trong gia đình");
        }
        else {
            giaDinh.set(indexOf, nguoi);
        }
    }

    void xoaten (String ten) {
        int indexOf = timKiemten(ten);
        if (indexOf == -1) {
            System.out.println("Không có người này");
        }
        else {
            giaDinh.remove(indexOf);
        }
    }

}
