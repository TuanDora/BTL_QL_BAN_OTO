package org.example.quanlyoto;

import org.example.dao.HangXeDAO;
import org.example.model.HangXe;

import java.util.List;

public class HangXeService {

    private HangXeDAO dao = new HangXeDAO();

    public void them() {
        HangXe hx = new HangXe();
        hx.nhap();
        dao.insert(hx);
    }

    public List<HangXe> getAll() {
        return dao.getAll();
    }

    public void hienThi() {
        List<HangXe> list = dao.getAll();
        for (HangXe hx : list) {
            hx.xuat();
        }
    }
}