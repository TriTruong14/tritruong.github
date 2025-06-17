package AutoTest;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
//        int i = 1;
//        while (i <= 5){
//            System.out.println("Đang học vòng lặp loop");
//            i++;
//        }
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Nhập số vào ");
//        int soLan = scanner.nextInt();
//        int lan = 1;
//        while (lan <= soLan){
//            System.out.println("Vòng lặp while là Nhập điều kiện trước" );
//            lan++;
//        }


        //Vòng lặp do ... while
//        int index = 1;
//        do {
//            System.out.println("vòng lặp do..while hành động trước và điều kiện" + index);
//            index++;
//        }
//        while(index <=3);


        //Vòng lặp for
//        for (int f=1; f<=4; f++){
//            System.out.println("Vòng lặp for" + f);
//        }

        //Bài tập 1
//        System.out.println("Nhập số vào ");
//        int n = scanner.nextInt();
//        int tong = 0;
//        for (int N=0; N <= n; N++)
//        {   tong += N;}
//        System.out.println("Tổng số N "+ tong);


        //Bài tập 2
        System.out.println("Nhập số vào: ");
        int n2 = scanner.nextInt();
        int tong2 = 0;
//        for (int k = 0; k <= n2;k++){
//            if (k % 2 == 0){
//                tong2 +=k;
//            }
//        }

        //tổng chẵn
        for (int k = 0; k <=n2; k+=2){
            tong2 += k;
        }

        //chia hết cho 3
        for(int k = 3; k <= n2; k+=3){
        }

        System.out.println("tổng n = " + tong2);
    }
    }
