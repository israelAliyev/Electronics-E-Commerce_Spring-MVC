package com.spring.mvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.entity.Product;
import com.spring.service.ProductService;


@Controller
@RequestMapping(value = "admin")
public class AdminController {

	@Autowired
	private ProductService productService;

	@RequestMapping(value = { "", "/product" }, method = RequestMethod.GET)
	public String home() {

		return "product";
	}
	
	
	
	@ModelAttribute("prod")
	public List<Product> products() {

		return this.productService.listItem();

	}

}
