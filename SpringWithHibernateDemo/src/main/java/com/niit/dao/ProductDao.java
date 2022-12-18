package com.niit.dao;

import java.util.List;

import com.niit.model.Product;

public interface ProductDao {
    List<Product> getAllProducts();
    Product getProductByID(int ProductID);
    boolean addProduct(Product product);
    Product update(int productID);
    boolean deleteProduct(int productID);
}
