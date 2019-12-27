package com.shop;

public class Product {


    private int productID;
    private int typeId;
    private String name;
    private String makerName;
    private double price;


    public Product(int productID, int typeId, String name, String makerName, double price) {
        this.productID = productID;
        this.typeId = typeId;
        this.name = name;
        this.makerName = makerName;
        this.price = price;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        if (productID < 0) {
            throw new IllegalArgumentException("Invalid product id! ");
        }
        this.productID = productID;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        if (typeId < 0) {
            throw new IllegalArgumentException("Invalid type id! ");
        }
        this.typeId = typeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.length() == 0) {
            throw new IllegalArgumentException(" Invalid name! ");
        }
        this.name = name;
    }

    public String getMakerName() {
        return makerName;
    }

    public void setMakerName(String makerName) {
        if (makerName == null || makerName.length() == 0) {
            throw new IllegalArgumentException(" Invalid maker's name! ");
        }
        this.makerName = makerName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException(" Invalid price! ");
        }
        this.price = price;
    }

    public void addProduct(String productName) {
    }

    public void sellProduct(String productName) {
    }

    public void searchProduct(String productName) {
    }

    public void makePayment(double productPrice) {

    }

}
