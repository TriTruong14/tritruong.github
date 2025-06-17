package AutoTest;

import java.util.Scanner;

public class BaiTapCauDieuKien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tên Khách Hàng ");
        String name = scanner.nextLine();
        System.out.println("Nhập chỉ số KW ");
        float kw = scanner.nextInt();

        float tienDien = 0;
        if (kw > 0 && kw <= 50) {
            tienDien = kw * 500;
        } else if (kw > 50 && kw <= 100) {
            tienDien = (50 * 500) + (kw - 50) * 650;
        } else if (kw > 100 && kw <= 200) {
            tienDien = (50 * 500) + (50 * 650) + (kw - 100) * 850;
        } else if (kw > 200 && kw <= 350) {
            tienDien = (50 * 500) + (50 * 650) + 100 * 850 + (kw - 200) * 1100;
        } else if(kw >350) {
            tienDien = (50 * 500) + (50 * 650) + (100 * 850) + (200 * 1100) + ((kw - 350) * 1300);
        } else{
                System.out.println("vui lòng nhập lại");
            }
            System.out.println("Khách hàng " + name + " có số tiền điện phải đóng là " + tienDien);
        }
    }
