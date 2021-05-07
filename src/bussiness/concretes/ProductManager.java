package bussiness.concretes;

import java.util.List;

import bussiness.abstracts.ProductService;
import dataaccess.abstracts.ProductDaO;
import entities.concretes.Products;

public class ProductManager implements ProductService {

    private ProductDaO productDaO;

    public ProductManager(ProductDaO productDaO) {
        this.productDaO = productDaO;
    }

    @Override
    public void add(Products product) {
        // TODO Auto-generated method stub
        this.productDaO.addProduct(product);
        
        
    }

    @Override
    public List<Products> getAll() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
