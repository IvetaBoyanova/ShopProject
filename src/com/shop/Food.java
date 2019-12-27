package com.shop;

public class Food extends Product {

private int expirationDate;

    public Food(int productID, int typeId, String name, String makerName, double price, int expirationDate) {
        super(productID, typeId, name, makerName, price);
        this.expirationDate = expirationDate;
    }

    public int getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(int expirationDate) {
        if(expirationDate < 0 ){
            throw new IllegalArgumentException(" Invalid date! ");
        }
        this.expirationDate = expirationDate;
    }
}
