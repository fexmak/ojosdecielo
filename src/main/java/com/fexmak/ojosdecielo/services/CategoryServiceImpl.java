package com.fexmak.ojosdecielo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.fexmak.ojosdecielo.DAO.CategoryDAO;

@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	CategoryDAO categoryDAO;
	
}
