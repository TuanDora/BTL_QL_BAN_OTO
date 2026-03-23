package org.example.model;

import java.util.Scanner;

public class XeOTo {
    private String maXe;
    private String tenXe;
    private double gia;
    private HangXe hangXe;

    public XeOTo() {
    }
    public void nhap(HangXe hx) {
        Scanner sc = new Scanner(System.in);
        this.hangXe = hx;

        System.out.print("Nhap ma xe: ");
        maXe = sc.nextLine();

        System.out.print("Nhap ten xe: ");
        tenXe = sc.nextLine();

        System.out.print("Nhap gia: ");
        while (!sc.hasNextDouble()) {
            System.out.print("Nhap lai gia: ");
            sc.next();
        }
        gia = sc.nextDouble();
        sc.nextLine();
    }

    public void xuat() {
        System.out.println("Ma xe: " + maXe +
                " Ten xe: " + tenXe +
                " Gia: " + gia +
                " Hang: " + hangXe.getTenHang());
    }

    public double getGiaBan() {
        return this.gia;
    }
}