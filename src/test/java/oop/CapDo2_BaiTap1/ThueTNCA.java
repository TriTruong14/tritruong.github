package oop.CapDo2_BaiTap1;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ThueTNCA {
    public static void main(String[] args) {

        //input - Nhập thu nhập hằng năm
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thu nhập hằng năm của bạn: ");
        double TN = scanner.nextInt();

        //process - Tính số thuế phải trả theo từng mức thuế suất.
        double tienThue = 1234567.89;
        NumberFormat currencyFormatUS = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat currencyFormatVN = NumberFormat.getCurrencyInstance(new Locale("vi", "VN")); // Locale cho Việt Nam
            if (TN >= 0 && TN <= 5000000) {
                tienThue = TN * 5 / 100;
            } else if (TN >= 6000000 && TN <= 10000000) {
                tienThue = TN * 10 / 100;
            } else if (TN >= 11000000 && TN <= 18000000) {
                tienThue = TN * 15 / 100;
            } else if (TN >= 19000000 && TN <= 32000000) {
                tienThue = TN * 20 /100;
            } else if(TN >= 33000000 && TN <= 52000000) {
                tienThue = TN * 25 /100;
            } else if(TN >= 53000000 && TN <= 80000000) {
                tienThue = TN * 30 /100;
            } else if(TN >= 81000000) {
                tienThue = TN * 35 / 100;
            } else {
                System.out.println("Vui lòng nhập giá trị dương");
            }
            System.out.println("Số tiền thuế cần trả: " + tienThue);
        }
    }