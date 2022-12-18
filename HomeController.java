package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
  @GetMapping(value={"/","/home"})
  public String homePage() {
	  return "index";
  }
  @GetMapping("/about")
  public String aboutUspage() {
	  return "aboutUs";
  }
   
  
}