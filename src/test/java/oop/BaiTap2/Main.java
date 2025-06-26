package oop.BaiTap2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số lượng tài khoản");
        int n = scanner.nextInt();

        TaiKhoan[] danhSachTaiKhoan = new TaiKhoan[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Tài khoản thứ " + (i + 1));
            System.out.println("Loại tài khoản: 1-Tiết kiệm, 2-thanh toán");
            int loai = scanner.nextInt();
            scanner.nextLine();

            System.out.println("số tài khoản");
            String soTK = scanner.nextLine();

            System.out.println("Chủ tài khoản ");
            String chuTK = scanner.nextLine();

            System.out.println("số dư ");
            double soDu = scanner.nextDouble();

            if(loai == 1) {
                System.out.println("lãi suất (%)");
                double ls = scanner.nextDouble() / 100;

                danhSachTaiKhoan[i] = new TaiKhoanTietKiem(soTK, chuTK, soDu, ls);
            } else {
                danhSachTaiKhoan[i] = new TaiKhoanThanhToan(soTK, chuTK, soDu);
            }
        }

        System.out.println("Thông tin tài khoản");
        for(TaiKhoan tk : danhSachTaiKhoan) {
            tk.hienThiThongTin();
        }
    }
}
