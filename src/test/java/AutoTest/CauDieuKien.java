package AutoTest;

import java.util.Scanner;

public class CauDieuKien {
    public static void main(String[] args) {
        //câu lệnh if
        //if(điều kiện){thực hiện logic}
        //điều kiện đúng
        if (9 > 2) {
            System.out.println("điều kiện đúng");
        }
        //điều kiện sai
        if (9 < 2) {
            System.out.println("điều kiện đúng");
        }

        //Viết chương trình kiểm tra hôm nay có phải ngày đi học không
        int day = 4; //khai báo biến hôm nay là ngày thứ 4
        if (day == 4 || day == 8) {
            System.out.println("Hôm nay là ngày đi học");

            //câu if..else
            //if(điều kiện){thực hiên logic} else {thực hiện logic}
            //viết chương trình cho phép người dùng nhập vào số tuổi, kiểm tra xem đã đủ tuổi học đại học chưa(>18)
            Scanner scanner = new Scanner(System.in);
//            System.out.println("Nhập số tuổi = ");
//            int tuoi = scanner.nextInt();
//            if(tuoi >= 18) {
//                System.out.println("Du tuoi hoc dai hoc");
//            }
//                else {
//                    System.out.println("chua du tuoi hoc dai hoc");
//                }

            //Toán tử 3 ngôi -> điều kiện ? thực hiện logic 1 : thực hiện logic 2
//        String result = (tuoi >=18) ? "Bạn đủ tuổi học đại học" : "Bạn chưa đủ tuổi";
//            System.out.println(result);

            //if(điều kiện 1){thực hiện logic1} else if(điều kiện 2){thực hiện logic2} else {logic3}
//            System.out.println("Điểm Toán ");
//                float Toan = scanner.nextInt();
//            System.out.println("Điểm Lý ");
//                float Ly = scanner.nextInt();
//            System.out.println("Điểm Hóa ");
//                float Hoa = scanner.nextInt();
//            float average = ((Toan+Ly+Hoa)/3);
//            System.out.println("Điểm Trung Bình = " + average);

//            if(average <= 5) {
//                System.out.println("Yeu");
//            }   else if (average <=6 && average >=5.1) {
//                System.out.println("Trung Binh");
//            }   else if (average <= 7 && average >= 6.1) {
//                System.out.println("Khá");
//            }   else if (average <= 8 && average >= 7.1) {
//                System.out.println("Giỏi");
//            }   else if (average <= 10 && average >= 8.1) {
//                    System.out.println("Xuất Sắc");
//                            }
//                        }
//                    }
//                }


            //switch case
            //switch (giá trị đem đi so sánh){
            //  case giá trị so sánh
            //      thực hiện logic
            //  break
            //lưu ý: nên switch case - giá trị so sánh là giá trị cụ thể, điều kiện đơn giản.
            int d = 10;
            switch (d) {
                case 5:
                    System.out.println("số 5");
                    break;
                case 10:
                    System.out.println("số 10");
                    break;
                default:
                    System.out.println("vui lòng nhập lại");
            }
        }
    }


}