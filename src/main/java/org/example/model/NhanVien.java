package org.example.model;

import org.example.util.Validator;

public class NhanVien {

    private String maNV;
    private String tenNV;
    private String chucVu;
    private String sdt;
    private double luong;

    public NhanVien() {}

    public NhanVien(String maNV, String tenNV, String chucVu, String sdt, double luong) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.chucVu = chucVu;
        this.sdt = sdt;
        this.luong = luong;
    }

    public void nhap() {

        maNV = Validator.inputString("Ma NV: ");
        tenNV = Validator.inputString("Ten NV: ");
        chucVu = Validator.inputString("Chuc vu: ");
        sdt = Validator.inputString("SDT: ");
        luong = Validator.inputDouble("Luong: ");
    }

    public void xuat() {

        System.out.printf("%-10s %-20s %-15s %-15s %-10.0f\n",
                maNV, tenNV, chucVu, sdt, luong);
    }

    public String getMaNV() {
        return maNV;
    }

    public String getTenNV() {
        return tenNV;
    }
}