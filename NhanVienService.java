package org.example.quanlyoto;

import org.example.dao.NhanVienDAO;
import org.example.model.NhanVien;

import java.util.List;

public class NhanVienService {

    private NhanVienDAO dao = new NhanVienDAO();

    public void them() {
        NhanVien nv = new NhanVien();
        nv.nhap();
        dao.insert(nv);
    }

    public void hienThi() {
        List<NhanVien> list = dao.getAll();

        System.out.printf("%-10s %-20s %-15s %-15s %-10s\n",
                "MaNV", "TenNV", "ChucVu", "SDT", "Luong");

        for (NhanVien nv : list) {
            nv.xuat();
        }
    }
}