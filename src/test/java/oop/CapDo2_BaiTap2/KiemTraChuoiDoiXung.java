package oop.CapDo2_BaiTap2;

import java.util.Scanner;

public class KiemTraChuoiDoiXung {
    public static boolean isChuoiDoiXung (String input) {
        String cleanText = input.toLowerCase().replaceAll("[^a-z0-9]", "");
        int length = cleanText.length();
        int indexTrai = 0;
        int indexPhai = length - 1;

        while (indexTrai < indexPhai) {
            if (cleanText.charAt(indexTrai) != cleanText.charAt(indexPhai)) {
                return false; // Ký tự không khớp, không phải palindrome
            }
            indexTrai++;  // Di chuyển từ đầu vào trong
            indexPhai--; // Di chuyển từ cuối vào trong
        }
        return true; // Tất cả ký tự đều khớp
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào một từ để kiểm tra tính đối xứng: ");
        String input = scanner.nextLine();

        String result = String.valueOf(isChuoiDoiXung(input));

        System.out.println("Từ vừa nhập có phải là Palindrome? " + result);
    }
}
