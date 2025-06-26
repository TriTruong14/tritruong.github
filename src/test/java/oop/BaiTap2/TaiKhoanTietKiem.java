package oop.BaiTap2;

public class TaiKhoanTietKiem extends TaiKhoan {

    private double laiSuat;

    //constuctor
        public TaiKhoanTietKiem(String ChuTaiKhoan, String soTaiKhoan, double soDu, double laiSuat){
            super(soTaiKhoan, ChuTaiKhoan, soDu);
            this.laiSuat = laiSuat;
        }

    @Override
    public double tinhLai() {
        return getSoDu() * laiSuat;
    }
}
