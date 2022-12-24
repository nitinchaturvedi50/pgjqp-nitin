package com.niit.dao;

import java.util.List;

import org.springframework.ui.Model;

import com.niit.model.Category;



public interface CategoryDAO {
     public boolean addCategory(Category category);
     public boolean deleteCategory(Category category);
     public boolean updateCategory(Category category);
     public List<Category>  retrieveCategories();
     public Category getCategory(int categoryId);
}
