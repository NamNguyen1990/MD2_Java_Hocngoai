package QLSV2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuanLySinhVien {
    List<Sinhvien> sinhvienList = new ArrayList<>();

    void them (Sinhvien sinhvien) {
        sinhvienList.add(sinhvien);
    }

    // Cách 1: Xóa sinh viên theo vị trí
    void xoavitri (int sinhvien) {
        sinhvienList.remove(sinhvien);
    }
    // Cách 2: Xóa theo tên
    void xoaten (String ten) {
        int indexOf = timKiemten(ten);
        if (indexOf == -1) {
            System.out.println("Không có sinh viên này");
        }
        else {
            sinhvienList.remove(indexOf);
        }
    }
    // Cách 3: Xóa theo id
    void xoaid (int id) {
        int indexOf = timKiemID(id);
        if (indexOf == -1) {
            System.out.println("Không có sinh viên này");
        }
        else {
            sinhvienList.remove(indexOf);
        }
    }


    // Tìm kiếm Cách 1: Tìm kiếm theo tên
    public int timKiemten (String ten) {
        for (int i=0; i< sinhvienList.size(); i++) {
            if (sinhvienList.get(i).getTen().equals(ten)) {   // do tìm theo tên kiểu String nên phải dùng equals.
                return i;
            }
        }
        return -1;
    }
    // Cách 2: Tìm kiếm theo id
    public int timKiemID (int id) {
        for (int i=0; i< sinhvienList.size(); i++) {
          if (sinhvienList.get(i).getId() == id) {
              return i;
          }
        }
        return -1;
    }


    // Sửa: Cách 1 sửa theo tên
    public void suaten (String ten, Sinhvien sinhvien) {
        int indexOf = timKiemten(ten);
        if (indexOf == -1) {
            System.out.println("Không có sinh viên này");
        }
        else {
            sinhvienList.set(indexOf, sinhvien);
        }
    }

    // Sửa: Cách 2 sửa theo id
    public void suaid (int id, Sinhvien sinhvien) {
        int indexOf = timKiemID(id);
        if (indexOf == -1) {
            System.out.println("Không có sinh viên này");
        }
        else {
            sinhvienList.set(indexOf, sinhvien);
        }
    }


    void hienthi() {

        for (int i=0; i< sinhvienList.size(); i++) {
            System.out.println(sinhvienList.get(i));
        }
        System.out.println("-------------------------------");
    }

    void xapXeptuoi() {
        Collections.sort(this.sinhvienList);
    }
}
