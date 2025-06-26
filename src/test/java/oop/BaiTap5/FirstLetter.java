package oop.BaiTap5;

import java.util.Scanner;

public class FirstLetter {
    public static String getFirstLetter(String input) {
        String[] words = input.trim().split("\\s+");
        if (input.trim().isEmpty()) {
            return ""; //trả về chuỗi rỗng nếu ko có nội dung
        }
        String result = "";

        for (String word:words) //duyệt từng từ trong 1 mảng -- words = ["","",...""]
        {
            result += word.charAt(0) + " ";
        }

        return result.toUpperCase();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap chuoi can tach tu: ");
        String input = scanner.nextLine();

        String result = getFirstLetter(input);

        System.out.println("Kết quả: " +result);
        }
}

