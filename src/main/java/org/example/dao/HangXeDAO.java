package org.example.dao;

import org.example.model.HangXe;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HangXeDAO {
    // Giả sử bạn có class DBContext để lấy Connection
    // Bạn cần import đúng class config của mình vào đây

    public void insert(HangXe hx) {
        String sql = "INSERT INTO HangXe (maHang, tenHang, quocGia) VALUES (?, ?, ?)";
        // Logic dùng PreparedStatement để thực thi
    }

    public void update(HangXe hx) {
        String sql = "UPDATE HangXe SET tenHang = ?, quocGia = ? WHERE maHang = ?";
        // Logic dùng PreparedStatement để thực thi
    }

    public void delete(String maHang) {
        String sql = "DELETE FROM HangXe WHERE maHang = ?";
        // Logic dùng PreparedStatement để thực thi
    }

    public List<HangXe> selectAll() {
        List<HangXe> list = new ArrayList<>();
        String sql = "SELECT * FROM HangXe";

        // Ví dụ logic đổ dữ liệu (Cần có thêm các hàm Getter trong class HangXe)
        /*
        try (Connection con = DBContext.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                HangXe hx = new HangXe();
                // hx.setMaHang(rs.getString("maHang")); ...
                list.add(hx);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        */
        return list;
    }

    // Hàm bổ trợ: Tìm hãng xe theo mã (Rất cần cho lớp XeOtoDAO)
    public HangXe findById(String maHang) {
        String sql = "SELECT * FROM HangXe WHERE maHang = ?";
        // Trả về đối tượng HangXe tương ứng
        return null;
    }
}