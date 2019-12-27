package com.shop;

import model.db.DBManager;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductDao {

    private static ProductDao instance;
    private static Connection con;

    private ProductDao() {
        con = DBManager.getInstance().getConnection();

    }

    public static ProductDao getInstance() {
        if (instance == null) {
            instance = new ProductDao();
        }
        return instance;
    }

    public List<Product> getAll() throws SQLException {
        String sql = "SELECT productId, typeId, name, makerName, price FROM products ";
        Statement s = con.createStatement();
        ResultSet result = s.executeQuery(sql);
        List<Product> products = new ArrayList<>();
        while (result.next()) {
            products.add(new Product(
                    result.getInt("productId"),
                    result.getInt("typeId"),
                    result.getString("name"),
                    result.getString("makerName"),
                    result.getDouble("price")));
        }
        return products;
    }

}

