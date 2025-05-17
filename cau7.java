package Huong175;

import java.util.Scanner;

public class cau7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập số thứ nhất: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Nhập số thứ hai: ");
        double num2 = scanner.nextDouble();
        
        if (num2 == 0) {
            System.out.println("Lỗi: Không thể chia cho 0!");
        } else {
            double result = num1 / num2;
            System.out.printf("Kết quả: %.2f / %.2f = %.2f\n", num1, num2, result);
        }
        
        scanner.close();
    }
}