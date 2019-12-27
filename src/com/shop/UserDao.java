package com.shop;

import model.db.DBManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDao {

    private static UserDao instance;
    private static Connection con;

    private UserDao() {
        con = DBManager.getInstance().getConnection();
    }

    public static UserDao getInstance() {
        if (instance == null) {
            instance = new UserDao();
        }
        return instance;
    }
    public void saveUser(User u) throws SQLException {
        String sql = "INSERT INTO users(username, password, email) VALUES (?, ?, ?);";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, u.getUsername());
        ps.setString(2, u.getPassword());
        ps.setString(3, u.getEmail());
        ps.executeUpdate();
    }
}
