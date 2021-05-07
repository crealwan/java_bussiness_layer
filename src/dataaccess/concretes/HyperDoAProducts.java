package dataaccess.concretes;

import java.util.List;

import dataaccess.abstracts.ProductDaO;
import entities.concretes.Products;

public class HyperDoAProducts implements ProductDaO {

    @Override
    public void addProduct(Products products) {
        System.out.println("Ürün Eklendi : "+products.getProductName());
        // TODO Auto-generated method stub
        
    }

    @Override
    public void updateProduct(Products product) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void removeProduct(Products products) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<Products> getAll() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
