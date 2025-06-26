package oop.BaiTap2;

public abstract class TaiKhoan {
    private String chuTaiKhoan;
    private String soTaiKhoan;
    private double soDu;

    //Constructor
    public TaiKhoan(String ChuTaiKhoan, String soTaiKhoan, double soDu) {
        this.soTaiKhoan = soTaiKhoan;
        this.chuTaiKhoan = ChuTaiKhoan;
        this.soDu = soDu;
    }

    //phuong thuc
    public String getSoTaiKhoan () {
        return soTaiKhoan;
    }

    public String getChuTaiKhoan () {
        return chuTaiKhoan;
    }

    public double getSoDu() {
        return soDu;
    }

    public void guiTien(double soTien) {
        if (soTien > 0) {
            soDu += soTien;
        }
    }

    public void rutTien (double soTien) {
        if (soTien > 0 && soTien <= soDu) {
            soDu -= soTien;
        }
    }

    public abstract double tinhLai();

    public void hienThiThongTin() {
        System.out.println("Số Tài Khoản: " + soTaiKhoan);
        System.out.println("Chủ tài Khoản " + chuTaiKhoan);
        System.out.println("số dư: " + soDu);
        System.out.println("Số tiền lãi: " + tinhLai());
        System.out.println("------------------------------");
    }
}
