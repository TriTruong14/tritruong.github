package AutoTest;

import java.util.Scanner;

public class Baitap2 {
    //mô hình IPO
    //input
    //giá trị từ người dùng nhập
    //tổng số ngày làm, số lương 1 day

    //process
    //giá trị người dùng nhập vào
    //tongLuong = tổng số ngày làm * số tiền lương 1 ngày

    //output


    //Bài này chưa xong, cần xem lại video
//    static double tongLuong(double salary, double day){
//        double tongLuong = salary * day;
//        return tongLuong;
//    }
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//

    /// /        System.out.println("nhập tên = ");
    /// /        String name = scanner.nextLine();
    /// /        System.out.println("nhập lương 1 ngày = ");
    /// /        double salary = scanner.nextInt();
    /// /        System.out.println("số ngày làm việc = ");
    /// /        double day = scanner.nextInt();
//    }
    static float average(double Toan, double Ly, double Hoa) {
        double dtb = (Toan + Ly + Hoa) / 3;
        return dtb;
    }


    static String xepLoai(double dtb) {
        String result = "";
        if (dtb <= 5) {
            result = "Yeu";
        } else if (dtb <= 6 && dtb >= 5.1) {
            result = "Trung Bình";
        } else if (dtb <= 7 && dtb >= 6.1) {
            result = "Khá";
        } else if (dtb <= 8 && dtb >= 7.1) {
            result = "Giỏi";
        } else if (dtb <= 10 && dtb >= 8.1) {
            result = "Xuất sắc";
        }
        return result;


        public static void main (String[]args){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Điểm Toán ");
            double Toan = scanner.nextDouble();
            System.out.println("Điểm Lý ");
            double Ly = scanner.nextDouble();
            System.out.println("Điểm Hóa ");
            double Hoa = scanner.nextDouble();

            double dtb = average(Toan, Ly, Hoa);
            String danhGia = xepLoai(dtb);

            System.out.println(danhGia);
        }
    }
}