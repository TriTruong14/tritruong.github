package AutoTest;

public class Object {

    public static void main (String[]args) {
        SinhVien sv = new SinhVien();
        sv.hoTen = "Trí";
        sv.tuoi = 29;
        sv.sdt = "0905123456";

        sv.hienThiThongTinSinhVien();
    }
}
