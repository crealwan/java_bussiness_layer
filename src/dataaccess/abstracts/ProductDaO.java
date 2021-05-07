package dataaccess.abstracts;

import java.util.List;

import entities.concretes.Products;

public interface ProductDaO{
    void addProduct(Products products);
    void updateProduct(Products product);
    void removeProduct(Products products);
    List<Products>getAll();
}