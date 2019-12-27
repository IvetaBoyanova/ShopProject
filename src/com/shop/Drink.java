package com.shop;

public class Drink extends Product {

    private double percentAlcohol;

    public Drink(int productID, int typeId, String name, String makerName, double price, double percentAlcohol) {
        super(productID, typeId, name, makerName, price);
        this.percentAlcohol = percentAlcohol;
    }

    public double getPercentAlcohol() {
        return percentAlcohol;
    }

    public void setPercentAlcohol(double percentAlcohol) {
        if(percentAlcohol < 0){
            throw  new IllegalArgumentException(" Invalid percent! ");
        }
        this.percentAlcohol = percentAlcohol;
    }
}
