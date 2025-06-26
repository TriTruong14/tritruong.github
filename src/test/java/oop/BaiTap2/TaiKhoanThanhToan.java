package oop.BaiTap2;

public class TaiKhoanThanhToan extends TaiKhoan {

    public TaiKhoanThanhToan(String ChuTaiKhoan, String soTaiKhoan, double soDu) {
        super(ChuTaiKhoan, soTaiKhoan, soDu);
    }

    @Override
    public double tinhLai() {
        return 0;
    }
}
