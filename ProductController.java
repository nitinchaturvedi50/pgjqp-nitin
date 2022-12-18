package com.niit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.niit.model.Product;
import com.niit.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService productService;
	private Model model;
@GetMapping("/addProduct")
public String addProductPage(Model model) {
	Product product=new Product();
	model.addAttribute("product",product);
	return "addProduct";
	
}
  
@PostMapping("/addProduct")
public String addProductDB(@ModelAttribute ("product") Product product)
{    boolean result=productService.addProduct(product);
     if(result)
     {
    	 return "index";
    	 
     }
     else
     {
    	 return "redirect:/addProduct";
     }
	
}
@GetMapping("/viewAllProducts")
public String viewAllProduct(Model model)
{
	List<Product> allProducts=productService.getAllProducts();
	model.addAttribute("products",allProducts);
	return "viewAllProducts";
}
@GetMapping("/viewProduct/{id}")
public String viewProduct(@PathVariable("id") int id,Model model)
{
	Product product=productService.getProductByID(id);
	model.addAttribute("product",product);
	return "viewProduct";
}

@GetMapping("/deleteProduct/{id}")
public String deleteProduct(@PathVariable("id") int id)
{     productService.deleteProduct(id);

	 return "redirect:/viewProduct";
	
}


}
