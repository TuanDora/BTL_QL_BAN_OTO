package org.example.dao;

import org.example.model.KhachHang;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class KhachHangDAO {
    public void insert(KhachHang kh) {
        String sql = "INSERT INTO KhachHang VALUES (?, ?, ?)";
        // Thực thi PreparedStatement
    }

    public List<KhachHang> selectAll() {
        List<KhachHang> list = new ArrayList<>();
        // Logic ResultSet -> list.add(new KhachHang(...))
        return list;
    }
}