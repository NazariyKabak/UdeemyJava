package Udemy.oop.Prac1;

public class Product {
    private String productName;
    private double productPrice;
    private int count;

    public Product(String productName, double productPrice, int count) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.count = count;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getTotalPrice() {
        return productPrice * count;
    }
}
