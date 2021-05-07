package entities.concretes;
import entities.abstracts.Entity;

public class Products implements Entity {
    private int id;
    private String productName;
    private double productUnitPrice;

    public Products(){}

    public Products(int id, String productName, double productPrice) {
        super();
        this.id = id;
        this.productName = productName;
        this.productUnitPrice = productPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productUnitPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productUnitPrice = productPrice;
    }

    



}