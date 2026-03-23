package org.example.dao;

import org.example.model.NhanVien;
import java.util.ArrayList;
import java.util.List;

public class NhanVienDAO {
    public void insert(NhanVien nv) {
        String sql = "INSERT INTO NhanVien VALUES (?, ?, ?, ?, ?)";
    }

    public List<NhanVien> selectAll() {
        List<NhanVien> list = new ArrayList<>();
        return list;
    }
}