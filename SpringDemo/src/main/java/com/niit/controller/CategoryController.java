package com.niit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.dao.CategoryDAO;
import com.niit.model.Category;



@Controller

public class CategoryController {
	@Autowired
	CategoryDAO categoryDAO;
	
	
	
	@RequestMapping("/Category")
	public String showCategoryPage(Model m)
	{
		 List<Category> categoryList=categoryDAO.retrieveCategories();
	      m.addAttribute("categoryList",categoryList);
		return "ManageCategory";
		
	}
	
	@RequestMapping(value="/insertCategory",method=RequestMethod.POST)
	public String insertCategory(@RequestParam("catId")int catId,@RequestParam("catName")String catName,@RequestParam("catDesc")String catDesc,Model m)
	{    Category category=new Category();
	     category.setCategoryId(catId);
	     category.setCategoryName(catName);
	     category.setCategoryDesc(catDesc);
	     categoryDAO.addCategory(category);
	     List<Category> categoryList=categoryDAO.retrieveCategories();
	      m.addAttribute("categoryList",categoryList);
		return "ManageCategory";
	}
  @RequestMapping("/deleteCategory/{categoryId}")
  public String deleteCategory(@PathVariable("categoryId") int categoryId,Model m)
  {
	  Category category=categoryDAO.getCategory(categoryId);
	  categoryDAO.deleteCategory(category);
	  List<Category> categoryList=categoryDAO.retrieveCategories();
	  m.addAttribute("categoryList", categoryList);
	  return "ManageCategory";
  }
  @RequestMapping("/editCategory/{categoryId}")
  public String editCategory(@PathVariable("categoryId") int categoryId,Model m)
  {
	  Category category=categoryDAO.getCategory(categoryId);
	 
	  m.addAttribute("category", category);
	  return "UpdateCategory";
  }
  @RequestMapping(value="/updateCategory",method=RequestMethod.POST)
	public String updateCategory(@RequestParam("catId")int catId,@RequestParam("catName")String catName,@RequestParam("catDesc")String catDesc,Model m)
	{    Category category=new Category();
	     category.setCategoryId(catId);
	     category.setCategoryName(catName);
	     category.setCategoryDesc(catDesc);
	     categoryDAO.updateCategory(category);
	     List<Category> categoryList=categoryDAO.retrieveCategories();
	      m.addAttribute("categoryList",categoryList);
		return "ManageCategory";
	}
}
