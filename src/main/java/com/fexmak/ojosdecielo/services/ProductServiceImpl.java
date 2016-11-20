package com.fexmak.ojosdecielo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.fexmak.ojosdecielo.DAO.ProductDAO;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductDAO productDAO;
	
}
