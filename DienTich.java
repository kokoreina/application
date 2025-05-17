package application;

import java.util.Scanner;

public class DienTich {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chiều dài: ");
        double chieuDai = scanner.nextDouble();

        System.out.print("Nhập chiều rộng: ");
        double chieuRong = scanner.nextDouble();

        double dienTich = chieuDai * chieuRong;
        System.out.println("Diện tích hình chữ nhật là: " + dienTich);

        scanner.close();
    }
}

