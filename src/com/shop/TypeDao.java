package com.shop;

import model.db.DBManager;

import java.sql.Connection;

public class TypeDao {

        private static TypeDao instance;
        private static Connection con;

        private TypeDao() {
            con = DBManager.getInstance().getConnection();
        }
        public static TypeDao getInstance() {
            if (instance == null) {
                instance = new TypeDao();
            }
            return instance;
        }
}
