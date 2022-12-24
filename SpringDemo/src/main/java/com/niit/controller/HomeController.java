package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@GetMapping(value={"/","/login"})
	public String showLoginPage() {
		return "Login";
		
	}
	@GetMapping("/register")
	public String showRegisterPage() {
		return "Register";
	}
	@GetMapping("/category")
	public String showCategoryPage() {
		return "ManageCategory";
	}
	
}
