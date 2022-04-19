package QuanLyKP;

import java.util.ArrayList;
import java.util.List;

public class KhuPho {
    List<HoGiaDinh> khuPho = new ArrayList<>();

    public KhuPho() {
    }

    public KhuPho(List<HoGiaDinh> khuPho) {
        this.khuPho = khuPho;
    }

    public List<HoGiaDinh> getKhuPho() {
        return khuPho;
    }

    public void setKhuPho(List<HoGiaDinh> khuPho) {
        this.khuPho = khuPho;
    }

    public void them(HoGiaDinh hoGiaDinh) {
        khuPho.add(hoGiaDinh);
    }

    public void hienThi() {
        System.out.println("Danh sách các hộ gia đình: ");
        for (int i=0; i<khuPho.size();i++) {
            System.out.println(khuPho.get(i).giaDinh);
        }
        System.out.println("------------------------------------------------------------");
    }
    // Hoặc dùng for ex       for (HoGiaDinh hoGiaDinh : khuPho) {
    //                             hoGiaDinh.hienThi();
    //                              }

    public int timKiemdiaChi (String diaChi) {
        for (int i=0; i< khuPho.size(); i++) {
            if (khuPho.get(i).getDiaChi().equals(diaChi)) {   // do tìm theo tên kiểu String nên phải dùng equals.
                return i;
            }
        }
        return -1;
    }


}

