package com.fexmak.ojosdecielo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fexmak.ojosdecielo.services.CategoryService;

@RequestMapping("/category")
@Controller
public class CategoryController {

	@Autowired
	CategoryService categoryService;
	
	@RequestMapping(value = "/list")
	public String list(Model model) {
		
		return null;
	}
	
}
