import bussiness.abstracts.ProductService;
import bussiness.concretes.ProductManager;
import dataaccess.concretes.HyperDoAProducts;
import entities.concretes.Products;

public class App {
    public static void main(String[] args) throws Exception {
        Products products1 = new Products(1,"armut",10.0);
        ProductService productService = new ProductManager(new HyperDoAProducts());
        productService.add(products1);       
    }
}
