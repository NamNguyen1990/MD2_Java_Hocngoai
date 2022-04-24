package QuanLyTaiLieu;

import QLSV.QuanLy;

import java.util.ArrayList;
import java.util.List;

public class QLTapChi implements QuanLy<TapChi> {

    List<TapChi> tapChiList = new ArrayList<>();

    @Override
    public void them(TapChi tapChi) {
        tapChiList.add(tapChi);
    }

    @Override
    public void sua(String ten, TapChi tapChi) {

    }

    @Override
    public void xoa(String ten) {

    }

    @Override
    public int timKiem(String ten) {
        return 0;
    }

    @Override
    public void xapXep() {

    }

    @Override
    public void hienThi() {
        boolean check = false;
        for (int i=0; i<tapChiList.size(); i++) {
            System.out.println(tapChiList.get(i));
            check = true;
        }
        if (check == false) {
            System.out.println("Danh sách chưa có tạp chí nào. Mời bạn nhập!");
        }

    }
}
