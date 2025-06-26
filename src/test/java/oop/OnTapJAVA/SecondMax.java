package oop.OnTapJAVA;

import java.util.Scanner;

public class SecondMax {
    public static int timSoLonThuHai(int[] arr) {
        if (arr == null || arr.length < 2) {
            // Xử lý trường hợp mảng rỗng, null hoặc chỉ có 1 phần tử
            return Integer.MIN_VALUE;
        }

        int soLonNhat = Integer.MIN_VALUE;  // Khởi tạo giá trị lớn nhất là số âm nhỏ nhất
        int soLonThuHai = Integer.MIN_VALUE; // Khởi tạo giá trị lớn thứ hai là số âm nhỏ nhất

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > soLonNhat) {
                soLonThuHai = soLonNhat; // Cập nhật soLonNhat cũ thành soLonThuHai
                soLonNhat = arr[i];        // Cập nhật soLonNhat mới
            } else if (arr[i] > soLonThuHai && arr[i] != soLonNhat) {
                // Nếu phần tử hiện tại lớn hơn soLonThuHai VÀ không bằng soLonNhat
                soLonThuHai = arr[i];
            }
        }

        if (soLonThuHai == Integer.MIN_VALUE) {
            // Trường hợp tất cả các phần tử đều giống nhau (ví dụ: {5, 5, 5})
            // hoặc không tìm thấy giá trị lớn thứ hai khác biệt
            throw new IllegalArgumentException("Không tìm thấy giá trị lớn thứ hai khác biệt.");
        }

        return soLonThuHai;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr1 = {1,4,5,0,3,2};

        System.out.println("Output " + timSoLonThuHai(arr1) );
    }
}
