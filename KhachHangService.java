package org.example.quanlyoto;

import org.example.dao.KhachHangDAO;
import org.example.model.KhachHang;

import java.util.List;

public class KhachHangService {

    private KhachHangDAO dao = new KhachHangDAO();

    public void them() {
        KhachHang kh = new KhachHang();
        kh.nhap();
        dao.insert(kh);
    }

    public void hienThi() {
        List<KhachHang> list = dao.getAll();
        for (KhachHang kh : list) {
            kh.xuat();
        }
    }

    public void timTheoTen(String ten) {
        List<KhachHang> list = dao.getAll();
        for (KhachHang kh : list) {
            if (kh.getTenKH().equalsIgnoreCase(ten)) {
                kh.xuat();
            }
        }
    }
}