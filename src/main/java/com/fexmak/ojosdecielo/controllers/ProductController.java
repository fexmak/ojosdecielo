package com.fexmak.ojosdecielo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fexmak.ojosdecielo.services.ProductService;

@RequestMapping("/product")
@Controller
public class ProductController {
	
	@Autowired
	ProductService productService;

}
