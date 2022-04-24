package QuanLyTaiLieu;

import QLSV.QuanLy;

import java.util.ArrayList;
import java.util.List;

public class QLTaiLieu implements QuanLy<TaiLieu> {

    List<TaiLieu> taiLieuList = new ArrayList<>();

    public QLTaiLieu() {
        taiLieuList.add(new Sach("Nam Hà",99,"Linh",199));  // Đây chính là upcasting gọi từ thằng cha xuống thằng con.
        taiLieuList.add(new TapChi("Hòa Bình",22,31,8));
    }

    @Override
    public void them(TaiLieu taiLieu) {
        taiLieuList.add(taiLieu);
    }

    @Override
    public void sua(String ten, TaiLieu taiLieu) {

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
        for (int i = 0; i < taiLieuList.size(); i++) {
            System.out.println(taiLieuList.get(i));
            check = true;
        }
        if (check == false){
            System.out.println("Danh sách chưa có tạp chí nào. Mời bạn nhập!");
        }

    }
}
