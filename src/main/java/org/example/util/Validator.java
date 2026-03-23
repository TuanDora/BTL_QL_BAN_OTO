package org.example.util;

import java.util.Scanner;

public class Validator {
    private static Scanner sc = new Scanner(System.in);

    // Hàm nhập chuỗi không được để trống
    public static String inputString(String message) {
        String input;
        while (true) {
            System.out.print(message);
            input = sc.nextLine().trim();
            if (!input.isEmpty()) {
                return input;
            }
            System.err.println("Lỗi: Không được để trống!");
        }
    }

    // Hàm nhập số nguyên (ví dụ: Năm sản xuất, Số lượng)
    public static int inputInt(String message) {
        while (true) {
            try {
                System.out.print(message);
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Lỗi: Vui lòng nhập số nguyên hợp lệ!");
            }
        }
    }

    // Hàm nhập số thực (ví dụ: Giá bán ô tô)
    public static double inputDouble(String message) {
        while (true) {
            try {
                System.out.print(message);
                return Double.parseDouble(sc.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Lỗi: Vui lòng nhập số tiền hợp lệ!");
            }
        }
    }
}