package com.niit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.dao.ProductDao;
import com.niit.model.Product;
import com.niit.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	
  @Autowired
  private ProductDao productDao;
private int product;
	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return productDao.getAllProducts();
	}

	@Override
	public Product getProductByID(int ProductID) {
		// TODO Auto-generated method stub
		return productDao.getProductByID(ProductID);
	}

	@Override
	public boolean addProduct(Product product) {
		// TODO Auto-generated method stub
		return productDao.addProduct(product);
	}

	@Override
	public Product updateProduct(int productID) {
		// TODO Auto-generated method stub
		return productDao.getProductByID(productID);
	}

	@Override
	public boolean deleteProduct(int productID) {
		// TODO Auto-generated method stub
		return productDao.deleteProduct(productID);
	}

}
