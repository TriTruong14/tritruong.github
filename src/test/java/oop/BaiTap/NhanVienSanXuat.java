package oop.BaiTap;

public class NhanVienSanXuat extends NhanVien {

        //Constructor
        public NhanVienSanXuat (String name, int id, double soGioLamViec) {
            super(name, id, soGioLamViec);
        }

        @Override
        public double tinhTongLuong() {
            return getSoGioLamViec () * 2000;
        }
    }

