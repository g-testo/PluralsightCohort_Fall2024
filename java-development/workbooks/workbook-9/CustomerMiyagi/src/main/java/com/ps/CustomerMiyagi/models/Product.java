package com.ps.CustomerMiyagi.models;

public class Product {
    private int productId;
    private String name;
    private float price;
    private int categoryId;

    public Product() {}

    public Product(int productId, String name, float price, int categoryId) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.categoryId = categoryId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
}
