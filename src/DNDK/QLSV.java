package DNDK;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QLSV {
    List<Sinhvien> sinhvienList = new ArrayList<>();

    void them(Sinhvien sinhvien) {
        sinhvienList.add(sinhvien);

    }

    public int slSV() {
        return sinhvienList.size();
    }

    public void suaten(String ten, Sinhvien sinhvien) {
        int indexOf = timKiemten1(ten);
        if (indexOf == -1) {
            System.out.println("Không có sinh viên này");
        } else {
            sinhvienList.set(indexOf, sinhvien);
        }
    }

    void xoaten(String ten) {
        int indexOf = timKiemten1(ten);
        if (indexOf == -1) {
            System.out.println("Không có sinh viên này");
        } else {
            sinhvienList.remove(indexOf);
            System.out.println("Sinh viên trên đã bị xóa khỏi danh sách");
        }
    }

    public void timKiemten(String ten) {
        boolean check = false;
        for (int i = 0; i < sinhvienList.size(); i++) {
            if (sinhvienList.get(i).getTen().equals(ten)) {
                System.out.println(sinhvienList.get(i));  // đây trả về thông tin của sinh viên (tùy thuộc vào yêu cầu là gì)
                check = true;
            }
        }
        if (check == false) {
            System.out.println("Không có tên sinh viên nào như trên");
        }
    }

    public int timKiemten1(String ten) {
        for (int i = 0; i < sinhvienList.size(); i++) {
            if (sinhvienList.get(i).getTen().equals(ten)) {
                return i;  // đây trả về vị trí của sinh viên trong danh sách.
            }
        }
        return -1;
    }

    public void timKiemmaSV(int maSV) {
        boolean check = false;
        for (int i = 0; i < sinhvienList.size(); i++) {
            if (sinhvienList.get(i).getMaSV() == maSV) {
                System.out.println(sinhvienList.get(i));
                check = true;
            }
//            if (sinhvienList.get(i).getMaSV() != maSV) {
//                System.out.println("Không có mã SV nào như trên");
//            }
        }
        if (check == false) {
            System.out.println("Không có mã sinh viên nào như trên");
        }
    }

    void hienThi() {
        boolean check = false;
        for (int i = 0; i < sinhvienList.size(); i++) {
            System.out.println(sinhvienList.get(i));
            check = true;
        }
        if (check == false){
            System.out.println("Danh sách chưa có sinh viên nào. Mời bạn nhập!");
        }
    }

    void xapXepdiem() {
        Collections.sort(this.sinhvienList);
    }
}
