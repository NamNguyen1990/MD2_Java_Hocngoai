package QLSVMangMenu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QLSV {
    List<Sinhvien> sinhvienList = new ArrayList<>();
    void them (Sinhvien sinhvien) {
        sinhvienList.add(sinhvien);

    }
   public int slSV () {
        return sinhvienList.size();
    }
    void suaten (String ten, Sinhvien sinhvien) {
        int indexOf = timKiemten1(ten);
        if (indexOf == -1) {
            System.out.println("Không có sinh viên này");
        }
        else {
            sinhvienList.set(indexOf,sinhvien);
        }
    }

    void xoaten (String ten) {
        int indexOf = timKiemten1(ten);
        if (indexOf == -1) {
            System.out.println("Không có sinh viên này");
        }
        else {
            sinhvienList.remove(indexOf);
        }
    }

    public void timKiemten (String ten) {
        for (int i=0;i<sinhvienList.size();i++) {
            if (sinhvienList.get(i).getTen().equals(ten)) {
                System.out.println(sinhvienList.get(i));
            }
            if (sinhvienList.get(i).getTen().equals(ten) == false) {
                System.out.println("Không có sinh viên có tên như trên");
            }
        }
    }

    public int timKiemten1 (String ten) {
        for (int i=0;i<sinhvienList.size();i++) {
            if (sinhvienList.get(i).getTen().equals(ten)) {
                return i;
            }
        }
        return -1;
    }

    public void timKiemmaSV(int maSV) {
        for (int i=0;i<sinhvienList.size();i++) {
            if (sinhvienList.get(i).getMaSV() == maSV) {
                System.out.println(sinhvienList.get(i));
            }
            if (sinhvienList.get(i).getMaSV() != maSV) {
                System.out.println("Không có mã SV nào như trên");
            }
        }
    }

    void hienThi () {
        for (int i=0;i<sinhvienList.size();i++) {
            System.out.println(sinhvienList.get(i));
        }
    }

    void xapXepdiem() {
        Collections.sort(this.sinhvienList);
    }

}
