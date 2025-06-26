package oop.BaiTap4;

import java.util.Scanner;

public class DemTuTrongChuoi {
    public static int wordCount(String input) {
        String [] words = input.trim().split("\\s+");

        if (input.trim().isEmpty()) {
            return 0;
        }

        return words.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap chuoi can dem: ");
        String input = scanner.nextLine();

        int wordCount = wordCount(input);

        System.out.println("So tu trong chuoi la: " + wordCount);
    }
}
