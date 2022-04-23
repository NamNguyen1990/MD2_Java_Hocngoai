package DNDK;

import QLSVMangMenu.Sinhvien;

import java.util.ArrayList;
import java.util.List;

public class QuanLyDKDN {
    List<DKDN> dkdnList = new ArrayList<>();

    void them(DKDN dkdn) {
        dkdnList.add(dkdn);
    }
    void hienThi() {
        for (int i = 0; i < dkdnList.size(); i++) {
            System.out.println(dkdnList.get(i));
        }
    }

    public void dangNhap(String ten, String maukhau) {
        for (int i = 0; i < dkdnList.size(); i++) {
            if (dkdnList.get(i).getTen().equals(ten) && dkdnList.get(i).getMauKhau().equals(maukhau)) {
                System.out.println("Bạn đã đăng nhập thành công");
            }
            if (dkdnList.get(i).getTen().equals(ten) == false || dkdnList.get(i).getMauKhau().equals(maukhau) == false) {
                System.out.println("Không đúng tài khoản đăng nhập");
            }
        }
    }

    public int timKiemten(String ten, String matkhau) {
        for (int i = 0; i < dkdnList.size(); i++) {
            if (dkdnList.get(i).getTen().equals(ten) && dkdnList.get(i).getMauKhau().equals(matkhau)) {
                return i;
            }
        }
        return -1;
    }

    public void suaten(String ten, String matkhau, DKDN dkdn) {
        int indexOf = timKiemten(ten,matkhau);
        if (indexOf == -1) {
            System.out.println("Nhập sai tài khoản đăng ký cũ");
        } else {
            dkdnList.set(timKiemten(ten,matkhau), dkdn);
            System.out.println("Mật khẩu đã được đổi thành công");
        }
    }



}
