package oop.BaiTap3;

import java.util.Scanner;

public class TongDuong {
    public static int tongSoChan (int n) {
        if (n < 0) {
            System.out.println("Lỗi: Số n phải là một số nguyên dương.");
            return -1; // Hoặc ném một ngoại lệ IllegalArgumentException
        }

        int tong = 0;

        for (int i = 0; i <= n; i += 2) {
            tong += i;
        }
        return tong;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số n ");
        int n = scanner.nextInt();

        int result = tongSoChan(n);

        System.out.println("Tổng số chẵn: " + result);
    }
}
