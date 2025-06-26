//package oop.OnTapJAVA;
//
//import java.util.Scanner;
//
//public class XoaNguyenAm {
//    public static boolean isNguyenAm(char kyTu) {
//        kyTu = Character.toLowerCase(kyTu);
//        return kyTu == 'a' || kyTu == 'e' || kyTu == 'i' || kyTu == 'o' || kyTu == 'u' ||;
//    }
//
//    public static String chuoiKhongCoNguyenAm(String input) {
//        String output = "";
//        for (int  i = 0; i < input.length(); i++) {
//            char kyTu = input.charAt(i);
//            System.out.println("Chuỗi ký tự " + kyTu);
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("nhập chuỗi cần xử lý ");
//        String input = scanner.nextLine();
//
//        String output = XoaNguyenAm(input);
//        System.out.println("Chuỗi sau khi xử lý " + output);
//    }
//}
