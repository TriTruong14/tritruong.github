package AutoTest;

import java.util.Scanner;

public class Baitap {


    public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);
        //yêu cầu: viết chương trình tính lương cho phép người dùng nhập vào tên,
        // lương 1 ngày, tổng số ngày làm và in kết quả màn hình.
        // Ví dụ: lương 1 ngày 10đ và làm 28 > 280đ
        System.out.println("nhập tên = ");
        String name = scanner.nextLine();
        System.out.println("nhập lương 1 ngày = ");
        int salary = scanner.nextInt();
        System.out.println("số ngày làm việc = ");
        int day = scanner.nextInt();

        int tongluong = salary * day;

        System.out.println("Xin chào " + name + "Tổng lương là " + tongluong);



       //Viết chương trình cho phép người dùng nhập vào điểm toán lý hóa.
        //tính diểm trung bình và in ra màn hình
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Điểm Toán = ");
//        int Toan = scanner.nextInt();
//        System.out.println("Điểm Lý = ");
//        int Ly = scanner.nextInt();
//        System.out.println("Điểm Hóa = ");
//        int Hoa = scanner.nextInt();

//        System.out.println("Điểm Toán = ");
//        float Toan = scanner.nextInt();
//        System.out.println("Điểm Lý = ");
//        float Ly = scanner.nextInt();
//        System.out.println("Điểm Hóa = ");
//        float Hoa = scanner.nextInt();
//        float average = ((Toan+Ly+Hoa)/3);
//
//        System.out.println("Điểm Trung Bình = " + average);

        //Toán tử so sánh
        //so sánh giá trị ( == )
        int e = 10;
        int f = 11;
        System.out.println(e == f);

        //so sánh ko bằng ( != )
        System.out.println(e != f);

        //so sánh  < > >= <=

        //toán tử logic
        // and(&&) - tất cả điều kiện phải true thì mới trả về true
        boolean rs1 = (10 == 15) && (15 == 15);
                System.out.println(rs1);

        // hoặc ( || ) chỉ cần 1 thằng true thì sẽ trả về true
        boolean rs2 = (10 == 15) || (15 == 15);
        System.out.println(rs2);

        // phủ định ( ! ) trả ngược lại giá trị true
        boolean rs3 = !(10<15);
        System.out.println(rs3);


    }
    }
