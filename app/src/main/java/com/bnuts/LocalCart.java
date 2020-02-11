package com.bnuts;

public class LocalCart {
    private int product_no;
    private int product_image;
    private String product_name;
    private int product_quantity;
    private int product_package;
    private float product_cost;

    public LocalCart (int product_no, int product_image, String product_name, int product_package, int product_quantity, float product_cost) {
        this.product_no = product_no;
        this.product_image = product_image;
        this.product_name = product_name;
        this.product_quantity = product_quantity;
        this.product_package = product_package;
        this.product_cost = product_cost;
    }

    public int getProduct_no() {
        return product_no;
    }

    public int getProduct_image() {return product_image;}

    public String getProduct_name() {
        return product_name;
    }

    public int getProduct_quantity() {
        return product_quantity;
    }

    public int getProduct_package() { return product_package; }

    public float getProduct_cost() {
        return product_cost;
    }
}
