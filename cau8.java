package Huong175;

import java.util.Scanner;

public class cau8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập số lượng: ");
        int quantity = scanner.nextInt();
        
        System.out.print("Nhập đơn giá: ");
        double unitPrice = scanner.nextDouble();
        
        if (quantity < 0 || unitPrice < 0) {
            System.out.println("Lỗi: Số lượng và đơn giá không được âm!");
        } else {
            double total = quantity * unitPrice;
            System.out.printf("Thành tiền: %d * %.2f = %.2f\n", quantity, unitPrice, total);
        }
        
        scanner.close();
    }
}