package Udemy.oop.Prac1;

public class Deals {
    private String dealName;
    private String dealDescription;
    private Product [] products;
    private Participant buyer;
    private Participant seller;

    public Deals(String dealName, String dealDescription, Product[] products, Participant buyer, Participant seller) {
        this.dealName = dealName;
        this.dealDescription = dealDescription;
        this.products = (products!=null)?products:new Product[0];
        this.buyer = buyer;
        this.seller = seller;
    }

    public String getDealName() {
        return dealName;
    }

    public void setDealName(String dealName) {
        this.dealName = dealName;
    }

    public String getDealDescription() {
        return dealDescription;
    }

    public void setDealDescription(String dealDescription) {
        this.dealDescription = dealDescription;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public double getSumPrice() {
        double sum = 0;
        for (Product product : products) {
            sum += product.getTotalPrice();
        }
        return sum;
    }

}
