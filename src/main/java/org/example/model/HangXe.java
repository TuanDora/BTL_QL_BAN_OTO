package org.example.model;

import java.util.Scanner;

public class HangXe {
    private String maHang;
    private String tenHang;
    private String quocGia;

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma hang: ");
        maHang = sc.nextLine();
        System.out.print("Nhap ten hang: ");
        tenHang = sc.nextLine();
        System.out.print("Nhap quoc gia: ");
        quocGia = sc.nextLine();
    }

    public void xuat() {
        System.out.println("Ma hang: " + maHang +
                " Ten hang: " + tenHang +
                " Quoc gia: " + quocGia);
    }

    public String getTenHang() {
        return tenHang;
    }
}