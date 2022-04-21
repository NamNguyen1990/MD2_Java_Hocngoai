package QuanLyCanbo;

import java.util.ArrayList;
import java.util.List;

public class QuanLyCanbo implements qlCanbo<Canbo>{
    List<Canbo> canboList = new ArrayList<>();


    @Override
    public void them(Canbo canbo) {
        canboList.add(canbo);
    }

    @Override
    public int timKiem(String ten) {
        for (int i=0;i<canboList.size();i++) {
            if (canboList.get(i).getTen().equals(ten)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public void hienThi() {
        for (int i=0; i<canboList.size(); i++) {
            System.out.println(canboList.get(i));
        }
        System.out.println("-------------------------");
    }

    @Override
    public void thoat() {
        System.exit(0);
    }

}
