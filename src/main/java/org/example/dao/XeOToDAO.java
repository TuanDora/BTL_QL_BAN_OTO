package org.example.dao;

import org.example.model.XeOTo;
import org.example.model.HangXe;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class XeOToDAO {
    // Lưu ý: Thay đổi logic kết nối tùy theo class config của bạn
    // Giả sử bạn dùng Connection từ một class JDBCHelper

    public void insert(XeOTo xe) {
        String sql = "INSERT INTO XeOTo (maXe, tenXe, gia, maHang) VALUES (?, ?, ?, ?)";
        // Thực thi query (Sử dụng PreparedStatement)
    }

    public void update(XeOTo xe) {
        String sql = "UPDATE XeOTo SET tenXe=?, gia=?, maHang=? WHERE maXe=?";
        // Thực thi query
    }

    public void delete(String maXe) {
        String sql = "DELETE FROM XeOTo WHERE maXe=?";
        // Thực thi query
    }

    public List<XeOTo> selectAll() {
        List<XeOTo> list = new ArrayList<>();
        String sql = "SELECT * FROM XeOTo";
        // Logic dùng ResultSet để đổ dữ liệu vào list
        return list;
    }
}