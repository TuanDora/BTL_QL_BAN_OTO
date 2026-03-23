package org.example.model;

import java.util.Scanner;

public class KhachHang {
    private String maKH;
    private String tenKH;
    private String sdt;

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma KH: ");
        maKH = sc.nextLine();
        System.out.print("Nhap ten KH: ");
        tenKH = sc.nextLine();
        System.out.print("Nhap SDT: ");
        sdt = sc.nextLine();
    }

    public void xuat() {
        System.out.println("Ma KH: " + maKH +
                " Ten KH: " + tenKH +
                " SDT: " + sdt);
    }

    // Đây là cách sửa đúng logic: trả về giá trị của biến tenKH
    public String getTenKH() {
        return this.tenKH;
    }
}
