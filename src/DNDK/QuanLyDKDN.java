package DNDK;

import java.util.ArrayList;
import java.util.List;

public class QuanLyDKDN {
    List<DKDN> dkdnList = new ArrayList<>();
    int count = 0;

    void them(DKDN dkdn) {
        dkdnList.add(dkdn);
        count++;
    }
    void hienThi() {
        boolean check = false;
        for (int i = 0; i < dkdnList.size(); i++) {
            System.out.println(dkdnList.get(i));
            check = true;
        }
        if (check == false) {
            System.out.println("Chưa có tài khoản đăng ký");
        }
    }

    public void dangNhap(String ten, String maukhau) {
        if (count == 0) {
            System.out.println("Bạn chưa đăng ký tài khoản, xin mời đăng ký trước tài khoản!");
        }
        else {
            for (int i = 0; i < dkdnList.size(); i++) {
                if (dkdnList.get(i).getTen().equals(ten) && dkdnList.get(i).getMauKhau().equals(maukhau)) {
                    System.out.println("Bạn đã đăng nhập thành công");
                }
                if (dkdnList.get(i).getTen().equals(ten) == false || dkdnList.get(i).getMauKhau().equals(maukhau) == false) {
                    System.out.println("Không đúng tài khoản đăng nhập");
                }
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
        if (count == 0) {
            System.out.println("Bạn chưa đăng ký tài khoản, xin mời đăng ký trước tài khoản!");
        }
        else {
            int indexOf = timKiemten(ten,matkhau);
            if (indexOf == -1) {
                System.out.println("Nhập sai tài khoản đăng ký cũ, mời nhập lại!");
            } else {
                dkdnList.set(timKiemten(ten,matkhau), dkdn);
                System.out.println("Mật khẩu đã được đổi thành công");
            }
        }
    }
}
