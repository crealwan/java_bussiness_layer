package bussiness.abstracts;

import java.util.List;

import entities.concretes.Products;

public interface ProductService {
    void add(Products product);
    List<Products>getAll();
}
