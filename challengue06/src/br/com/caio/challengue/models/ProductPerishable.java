package br.com.caio.challengue.models;

public class ProductPerishable extends Product {
    private String dateExpiration;

    // Construtor
    public ProductPerishable(String name, int quantity, double price, String dateExpiration) {
        super(name, quantity, price);
        this.dateExpiration = dateExpiration;
    }

    public String getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(String dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    @Override
    public String toString() {
        return "Product: " + getName() + ", Price: " + getPrice() + ", Quantity: " + getQuantity() + " Expiration: " + dateExpiration;
    }
}
