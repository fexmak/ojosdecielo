package com.fexmak.ojosdecielo.DAO;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fexmak.ojosdecielo.bo.Product;

@Repository
public class ProductDAOImpl extends GenericDAOImp<Product, Long> implements ProductDAO{

}
