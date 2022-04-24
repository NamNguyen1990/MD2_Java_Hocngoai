package QuanLyTaiLieu;

import QLSV.QuanLy;

import java.util.ArrayList;
import java.util.List;

public class QLSach implements QuanLy<Sach> {

    List<Sach> sachList = new ArrayList<>();

    @Override
    public void them(Sach sach) {
        sachList.add(sach);
    }

    @Override
    public void sua(String ten, Sach sach) {

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
        for (int i = 0; i < sachList.size(); i++) {
            System.out.println(sachList.get(i));
            check = true;
        }
        if (check == false){
            System.out.println("Danh sách chưa có cuốn sách nào. Mời bạn nhập!");
        }
    }
}
