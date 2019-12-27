package com.shop;

import java.util.List;

public class User {

    private long id;
    private String username;
    private String password;
    private String email;
    private List<Product> products;

    public User(long id, String username, String password, String email, List<Product> products) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.products = products;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }


    public String getEmail() {
        return email;
    }

    public List<Product> getProducts() {
        return products;
    }

}
