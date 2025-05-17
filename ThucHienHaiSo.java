package baitaphomnay;

import java.util.Scanner;

public class ThucHienHaiSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số thứ nhất: ");
        double a = scanner.nextDouble();

        System.out.print("Nhập số thứ hai: ");
        double b = scanner.nextDouble();

        System.out.println("Tổng: " + (a + b));
        System.out.println("Hiệu: " + (a - b));
        System.out.println("Tích: " + (a * b));
        if (b != 0) {
            System.out.println("Thương: " + (a / b));
        } else {
            System.out.println("Không thể chia cho 0.");
        }

        scanner.close();
    }
}
