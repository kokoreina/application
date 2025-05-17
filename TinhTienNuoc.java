package baitaphomnay;

import java.util.Scanner;

public class TinhTienNuoc {

    // Hàm tính tiền nước
    public static int tinhTienNuoc(int soDau, int soCuoi) {
        if (soCuoi >= soDau) {
            return (soCuoi - soDau) * 10000;
        } else {
            System.out.println("Lỗi: Số cuối phải lớn hơn hoặc bằng số đầu.");
            return -1; // Trả về -1 nếu có lỗi
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số đầu đồng hồ nước: ");
        int soDau = scanner.nextInt();

        System.out.print("Nhập số cuối đồng hồ nước: ");
        int soCuoi = scanner.nextInt();

        int thanhTien = tinhTienNuoc(soDau, soCuoi);

        if (thanhTien != -1) {
            System.out.println("Thành tiền: " + thanhTien + " đồng");
        }

        scanner.close();
    }
}
