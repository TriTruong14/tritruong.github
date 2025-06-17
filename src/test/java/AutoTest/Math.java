package AutoTest;

public class Math {
    public static void main(String[] args){
        int a = 10;
        int b = 15;

        int sum = a+b;
        int minus = a-b;
        int multiply = a*b;
        int divided = a/b;
        int remender = a%b;

        System.out.println("Tong=" + sum);
        System.out.println("hieu = " + minus);
        System.out.println("tich = " + multiply);
        System.out.println("thuong = " + divided);
        System.out.println("lay du = " + remender);

        //tiền tố - tăng ngay 1 đơn vị
        System.out.println(++a);
        //hậu tố - giảm 1 đơn vị ở dòng tiếp theo
        System.out.println(b++);
        System.out.println(b);


    }
}
