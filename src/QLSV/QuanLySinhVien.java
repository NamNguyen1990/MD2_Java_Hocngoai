package QLSV;

public class QuanLySinhVien implements QuanLy<SinhVien>{
    private SinhVien[] danhSach = new SinhVien[5];
    private int size = 0;

    @Override
    public void them(SinhVien sinhVien) {
        danhSach[size] = sinhVien;
        size++;
    }

    @Override
    public void sua(String ten, SinhVien sinhVien) {
        for (int i=0;i<size;i++) {
            if (danhSach[i].getTenSV() == ten) {
                danhSach[i].setMaSV(sinhVien.getMaSV());
                danhSach[i].setTenSV(sinhVien.getTenSV());
                danhSach[i].setTuoiSV(sinhVien.getTuoiSV());
                danhSach[i].setNamSinh(sinhVien.getNamSinh());
                danhSach[i].setDiemSV(sinhVien.getDiemSV());

            }
        }

    }

    @Override
    public void xoa(String ten) {

    }

    @Override
    public int timKiem(String ten) {
        for (int i=0;i<size;i++) {
            if (danhSach[i].getTenSV().equals(ten)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void xapXep() {

    }

    @Override
    public void hienThi() {
        for (int i=0;i<size;i++) {
            System.out.println(danhSach[i]);
        }
        System.out.println("-----------------------------");
    }
}
