package org.example.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtil {
    public static Connection getConnection() {
        Connection c = null;
        try {
            // 1. Đăng ký Driver (Không bắt buộc với bản Java mới nhưng nên có)
            DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());

            // 2. Chuỗi URL kết nối (Thay đổi nếu User/Pass của em khác)
            // localhost:1433 là cổng mặc định, databaseName khớp với file SQL của em
            String url = "jdbc:sqlserver://localhost:1433;databaseName=QuanLyBanXe;encrypt=true;trustServerCertificate=true;";
            String user = "sa"; // Tài khoản SQL Server của em
            String pass = "123"; // Mật khẩu của em

            // 3. Tạo kết nối
            c = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return c;
    }

    public static void closeConnection(Connection c) {
        try {
            if (c != null) {
                c.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}