package oop.BaiTap;

public abstract class NhanVien {

    private String name;
    private int id;
    private double soGioLamViec;

    //Constructor
    public NhanVien(String name, int id, double soGioLamViec) {
        this.name = name;
        this.id = id;
        this.soGioLamViec = soGioLamViec;
    }

    //phuong thuc
    public String getName () {
        return name;
    }

    public int getid() {
        return id;
    }

    public double getSoGioLamViec() {
        return soGioLamViec;
    }

    public abstract double tinhTongLuong();

    public void inThongTin() {
        System.out.println("Nhân Viên: " + name + "; id:" + id + "; Tổng Lương" + tinhTongLuong());
    }
    }
