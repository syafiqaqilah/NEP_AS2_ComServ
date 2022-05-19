package com.nepcomserv.AS2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nepcomserv.AS2.data.ProductRepository;
import com.nepcomserv.AS2.model.Product;

@Controller
public class HomeController {
	
	@Autowired
	ProductRepository productRepository;
	
	@RequestMapping(value="/")
	public String home(ModelMap modelMap) {
//		List<Product> products = (List<Product>) productRepository.findAll();
//		modelMap.put("products", products);
		List<Product> products = productRepository.getAllProducts();
		modelMap.put("products", products);
		return "index";
	}
	
	@RequestMapping(value="/list")
	public String list(ModelMap modelMap) {
//		List<Product> products = (List<Product>) productRepository.findAll();
//		modelMap.put("products", products);
		List<Product> products = productRepository.getAllProducts();
		modelMap.put("products", products);
		return "foodcomm";
	}
	
	@RequestMapping(value="/addfood")
	public String addreview() {
		return "addfood";
	}
	
	@RequestMapping(value="/aboutus")
	public String aboutus() {
		return "about";
	}
	
//	@RequestMapping(value="/reviewpage/{name}")
//	 public String reviewpage() {
//	 return "reviewpage";
//	 }
	
//	@RequestMapping(value="/add")
//	 public String add(
//			 @RequestParam(required=false) String name,
//			 @RequestParam(required=false) String review,
//			 @RequestParam(required=false) String file,
//			 @RequestParam(required=false) String instock,
//			 ModelMap modelMap) {
//		boolean success = false;
//		 boolean fail = false;
//		 if(name == null && review == null
//		 && file == null && instock == null) {
//		 success = false;
//		 fail = false;
//		 } else {
//		 if(name == null || review == null
//		 || file == null || instock == null) {
//		 success = false;
//		 fail = true;
//		 } else {
//			 try {
//			 boolean instockInBoolean = Boolean.parseBoolean(instock);
//			 
//			 Product product = new Product(name, 0, file,
//					 review, instockInBoolean);
//			productRepository.save(product);
//			 
//			 success = true;
//			 fail = false;
//			 } catch (NumberFormatException e) {
//			 success = false;
//			 fail = true;
//			 }
//			 }
//			 }
//		 modelMap.put("success", success);
//		 modelMap.put("fail", fail);
//		return "addfood";
//	 }
}
