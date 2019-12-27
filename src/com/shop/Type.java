package com.shop;

public class Type {

    private int id;
    private String typeName;

    public Type(int id, String typeName) {
        this.id = id;
        this.typeName = typeName;
    }

    public String getTypeName() {
        return typeName;
    }
}
