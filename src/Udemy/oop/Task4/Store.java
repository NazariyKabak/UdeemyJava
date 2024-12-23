package Udemy.oop.Task4;

public class Store {
    private Product[] products;

    public Store (Product[] products){
        this.products = new Product[products.length];
        for (int i = 0; i < products.length; i++) {
            this.products[i] = new Product(products[i]);
        }
    }

    public Product getProduct(int index) {
        return new Product(products[index]);
    }

    public void setProduct(Product product, int index) {
        Product copyProduct = new Product(product);
        this.products[index] = copyProduct;
    }

    public void displayProducts(){
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public void addProduct(Product product){
        Product[] newProducts = new Product[products.length + 1];
        System.arraycopy(products, 0, newProducts, 0, products.length);
        newProducts[products.length] = new Product(product);
        products = newProducts;
    }

    public void deleteProduct(int index){
        Product[] newProducts = new Product[products.length - 1];
        System.arraycopy(products, 0, newProducts, 0, index);
        System.arraycopy(products, index + 1, newProducts, index, products.length - index - 1);
        products = newProducts;
    }

}
