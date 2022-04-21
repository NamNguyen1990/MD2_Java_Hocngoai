package QuanLyCanbo;

import java.util.ArrayList;
import java.util.List;

public class QLCongnhan implements qlCanbo<Congnhan>{
    List<Congnhan> congnhanList = new ArrayList<>();

    @Override
    public void them(Congnhan congnhan) {
        congnhanList.add(congnhan);

    }

    @Override
    public int timKiem(String ten) {
//        for (int i=0;i<canboList.size();i++) {
//            if (canboList.get(i).getTen().equals(ten)){
//                return i;
//            }
//        }
        return -1;
    }

    @Override
    public void hienThi() {

    }

    @Override
    public void thoat() {

    }
}
