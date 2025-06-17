package AutoTest;

public class Mang {
    public static void main(String[] args){
        int[] numbers = {10,20,30,40};
        String[] name = {"Tri", "Bo", "Ve", "Q"};
        //                 0      1     2     3
        System.out.println(name[0]);
        name[2] = "CapNhatBo";
        System.out.println(name[2]);

        //độ dài của mảng - là tổng số phần tử có trong mảng
        int length = name.length;
        System.out.println("chiếu dài mảng: " + length);

        //duyệt mảng dùng vòng lặp for
        for (int i = 0; i < name.length; i++){
            System.out.println(" " + (i+1) + ": " + name[i]);
        }

        //duyệt mảng dùng lặp for-each (chỉ dùng trong mảng)
        for (int number: numbers){
            System.out.println(number);
        }

        //nâng cao: duyệt mảng ngược
        for (int index = numbers.length - 1; index >= 0; index--){
            System.out.println(numbers[index]);
        }


    }
}
